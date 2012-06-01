package org.msl.simple.gmf.migrate.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.tooldef.Palette;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsFactory;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorUtil;

/**
 * @generated
 */
public class SimplemapMigrationEditorUtil extends SimplemapDiagramEditorUtil{


	private SimpleMapping simpleMapping;
	
	/**
	 * This method should be called within a workspace modify operation since it creates resources.
	 * @generated
	 */
	public Resource createDiagram(URI diagramURI,
			IProgressMonitor progressMonitor, final Mapping myMapping, final Canvas myCanvas, final Palette myPalette) {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		progressMonitor.beginTask(
				org.msl.simple.gmfmap.simplemappings.diagram.part.Messages.SimplemapDiagramEditorUtil_CreateDiagramProgressTask,
				3);
		final Resource diagramResource = editingDomain.getResourceSet()
				.createResource(diagramURI);

		final String diagramName = diagramURI.lastSegment();
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(
				editingDomain,
				org.msl.simple.gmfmap.simplemappings.diagram.part.Messages.SimplemapDiagramEditorUtil_CreateDiagramCommandLabel,
				Collections.EMPTY_LIST) {
			protected CommandResult doExecuteWithResult(
					IProgressMonitor monitor, IAdaptable info)
					throws ExecutionException {
				SimpleMapping model = createInitialModel(myMapping, myCanvas, myPalette);
				attachModelToResource(model, diagramResource);

				Diagram diagram = ViewService.createDiagram(model,
						SimpleMappingEditPart.MODEL_ID,
						SimplemapDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
				if (diagram != null) {
					diagramResource.getContents().add(diagram);
					diagram.setName(diagramName);
					diagram.setElement(model);
				}

				try {
					diagramResource
							.save(org.msl.simple.gmfmap.simplemappings.diagram.part.SimpleMapEditorDiagramEditorUtil
									.getSaveOptions());
				} catch (IOException e) {

					SimplemapDiagramEditorPlugin.getInstance().logError(
							"Unable to store model and diagram resources", e); //$NON-NLS-1$
				}
				return CommandResult.newOKCommandResult();
			}
		};
		try {
			OperationHistoryFactory.getOperationHistory().execute(command,
					new SubProgressMonitor(progressMonitor, 1), null);
		} catch (ExecutionException e) {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Unable to create model and diagram", e); //$NON-NLS-1$
		}
		setCharset(WorkspaceSynchronizer.getFile(diagramResource));
		return diagramResource;
	}

	/**
	 * Create a new instance of domain element associated with canvas.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMapping createInitialModel(Mapping myMapping, Canvas myCanvas, Palette myPalette) {
		
		simpleMapping = SimplemappingsFactory.eINSTANCE
				.createSimpleMapping();
		
		simpleMapping.setMapping(myMapping);
		simpleMapping.setCanvas(myCanvas);
		simpleMapping.setPalette(myPalette);
		
		simpleMapping.getChildren().addAll(createNodes(myMapping));
		
		//createNodeLinkRelations();
		
		return simpleMapping;
		
	}
	
	private List<SimpleChildNode> createNodes(Mapping myMapping)
	{
		List<SimpleChildNode> children = new ArrayList<SimpleChildNode>();
		
		for(TopNodeReference topNodeRef:myMapping.getNodes())
			children.add(createTopNode(topNodeRef));
		
		for(LinkMapping linkMapping:myMapping.getLinks())
			children.add(createLinkMappingNode(linkMapping));
		
		return children;
	}
	
	private SimpleTopNode createTopNode(TopNodeReference topNodeReference)
	{
		SimpleTopNode topNode = SimplemappingsFactory.eINSTANCE.createSimpleTopNode();
		
		topNode.setContainmentFeature(topNodeReference.getContainmentFeature());
		
		NodeMapping nodeMapping = topNodeReference.getChild();
		
		if(nodeMapping!=null)
		{
			topNode.setDomainMetaElement(nodeMapping.getDomainMetaElement());	

			for(ChildReference childReference:nodeMapping.getChildren())
				createChild(topNode, childReference);
				
		}
		
		topNode.setNodeReference(topNodeReference);
		
		return topNode;
	}
	
	private SimpleLinkMapping createLinkMappingNode(LinkMapping linkMapping)
	{
		SimpleLinkMapping simpleLinkMapping = SimplemappingsFactory.eINSTANCE.createSimpleLinkMapping();
		
		simpleLinkMapping.setLinkMapping(linkMapping);
		
		Connection diagramLink = linkMapping.getDiagramLink();
		
		if(diagramLink!=null)
			simpleLinkMapping.setName(diagramLink.getName());
		
		
		return simpleLinkMapping;
	}
	
	private void createChild(SimpleParentNode parentNode, ChildReference childReference)
	{
		SimpleParentNode parent = parentNode;
		
		CompartmentMapping compartmentMapping = childReference.getCompartment();
		
		if(compartmentMapping!=null)
		{
			SimpleCompartment simpleCompartment = findSimpleCompartment(parentNode, compartmentMapping);
			
			if(simpleCompartment==null)
			{
				simpleCompartment = SimplemappingsFactory.eINSTANCE.createSimpleCompartment();
				simpleCompartment.setCompartmentMapping(compartmentMapping);
				
				simpleCompartment.setName(compartmentMapping.getCompartment().getName());
				
				parentNode.getChildren().add(simpleCompartment);
			}
			
			parent = simpleCompartment;
		}
		
		NodeMapping nodeMapping = childReference.getChild();
		
		SimpleNode newChild = null;
		
		//Es un sub label:
		if(nodeMapping.getDiagramNode() instanceof DiagramLabel)
		{
			newChild = SimplemappingsFactory.eINSTANCE.createSimpleLabelNode();
			parent.getChildren().add(newChild);
			
		}else if(nodeMapping.getDiagramNode() instanceof Node)
		{
			newChild = SimplemappingsFactory.eINSTANCE.createSimpleSubNode();
			parent.getChildren().add(newChild);
			
			for(ChildReference childReference2:nodeMapping.getChildren())
				createChild((SimpleSubNode)newChild, childReference2);
		}
			
		
		if(newChild!=null)
		{
			newChild.setContainmentFeature(childReference.getContainmentFeature());
			newChild.setDomainMetaElement(nodeMapping.getDomainMetaElement());	
			newChild.setNodeReference(childReference);
		}

	}
	
	private SimpleCompartment findSimpleCompartment(SimpleParentNode parentNode, CompartmentMapping compartmentMapping)
	{
		for(SimpleChildNode child:parentNode.getChildren())
			if(child instanceof SimpleCompartment && ((SimpleCompartment)child).getCompartmentMapping()==compartmentMapping)
				return (SimpleCompartment)child;
		return null;
	}
	
	/**
	 * Store model element in the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void attachModelToResource(SimpleMapping model,
			Resource resource) {
		resource.getContents().add(model);
	}

}
