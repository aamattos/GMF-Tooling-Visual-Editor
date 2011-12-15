package com.isb.simple.gmf.migrate.ui;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.tooldef.Palette;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

import com.isb.simple.gmfmap.simplemappings.diagram.part.Messages;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapCreationWizard;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorUtil;

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
		
		Mapping mapping = myOperation.getMapping();
		Canvas canvas = mapping!=null?mapping.getDiagram().getDiagramCanvas():null;
		Palette palette = mapping!=null?mapping.getDiagram().getPalette():null;
		
		Collection<EObject> mySource = new ArrayList<EObject>();
		Collection<EObject> myCopy = new ArrayList<EObject>();
		
		if(mapping!=null && canvas!=null && palette!=null)
		{
			mySource.add(mapping);
			mySource.add(canvas);
			mySource.add(palette);
			
			myCopy = EcoreUtil.copyAll(mySource);
					
			myMapping = (Mapping)myCopy.toArray()[0];
			myCanvas = (Canvas)myCopy.toArray()[1];
			myPalette = (Palette)myCopy.toArray()[2];
		}
			
		
	}



	@Override
	public boolean performFinish() {
		
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor)
					throws CoreException, InterruptedException {
				diagram = new SimplemapMigrationEditorUtil().createDiagram(
						diagramModelFilePage.getURI(),
						domainModelFilePage.getURI(), monitor,
						myMapping, myCanvas, myPalette);
				
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						SimplemapDiagramEditorUtil.openDiagram(diagram);
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
