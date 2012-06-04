/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.mappings.NodeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNodeReference()
 * @model
 * @generated
 */
public interface SimpleNodeReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Reference</em>' reference.
	 * @see #setNodeReference(NodeReference)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNodeReference_NodeReference()
	 * @model derived="true"
	 * @generated
	 */
	NodeReference getNodeReference();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getNodeReference <em>Node Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Reference</em>' reference.
	 * @see #getNodeReference()
	 * @generated
	 */
	void setNodeReference(NodeReference value);

	/**
	 * Returns the value of the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Feature</em>' reference.
	 * @see #setContainmentFeature(EReference)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNodeReference_ContainmentFeature()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EReference getContainmentFeature();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getContainmentFeature <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Feature</em>' reference.
	 * @see #getContainmentFeature()
	 * @generated
	 */
	void setContainmentFeature(EReference value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNodeReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SimpleNodeReference
