/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Child Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParent <em>Parent</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentRoot <em>Parent Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SimpleChildNode extends EObject {

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.isb.simple.gmfmap.simplemappings.SimpleParentNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' container reference.
	 * @see #setParentNode(SimpleParentNode)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildNode_ParentNode()
	 * @see com.isb.simple.gmfmap.simplemappings.SimpleParentNode#getChildren
	 * @model opposite="children" unsettable="true" transient="false"
	 * @generated
	 */
	SimpleParentNode getParentNode();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode <em>Parent Node</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' container reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(SimpleParentNode value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(SimpleNode)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildNode_Parent()
	 * @model
	 * @generated
	 */
	SimpleNode getParent();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(SimpleNode value);

	/**
	 * Returns the value of the '<em><b>Parent Root</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Root</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Root</em>' reference.
	 * @see #isSetParentRoot()
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildNode_ParentRoot()
	 * @model unsettable="true" changeable="false"
	 * @generated
	 */
	SimpleParentNode getParentRoot();

	/**
	 * Returns whether the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentRoot <em>Parent Root</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Parent Root</em>' reference is set.
	 * @see #getParentRoot()
	 * @generated
	 */
	boolean isSetParentRoot();

	/**
	 * Returns the value of the '<em><b>Parent Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Mapping</em>' reference.
	 * @see #setParentMapping(SimpleMapping)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildNode_ParentMapping()
	 * @model transient="true"
	 * @generated
	 */
	SimpleMapping getParentMapping();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleChildNode#getParentMapping <em>Parent Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Mapping</em>' reference.
	 * @see #getParentMapping()
	 * @generated
	 */
	void setParentMapping(SimpleMapping value);
} // SimpleChildNode
