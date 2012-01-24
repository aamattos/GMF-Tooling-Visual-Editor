package org.msl.simple.gmfmap.diagram.parsers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ISemanticParser;

import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.diagram.parsers.MessageFormatParser;

/**
 * MessageFormatParser para ColumnEditPart (Se asocia en DatamodelerParserProvider)
 * Lo usamos para provocar un refresco del label, ante cambios en la columna y en las propiedades del tipo de dato
 * @author xIS05655
 *
 */
public class SubNodeFormatParser extends MessageFormatParser implements ISemanticParser{

	public SubNodeFormatParser(EAttribute[] features) {
		super(features);
	}

	public SubNodeFormatParser(EAttribute[] features,
			EAttribute[] editableFeatures) {
		super(features, editableFeatures);
	}

	public static SubNodeFormatParser getInstance(EAttribute[] features,
			EAttribute[] editableFeatures)
	{
		if(editableFeatures==null)
			return new SubNodeFormatParser(features);
		else
			return new SubNodeFormatParser(features, editableFeatures);
	}

	/**
	 * Al hacer que esta clase implemente ISemanticParser, podemos hacer que ColumnEditPart escuche notificaciones de
	 * otros Notifiers ademas de EColumn
	 */
	@Override
	public List getSemanticElementsBeingParsed(EObject element) {
		List<EObject> parserElements = new ArrayList<EObject>(2);
		
		//Deberia ser siempre EColumn pero alguna vez da un ClassCast y no sabemos por que
		if(element instanceof SimpleSubNode)
		{
			parserElements.add((SimpleSubNode)element);
			if(((SimpleSubNode)element).getParentSubNodeReference()!=null)
				parserElements.add(((SimpleSubNode)element).getParentSubNodeReference());
		}
		
		
		return parserElements;
	}

	@Override
	public boolean areSemanticElementsAffected(EObject listener,
			Object notification) {
		return true;
	}

}
