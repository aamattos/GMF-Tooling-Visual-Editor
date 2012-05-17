package org.msl.simple.gmfmap.simplemappings.diagram.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeEditPart;

/**
 * @generated
 */
public class SimplemapDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSemanticChildren(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_79SemanticChildren(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001SemanticChildren(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002SemanticChildren(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_2003SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleMapping_79SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleMapping modelElement = (SimpleMapping) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimpleTopNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleLinkMappingEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleTopNode_1001SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleTopNode modelElement = (SimpleTopNode) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleCompartmentEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleCompartment_2002SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleCompartment modelElement = (SimpleCompartment) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleSubNodeReference_2003SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleSubNodeReference modelElement = (SimpleSubNodeReference) view
				.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimpleLabelNodeEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleCompartmentEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeReferenceEditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getContainedLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleMappingEditPart.VISUAL_ID:
			return getSimpleMapping_79ContainedLinks(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001ContainedLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002ContainedLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001ContainedLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002ContainedLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_2003ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getIncomingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001IncomingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002IncomingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001IncomingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002IncomingLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_2003IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getOutgoingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_1001OutgoingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_1002OutgoingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_2001OutgoingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_2002OutgoingLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_2003OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleMapping_79ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_1001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_1002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

}
