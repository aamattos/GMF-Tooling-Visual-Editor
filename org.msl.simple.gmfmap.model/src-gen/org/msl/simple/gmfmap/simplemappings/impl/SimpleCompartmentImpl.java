/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Compartment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getParentMetaElement <em>Parent Meta Element</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getNodeFigure <em>Node Figure</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getLabelFigure <em>Label Figure</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartmentMapping <em>Compartment Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartment <em>Compartment</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#getCompartmentLabel <em>Compartment Label</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleCompartmentImpl#isNeedsTitle <em>Needs Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleCompartmentImpl extends EObjectImpl implements SimpleCompartment {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleCompartmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleChildNode> getChildren() {
		return (EList<SimpleChildNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_PARENT_NODE__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParentNode getParentNode() {
		return (SimpleParentNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(SimpleParentNode newParentNode) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, newParentNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMapping getParentMapping() {
		return (SimpleMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMapping(SimpleMapping newParentMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, newParentMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNode getParent() {
		return (SimpleNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SimpleNode newParent) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentMetaElement() {
		return (EClass)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMetaElement(EClass newParentMetaElement) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT, newParentMetaElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompartmentMapping getCompartmentMapping() {
		return (CompartmentMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompartmentMapping(CompartmentMapping newCompartmentMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_MAPPING, newCompartmentMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Compartment getCompartment() {
		return (Compartment)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompartment() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Label getCompartmentLabel() {
		return (Label)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCompartmentLabel() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__COMPARTMENT_LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNeedsTitle() {
		return (Boolean)eGet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NEEDS_TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedsTitle(boolean newNeedsTitle) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT__NEEDS_TITLE, newNeedsTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getNodeFigure() {
		return (Figure)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeFigure(Figure newNodeFigure) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE, newNodeFigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getLabelFigure() {
		return (Figure)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelFigure(Figure newLabelFigure) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE, newLabelFigure);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_NODE: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_META_ELEMENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == SimpleMappingElementWithFigure.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__NODE_FIGURE: return SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE;
				case SimplemappingsPackage.SIMPLE_COMPARTMENT__LABEL_FIGURE: return SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT: return SimplemappingsPackage.SIMPLE_COMPARTMENT__PARENT_META_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == SimpleMappingElementWithFigure.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE: return SimplemappingsPackage.SIMPLE_COMPARTMENT__NODE_FIGURE;
				case SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE: return SimplemappingsPackage.SIMPLE_COMPARTMENT__LABEL_FIGURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleCompartmentImpl
