package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.NodeMapping;
import org.eclipse.gmf.tooldef.CreationTool;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference;

public class NewSubNodeTrigger extends NewTopNodeTrigger {
	
	public NewSubNodeTrigger(TransactionalEditingDomain domain, SimpleParentNode parent, SimpleSubNodeReference newSubNodeReference) {
		super(domain, parent, newSubNodeReference);
	}

	@Override
	public void executeTrigger() {
		
		Node newNode = GMFGraphFactory.eINSTANCE.createNode();
		DiagramLabel newLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();
		
		Label parentLabel = getLabelFigure(parent);
		
		BasicFont parentFont = parentLabel!=null?(BasicFont)parentLabel.getFont():null;
		
		updateCanvas(newNode, newLabel, parentFont);
		
		CreationTool newCreationTool =  createNewTool();
		
		if(parent instanceof SimpleCompartment)
		{
			SimpleNode parentNode = (SimpleNode)((SimpleCompartment)parent).getParent();
			updateMapping(parentNode, newNode, newLabel, newCreationTool, ((SimpleCompartment)parent).getCompartmentMapping());
		}else
			updateMapping((SimpleNode)parent, newNode, newLabel, newCreationTool);

	}
	
	protected void updateCanvas(Node newNode, DiagramLabel newLabel, BasicFont parentFont)
	{
		canvasFactory.createDefaultRoundedRectangleWithLabel(newNode, newLabel, false, parentFont);
	}
	
	
	/**
	 * El padre es un Top Node
	 * @param parentTopNode
	 * @param newNode
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode, Node newNode, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		updateMapping(parentNode, newNode, newLabel, newCreationTool, null);
	}

	
	/**
	 * El padre es un Compartment
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode, Node newNode, DiagramLabel newLabel, CreationTool newCreationTool, CompartmentMapping compartment)
	{
		NodeMapping newNodeMapping = createNewNodeMapping(newNode, newLabel, newCreationTool);
		
		ChildReference newChildReference = GMFMapFactory.eINSTANCE.createChildReference();
		
		newChildReference.setOwnedChild(newNodeMapping);
		
		if(compartment!=null)
			newChildReference.setCompartment(compartment);
		
		parentNode.getNodeReference().getChild().getChildren().add(newChildReference);

		newSimpleNode.setNodeReference(newChildReference);

	}

}
