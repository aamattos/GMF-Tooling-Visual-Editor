/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;




/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Top Node Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleTopNodeReference#getTopNode <em>Top Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleTopNodeReference()
 * @model
 * @generated
 */
public interface SimpleTopNodeReference extends SimpleTopNode {

	/**
	 * Returns the value of the '<em><b>Top Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link com.isb.simple.gmfmap.simplemappings.SimpleTopNode#getParentTopNodeReference <em>Parent Top Node Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Node</em>' reference.
	 * @see #setTopNode(SimpleTopNode)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleTopNodeReference_TopNode()
	 * @see com.isb.simple.gmfmap.simplemappings.SimpleTopNode#getParentTopNodeReference
	 * @model opposite="parentTopNodeReference"
	 * @generated
	 */
	SimpleTopNode getTopNode();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleTopNodeReference#getTopNode <em>Top Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Node</em>' reference.
	 * @see #getTopNode()
	 * @generated
	 */
	void setTopNode(SimpleTopNode value);

} // SimpleTopNodeReference
