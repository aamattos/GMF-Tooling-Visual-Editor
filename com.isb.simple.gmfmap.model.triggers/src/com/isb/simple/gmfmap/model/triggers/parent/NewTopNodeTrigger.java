package com.isb.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.mappings.TopNodeReference;
import org.eclipse.gmf.tooldef.CreationTool;

import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;

class NewTopNodeTrigger extends NewElementTrigger {
	
	protected SimpleNode newSimpleNode;
	protected SimpleParentNode parent;

	public NewTopNodeTrigger(TransactionalEditingDomain domain, SimpleParentNode parent, SimpleNode newSimpleNode) {
		super(domain, newSimpleNode);
		
		this.newSimpleNode = newSimpleNode;
		this.parent = parent;

	}

	@Override
	public void executeTrigger() {
		
		Node newNode = GMFGraphFactory.eINSTANCE.createNode();
		DiagramLabel newLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		
		Label parentLabel = getLabelFigure(parent);
		
		BasicFont parentFont = parentLabel!=null?(BasicFont)parentLabel.getFont():null;

		updateCanvas(newNode, newLabel, parentFont);
		
		CreationTool newCreationTool =  createNewTool();

		updateMapping((SimpleMapping)parent, newNode, newLabel, newCreationTool);

	}
	
	
	protected void updateCanvas(Node newNode, DiagramLabel newLabel, BasicFont parentFont)
	{
		canvasFactory.createDefaultRoundedRectangleWithLabel(newNode, newLabel, true, parentFont);
	}
	

	/**
	 * El padre es el diagrama:
	 * @param mapping
	 * @param newNode
	 * @param newLabel
	 * @param newCreationTool
	 */
	protected void updateMapping(SimpleMapping mapping, Node newNode, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		NodeMapping newNodeMapping = createNewNodeMapping(newNode, newLabel, newCreationTool);

		TopNodeReference newTopNodeReference = GMFMapFactory.eINSTANCE.createTopNodeReference();
		
		newTopNodeReference.setOwnedChild(newNodeMapping);
		
		mapping.getMapping().getNodes().add(newTopNodeReference);
		
		newSimpleNode.setNodeReference(newTopNodeReference);
		
	}
	
	
	protected NodeMapping createNewNodeMapping(Node newNode, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		NodeMapping newNodeMapping = GMFMapFactory.eINSTANCE.createNodeMapping();
		
		//Diagram Node
		newNodeMapping.setDiagramNode(newNode);
		
		//Tool
		newNodeMapping.setTool(newCreationTool);
		
		//Feature Label Mapping
		FeatureLabelMapping labelMapping = GMFMapFactory.eINSTANCE.createFeatureLabelMapping();
		labelMapping.setDiagramLabel(newLabel);
		
		newNodeMapping.getLabelMappings().add(labelMapping);
		
		return newNodeMapping;

	}
	

}
