/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.gmf.mappings.NodeMapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Child Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference#getReferencedChild <em>Referenced Child</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference#getReferencedSimpleNode <em>Referenced Simple Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildReference()
 * @model
 * @generated
 */
public interface SimpleChildReference extends SimpleNodeReference, SimpleChildNode {
	/**
	 * Returns the value of the '<em><b>Referenced Child</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Child</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Child</em>' reference.
	 * @see #setReferencedChild(NodeMapping)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildReference_ReferencedChild()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	NodeMapping getReferencedChild();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference#getReferencedChild <em>Referenced Child</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Child</em>' reference.
	 * @see #getReferencedChild()
	 * @generated
	 */
	void setReferencedChild(NodeMapping value);

	/**
	 * Returns the value of the '<em><b>Referenced Simple Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Simple Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Simple Node</em>' reference.
	 * @see #setReferencedSimpleNode(SimpleNode)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleChildReference_ReferencedSimpleNode()
	 * @model
	 * @generated
	 */
	SimpleNode getReferencedSimpleNode();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference#getReferencedSimpleNode <em>Referenced Simple Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Simple Node</em>' reference.
	 * @see #getReferencedSimpleNode()
	 * @generated
	 */
	void setReferencedSimpleNode(SimpleNode value);

} // SimpleChildReference
