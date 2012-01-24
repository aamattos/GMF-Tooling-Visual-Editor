package com.isb.simple.gmfmap.simplemappings.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.ParentSubNodeLabelEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartment2EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentName2EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentNameEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode3EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode4EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingNameEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeParentRootNodeEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference2EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference3EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference4EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeNameEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;
import com.isb.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;
import com.isb.simple.gmfmap.simplemappings.diagram.providers.SimplemapParserProvider;

/**
 * @generated
 */
public class SimplemapNavigatorLabelProvider extends LabelProvider implements
		ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		SimplemapDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		SimplemapDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof SimplemapNavigatorItem
				&& !isOwnView(((SimplemapNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof SimplemapNavigatorGroup) {
			SimplemapNavigatorGroup group = (SimplemapNavigatorGroup) element;
			return SimplemapDiagramEditorPlugin.getInstance().getBundledImage(
					group.getIcon());
		}

		if (element instanceof SimplemapNavigatorItem) {
			SimplemapNavigatorItem navigatorItem = (SimplemapNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNodeReference", SimplemapElementTypes.SimpleSubNodeReference_3012); //$NON-NLS-1$
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNodeReference", SimplemapElementTypes.SimpleSubNodeReference_3016); //$NON-NLS-1$
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleLabelNode", SimplemapElementTypes.SimpleLabelNode_3013); //$NON-NLS-1$
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.isb.simple.gmfmap/simplemappings?SimpleTopNode", SimplemapElementTypes.SimpleTopNode_2003); //$NON-NLS-1$
		case SimpleMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://com.isb.simple.gmfmap/simplemappings?SimpleMapping", SimplemapElementTypes.SimpleMapping_1000); //$NON-NLS-1$
		case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNode?parentRootNode", SimplemapElementTypes.SimpleSubNodeParentRootNode_4003); //$NON-NLS-1$
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleLabelNode", SimplemapElementTypes.SimpleLabelNode_3007); //$NON-NLS-1$
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNodeReference", SimplemapElementTypes.SimpleSubNodeReference_3020); //$NON-NLS-1$
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleLabelNode", SimplemapElementTypes.SimpleLabelNode_3018); //$NON-NLS-1$
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.isb.simple.gmfmap/simplemappings?SimpleLinkMapping", SimplemapElementTypes.SimpleLinkMapping_2007); //$NON-NLS-1$
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleCompartment", SimplemapElementTypes.SimpleCompartment_3005); //$NON-NLS-1$
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNodeReference", SimplemapElementTypes.SimpleSubNodeReference_3011); //$NON-NLS-1$
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleCompartment", SimplemapElementTypes.SimpleCompartment_3019); //$NON-NLS-1$
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://com.isb.simple.gmfmap/simplemappings?SimpleLabelNode", SimplemapElementTypes.SimpleLabelNode_3004); //$NON-NLS-1$
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://com.isb.simple.gmfmap/simplemappings?SimpleSubNode", SimplemapElementTypes.SimpleSubNode_2006); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = SimplemapDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& SimplemapElementTypes.isKnownElementType(elementType)) {
			image = SimplemapElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof SimplemapNavigatorGroup) {
			SimplemapNavigatorGroup group = (SimplemapNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof SimplemapNavigatorItem) {
			SimplemapNavigatorItem navigatorItem = (SimplemapNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3012Text(view);
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3016Text(view);
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getSimpleLabelNode_3013Text(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_2003Text(view);
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_1000Text(view);
		case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID:
			return getSimpleSubNodeParentRootNode_4003Text(view);
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getSimpleLabelNode_3007Text(view);
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3020Text(view);
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getSimpleLabelNode_3018Text(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_2007Text(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_3005Text(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3011Text(view);
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getSimpleCompartment_3019Text(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_3004Text(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2006Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNodeReference_3020Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNodeReference_3020, view
						.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeReference4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3020); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLinkMapping_2007Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLinkMapping_2007,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLinkMappingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNodeParentRootNode_4003Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNodeParentRootNode_4003, view
						.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(ParentSubNodeLabelEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleMapping_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSimpleTopNode_2003Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleTopNode_2003,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleTopNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleCompartment_3019Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleCompartment_3019,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleCompartmentName2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLabelNode_3004Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLabelNode_3004,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLabelNodeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleCompartment_3005Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleCompartment_3005,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleCompartmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLabelNode_3007Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLabelNode_3007,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLabelNode2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNodeReference_3011Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNodeReference_3011, view
						.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeReferenceEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNodeReference_3012Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNodeReference_3012, view
						.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeReference2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3012); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLabelNode_3013Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLabelNode_3013,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLabelNode3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3013); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLabelNode_3018Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLabelNode_3018,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLabelNode4EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3018); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNode_2006Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNode_2006,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNodeReference_3016Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNodeReference_3016, view
						.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeReference3EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 3016); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleMappingEditPart.MODEL_ID.equals(SimplemapVisualIDRegistry
				.getModelID(view));
	}

}
