package org.msl.simple.gmfmap.diagram.parsers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;
import org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure;
import org.msl.simple.gmfmap.simplemappings.SimpleNodeReference;
import org.msl.simple.gmfmap.simplemappings.diagram.parsers.MessageFormatParser;

/**
 * MessageFormatParser para ColumnEditPart (Se asocia en SimpleMapParserProvider)
 * Lo usamos para provocar un refresco del label, ante cambios en la columna y en las propiedades del tipo de dato
 * @author xIS05655
 *
 */
public class SimpleNodeFormatParser extends MessageFormatParser implements ISemanticParser{

	public SimpleNodeFormatParser(EAttribute[] features) {
		super(features);
	}

	public SimpleNodeFormatParser(EAttribute[] features,
			EAttribute[] editableFeatures) {
		super(features, editableFeatures);
	}

	public static SimpleNodeFormatParser getInstance(EAttribute[] features,
			EAttribute[] editableFeatures)
	{
		if(editableFeatures==null)
			return new SimpleNodeFormatParser(features);
		else
			return new SimpleNodeFormatParser(features, editableFeatures);
	}

	/**
	 * Al hacer que esta clase implemente ISemanticParser, podemos hacer que ColumnEditPart escuche notificaciones de
	 * otros Notifiers ademas de EColumn
	 */
	@Override
	public List getSemanticElementsBeingParsed(EObject element) {
		List<EObject> parserElements = new ArrayList<EObject>(1);
		
		//Deberia ser siempre EColumn pero alguna vez da un ClassCast y no sabemos por que
		if(element instanceof SimpleNodeReference)
		{
			parserElements.add((SimpleNodeReference)element);
			parserElements.add(((SimpleNodeReference)element).getNodeReference());
			
			if(((SimpleNodeReference)element).getNodeReference()!=null)
				parserElements.add(((SimpleNodeReference)element).getNodeReference().getChild());
		}
		
		if(element instanceof SimpleMappingElementWithFigure)
		{
			parserElements.add(getFigureBackgroundColor((SimpleMappingElementWithFigure)element));
			parserElements.add(getFigureForegroundColor((SimpleMappingElementWithFigure)element));
		}
			
		return parserElements;
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		return true;
	}

	private RGBColor getFigureBackgroundColor(SimpleMappingElementWithFigure childNode) {
		
		Figure nodeFigure = childNode.getNodeFigure();

		if (nodeFigure != null
				&& nodeFigure.getBackgroundColor() instanceof RGBColor)
			return (RGBColor) nodeFigure.getBackgroundColor();

		return null;
	}

	private RGBColor getFigureForegroundColor(SimpleMappingElementWithFigure childNode) {
		Figure nodeFigure = childNode.getNodeFigure();

		if (nodeFigure != null
				&& nodeFigure.getForegroundColor() instanceof RGBColor)
			return (RGBColor) nodeFigure.getForegroundColor();

		return null;
	}
}
