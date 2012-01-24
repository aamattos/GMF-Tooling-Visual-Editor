package org.msl.simple.gmf.migrate.ui;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import org.msl.simple.gmfmap.simplemappings.diagram.part.Messages;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimpleMapEditorDiagramEditorUtil;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapCreationWizard;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;

public class TransformToSimpleMappingWizard extends SimplemapCreationWizard {
	
	private Mapping myMapping;
	private Canvas myCanvas;
	private Palette myPalette;
	
	public TransformToSimpleMappingWizard() {
	}

	

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		super.init(workbench, selection);
		
		TransformToSimpleMappingOperation myOperation = new TransformToSimpleMappingOperation(createResourceSet());
		URI uri = URI.createPlatformResourceURI(getMapFile() .getFullPath()
				.toString(), true);
		try {
			myOperation.loadMappingModel(uri , new NullProgressMonitor());
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		myMapping = myOperation.getMapping();
		myCanvas = myMapping!=null?myMapping.getDiagram().getDiagramCanvas():null;
		myPalette = myMapping!=null?myMapping.getDiagram().getPalette():null;
		
	}



	@Override
	public boolean performFinish() {
		
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = new SimplemapMigrationEditorUtil().createDiagram(
						diagramModelFilePage.getURI(),
						monitor,
						myMapping, myCanvas, myPalette);
				
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
	
	protected ResourceSet createResourceSet() {
		final ResourceSetImpl rs = new ResourceSetImpl();
		rs.getURIConverter().getURIMap().putAll(EcorePlugin.computePlatformURIMap());
		return rs;
	}
	
	IFile getMapFile() {
		return (IFile) selection.getFirstElement();
	}
	
}
