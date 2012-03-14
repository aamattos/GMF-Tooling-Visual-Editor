package org.msl.simple.gmfmap.diagram.properties.figure;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.Figure;


public class FigureLabelPropertiesSection extends ElementWithLabelPropertySection {

	@Override
	protected EObject adapt(Object selected) {

		EObject adapted = super.adapt(selected);
		
		Figure figure = getLabelFigure(adapted);
		
		return figure!=null?figure.getFont():null;
	}

}
