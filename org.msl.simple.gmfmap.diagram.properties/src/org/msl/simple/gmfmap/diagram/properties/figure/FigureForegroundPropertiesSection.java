package org.msl.simple.gmfmap.diagram.properties.figure;

import org.eclipse.gmf.gmfgraph.Figure;


public class FigureForegroundPropertiesSection extends ElementWithFigurePropertySection {

	@Override
	protected Object transformSelection(Object selected) {
		
		Figure figure = getFigure(selected);
		
		if(figure!=null)
			return figure.getForegroundColor();
		
		return null;
	}

}
