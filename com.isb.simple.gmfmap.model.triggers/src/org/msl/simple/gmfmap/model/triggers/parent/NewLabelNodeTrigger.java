package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.FeatureLabelMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.tooldef.CreationTool;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;

public class NewLabelNodeTrigger extends NewElementTrigger {
	
	private SimpleParentNode parent;
	private SimpleLabelNode newLabelNode;
	private BasicFont parentFont;
	

	public NewLabelNodeTrigger(TransactionalEditingDomain domain, SimpleParentNode parent, SimpleLabelNode newLabelNode) {
		super(domain, newLabelNode);
		
		this.newLabelNode = newLabelNode;
		this.parent = parent;
	}

	@Override
	public void executeTrigger() {
		
		DiagramLabel newLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
	
		Label parentLabel = getLabelFigure(parent);
		
		BasicFont parentBasicFont = parentLabel!=null?(BasicFont)parentLabel.getFont():null;
		
		updateCanvas(newLabel, parentBasicFont);
		
		CreationTool newCreationTool =  createNewTool();
		
		if(parent instanceof SimpleNode)
			updateMapping((SimpleNode)parent, newLabel, newCreationTool);
		
		if(parent instanceof SimpleCompartment)
		{
			SimpleNode parentNode = (SimpleNode)((SimpleCompartment)parent).getParent();
			updateMapping(parentNode, newLabel, newCreationTool, ((SimpleCompartment)parent).getCompartmentMapping());
		}
		

	}
	
	
	private void updateCanvas(DiagramLabel newLabel, BasicFont parentFont)
	{
		canvasFactory.createDefaultLabelFigure(newLabel, parentFont);
		
		//newLabelNode.setDiagramLabel(newLabel);
	}
	
	/**
	 * El padre es un Top Node
	 * @param parentTopNode
	 * @param newNode
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		updateMapping(parentNode, newLabel, newCreationTool, null);
	}

	
	/**
	 * El padre es un Compartment
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode, DiagramLabel newLabel, CreationTool newCreationTool, CompartmentMapping compartment)
	{
		ChildReference newChildReference = GMFMapFactory.eINSTANCE.createChildReference();
		
		NodeMapping newNodeMapping = GMFMapFactory.eINSTANCE.createNodeMapping();
		
		newChildReference.setOwnedChild(newNodeMapping);
		
		if(compartment!=null)
			newChildReference.setCompartment(compartment);
		
		//Diagram Node
		newNodeMapping.setDiagramNode(newLabel);
		
		//Tool
		newNodeMapping.setTool(newCreationTool);
		
		//Feature Label Mapping
		FeatureLabelMapping labelMapping = GMFMapFactory.eINSTANCE.createFeatureLabelMapping();
		labelMapping.setDiagramLabel(newLabel);
		
		newNodeMapping.getLabelMappings().add(labelMapping);
		
		parentNode.getNodeReference().getChild().getChildren().add(newChildReference);

		newLabelNode.setNodeReference(newChildReference);

	}



}
