package com.isb.simple.gmfmap.diagram.properties.figure;

import org.eclipse.gmf.gmfgraph.Figure;


public class FigureMinimumSizePropertiesSection extends ElementWithFigurePropertySection {

	@Override
	protected Object transformSelection(Object selected) {
		
		Figure figure = getFigure(selected);
		
		return figure!=null?figure.getMinimumSize():null;
	}

}
