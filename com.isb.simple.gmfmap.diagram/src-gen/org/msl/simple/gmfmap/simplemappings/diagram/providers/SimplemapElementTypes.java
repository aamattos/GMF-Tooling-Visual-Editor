package org.msl.simple.gmfmap.simplemappings.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

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
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;

/**
 * @generated
 */
public class SimplemapElementTypes {

	/**
	 * @generated
	 */
	private SimplemapElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType SimpleMapping_1000 = getElementType("org.msl.simple.gmfmap.diagram.SimpleMapping_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleTopNode_2003 = getElementType("org.msl.simple.gmfmap.diagram.SimpleTopNode_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNode_2006 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNode_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleLinkMapping_2007 = getElementType("org.msl.simple.gmfmap.diagram.SimpleLinkMapping_2007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleLabelNode_3004 = getElementType("org.msl.simple.gmfmap.diagram.SimpleLabelNode_3004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleCompartment_3005 = getElementType("org.msl.simple.gmfmap.diagram.SimpleCompartment_3005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleLabelNode_3007 = getElementType("org.msl.simple.gmfmap.diagram.SimpleLabelNode_3007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNodeReference_3011 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNodeReference_3011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNodeReference_3012 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNodeReference_3012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleLabelNode_3018 = getElementType("org.msl.simple.gmfmap.diagram.SimpleLabelNode_3018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleCompartment_3019 = getElementType("org.msl.simple.gmfmap.diagram.SimpleCompartment_3019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleLabelNode_3013 = getElementType("org.msl.simple.gmfmap.diagram.SimpleLabelNode_3013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNodeReference_3016 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNodeReference_3016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNodeReference_3020 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNodeReference_3020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SimpleSubNodeParentRootNode_4003 = getElementType("org.msl.simple.gmfmap.diagram.SimpleSubNodeParentRootNode_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return SimplemapDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(SimpleMapping_1000,
					SimplemappingsPackage.eINSTANCE.getSimpleMapping());

			elements.put(SimpleTopNode_2003,
					SimplemappingsPackage.eINSTANCE.getSimpleTopNode());

			elements.put(SimpleSubNode_2006,
					SimplemappingsPackage.eINSTANCE.getSimpleSubNode());

			elements.put(SimpleLinkMapping_2007,
					SimplemappingsPackage.eINSTANCE.getSimpleLinkMapping());

			elements.put(SimpleLabelNode_3004,
					SimplemappingsPackage.eINSTANCE.getSimpleLabelNode());

			elements.put(SimpleCompartment_3005,
					SimplemappingsPackage.eINSTANCE.getSimpleCompartment());

			elements.put(SimpleLabelNode_3007,
					SimplemappingsPackage.eINSTANCE.getSimpleLabelNode());

			elements.put(SimpleSubNodeReference_3011,
					SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference());

			elements.put(SimpleSubNodeReference_3012,
					SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference());

			elements.put(SimpleLabelNode_3018,
					SimplemappingsPackage.eINSTANCE.getSimpleLabelNode());

			elements.put(SimpleCompartment_3019,
					SimplemappingsPackage.eINSTANCE.getSimpleCompartment());

			elements.put(SimpleLabelNode_3013,
					SimplemappingsPackage.eINSTANCE.getSimpleLabelNode());

			elements.put(SimpleSubNodeReference_3016,
					SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference());

			elements.put(SimpleSubNodeReference_3020,
					SimplemappingsPackage.eINSTANCE.getSimpleSubNodeReference());

			elements.put(SimpleSubNodeParentRootNode_4003,
					SimplemappingsPackage.eINSTANCE
							.getSimpleSubNode_ParentRootNode());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(SimpleMapping_1000);
			KNOWN_ELEMENT_TYPES.add(SimpleTopNode_2003);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNode_2006);
			KNOWN_ELEMENT_TYPES.add(SimpleLinkMapping_2007);
			KNOWN_ELEMENT_TYPES.add(SimpleLabelNode_3004);
			KNOWN_ELEMENT_TYPES.add(SimpleCompartment_3005);
			KNOWN_ELEMENT_TYPES.add(SimpleLabelNode_3007);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNodeReference_3011);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNodeReference_3012);
			KNOWN_ELEMENT_TYPES.add(SimpleLabelNode_3018);
			KNOWN_ELEMENT_TYPES.add(SimpleCompartment_3019);
			KNOWN_ELEMENT_TYPES.add(SimpleLabelNode_3013);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNodeReference_3016);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNodeReference_3020);
			KNOWN_ELEMENT_TYPES.add(SimpleSubNodeParentRootNode_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case SimpleMappingEditPart.VISUAL_ID:
			return SimpleMapping_1000;
		case SimpleTopNodeEditPart.VISUAL_ID:
			return SimpleTopNode_2003;
		case SimpleSubNodeEditPart.VISUAL_ID:
			return SimpleSubNode_2006;
		case SimpleLinkMappingEditPart.VISUAL_ID:
			return SimpleLinkMapping_2007;
		case SimpleLabelNodeEditPart.VISUAL_ID:
			return SimpleLabelNode_3004;
		case SimpleCompartmentEditPart.VISUAL_ID:
			return SimpleCompartment_3005;
		case SimpleLabelNode2EditPart.VISUAL_ID:
			return SimpleLabelNode_3007;
		case SimpleSubNodeReferenceEditPart.VISUAL_ID:
			return SimpleSubNodeReference_3011;
		case SimpleSubNodeReference2EditPart.VISUAL_ID:
			return SimpleSubNodeReference_3012;
		case SimpleLabelNode4EditPart.VISUAL_ID:
			return SimpleLabelNode_3018;
		case SimpleCompartment2EditPart.VISUAL_ID:
			return SimpleCompartment_3019;
		case SimpleLabelNode3EditPart.VISUAL_ID:
			return SimpleLabelNode_3013;
		case SimpleSubNodeReference3EditPart.VISUAL_ID:
			return SimpleSubNodeReference_3016;
		case SimpleSubNodeReference4EditPart.VISUAL_ID:
			return SimpleSubNodeReference_3020;
		case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID:
			return SimpleSubNodeParentRootNode_4003;
		}
		return null;
	}

}
