/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.Figure;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Mapping Element With Figure</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure#getNodeFigure <em>Node Figure</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure#getLabelFigure <em>Label Figure</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMappingElementWithFigure()
 * @model
 * @generated
 */
public interface SimpleMappingElementWithFigure extends EObject {
	/**
	 * Returns the value of the '<em><b>Node Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Figure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Figure</em>' reference.
	 * @see #setNodeFigure(Figure)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMappingElementWithFigure_NodeFigure()
	 * @model
	 * @generated
	 */
	Figure getNodeFigure();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure#getNodeFigure <em>Node Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Figure</em>' reference.
	 * @see #getNodeFigure()
	 * @generated
	 */
	void setNodeFigure(Figure value);

	/**
	 * Returns the value of the '<em><b>Label Figure</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Figure</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Figure</em>' reference.
	 * @see #setLabelFigure(Figure)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMappingElementWithFigure_LabelFigure()
	 * @model
	 * @generated
	 */
	Figure getLabelFigure();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure#getLabelFigure <em>Label Figure</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Figure</em>' reference.
	 * @see #getLabelFigure()
	 * @generated
	 */
	void setLabelFigure(Figure value);

} // SimpleMappingElementWithFigure
