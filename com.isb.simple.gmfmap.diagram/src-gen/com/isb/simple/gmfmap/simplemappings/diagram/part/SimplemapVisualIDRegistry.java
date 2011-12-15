package com.isb.simple.gmfmap.simplemappings.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;
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

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class SimplemapVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "com.isb.simple.gmfmap.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (SimpleMappingEditPart.MODEL_ID.equals(view.getType())) {
				return SimpleMappingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				SimplemapDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (SimplemappingsPackage.eINSTANCE.getSimpleMapping().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((SimpleMapping) domainElement)) {
			return SimpleMappingEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleMappingEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (SimpleMappingEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleMappingEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case SimpleMappingEditPart.VISUAL_ID:
			if (SimplemappingsPackage.eINSTANCE.getSimpleTopNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleTopNodeEditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleSubNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleSubNodeEditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleLinkMapping()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleLinkMappingEditPart.VISUAL_ID;
			}
			break;
		case SimpleTopNodeEditPart.VISUAL_ID:
			if (SimplemappingsPackage.eINSTANCE.getSimpleLabelNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleLabelNodeEditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleCompartment()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleCompartmentEditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleSubNodeReference2EditPart.VISUAL_ID;
			}
			break;
		case SimpleSubNodeEditPart.VISUAL_ID:
			if (SimplemappingsPackage.eINSTANCE.getSimpleLabelNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleLabelNode4EditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleCompartment()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleCompartment2EditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleSubNodeReference4EditPart.VISUAL_ID;
			}
			break;
		case SimpleCompartmentEditPart.VISUAL_ID:
			if (SimplemappingsPackage.eINSTANCE.getSimpleLabelNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleLabelNode2EditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleSubNodeReferenceEditPart.VISUAL_ID;
			}
			break;
		case SimpleCompartment2EditPart.VISUAL_ID:
			if (SimplemappingsPackage.eINSTANCE.getSimpleLabelNode()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleLabelNode3EditPart.VISUAL_ID;
			}
			if (SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference()
					.isSuperTypeOf(domainElement.eClass())) {
				return SimpleSubNodeReference3EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry
				.getModelID(containerView);
		if (!SimpleMappingEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (SimpleMappingEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = SimpleMappingEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case SimpleMappingEditPart.VISUAL_ID:
			if (SimpleTopNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleSubNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleLinkMappingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleTopNodeEditPart.VISUAL_ID:
			if (SimpleTopNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleLabelNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleSubNodeReference2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleSubNodeEditPart.VISUAL_ID:
			if (SimpleSubNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleLabelNode4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleSubNodeReference4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleLinkMappingEditPart.VISUAL_ID:
			if (SimpleLinkMappingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleCompartmentEditPart.VISUAL_ID:
			if (SimpleCompartmentNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleLabelNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleSubNodeReferenceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleCompartment2EditPart.VISUAL_ID:
			if (SimpleCompartmentName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleLabelNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SimpleSubNodeReference3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID:
			if (ParentSubNodeLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(SimpleMapping element) {
		return true;
	}

}
