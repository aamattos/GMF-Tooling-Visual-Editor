package org.msl.simple.gmfmap.model.triggers.link;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.msl.simple.gmfmap.model.triggers.AbstractTrigger;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;

class SetLinkMappingNameTrigger extends AbstractTrigger {
	
	private SimpleLinkMapping simpleLinkMapping;
	private String newName;

	public SetLinkMappingNameTrigger(TransactionalEditingDomain domain, SimpleLinkMapping linkMapping, String newName) {
		super(domain);
		
		this.simpleLinkMapping = linkMapping;
		this.newName = newName;
	}

	@Override
	public void executeTrigger() {
		
		updateCanvas();
		
	}
	
	
	private void updateCanvas()
	{
		
		Connection connectionToRename = simpleLinkMapping.getDiagramLink();
		AbstractTool toolToRename = simpleLinkMapping.getTool();
		DiagramLabel diagramLabelToRename = simpleLinkMapping.getDiagramLabel();
		
		//Connection Name
		if(connectionToRename!=null && canRename(connectionToRename))
		{
			String newLinkName = getNewCanvasElementName(newName, connectionToRename);
			connectionToRename.setName(newLinkName);
			
			renameConnection(connectionToRename, newName);
		}
		
		//Label Mapping Name
		String newDiagramLabelName = newName + "ConnectionName";
		
		if(diagramLabelToRename!=null && canRename(diagramLabelToRename))
		{
			String newLabelName = getNewCanvasElementName(newDiagramLabelName, diagramLabelToRename);
			diagramLabelToRename.setName(newLabelName);
			
			renameLabel(diagramLabelToRename, newName + "ConnectionLabel");
		}

		
		//Tool Name
		if(toolToRename!=null && canRename(toolToRename))
		{
			String newToolName = getNewToolName(newName, toolToRename);
			toolToRename.setTitle(newToolName);
			toolToRename.setDescription("Create new " + newName + "Connection");
		}
	}

	private void renameConnection(Connection connectionToRename, String newElementName)
	{
		String newFigureName = newElementName + "ConnectionFigure";

		//Figure Descriptor Name
		FigureDescriptor figDesc = connectionToRename.getFigure();
		
		String newFigDescName = getNewCanvasElementName(newFigureName, figDesc); 
		
		figDesc.setName(newFigDescName);

		//Figure Name
		if(figDesc.getActualFigure() instanceof RealFigure)
			((RealFigure)figDesc.getActualFigure()).setName(newFigDescName);

		
		String newTargetDecorationName = newName + "TargetDecoration";
		String newSourceDecorationName = newName + "SourceDecoration";
		
		if(figDesc.getActualFigure() instanceof PolylineConnection)
		{
			PolylineConnection polylineConnection = (PolylineConnection)figDesc.getActualFigure();
			
			if(polylineConnection.getTargetDecoration()!=null)
				polylineConnection.getTargetDecoration().setName(newTargetDecorationName);

			if(polylineConnection.getSourceDecoration()!=null)
				polylineConnection.getSourceDecoration().setName(newSourceDecorationName);
			
		}

	}
	
	private void renameLabel(DiagramLabel labelToRename, String newElementName)
	{
		String newFigureName = newElementName + "Figure";

		//Figure Descriptor Name
		FigureDescriptor figDesc = labelToRename.getFigure();
		
		String newFigDescName = getNewCanvasElementName(newFigureName, figDesc); 
		
		figDesc.setName(newFigDescName);

		//Figure Name
		if(figDesc.getActualFigure() instanceof RealFigure)
			((RealFigure)figDesc.getActualFigure()).setName(newFigDescName);
			
		if(figDesc.getActualFigure() instanceof Label)
			((Label)figDesc.getActualFigure()).setText(newName.toLowerCase());
	

	}

}
