package com.isb.simple.gmfmap.diagram.properties.figure;

import org.eclipse.gmf.gmfgraph.Figure;


public class FigureLabelPropertiesSection extends ElementWithFigurePropertySection {

	@Override
	protected Object transformSelection(Object selected) {

		Figure figure = getLabelFigure(selected);
		
		return figure!=null?figure.getFont():null;
	}

}
