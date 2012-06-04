package org.msl.simple.gmfmap.diagram.parsers;

import org.eclipse.emf.ecore.EAttribute;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleChildReferenceEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.parsers.MessageFormatParser;

/**
 * Se encarga de crear un MessageFormatParser para un EditPart en particular
 * El MessageFormatParser define cuales son las features que afectan el refresco del editPart
 * Por defecto solo afectan las definidas como Label en el gmfmap.
 * @author xIS05655
 *
 */
public class SimpleMapMessageFormatParserProvider{

	public static MessageFormatParser getParser(int visualId, EAttribute[] features)
	{
		return createParser(visualId, features, null);
	}
	
	public static MessageFormatParser getParser(int visualId, EAttribute[] features, EAttribute[] editableFeatures)
	{
		return createParser(visualId, features, editableFeatures);
	}
	
	private static MessageFormatParser createParser(int visualId, EAttribute[] features, EAttribute[] editableFeatures)
	{
		switch(visualId)
		{
			case SimpleTopNodeNameEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleSubNodeNameEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
			case SimpleLabelNodeEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleCompartmentNameEditPart.VISUAL_ID:return SimpleCompartmentFormatParser.getInstance(features, editableFeatures);
			case SimpleChildReferenceEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 

		}
		
		if(editableFeatures==null)
			return new MessageFormatParser(features);
		else
			return new MessageFormatParser(features, editableFeatures);
		
	}
	
}
