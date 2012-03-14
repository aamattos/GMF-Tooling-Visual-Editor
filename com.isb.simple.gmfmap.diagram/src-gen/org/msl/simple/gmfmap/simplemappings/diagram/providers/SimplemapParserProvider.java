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
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentName2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
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
	private IParser simpleTopNodeName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleTopNodeName_5004Parser() {
		if (simpleTopNodeName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(5004, features);
			simpleTopNodeName_5004Parser = parser;
		}
		return simpleTopNodeName_5004Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeName_5009Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeName_5009Parser() {
		if (simpleSubNodeName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleSubNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(5009, features);
			simpleSubNodeName_5009Parser = parser;
		}
		return simpleSubNodeName_5009Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLinkMappingName_5010Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLinkMappingName_5010Parser() {
		if (simpleLinkMappingName_5010Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleLinkMapping_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(5010, features);
			simpleLinkMappingName_5010Parser = parser;
		}
		return simpleLinkMappingName_5010Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLabelNode_3004Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLabelNode_3004Parser() {
		if (simpleLabelNode_3004Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3004, features);
			simpleLabelNode_3004Parser = parser;
		}
		return simpleLabelNode_3004Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleCompartmentName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleCompartmentName_5003Parser() {
		if (simpleCompartmentName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleCompartment_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(5003, features);
			simpleCompartmentName_5003Parser = parser;
		}
		return simpleCompartmentName_5003Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLabelNode_3007Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLabelNode_3007Parser() {
		if (simpleLabelNode_3007Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3007, features);
			simpleLabelNode_3007Parser = parser;
		}
		return simpleLabelNode_3007Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeReference_3011Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeReference_3011Parser() {
		if (simpleSubNodeReference_3011Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3011, features);
			simpleSubNodeReference_3011Parser = parser;
		}
		return simpleSubNodeReference_3011Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeReference_3012Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeReference_3012Parser() {
		if (simpleSubNodeReference_3012Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3012, features);
			simpleSubNodeReference_3012Parser = parser;
		}
		return simpleSubNodeReference_3012Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLabelNode_3018Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLabelNode_3018Parser() {
		if (simpleLabelNode_3018Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3018, features);
			simpleLabelNode_3018Parser = parser;
		}
		return simpleLabelNode_3018Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleCompartmentName_5007Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleCompartmentName_5007Parser() {
		if (simpleCompartmentName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleCompartment_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(5007, features);
			simpleCompartmentName_5007Parser = parser;
		}
		return simpleCompartmentName_5007Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleLabelNode_3013Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleLabelNode_3013Parser() {
		if (simpleLabelNode_3013Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3013, features);
			simpleLabelNode_3013Parser = parser;
		}
		return simpleLabelNode_3013Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeReference_3016Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeReference_3016Parser() {
		if (simpleSubNodeReference_3016Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3016, features);
			simpleSubNodeReference_3016Parser = parser;
		}
		return simpleSubNodeReference_3016Parser;
	}

	/**
	 * (Modified template: ParserProvider.xpt)
	 * @generated
	 */
	private IParser simpleSubNodeReference_3020Parser;

	/**
	 * @generated
	 */
	private IParser getSimpleSubNodeReference_3020Parser() {
		if (simpleSubNodeReference_3020Parser == null) {
			EAttribute[] features = new EAttribute[] { SimplemappingsPackage.eINSTANCE
					.getSimpleNode_Name() };
			MessageFormatParser parser = SimpleMapMessageFormatParserProvider
					.getParser(3020, features);
			simpleSubNodeReference_3020Parser = parser;
		}
		return simpleSubNodeReference_3020Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case SimpleTopNodeNameEditPart.VISUAL_ID:
			return getSimpleTopNodeName_5004Parser();
		case SimpleSubNodeNameEditPart.VISUAL_ID:
			return getSimpleSubNodeName_5009Parser();
		case SimpleLinkMappingNameEditPart.VISUAL_ID:
			return getSimpleLinkMappingName_5010Parser();
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_3004Parser();
		case SimpleCompartmentNameEditPart.VISUAL_ID:
			return getSimpleCompartmentName_5003Parser();
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getSimpleLabelNode_3007Parser();
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3011Parser();
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3012Parser();
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getSimpleLabelNode_3018Parser();
		case SimpleCompartmentName2EditPart.VISUAL_ID:
			return getSimpleCompartmentName_5007Parser();
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getSimpleLabelNode_3013Parser();
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3016Parser();
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3020Parser();
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
