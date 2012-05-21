/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore settingDelegates='org.msl.simple.gmfmap.simplemapping.setting' invocationDelegates='org.msl.simple.gmfmap.simplemapping.invocation'"
 * @generated
 */
public interface SimplemappingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simplemappings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org.msl.simple.gmfmap/simplemappings_1.1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simplemap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplemappingsPackage eINSTANCE = org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode <em>Simple Parent Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleParentNode
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleParentNode()
	 * @generated
	 */
	int SIMPLE_PARENT_NODE = 6;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARENT_NODE__CHILDREN = 0;

	/**
	 * The number of structural features of the '<em>Simple Parent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARENT_NODE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simple Parent Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PARENT_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleMappingImpl <em>Simple Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleMappingImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleMapping()
	 * @generated
	 */
	int SIMPLE_MAPPING = 0;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__CHILDREN = SIMPLE_PARENT_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__CANVAS = SIMPLE_PARENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__PALETTE = SIMPLE_PARENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__MAPPING = SIMPLE_PARENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__DOMAIN_MODEL = SIMPLE_PARENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING__DOMAIN_META_ELEMENT = SIMPLE_PARENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Simple Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING_FEATURE_COUNT = SIMPLE_PARENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Simple Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_MAPPING_OPERATION_COUNT = SIMPLE_PARENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode <em>Simple Child Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleChildNode()
	 * @generated
	 */
	int SIMPLE_CHILD_NODE = 7;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE__PARENT_NODE = 0;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE__PARENT_MAPPING = 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE__PARENT = 2;

	/**
	 * The number of structural features of the '<em>Simple Child Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE___GET_NODE_FIGURE = 0;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE___GET_LABEL_FIGURE = 1;

	/**
	 * The number of operations of the '<em>Simple Child Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_CHILD_NODE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl <em>Simple Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleNode()
	 * @generated
	 */
	int SIMPLE_NODE = 5;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__PARENT_NODE = SIMPLE_CHILD_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__PARENT_MAPPING = SIMPLE_CHILD_NODE__PARENT_MAPPING;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__PARENT = SIMPLE_CHILD_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__DOMAIN_META_ELEMENT = SIMPLE_CHILD_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__NODE_REFERENCE = SIMPLE_CHILD_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__CONTAINMENT_FEATURE = SIMPLE_CHILD_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__NAME = SIMPLE_CHILD_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Parent Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__PARENT_META_ELEMENT = SIMPLE_CHILD_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__TOOL = SIMPLE_CHILD_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Label Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__LABEL_ATTRIBUTES = SIMPLE_CHILD_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__DIAGRAM_NODE = SIMPLE_CHILD_NODE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE__DIAGRAM_LABEL = SIMPLE_CHILD_NODE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Simple Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_FEATURE_COUNT = SIMPLE_CHILD_NODE_FEATURE_COUNT + 9;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE___GET_NODE_FIGURE = SIMPLE_CHILD_NODE___GET_NODE_FIGURE;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE___GET_LABEL_FIGURE = SIMPLE_CHILD_NODE___GET_LABEL_FIGURE;

	/**
	 * The number of operations of the '<em>Simple Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_NODE_OPERATION_COUNT = SIMPLE_CHILD_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl <em>Simple Top Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleTopNode()
	 * @generated
	 */
	int SIMPLE_TOP_NODE = 1;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__PARENT_NODE = SIMPLE_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__PARENT_MAPPING = SIMPLE_NODE__PARENT_MAPPING;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__PARENT = SIMPLE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__DOMAIN_META_ELEMENT = SIMPLE_NODE__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__NODE_REFERENCE = SIMPLE_NODE__NODE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__CONTAINMENT_FEATURE = SIMPLE_NODE__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__NAME = SIMPLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__PARENT_META_ELEMENT = SIMPLE_NODE__PARENT_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__TOOL = SIMPLE_NODE__TOOL;

	/**
	 * The feature id for the '<em><b>Label Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__LABEL_ATTRIBUTES = SIMPLE_NODE__LABEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__DIAGRAM_NODE = SIMPLE_NODE__DIAGRAM_NODE;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__DIAGRAM_LABEL = SIMPLE_NODE__DIAGRAM_LABEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__CHILDREN = SIMPLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE__LINKS = SIMPLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Simple Top Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE_FEATURE_COUNT = SIMPLE_NODE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE___GET_NODE_FIGURE = SIMPLE_NODE___GET_NODE_FIGURE;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE___GET_LABEL_FIGURE = SIMPLE_NODE___GET_LABEL_FIGURE;

	/**
	 * The number of operations of the '<em>Simple Top Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_TOP_NODE_OPERATION_COUNT = SIMPLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl <em>Simple Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleCompartment()
	 * @generated
	 */
	int SIMPLE_COMPARTMENT = 2;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__CHILDREN = SIMPLE_PARENT_NODE__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__PARENT_NODE = SIMPLE_PARENT_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__PARENT_MAPPING = SIMPLE_PARENT_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__PARENT = SIMPLE_PARENT_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Compartment Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING = SIMPLE_PARENT_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__NAME = SIMPLE_PARENT_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Compartment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__COMPARTMENT = SIMPLE_PARENT_NODE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Compartment Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__COMPARTMENT_LABEL = SIMPLE_PARENT_NODE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Needs Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT__NEEDS_TITLE = SIMPLE_PARENT_NODE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Simple Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT_FEATURE_COUNT = SIMPLE_PARENT_NODE_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT___GET_NODE_FIGURE = SIMPLE_PARENT_NODE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT___GET_LABEL_FIGURE = SIMPLE_PARENT_NODE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Simple Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_COMPARTMENT_OPERATION_COUNT = SIMPLE_PARENT_NODE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLabelNodeImpl <em>Simple Label Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleLabelNodeImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleLabelNode()
	 * @generated
	 */
	int SIMPLE_LABEL_NODE = 3;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__PARENT_NODE = SIMPLE_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__PARENT_MAPPING = SIMPLE_NODE__PARENT_MAPPING;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__PARENT = SIMPLE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__DOMAIN_META_ELEMENT = SIMPLE_NODE__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__NODE_REFERENCE = SIMPLE_NODE__NODE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__CONTAINMENT_FEATURE = SIMPLE_NODE__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__NAME = SIMPLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__PARENT_META_ELEMENT = SIMPLE_NODE__PARENT_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__TOOL = SIMPLE_NODE__TOOL;

	/**
	 * The feature id for the '<em><b>Label Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__LABEL_ATTRIBUTES = SIMPLE_NODE__LABEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__DIAGRAM_NODE = SIMPLE_NODE__DIAGRAM_NODE;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE__DIAGRAM_LABEL = SIMPLE_NODE__DIAGRAM_LABEL;

	/**
	 * The number of structural features of the '<em>Simple Label Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE_FEATURE_COUNT = SIMPLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE___GET_NODE_FIGURE = SIMPLE_NODE___GET_NODE_FIGURE;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE___GET_LABEL_FIGURE = SIMPLE_NODE___GET_LABEL_FIGURE;

	/**
	 * The number of operations of the '<em>Simple Label Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LABEL_NODE_OPERATION_COUNT = SIMPLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl <em>Simple Link Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleLinkMapping()
	 * @generated
	 */
	int SIMPLE_LINK_MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__PARENT_NODE = SIMPLE_CHILD_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__PARENT_MAPPING = SIMPLE_CHILD_NODE__PARENT_MAPPING;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__PARENT = SIMPLE_CHILD_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__CHILDREN = SIMPLE_CHILD_NODE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__NAME = SIMPLE_CHILD_NODE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Link Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__LINK_MAPPING = SIMPLE_CHILD_NODE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__DIAGRAM_LINK = SIMPLE_CHILD_NODE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__DIAGRAM_LABEL = SIMPLE_CHILD_NODE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING__TOOL = SIMPLE_CHILD_NODE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Simple Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING_FEATURE_COUNT = SIMPLE_CHILD_NODE_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING___GET_NODE_FIGURE = SIMPLE_CHILD_NODE___GET_NODE_FIGURE;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING___GET_LABEL_FIGURE = SIMPLE_CHILD_NODE___GET_LABEL_FIGURE;

	/**
	 * The number of operations of the '<em>Simple Link Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_LINK_MAPPING_OPERATION_COUNT = SIMPLE_CHILD_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeReferenceImpl <em>Simple Sub Node Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeReferenceImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleSubNodeReference()
	 * @generated
	 */
	int SIMPLE_SUB_NODE_REFERENCE = 8;

	/**
	 * The feature id for the '<em><b>Parent Node</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__PARENT_NODE = SIMPLE_NODE__PARENT_NODE;

	/**
	 * The feature id for the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__PARENT_MAPPING = SIMPLE_NODE__PARENT_MAPPING;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__PARENT = SIMPLE_NODE__PARENT;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__DOMAIN_META_ELEMENT = SIMPLE_NODE__DOMAIN_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__NODE_REFERENCE = SIMPLE_NODE__NODE_REFERENCE;

	/**
	 * The feature id for the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__CONTAINMENT_FEATURE = SIMPLE_NODE__CONTAINMENT_FEATURE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__NAME = SIMPLE_NODE__NAME;

	/**
	 * The feature id for the '<em><b>Parent Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__PARENT_META_ELEMENT = SIMPLE_NODE__PARENT_META_ELEMENT;

	/**
	 * The feature id for the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__TOOL = SIMPLE_NODE__TOOL;

	/**
	 * The feature id for the '<em><b>Label Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__LABEL_ATTRIBUTES = SIMPLE_NODE__LABEL_ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__DIAGRAM_NODE = SIMPLE_NODE__DIAGRAM_NODE;

	/**
	 * The feature id for the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__DIAGRAM_LABEL = SIMPLE_NODE__DIAGRAM_LABEL;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE__CHILDREN = SIMPLE_NODE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Sub Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE_FEATURE_COUNT = SIMPLE_NODE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Node Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE___GET_NODE_FIGURE = SIMPLE_NODE___GET_NODE_FIGURE;

	/**
	 * The operation id for the '<em>Get Label Figure</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE___GET_LABEL_FIGURE = SIMPLE_NODE___GET_LABEL_FIGURE;

	/**
	 * The number of operations of the '<em>Simple Sub Node Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_SUB_NODE_REFERENCE_OPERATION_COUNT = SIMPLE_NODE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleDomainMapElementImpl <em>Simple Domain Map Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleDomainMapElementImpl
	 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleDomainMapElement()
	 * @generated
	 */
	int SIMPLE_DOMAIN_MAP_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Simple Domain Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DOMAIN_MAP_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Simple Domain Map Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_DOMAIN_MAP_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping <em>Simple Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping
	 * @generated
	 */
	EClass getSimpleMapping();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getCanvas <em>Canvas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Canvas</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping#getCanvas()
	 * @see #getSimpleMapping()
	 * @generated
	 */
	EReference getSimpleMapping_Canvas();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getPalette <em>Palette</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Palette</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping#getPalette()
	 * @see #getSimpleMapping()
	 * @generated
	 */
	EReference getSimpleMapping_Palette();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getMapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping#getMapping()
	 * @see #getSimpleMapping()
	 * @generated
	 */
	EReference getSimpleMapping_Mapping();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Model</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel()
	 * @see #getSimpleMapping()
	 * @generated
	 */
	EReference getSimpleMapping_DomainModel();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainMetaElement()
	 * @see #getSimpleMapping()
	 * @generated
	 */
	EReference getSimpleMapping_DomainMetaElement();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode <em>Simple Top Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Top Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleTopNode
	 * @generated
	 */
	EClass getSimpleTopNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleTopNode#getLinks()
	 * @see #getSimpleTopNode()
	 * @generated
	 */
	EReference getSimpleTopNode_Links();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment <em>Simple Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Compartment</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment
	 * @generated
	 */
	EClass getSimpleCompartment();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartmentMapping <em>Compartment Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartmentMapping()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EReference getSimpleCompartment_CompartmentMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getName()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EAttribute getSimpleCompartment_Name();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartment <em>Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartment()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EReference getSimpleCompartment_Compartment();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartmentLabel <em>Compartment Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Compartment Label</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment#getCompartmentLabel()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EReference getSimpleCompartment_CompartmentLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment#isNeedsTitle <em>Needs Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Needs Title</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleCompartment#isNeedsTitle()
	 * @see #getSimpleCompartment()
	 * @generated
	 */
	EAttribute getSimpleCompartment_NeedsTitle();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleLabelNode <em>Simple Label Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Label Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLabelNode
	 * @generated
	 */
	EClass getSimpleLabelNode();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping <em>Simple Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Link Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping
	 * @generated
	 */
	EClass getSimpleLinkMapping();

	/**
	 * Returns the meta object for the attribute '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getName()
	 * @see #getSimpleLinkMapping()
	 * @generated
	 */
	EAttribute getSimpleLinkMapping_Name();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getLinkMapping <em>Link Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Link Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getLinkMapping()
	 * @see #getSimpleLinkMapping()
	 * @generated
	 */
	EReference getSimpleLinkMapping_LinkMapping();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLink <em>Diagram Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Link</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLink()
	 * @see #getSimpleLinkMapping()
	 * @generated
	 */
	EReference getSimpleLinkMapping_DiagramLink();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLabel <em>Diagram Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Label</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLabel()
	 * @see #getSimpleLinkMapping()
	 * @generated
	 */
	EReference getSimpleLinkMapping_DiagramLabel();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getTool()
	 * @see #getSimpleLinkMapping()
	 * @generated
	 */
	EReference getSimpleLinkMapping_Tool();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode <em>Simple Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode
	 * @generated
	 */
	EClass getSimpleNode();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getNodeReference <em>Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node Reference</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getNodeReference()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_NodeReference();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getContainmentFeature <em>Containment Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Containment Feature</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getContainmentFeature()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_ContainmentFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getName()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EAttribute getSimpleNode_Name();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getParentMetaElement <em>Parent Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Meta Element</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getParentMetaElement()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_ParentMetaElement();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getTool <em>Tool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tool</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getTool()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_Tool();

	/**
	 * Returns the meta object for the reference list '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getLabelAttributes <em>Label Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Label Attributes</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getLabelAttributes()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_LabelAttributes();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode <em>Diagram Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_DiagramNode();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel <em>Diagram Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Diagram Label</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel()
	 * @see #getSimpleNode()
	 * @generated
	 */
	EReference getSimpleNode_DiagramLabel();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode <em>Simple Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Parent Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleParentNode
	 * @generated
	 */
	EClass getSimpleParentNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleParentNode#getChildren()
	 * @see #getSimpleParentNode()
	 * @generated
	 */
	EReference getSimpleParentNode_Children();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode <em>Simple Child Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Child Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode
	 * @generated
	 */
	EClass getSimpleChildNode();

	/**
	 * Returns the meta object for the container reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Node</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode()
	 * @see #getSimpleChildNode()
	 * @generated
	 */
	EReference getSimpleChildNode_ParentNode();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentMapping <em>Parent Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent Mapping</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentMapping()
	 * @see #getSimpleChildNode()
	 * @generated
	 */
	EReference getSimpleChildNode_ParentMapping();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Parent</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParent()
	 * @see #getSimpleChildNode()
	 * @generated
	 */
	EReference getSimpleChildNode_Parent();

	/**
	 * Returns the meta object for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getNodeFigure() <em>Get Node Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Node Figure</em>' operation.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getNodeFigure()
	 * @generated
	 */
	EOperation getSimpleChildNode__GetNodeFigure();

	/**
	 * Returns the meta object for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getLabelFigure() <em>Get Label Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Label Figure</em>' operation.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getLabelFigure()
	 * @generated
	 */
	EOperation getSimpleChildNode__GetLabelFigure();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference <em>Simple Sub Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Sub Node Reference</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference
	 * @generated
	 */
	EClass getSimpleSubNodeReference();

	/**
	 * Returns the meta object for class '{@link org.msl.simple.gmfmap.simplemappings.SimpleDomainMapElement <em>Simple Domain Map Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Domain Map Element</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleDomainMapElement
	 * @generated
	 */
	EClass getSimpleDomainMapElement();

	/**
	 * Returns the meta object for the reference '{@link org.msl.simple.gmfmap.simplemappings.SimpleDomainMapElement#getDomainMetaElement <em>Domain Meta Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Meta Element</em>'.
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleDomainMapElement#getDomainMetaElement()
	 * @see #getSimpleDomainMapElement()
	 * @generated
	 */
	EReference getSimpleDomainMapElement_DomainMetaElement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimplemappingsFactory getSimplemappingsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleMappingImpl <em>Simple Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleMappingImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleMapping()
		 * @generated
		 */
		EClass SIMPLE_MAPPING = eINSTANCE.getSimpleMapping();

		/**
		 * The meta object literal for the '<em><b>Canvas</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MAPPING__CANVAS = eINSTANCE.getSimpleMapping_Canvas();

		/**
		 * The meta object literal for the '<em><b>Palette</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MAPPING__PALETTE = eINSTANCE.getSimpleMapping_Palette();

		/**
		 * The meta object literal for the '<em><b>Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MAPPING__MAPPING = eINSTANCE.getSimpleMapping_Mapping();

		/**
		 * The meta object literal for the '<em><b>Domain Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MAPPING__DOMAIN_MODEL = eINSTANCE.getSimpleMapping_DomainModel();

		/**
		 * The meta object literal for the '<em><b>Domain Meta Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_MAPPING__DOMAIN_META_ELEMENT = eINSTANCE.getSimpleMapping_DomainMetaElement();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl <em>Simple Top Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleTopNode()
		 * @generated
		 */
		EClass SIMPLE_TOP_NODE = eINSTANCE.getSimpleTopNode();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_TOP_NODE__LINKS = eINSTANCE.getSimpleTopNode_Links();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl <em>Simple Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleCompartment()
		 * @generated
		 */
		EClass SIMPLE_COMPARTMENT = eINSTANCE.getSimpleCompartment();

		/**
		 * The meta object literal for the '<em><b>Compartment Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING = eINSTANCE.getSimpleCompartment_CompartmentMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_COMPARTMENT__NAME = eINSTANCE.getSimpleCompartment_Name();

		/**
		 * The meta object literal for the '<em><b>Compartment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPARTMENT__COMPARTMENT = eINSTANCE.getSimpleCompartment_Compartment();

		/**
		 * The meta object literal for the '<em><b>Compartment Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_COMPARTMENT__COMPARTMENT_LABEL = eINSTANCE.getSimpleCompartment_CompartmentLabel();

		/**
		 * The meta object literal for the '<em><b>Needs Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_COMPARTMENT__NEEDS_TITLE = eINSTANCE.getSimpleCompartment_NeedsTitle();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLabelNodeImpl <em>Simple Label Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleLabelNodeImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleLabelNode()
		 * @generated
		 */
		EClass SIMPLE_LABEL_NODE = eINSTANCE.getSimpleLabelNode();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl <em>Simple Link Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleLinkMapping()
		 * @generated
		 */
		EClass SIMPLE_LINK_MAPPING = eINSTANCE.getSimpleLinkMapping();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_LINK_MAPPING__NAME = eINSTANCE.getSimpleLinkMapping_Name();

		/**
		 * The meta object literal for the '<em><b>Link Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_LINK_MAPPING__LINK_MAPPING = eINSTANCE.getSimpleLinkMapping_LinkMapping();

		/**
		 * The meta object literal for the '<em><b>Diagram Link</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_LINK_MAPPING__DIAGRAM_LINK = eINSTANCE.getSimpleLinkMapping_DiagramLink();

		/**
		 * The meta object literal for the '<em><b>Diagram Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_LINK_MAPPING__DIAGRAM_LABEL = eINSTANCE.getSimpleLinkMapping_DiagramLabel();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_LINK_MAPPING__TOOL = eINSTANCE.getSimpleLinkMapping_Tool();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl <em>Simple Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleNode()
		 * @generated
		 */
		EClass SIMPLE_NODE = eINSTANCE.getSimpleNode();

		/**
		 * The meta object literal for the '<em><b>Node Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__NODE_REFERENCE = eINSTANCE.getSimpleNode_NodeReference();

		/**
		 * The meta object literal for the '<em><b>Containment Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__CONTAINMENT_FEATURE = eINSTANCE.getSimpleNode_ContainmentFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_NODE__NAME = eINSTANCE.getSimpleNode_Name();

		/**
		 * The meta object literal for the '<em><b>Parent Meta Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__PARENT_META_ELEMENT = eINSTANCE.getSimpleNode_ParentMetaElement();

		/**
		 * The meta object literal for the '<em><b>Tool</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__TOOL = eINSTANCE.getSimpleNode_Tool();

		/**
		 * The meta object literal for the '<em><b>Label Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__LABEL_ATTRIBUTES = eINSTANCE.getSimpleNode_LabelAttributes();

		/**
		 * The meta object literal for the '<em><b>Diagram Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__DIAGRAM_NODE = eINSTANCE.getSimpleNode_DiagramNode();

		/**
		 * The meta object literal for the '<em><b>Diagram Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_NODE__DIAGRAM_LABEL = eINSTANCE.getSimpleNode_DiagramLabel();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode <em>Simple Parent Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.SimpleParentNode
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleParentNode()
		 * @generated
		 */
		EClass SIMPLE_PARENT_NODE = eINSTANCE.getSimpleParentNode();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_PARENT_NODE__CHILDREN = eINSTANCE.getSimpleParentNode_Children();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode <em>Simple Child Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleChildNode()
		 * @generated
		 */
		EClass SIMPLE_CHILD_NODE = eINSTANCE.getSimpleChildNode();

		/**
		 * The meta object literal for the '<em><b>Parent Node</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CHILD_NODE__PARENT_NODE = eINSTANCE.getSimpleChildNode_ParentNode();

		/**
		 * The meta object literal for the '<em><b>Parent Mapping</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CHILD_NODE__PARENT_MAPPING = eINSTANCE.getSimpleChildNode_ParentMapping();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_CHILD_NODE__PARENT = eINSTANCE.getSimpleChildNode_Parent();

		/**
		 * The meta object literal for the '<em><b>Get Node Figure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_CHILD_NODE___GET_NODE_FIGURE = eINSTANCE.getSimpleChildNode__GetNodeFigure();

		/**
		 * The meta object literal for the '<em><b>Get Label Figure</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_CHILD_NODE___GET_LABEL_FIGURE = eINSTANCE.getSimpleChildNode__GetLabelFigure();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeReferenceImpl <em>Simple Sub Node Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeReferenceImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleSubNodeReference()
		 * @generated
		 */
		EClass SIMPLE_SUB_NODE_REFERENCE = eINSTANCE.getSimpleSubNodeReference();

		/**
		 * The meta object literal for the '{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleDomainMapElementImpl <em>Simple Domain Map Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimpleDomainMapElementImpl
		 * @see org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsPackageImpl#getSimpleDomainMapElement()
		 * @generated
		 */
		EClass SIMPLE_DOMAIN_MAP_ELEMENT = eINSTANCE.getSimpleDomainMapElement();

		/**
		 * The meta object literal for the '<em><b>Domain Meta Element</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT = eINSTANCE.getSimpleDomainMapElement_DomainMetaElement();

	}

} //SimplemappingsPackage
