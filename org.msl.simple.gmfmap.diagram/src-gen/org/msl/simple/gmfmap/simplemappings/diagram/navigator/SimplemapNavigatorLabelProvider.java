package org.msl.simple.gmfmap.simplemappings.diagram.navigator;

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
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeNameEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;
import org.msl.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;
import org.msl.simple.gmfmap.simplemappings.diagram.providers.SimplemapParserProvider;

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
		case SimpleMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleMapping", SimplemapElementTypes.SimpleMapping_79); //$NON-NLS-1$
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleTopNode", SimplemapElementTypes.SimpleTopNode_1001); //$NON-NLS-1$
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleLinkMapping", SimplemapElementTypes.SimpleLinkMapping_1002); //$NON-NLS-1$
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleLabelNode", SimplemapElementTypes.SimpleLabelNode_2001); //$NON-NLS-1$
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleCompartment", SimplemapElementTypes.SimpleCompartment_2002); //$NON-NLS-1$
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Node?http://org.msl.simple.gmfmap/simplemappings_1.1?SimpleSubNode", SimplemapElementTypes.SimpleSubNode_2003); //$NON-NLS-1$
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
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_79Text(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001Text(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002Text(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001Text(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002Text(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getSimpleMapping_79Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSimpleTopNode_1001Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleTopNode_1001,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleTopNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLinkMapping_1002Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLinkMapping_1002,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLinkMappingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleLabelNode_2001Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleLabelNode_2001,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleLabelNodeEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleCompartment_2002Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleCompartment_2002,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleCompartmentNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getSimpleSubNode_2003Text(View view) {
		IParser parser = SimplemapParserProvider.getParser(
				SimplemapElementTypes.SimpleSubNode_2003,
				view.getElement() != null ? view.getElement() : view,
				SimplemapVisualIDRegistry
						.getType(SimpleSubNodeNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			SimplemapDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 4001); //$NON-NLS-1$
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
