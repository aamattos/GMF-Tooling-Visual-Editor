package com.isb.simple.gmfmap.simplemappings.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.internal.bridge.wizards.pages.simple.DomainModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class SimpleMapEditorCreationWizard extends Wizard implements INewWizard {

	/**
	 * @generated
	 */
	private IWorkbench workbench;

	/**
	 * @generated
	 */
	protected IStructuredSelection selection;

	/**
	 * @generated
	 */
	protected SimplemapCreationWizardPage diagramModelFilePage;

	protected DomainModelSelectionPage domainModelSelectionPage;
	
	/**
	 * @generated
	 */
	protected Resource diagram;

	/**
	 * @generated
	 */
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	 * @generated
	 */
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	 * @generated
	 */
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	 * @generated
	 */
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	 * @generated
	 */
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void setOpenNewlyCreatedDiagramEditor(
			boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	 * @generated
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(Messages.SimplemapCreationWizardTitle);
		setDefaultPageImageDescriptor(SimplemapDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewSimplemappingsWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	 * @generated
	 */
	public void addPages() {
		
		ResourceLocationProvider rloc = new ResourceLocationProvider(selection);
		ResourceSet resourceSet = new ResourceSetImpl();
		
		diagramModelFilePage = new SimplemapCreationWizardPage(
				"DiagramModelFile", getSelection(), "simplemappings"); //$NON-NLS-1$ //$NON-NLS-2$
		diagramModelFilePage
				.setTitle(Messages.SimplemapCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage
				.setDescription(Messages.SimplemapCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);
		
		domainModelSelectionPage = new DomainModelSelectionPage("DomainModelSelectionPage", rloc, resourceSet);
		domainModelSelectionPage.setTitle(org.eclipse.gmf.internal.bridge.wizards.Messages.SimpleModelWizardDomainModelSelectionPageTitle);
		domainModelSelectionPage.setDescription(org.eclipse.gmf.internal.bridge.wizards.Messages.SimpleModelWizardDomainModelSelectionPageDesc);
		domainModelSelectionPage.setModelRequired(true);
		
		addPage(domainModelSelectionPage);

	}

	/**
	 * @generated not
	 */
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				
				EClass domainMetaElement = domainModelSelectionPage.getDiagramElement();
				EPackage domainModel = domainModelSelectionPage.getContents();
				
				diagram = SimpleMapEditorDiagramEditorUtil.createDiagram(
						diagramModelFilePage.getURI(), domainMetaElement, domainModel, monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						SimpleMapEditorDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog
								.openError(
										getContainer().getShell(),
										Messages.SimplemapCreationWizardOpenEditorError,
										null, e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						Messages.SimplemapCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				SimplemapDiagramEditorPlugin.getInstance().logError(
						"Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}

	
}
