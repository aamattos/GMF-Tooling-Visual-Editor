/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;
import com.isb.simple.gmfmap.simplemappings.SimpleRootNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimpleTopNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Top Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl#getSubNodes <em>Sub Nodes</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleTopNodeImpl#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleTopNodeImpl extends SimpleNodeImpl implements SimpleTopNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_TOP_NODE;
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
	@SuppressWarnings("unchecked")
	public EList<SimpleLinkMapping> getLinks() {
		return (EList<SimpleLinkMapping>)eGet(SimplemappingsPackage.Literals.SIMPLE_TOP_NODE__LINKS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleSubNode> getSubNodes() {
		return (EList<SimpleSubNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__SUB_NODES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleLinkMapping> getOutputs() {
		return (EList<SimpleLinkMapping>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__OUTPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleLinkMapping> getInputs() {
		return (EList<SimpleLinkMapping>)eGet(SimplemappingsPackage.Literals.SIMPLE_ROOT_NODE__INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleRootNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_TOP_NODE__SUB_NODES: return SimplemappingsPackage.SIMPLE_ROOT_NODE__SUB_NODES;
				case SimplemappingsPackage.SIMPLE_TOP_NODE__OUTPUTS: return SimplemappingsPackage.SIMPLE_ROOT_NODE__OUTPUTS;
				case SimplemappingsPackage.SIMPLE_TOP_NODE__INPUTS: return SimplemappingsPackage.SIMPLE_ROOT_NODE__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == SimpleParentNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_TOP_NODE__CHILDREN: return SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN;
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
		if (baseClass == SimpleRootNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_ROOT_NODE__SUB_NODES: return SimplemappingsPackage.SIMPLE_TOP_NODE__SUB_NODES;
				case SimplemappingsPackage.SIMPLE_ROOT_NODE__OUTPUTS: return SimplemappingsPackage.SIMPLE_TOP_NODE__OUTPUTS;
				case SimplemappingsPackage.SIMPLE_ROOT_NODE__INPUTS: return SimplemappingsPackage.SIMPLE_TOP_NODE__INPUTS;
				default: return -1;
			}
		}
		if (baseClass == SimpleParentNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN: return SimplemappingsPackage.SIMPLE_TOP_NODE__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleTopNodeImpl
