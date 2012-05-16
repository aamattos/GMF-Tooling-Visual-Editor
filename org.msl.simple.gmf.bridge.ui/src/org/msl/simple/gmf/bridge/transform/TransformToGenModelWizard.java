package org.msl.simple.gmf.bridge.transform;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.transform.Messages;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.bridge.wizards.WizardUtil;
import org.eclipse.gmf.internal.common.URIUtil;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;

public class TransformToGenModelWizard extends Wizard implements IWorkbenchWizard {
	
	private IStructuredSelection mySelection;

	private GMFGenNewFileCreationPage newFileCreationPage;
	private MapModelConfigurationPage mapModelPage;
	private ModelDiagnosticPage mapDiagnosticPage;
	private GenModelConfigurationPage genModelPage;
	private ViewmapProducerWizardPage transformOptionPage;
	private ModelDiagnosticPage genDiagnosticPage;
	
	private WizardPage myErrorContainer;
	
	private SimpleTransformToGenModelOperation myOperation;
	
	@Override
	public void addPages() {
		final String defaultName = "My"; //$NON-NLS-1$
		newFileCreationPage = new GMFGenNewFileCreationPage(mySelection);
		IFile file = WizardUtil.findExistingFile(mySelection, GMFGenNewFileCreationPage.EXT_GMFGEN);
		if (file != null) {
			newFileCreationPage.setFileName(file.getName());
		} else {
			newFileCreationPage.setFileName(WizardUtil.getDefaultFileName(mySelection, defaultName, GMFGenNewFileCreationPage.EXT_GMFGEN));
		}
		addPage(newFileCreationPage);
		
		final ResourceSet resourceSet = getTransformOperation().getResourceSet();
		ResourceLocationProvider rlp = new ResourceLocationProvider(mySelection);
		mapModelPage = new MapModelConfigurationPage(MapModelConfigurationPage.class.getSimpleName(), rlp, resourceSet);
		mapModelPage.setPageComplete(false);
		mapModelPage.setModelRequired(true);
		addPage(mapModelPage);
		
		mapDiagnosticPage = new MapModelDiagnosticPage(MapModelDiagnosticPage.class.getSimpleName());
		addPage(mapDiagnosticPage);

		genModelPage = new GenModelConfigurationPage(GenModelConfigurationPage.class.getSimpleName(), rlp, resourceSet);
		genModelPage.setPageComplete(false);
		genModelPage.setModelRequired(false);
		addPage(genModelPage);

		transformOptionPage = new ViewmapProducerWizardPage(ViewmapProducerWizardPage.class.getSimpleName());
		transformOptionPage.setPageComplete(false);
		addPage(transformOptionPage);
		
		genDiagnosticPage = new GMFGenModelDiagnosticPage(GMFGenModelDiagnosticPage.class.getSimpleName());
		addPage(genDiagnosticPage);
	}

	private boolean checkGMFGenValidationResult() {
		Diagnostic diagnostic = getTransformOperation().getGMFGenValidationResult();
		return !(Diagnostic.ERROR == diagnostic.getSeverity());
	}

	protected ResourceSet createResourceSet() {
		final ResourceSetImpl rs = new ResourceSetImpl();
		rs.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		return rs;
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		//clear error message
		if (myErrorContainer != null) {
			myErrorContainer.setErrorMessage(null);
			myErrorContainer = null;
		}
		if (page == mapModelPage) {
			Diagnostic diagnostic = getTransformOperation().getMapmodelValidationResult();
			if (Diagnostic.ERROR == diagnostic.getSeverity()) {
				//init genModelPage anyway
				findNextPageAfterMapping();
				return mapDiagnosticPage;
			}
			return findNextPageAfterMapping();
		} else if (page == mapDiagnosticPage) {
			return findNextPageAfterMapping();
		} else if (page == transformOptionPage) {
			if (checkGMFGenValidationResult()) {
				return null;
			}
			return genDiagnosticPage;
		}
		return super.getNextPage(page);
	}

	private IWizardPage findNextPageAfterMapping() {
		try {
			GenModel genmmodel = getTransformOperation().findGenmodel();
			if (genmmodel == null) {
				genModelPage.setPageComplete(true);
				return transformOptionPage;
			}
		} catch (CoreException e) {
			genModelPage.setStatusMessage(e.getStatus());
		}
		return genModelPage;
	}
	
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.mySelection = selection;
		setWindowTitle(Messages.TransformToGenModelWizard_title_wizard);
		setNeedsProgressMonitor(true);
		myOperation = new SimpleTransformToGenModelOperation(createResourceSet());
	}
	
	@Override
	public boolean performFinish() {
		if (getTransformOperation().getOptions().getIgnoreGMFGenValidation() && 
				getContainer().getCurrentPage() == genDiagnosticPage) {
			saveTransformOptions();
			return true;
		}
		try {
			final IStatus[] s = new IStatus[1];
			IRunnableWithProgress iwr = new IRunnableWithProgress() {
				public void run(IProgressMonitor monitor) {
					SimpleTransformToGenModelOperation op = getTransformOperation();
					IFile target = getTargetFile();
					op.setGenURI(URI.createPlatformResourceURI(target.getFullPath().toString(), true));
					s[0] = op.executeTransformation(monitor);
				}
			};
			getContainer().run(false, false, iwr);
			if (s[0].isOK()) {
				return processGMFGenValidationResult();
			}
			setErrorMessage(s[0].getMessage());
			if (s[0].getException() != null) {
				Plugin.log(s[0]);
			}
			return false;
		} catch (InvocationTargetException ex) {
			String message = Messages.TransformToGenModelOperation_e_generator_creation;
			Throwable targetException = ex.getTargetException();
			if (targetException != null) {
				if (targetException.getMessage() != null) {
					message = targetException.getMessage();
				} else {
					message += ": " + targetException.getClass().getName();
				}
			}
			setErrorMessage(message);
			Plugin.log(Plugin.createError(message, targetException));
			return false;
		} catch (InterruptedException ex){
			setErrorMessage(Messages.TransformToGenModelWizard_e_operation_cancelled);
			return false;
		}
	}
	
	private boolean processGMFGenValidationResult() {
		if (checkGMFGenValidationResult()) {
			setErrorMessage(null);
			saveTransformOptions();
			return true;
		}
		getContainer().showPage(genDiagnosticPage);
		return false;
	}
	
	private void saveTransformOptions() {
		if (getTransformOperation() != null) {
			getTransformOperation().getOptions().flush();
		}
	}
	
	@Override
	public boolean performCancel() {
		if (getTransformOperation() != null) {
			getTransformOperation().getOptions().reset();
		}
		return super.performCancel();
	}

	SimpleTransformToGenModelOperation getTransformOperation() {
		return myOperation;
	}
	
	IFile getTargetFile() {
		return newFileCreationPage.getModelFile();
	}
	
	IFile getMapFile() {
		URI mapURI = mapModelPage.getURI();
		if (mapURI != null) {
			return URIUtil.getFile(mapURI);
		}
		return (IFile) mySelection.getFirstElement();
	}

	private void setErrorMessage(String message) {
		WizardDialog wd = (WizardDialog) getContainer();
		WizardPage wp = (WizardPage) wd.getCurrentPage();
		if (wp != null) {
			myErrorContainer = wp;
			myErrorContainer.setErrorMessage(message);
		}
	}
}
