/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.tooldef.Palette;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getPalette <em>Palette</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping()
 * @model
 * @generated
 */
public interface SimpleMapping extends SimpleDomainMapElement, SimpleParentNode {
	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' containment reference.
	 * @see #setCanvas(Canvas)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Canvas()
	 * @model containment="true"
	 * @generated
	 */
	Canvas getCanvas();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getCanvas <em>Canvas</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas</em>' containment reference.
	 * @see #getCanvas()
	 * @generated
	 */
	void setCanvas(Canvas value);

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' containment reference.
	 * @see #setPalette(Palette)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Palette()
	 * @model containment="true"
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getPalette <em>Palette</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' containment reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' containment reference.
	 * @see #setMapping(Mapping)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Mapping()
	 * @model containment="true"
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getMapping <em>Mapping</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' containment reference.
	 * @see #getMapping()
	 * @generated
	 */
	void setMapping(Mapping value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' reference.
	 * @see #setDomainModel(EPackage)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_DomainModel()
	 * @model
	 * @generated
	 */
	EPackage getDomainModel();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(EPackage value);

} // SimpleMapping
