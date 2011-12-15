package com.isb.simple.gmfmap.diagram.properties.figure;

import org.eclipse.gmf.gmfgraph.Figure;


public class FigurePreferedSizePropertiesSection extends ElementWithFigurePropertySection {

	@Override
	protected Object transformSelection(Object selected) {
		
		Figure figure = getFigure(selected);
		
		return figure!=null?figure.getPreferredSize():null;
	}

}
