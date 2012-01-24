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
 * A representation of the model object '<em><b>Simple Top Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode#getLinks <em>Links</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleTopNode()
 * @model
 * @generated
 */
public interface SimpleTopNode extends SimpleNode, SimpleRootNode, SimpleParentNode {
	/**
	 * Returns the value of the '<em><b>Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Links</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Links</em>' containment reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleTopNode_Links()
	 * @model containment="true"
	 * @generated
	 */
	EList<SimpleLinkMapping> getLinks();

} // SimpleTopNode
