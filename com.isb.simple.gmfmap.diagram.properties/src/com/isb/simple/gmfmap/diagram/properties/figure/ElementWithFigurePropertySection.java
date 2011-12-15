package com.isb.simple.gmfmap.diagram.properties.figure;

import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;

import com.isb.simple.gmfmap.diagram.properties.AbstractSimplemapPropertySection;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleLabelNode;
import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference;

public abstract class ElementWithFigurePropertySection extends
		AbstractSimplemapPropertySection {
	
	protected Figure getFigure(Object selected)
	{
		Object transformSelection = super.transformSelection(selected);
		
		Figure figure = null;
		
		if(transformSelection instanceof SimpleNode)
		{
			figure = ((SimpleNode)transformSelection).getDiagramNode().getFigure().getActualFigure();
		}
		
		if(transformSelection instanceof SimpleCompartment)
		{
			figure = ((SimpleCompartment)transformSelection).getCompartment().getAccessor().getFigure();
		}
		
		if(transformSelection instanceof SimpleSubNode)
		{
			SimpleSubNodeReference referencingNode = ((SimpleSubNode)transformSelection).getParentSubNodeReference();
			figure = getFigure(referencingNode);
		}
		
		if(transformSelection instanceof SimpleLinkMapping)
		{
			FigureDescriptor figDesc = ((SimpleLinkMapping)transformSelection).getDiagramLink().getFigure();
			figure = figDesc!=null?figDesc.getActualFigure():null;

		}
		
		return figure;
	}

	protected Figure getLabelFigure(Object selected)
	{
		Object transformSelection = super.transformSelection(selected);
		
		Figure figure = null;
		
		if(transformSelection instanceof SimpleNode)
		{
			DiagramLabel diagramLabel = ((SimpleNode)transformSelection).getDiagramLabel();
			if(diagramLabel!=null && diagramLabel.getAccessor()!=null)
				figure = diagramLabel.getAccessor().getFigure();
		}
			
		if(transformSelection instanceof SimpleLabelNode)
		{
			figure = ((SimpleNode)transformSelection).getDiagramLabel().getFigure().getActualFigure();
		}

		
		if(transformSelection instanceof SimpleCompartment)
		{
			figure = ((SimpleCompartment)transformSelection).getCompartment().getFigure().getActualFigure();
		}
		
		if(transformSelection instanceof SimpleSubNode)
		{
			SimpleSubNodeReference referencingNode = ((SimpleSubNode)transformSelection).getParentSubNodeReference();
			figure = getLabelFigure(referencingNode);
		}
		
		if(transformSelection instanceof SimpleLinkMapping)
		{
			figure = ((SimpleLinkMapping)transformSelection).getDiagramLabel().getFigure().getActualFigure();

		}
		
		return figure;
	}

}
