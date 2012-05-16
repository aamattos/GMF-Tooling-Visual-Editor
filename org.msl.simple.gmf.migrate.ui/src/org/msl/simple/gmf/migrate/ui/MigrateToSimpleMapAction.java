package org.msl.simple.gmf.migrate.ui;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimpleMapEditorDiagramEditorUtil;

public class MigrateToSimpleMapAction implements IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;
	
	private IStructuredSelection sselection;


	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		
		final IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
		sselection = structuredSelection;
		
		action.setEnabled(true);
	}
	

	@Override
	public void run(IAction action) {
		
		TransformToSimpleMappingWizard wizard = new TransformToSimpleMappingWizard();
		wizard.init(PlatformUI.getWorkbench(), sselection);

		SimpleMapEditorDiagramEditorUtil.runWizard(getShell(), wizard,
				"InitDiagramFile"); //$NON-NLS-1$

	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}
}
