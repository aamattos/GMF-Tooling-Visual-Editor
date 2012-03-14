package org.msl.simple.gmfmap.simplemappings.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleRootNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartment2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeParentRootNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

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
			return getSimpleMapping_1000SemanticChildren(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_2003SemanticChildren(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2006SemanticChildren(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_3005SemanticChildren(view);
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getSimpleCompartment_3019SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleMapping_1000SemanticChildren(
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
			if (visualID == SimpleSubNodeEditPart.VISUAL_ID) {
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
	public static List<SimplemapNodeDescriptor> getSimpleTopNode_2003SemanticChildren(
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
			if (visualID == SimpleSubNodeReference2EditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleSubNode_2006SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		SimpleSubNode modelElement = (SimpleSubNode) view.getElement();
		LinkedList<SimplemapNodeDescriptor> result = new LinkedList<SimplemapNodeDescriptor>();
		for (Iterator<?> it = modelElement.getChildren().iterator(); it
				.hasNext();) {
			SimpleChildNode childElement = (SimpleChildNode) it.next();
			int visualID = SimplemapVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == SimpleLabelNode4EditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleCompartment2EditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeReference4EditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapNodeDescriptor> getSimpleCompartment_3005SemanticChildren(
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
			if (visualID == SimpleLabelNode2EditPart.VISUAL_ID) {
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
	public static List<SimplemapNodeDescriptor> getSimpleCompartment_3019SemanticChildren(
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
			if (visualID == SimpleLabelNode3EditPart.VISUAL_ID) {
				result.add(new SimplemapNodeDescriptor(childElement, visualID));
				continue;
			}
			if (visualID == SimpleSubNodeReference3EditPart.VISUAL_ID) {
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
			return getSimpleMapping_1000ContainedLinks(view);
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_2003ContainedLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2006ContainedLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_2007ContainedLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_3004ContainedLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_3005ContainedLinks(view);
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getSimpleLabelNode_3007ContainedLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3011ContainedLinks(view);
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3012ContainedLinks(view);
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getSimpleLabelNode_3018ContainedLinks(view);
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getSimpleCompartment_3019ContainedLinks(view);
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getSimpleLabelNode_3013ContainedLinks(view);
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3016ContainedLinks(view);
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3020ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getIncomingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_2003IncomingLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2006IncomingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_2007IncomingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_3004IncomingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_3005IncomingLinks(view);
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getSimpleLabelNode_3007IncomingLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3011IncomingLinks(view);
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3012IncomingLinks(view);
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getSimpleLabelNode_3018IncomingLinks(view);
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getSimpleCompartment_3019IncomingLinks(view);
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getSimpleLabelNode_3013IncomingLinks(view);
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3016IncomingLinks(view);
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3020IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getOutgoingLinks(View view) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {
		case SimpleTopNodeEditPart.VISUAL_ID:
			return getSimpleTopNode_2003OutgoingLinks(view);
		case SimpleSubNodeEditPart.VISUAL_ID:
			return getSimpleSubNode_2006OutgoingLinks(view);
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return getSimpleLinkMapping_2007OutgoingLinks(view);
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return getSimpleLabelNode_3004OutgoingLinks(view);
		case SimpleCompartmentEditPart.VISUAL_ID:
			return getSimpleCompartment_3005OutgoingLinks(view);
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return getSimpleLabelNode_3007OutgoingLinks(view);
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3011OutgoingLinks(view);
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3012OutgoingLinks(view);
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return getSimpleLabelNode_3018OutgoingLinks(view);
		case SimpleCompartment2EditPart.VISUAL_ID:
			return getSimpleCompartment_3019OutgoingLinks(view);
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return getSimpleLabelNode_3013OutgoingLinks(view);
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3016OutgoingLinks(view);
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return getSimpleSubNodeReference_3020OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleMapping_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2006ContainedLinks(
			View view) {
		SimpleSubNode modelElement = (SimpleSubNode) view.getElement();
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_2007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3011ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3012ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3018ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3019ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3013ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3016ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3020ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_2003IncomingLinks(
			View view) {
		SimpleTopNode modelElement = (SimpleTopNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2006IncomingLinks(
			View view) {
		SimpleSubNode modelElement = (SimpleSubNode) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_2007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3011IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3012IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3018IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3019IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3013IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3016IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3020IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleTopNode_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNode_2006OutgoingLinks(
			View view) {
		SimpleSubNode modelElement = (SimpleSubNode) view.getElement();
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLinkMapping_2007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3011OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3012OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3018OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleCompartment_3019OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleLabelNode_3013OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3016OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<SimplemapLinkDescriptor> getSimpleSubNodeReference_3020OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<SimplemapLinkDescriptor> getIncomingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(
			SimpleRootNode target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == SimplemappingsPackage.eINSTANCE
					.getSimpleSubNode_ParentRootNode()) {
				result.add(new SimplemapLinkDescriptor(setting.getEObject(),
						target,
						SimplemapElementTypes.SimpleSubNodeParentRootNode_4003,
						SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<SimplemapLinkDescriptor> getOutgoingFeatureModelFacetLinks_SimpleSubNode_ParentRootNode_4003(
			SimpleSubNode source) {
		LinkedList<SimplemapLinkDescriptor> result = new LinkedList<SimplemapLinkDescriptor>();
		SimpleRootNode destination = source.getParentRootNode();
		if (destination == null) {
			return result;
		}
		result.add(new SimplemapLinkDescriptor(source, destination,
				SimplemapElementTypes.SimpleSubNodeParentRootNode_4003,
				SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
		return result;
	}

}
