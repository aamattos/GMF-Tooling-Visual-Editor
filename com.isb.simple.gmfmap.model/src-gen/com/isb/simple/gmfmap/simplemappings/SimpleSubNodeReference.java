/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sub Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference#getSubNode <em>Sub Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNodeReference()
 * @model
 * @generated
 */
public interface SimpleSubNodeReference extends SimpleNode, SimpleParentNode {
	/**
	 * Returns the value of the '<em><b>Sub Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.isb.simple.gmfmap.simplemappings.SimpleSubNode#getParentSubNodeReference <em>Parent Sub Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Node</em>' reference.
	 * @see #setSubNode(SimpleSubNode)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNodeReference_SubNode()
	 * @see com.isb.simple.gmfmap.simplemappings.SimpleSubNode#getParentSubNodeReference
	 * @model opposite="parentSubNodeReference"
	 * @generated
	 */
	SimpleSubNode getSubNode();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference#getSubNode <em>Sub Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Node</em>' reference.
	 * @see #getSubNode()
	 * @generated
	 */
	void setSubNode(SimpleSubNode value);

} // SimpleSubNodeReference
