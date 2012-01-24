package org.msl.simple.gmfmap.diagram.parsers;

import org.eclipse.emf.ecore.EAttribute;

import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
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
			case SimpleSubNodeNameEditPart.VISUAL_ID: return SubNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleTopNodeNameEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleLabelNodeEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleLabelNode2EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleLabelNode3EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures); 
			case SimpleLabelNode4EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
			case SimpleSubNodeReferenceEditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
			case SimpleSubNodeReference2EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
			case SimpleSubNodeReference3EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
			case SimpleSubNodeReference4EditPart.VISUAL_ID: return SimpleNodeFormatParser.getInstance(features, editableFeatures);
		}
		
		if(editableFeatures==null)
			return new MessageFormatParser(features);
		else
			return new MessageFormatParser(features, editableFeatures);
		
	}
	
}
