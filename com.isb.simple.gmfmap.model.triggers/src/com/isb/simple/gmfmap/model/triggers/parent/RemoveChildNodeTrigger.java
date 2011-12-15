package com.isb.simple.gmfmap.model.triggers.parent;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DecorationFigure;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.tooldef.AbstractTool;

import com.isb.simple.gmfmap.model.triggers.AbstractTrigger;
import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference;

public class RemoveChildNodeTrigger extends AbstractTrigger {
	
	private List<SimpleChildNode> removedNodes = new ArrayList<SimpleChildNode>();

	public RemoveChildNodeTrigger(TransactionalEditingDomain domain, SimpleChildNode removedNode) {
		super(domain);
		
		this.removedNodes.add(removedNode);
	}

	public RemoveChildNodeTrigger(TransactionalEditingDomain domain, List<SimpleChildNode> removedNodes) {
		super(domain);
		
		this.removedNodes.addAll(removedNodes);
	}
	
	
	@Override
	public void executeTrigger() {
		
		for(SimpleChildNode removedNode:removedNodes)
			removeChildNode(removedNode);
	}
	
	private void removeChildNode(SimpleChildNode removedNode)
	{
		if(removedNode instanceof SimpleNode)
			removeSimpleNode((SimpleNode)removedNode);
		
		if(removedNode instanceof SimpleCompartment)
			removeCompartment((SimpleCompartment)removedNode);
		
		if(removedNode instanceof SimpleLinkMapping)
			removeLinkMapping((SimpleLinkMapping)removedNode);
		
	}
	
	private void removeSimpleNode(SimpleNode removedNode)
	{
		if(removedNode instanceof SimpleSubNodeReference)
			for(SimpleChildNode childNode: ((SimpleSubNodeReference)removedNode).getChildren())
				removeChildNode(childNode);
		
		NodeReference nodeReferenceToRemove = removedNode.getNodeReference();
		
		AbstractTool toolToRemove = removedNode.getTool();
		
		List<DiagramElement> diagramElementsToRemove = collectDiagramElementsToRemove(removedNode);
		
		List<FigureDescriptor> figureDescToRemove = new ArrayList<FigureDescriptor>();
		
		for(DiagramElement diagramElement:diagramElementsToRemove)
			if(diagramElement.getFigure()!=null)
				figureDescToRemove.add(diagramElement.getFigure());
		
		
		for(FigureDescriptor figDesc: figureDescToRemove)
			EcoreUtil.delete(figDesc);
		
		for(DiagramElement diagramElement: diagramElementsToRemove)
			EcoreUtil.delete(diagramElement);
		
		if(toolToRemove!=null && canRemove(toolToRemove))
			EcoreUtil.delete(toolToRemove);
		
		if(nodeReferenceToRemove!=null)
			EcoreUtil.delete(nodeReferenceToRemove);
	}
	
	private List<DiagramElement> collectDiagramElementsToRemove(SimpleNode removedNode)
	{
		List<DiagramElement> diagramElementsToRemove = new ArrayList<DiagramElement>();
		
		NodeReference nodeReferenceToRemove = removedNode.getNodeReference();
		
		NodeMapping nodeMapping = nodeReferenceToRemove.getChild();
		
		if(nodeMapping!=null)
		{
			Node nodeToRemove = nodeMapping.getDiagramNode();
			
			if(nodeToRemove!=null && canRemove(nodeToRemove))
				diagramElementsToRemove.add(nodeToRemove);
				
			
			for(LabelMapping labelMapping:nodeMapping.getLabelMappings())
				if(labelMapping.getDiagramLabel()!=null && canRemove(labelMapping.getDiagramLabel()))
					diagramElementsToRemove.add(labelMapping.getDiagramLabel());
		}
		
		return diagramElementsToRemove;
	}
	
	private List<DiagramElement> collectDiagramElementsToRemove(SimpleLinkMapping removedLinkMapping)
	{
		List<DiagramElement> diagramElementsToRemove = new ArrayList<DiagramElement>();
		
		LinkMapping linkMapping = removedLinkMapping.getLinkMapping();
		
		if(linkMapping!=null)
		{
			Connection connectionToRemove = linkMapping.getDiagramLink();
			
			if(connectionToRemove!=null && canRemove(connectionToRemove))
				diagramElementsToRemove.add(connectionToRemove);
				
			
			for(LabelMapping labelMapping:linkMapping.getLabelMappings())
				if(labelMapping.getDiagramLabel()!=null && canRemove(labelMapping.getDiagramLabel()))
					diagramElementsToRemove.add(labelMapping.getDiagramLabel());
		}
		
		return diagramElementsToRemove;
	}

	
	private void removeCompartment(SimpleCompartment removedCompartment)
	{
		for(SimpleChildNode childNode: removedCompartment.getChildren())
			removeChildNode(childNode);
		
		CompartmentMapping compartmentMappingToRemove = removedCompartment.getCompartmentMapping();
		Compartment compartmentToRemove = removedCompartment.getCompartment();
		
		if(compartmentToRemove!=null && canRemove(compartmentToRemove))
		{
			FigureDescriptor labelFigDesToRemove = compartmentToRemove!=null?compartmentToRemove.getFigure():null;
			ChildAccess accessorToRemove = compartmentToRemove!=null?compartmentToRemove.getAccessor():null;
			

			if(labelFigDesToRemove!=null && canRemove(labelFigDesToRemove))
				EcoreUtil.delete(labelFigDesToRemove);
			
			
			if(accessorToRemove!=null && canRemove(accessorToRemove))
			{
				Figure compartmentFigDesToRemove = accessorToRemove!=null?accessorToRemove.getFigure():null;
				
				if(compartmentFigDesToRemove!=null)
					EcoreUtil.delete(compartmentFigDesToRemove);
				
				EcoreUtil.delete(accessorToRemove);
			}


			EcoreUtil.delete(compartmentToRemove);

		}
		
		if(compartmentMappingToRemove!=null)
			EcoreUtil.delete(compartmentMappingToRemove);
	}
	
	private void removeLinkMapping(SimpleLinkMapping removedLinkMapping)
	{
		AbstractTool toolToRemove = removedLinkMapping.getTool();
		
		LinkMapping linkMappingToRemove = removedLinkMapping.getLinkMapping();
		
		List<DiagramElement> diagramElementsToRemove = collectDiagramElementsToRemove(removedLinkMapping);
		
		List<FigureDescriptor> figureDescToRemove = new ArrayList<FigureDescriptor>();
		
		DecorationFigure targetDecorationToRemove = null;
		DecorationFigure sourceDecorationToRemove = null;
		
		for(DiagramElement diagramElement:diagramElementsToRemove)
			if(diagramElement.getFigure()!=null)
			{
				figureDescToRemove.add(diagramElement.getFigure());
				if(diagramElement.getFigure().getActualFigure() instanceof PolylineConnection)
				{
					targetDecorationToRemove = ((PolylineConnection)diagramElement.getFigure().getActualFigure()).getTargetDecoration();
					sourceDecorationToRemove = ((PolylineConnection)diagramElement.getFigure().getActualFigure()).getSourceDecoration();
				}
			}
			
		
		
		for(FigureDescriptor figDesc: figureDescToRemove)
			EcoreUtil.delete(figDesc);
		
		for(DiagramElement diagramElement: diagramElementsToRemove)
			EcoreUtil.delete(diagramElement);

		if(toolToRemove!=null && canRemove(toolToRemove))
			EcoreUtil.delete(toolToRemove);
		
		if(linkMappingToRemove!=null)
			EcoreUtil.delete(linkMappingToRemove);
		
		if(targetDecorationToRemove!=null)
			EcoreUtil.delete(targetDecorationToRemove);
		
		if(sourceDecorationToRemove!=null)
			EcoreUtil.delete(sourceDecorationToRemove);
		
	}
	
}
