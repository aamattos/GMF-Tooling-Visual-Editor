/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.msl.simple.gmfmap.simplemappings.*;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsFactory;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplemappingsFactoryImpl extends EFactoryImpl implements SimplemappingsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimplemappingsFactory init() {
		try {
			SimplemappingsFactory theSimplemappingsFactory = (SimplemappingsFactory)EPackage.Registry.INSTANCE.getEFactory("http://org.msl.simple.gmfmap/simplemappings_1.1"); 
			if (theSimplemappingsFactory != null) {
				return theSimplemappingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimplemappingsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimplemappingsPackage.SIMPLE_MAPPING: return createSimpleMapping();
			case SimplemappingsPackage.SIMPLE_TOP_NODE: return createSimpleTopNode();
			case SimplemappingsPackage.SIMPLE_COMPARTMENT: return createSimpleCompartment();
			case SimplemappingsPackage.SIMPLE_LABEL_NODE: return createSimpleLabelNode();
			case SimplemappingsPackage.SIMPLE_LINK_MAPPING: return createSimpleLinkMapping();
			case SimplemappingsPackage.SIMPLE_NODE: return createSimpleNode();
			case SimplemappingsPackage.SIMPLE_SUB_NODE: return createSimpleSubNode();
			case SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE: return createSimpleMappingElementWithFigure();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMapping createSimpleMapping() {
		SimpleMappingImpl simpleMapping = new SimpleMappingImpl();
		return simpleMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleTopNode createSimpleTopNode() {
		SimpleTopNodeImpl simpleTopNode = new SimpleTopNodeImpl();
		return simpleTopNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleCompartment createSimpleCompartment() {
		SimpleCompartmentImpl simpleCompartment = new SimpleCompartmentImpl();
		return simpleCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLabelNode createSimpleLabelNode() {
		SimpleLabelNodeImpl simpleLabelNode = new SimpleLabelNodeImpl();
		return simpleLabelNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleLinkMapping createSimpleLinkMapping() {
		SimpleLinkMappingImpl simpleLinkMapping = new SimpleLinkMappingImpl();
		return simpleLinkMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNode createSimpleNode() {
		SimpleNodeImpl simpleNode = new SimpleNodeImpl();
		return simpleNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSubNode createSimpleSubNode() {
		SimpleSubNodeImpl simpleSubNode = new SimpleSubNodeImpl();
		return simpleSubNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMappingElementWithFigure createSimpleMappingElementWithFigure() {
		SimpleMappingElementWithFigureImpl simpleMappingElementWithFigure = new SimpleMappingElementWithFigureImpl();
		return simpleMappingElementWithFigure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsPackage getSimplemappingsPackage() {
		return (SimplemappingsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimplemappingsPackage getPackage() {
		return SimplemappingsPackage.eINSTANCE;
	}

} //SimplemappingsFactoryImpl
