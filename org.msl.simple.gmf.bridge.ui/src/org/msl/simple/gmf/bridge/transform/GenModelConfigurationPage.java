package org.msl.simple.gmf.bridge.transform;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.importer.ui.EMFModelWizard;
import org.eclipse.emf.importer.ui.GenModelReloadActionDelegate;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.ui.PlatformUI;


class GenModelConfigurationPage extends ModelConfigurationPage {
	
	private static final String FILE_EXT_ECORE = "ecore"; //$NON-NLS-1$
	private Button createWizardBtn;
	private Button refreshStaleBtn;
	
	GenModelConfigurationPage(String pageId, ResourceLocationProvider rlp, ResourceSet resourceSet) {
		super(pageId, rlp, resourceSet);
		setTitle(Messages.TransformToGenModelWizard_title_genmodel);
		setDescription(Messages.TransformToGenModelWizard_descr_genmodel);
		setModelFileExtension("genmodel"); //$NON-NLS-1$
	}
	
	@Override
	protected void createAdditionalControls(Composite parent) {
		Composite createComposite = new Composite(parent, SWT.NONE);
		createComposite.setLayout(new GridLayout(2, true));
		createComposite.setLayoutData(createGridData());

		createWizardBtn = new Button(createComposite, SWT.PUSH);
		createWizardBtn.setText(Messages.GenModelConfigurationPage_btn_new_wizard);
		setButtonLayoutData(createWizardBtn);

		refreshStaleBtn = new Button(createComposite, SWT.PUSH);
		refreshStaleBtn.setText(Messages.GenModelConfigurationPage_btn_refresh_stale);
		setButtonLayoutData(refreshStaleBtn);

		SelectionAdapter selectionAdapter = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				handleSelection(e.widget);
			}
		};
		createWizardBtn.addSelectionListener(selectionAdapter);
		refreshStaleBtn.addSelectionListener(selectionAdapter);
	}

	private GridData createGridData() {
		GridData gd = new GridData();
		gd.horizontalAlignment = GridData.FILL;
		gd.grabExcessHorizontalSpace = true;
		return gd;
	}
	
	void handleSelection(Widget w) {
		if (createWizardBtn.equals(w)) {
			launchWizard();
		} else if (refreshStaleBtn.equals(w)) {
			refreshGenmodel();
		}
	}

	@Override
	protected void initControls() {
		super.initControls();
		if (getURI() == null) {
			findGenmodel();
		} else {
			updateControls();
		}
	}
	
	void findGenmodel() {
		try {
			GenModel genModel = getOperation().findGenmodel();
			if (genModel != null) {
				Resource r = genModel.eResource();
				URI genURI = r.getURI();
				setURI(genURI);
				updateURI();
			} else {
				setPageComplete(true);
				updateControls();
			}
		} catch (CoreException e) {
			setErrorMessage(e.getMessage());
			updateControls();
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.gmf.internal.common.ui.ModelSelectionPage#resourceChanged()
	 */
	@Override
	protected void resourceChanged() {
		super.resourceChanged();
		updateControls();
		setPageComplete(getResource() != null);
	}

	private void updateControls() {
		IStatus stale = getOperation().getStaleGenmodelStatus();
		if (stale != null && !stale.isOK()) {
			setStatusMessage(stale);
			refreshStaleBtn.setEnabled((getURI() != null));
		} else {
			refreshStaleBtn.setEnabled(false);
		}
	}

	@Override
	protected Resource doLoadResource(IProgressMonitor monitor) throws CoreException {
		GenModel genModel = getOperation().loadGenModel(getURI(), monitor);
		if (genModel == null) {
			return null;
		}
		return genModel.eResource();
	}

	private void launchWizard() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		IFile mapFile = wizard.getMapFile();
		IFile genmodel = createWithWizard(getShell(), mapFile);
		if (genmodel != null) {
			setURI(URI.createPlatformResourceURI(genmodel.getFullPath().toString(), true));
			updateURI();
		}
	}
	
	private static IFile createWithWizard(Shell shell, IFile patternResource) {
		final IFile[] result = new IFile[1];
		EMFModelWizard wizard = new EMFModelWizard() {
			@Override
			public boolean performFinish() {
				result[0] = ResourcesPlugin.getWorkspace().getRoot().getFile(genModelContainerPath.append(genModelFileName));
				return super.performFinish();
			}
		};
		wizard.init(PlatformUI.getWorkbench(), createSelectionForEMFWizard(patternResource));
		if (Window.OK == new WizardDialog(shell, wizard).open()) {
			assert result[0] != null;
			return result[0];
		}
		return null;
	}
	private static StructuredSelection createSelectionForEMFWizard(IFile patternResource) {
		final IContainer parent = patternResource.getParent();
		IFile neighbour = parent.getFile(new Path(patternResource.getName()).removeFileExtension().addFileExtension(FILE_EXT_ECORE));
		if (neighbour.exists()) {
			return new StructuredSelection(neighbour);
		} else {
			return new StructuredSelection(patternResource);
		}
	}

	private void refreshGenmodel() {
		IPath p = new Path(getURI().path()).removeFirstSegments(1);
		IFile genModelFile = ResourcesPlugin.getWorkspace().getRoot().getFile(p);
		GenModelReloadActionDelegate action = new GenModelReloadActionDelegate();
		IAction uiAction = new Action() {
			//empty
		};
		action.selectionChanged(uiAction, new StructuredSelection(genModelFile));
		action.run(uiAction);
		updateURI();
	}

	private SimpleTransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}

}

