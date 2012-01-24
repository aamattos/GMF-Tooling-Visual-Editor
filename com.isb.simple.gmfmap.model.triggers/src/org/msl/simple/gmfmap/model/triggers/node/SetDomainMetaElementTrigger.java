package org.msl.simple.gmfmap.model.triggers.node;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.tooldef.AbstractTool;

import org.msl.simple.gmfmap.simplemappings.SimpleNode;

class SetDomainMetaElementTrigger extends AbstractSimpleNodeTrigger {
	
	private EClass newElement;

	public SetDomainMetaElementTrigger(TransactionalEditingDomain domain, SimpleNode simpleNode, EClass newElement) {
		super(domain, simpleNode);
		
		this.newElement = newElement;
	}

	@Override
	public void executeTrigger() {
		
		String newElementName = newElement!=null?newElement.getName():"";
		
		updateMapping();
		updateCanvas(newElementName);
	}
	
	
	private void updateMapping()
	{
		if(simpleNode.getNodeReference()!=null)
			simpleNode.getNodeReference().getChild().setDomainMetaElement(newElement);
	}
	
	
	private void updateCanvas(String newElementName)
	{
		
		DiagramLabel diagramLabelToRename = simpleNode.getDiagramLabel();
		Node nodeToRename = simpleNode.getDiagramNode();
		AbstractTool toolToRename = simpleNode.getTool();
		
		//Node Name
		if(nodeToRename!=null && canRename(nodeToRename))
		{
			String newNodeName = getNewCanvasElementName(newElementName, nodeToRename);
			nodeToRename.setName(newNodeName);
			
			renameNode(nodeToRename, newElementName);
		}
			
		
		//Tool Name
		if(toolToRename!=null && canRename(toolToRename))
		{
			String newToolName = getNewToolName(newElementName, toolToRename);
			toolToRename.setTitle(newToolName);
			toolToRename.setDescription("Create new " + newElementName);
		}
		
		//Label Mapping Name
		String newDiagramLabelName = newElementName + "Name";
		
		if(diagramLabelToRename!=null && canRename(diagramLabelToRename))
		{
			String newLabelName = getNewCanvasElementName(newDiagramLabelName, diagramLabelToRename);
			diagramLabelToRename.setName(newLabelName);
			
			renameNode(diagramLabelToRename, newElementName);
		}


	}
	
	private void renameNode(Node nodeToRename, String newElementName)
	{
		String newFigureName = newElementName + "Figure";

		//Figure Descriptor Name
		FigureDescriptor figDesc = nodeToRename.getFigure();
		
		String newFigDescName = getNewCanvasElementName(newFigureName, figDesc); 
		
		figDesc.setName(newFigDescName);

		//Figure Name
		if(figDesc.getActualFigure() instanceof RealFigure)
			((RealFigure)figDesc.getActualFigure()).setName(newFigDescName);
	
		if(nodeToRename instanceof DiagramLabel)
		{
			ChildAccess labelAccessor = ((DiagramLabel)nodeToRename).getAccessor();
			
			if(labelAccessor!=null && labelAccessor.getFigure() instanceof Label)
			{
				//Label and Label Accessor Name
				String newLabelName = newElementName + "NameFigure";
				String newLabelAccessorName = "getFigure" + newLabelName;
				
				((Label)labelAccessor.getFigure()).setName(newLabelName);
				labelAccessor.setAccessor(newLabelAccessorName);
			}
			
		}
				

	}
	


	
}
