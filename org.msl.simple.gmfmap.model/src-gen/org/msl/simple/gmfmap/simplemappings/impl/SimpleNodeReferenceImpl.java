/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.mappings.NodeReference;

import org.msl.simple.gmfmap.simplemappings.SimpleNodeReference;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Node Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeReferenceImpl#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeReferenceImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleNodeReferenceImpl extends EObjectImpl implements SimpleNodeReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNodeReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE;
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
	public NodeReference getNodeReference() {
		return (NodeReference)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__NODE_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeReference(NodeReference newNodeReference) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__NODE_REFERENCE, newNodeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentFeature() {
		return (EReference)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentFeature(EReference newContainmentFeature) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE, newContainmentFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE__NAME, newName);
	}

} //SimpleNodeReferenceImpl
