/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Parent Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleParentNode#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleParentNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SimpleParentNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode}.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleParentNode_Children()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleChildNode#getParentNode
	 * @model opposite="parentNode" containment="true"
	 * @generated
	 */
	EList<SimpleChildNode> getChildren();

} // SimpleParentNode
