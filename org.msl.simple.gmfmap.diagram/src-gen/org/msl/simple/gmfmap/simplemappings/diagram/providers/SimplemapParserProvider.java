package org.msl.simple.gmfmap.simplemappings.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;
import org.msl.simple.gmfmap.diagram.parsers.SimpleMapMessageFormatParserProvider;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.parsers.MessageFormatParser;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;

/**
 * @generated
 */
public class SimplemapParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleTopNodeName_4003Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleTopNodeName_4003Parser() {
		if (simpleTopNodeName_4003Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(4003, features);
			simpleTopNodeName_4003Parser = parser;
		}
		return simpleTopNodeName_4003Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLinkMappingName_4004Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLinkMappingName_4004Parser() {
		if (simpleLinkMappingName_4004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleLinkMapping_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(4004, features);
			simpleLinkMappingName_4004Parser = parser;
		}
		return simpleLinkMappingName_4004Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLabelNode_2001Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLabelNode_2001Parser() {
		if (simpleLabelNode_2001Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(2001, features);
			simpleLabelNode_2001Parser = parser;
		}
		return simpleLabelNode_2001Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleCompartmentName_4002Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleCompartmentName_4002Parser() {
		if (simpleCompartmentName_4002Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleCompartment_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(4002, features);
			simpleCompartmentName_4002Parser = parser;
		}
		return simpleCompartmentName_4002Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeName_4001Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeName_4001Parser() {
		if (simpleSubNodeName_4001Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(4001, features);
			simpleSubNodeName_4001Parser = parser;
		}
		return simpleSubNodeName_4001Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimpleTopNodeNameEditPart.VISUAL_ID:
			return getSimpleTopNodeName_4003Parser();
		case SimpleLinkMappingNameEditPart.VISUAL_ID:
			return getSimpleLinkMappingName_4004Parser();
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001Parser();
		case SimpleCompartmentNameEditPart.VISUAL_ID:
			return getSimpleCompartmentName_4002Parser();
		case SimpleSubNodeNameEditPart.VISUAL_ID:
			return getSimpleSubNodeName_4001Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(SimplemapVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(SimplemapVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (SimplemapElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
