/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Sub Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentSubNodeReference <em>Parent Sub Node Reference</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentRootNode <em>Parent Root Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNode()
 * @model
 * @generated
 */
public interface SimpleSubNode extends SimpleRootNode, SimpleChildNode {
	/**
	 * Returns the value of the '<em><b>Parent Sub Node Reference</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference#getSubNode <em>Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Sub Node Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Sub Node Reference</em>' reference.
	 * @see #setParentSubNodeReference(SimpleSubNodeReference)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNode_ParentSubNodeReference()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference#getSubNode
	 * @model opposite="subNode"
	 * @generated
	 */
	SimpleSubNodeReference getParentSubNodeReference();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentSubNodeReference <em>Parent Sub Node Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Sub Node Reference</em>' reference.
	 * @see #getParentSubNodeReference()
	 * @generated
	 */
	void setParentSubNodeReference(SimpleSubNodeReference value);

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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Root Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleRootNode#getSubNodes <em>Sub Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Root Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Root Node</em>' reference.
	 * @see #setParentRootNode(SimpleRootNode)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNode_ParentRootNode()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleRootNode#getSubNodes
	 * @model opposite="subNodes"
	 * @generated
	 */
	SimpleRootNode getParentRootNode();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentRootNode <em>Parent Root Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Root Node</em>' reference.
	 * @see #getParentRootNode()
	 * @generated
	 */
	void setParentRootNode(SimpleRootNode value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleSubNode_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleChildNode> getChildren();

} // SimpleSubNode
