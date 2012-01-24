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
 * A representation of the model object '<em><b>Simple Root Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleRootNode#getSubNodes <em>Sub Nodes</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleRootNode#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleRootNode#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleRootNode()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface SimpleRootNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Sub Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode}.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentRootNode <em>Parent Root Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Nodes</em>' reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleRootNode_SubNodes()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleSubNode#getParentRootNode
	 * @model opposite="parentRootNode"
	 * @generated
	 */
	EList<SimpleSubNode> getSubNodes();

	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping}.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleRootNode_Outputs()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getInputs
	 * @model opposite="inputs"
	 * @generated
	 */
	EList<SimpleLinkMapping> getOutputs();

	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping}.
	 * It is bidirectional and its opposite is '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleRootNode_Inputs()
	 * @see org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getOutputs
	 * @model opposite="outputs"
	 * @generated
	 */
	EList<SimpleLinkMapping> getInputs();

} // SimpleRootNode
