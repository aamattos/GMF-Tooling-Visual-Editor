/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EClass;
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
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getPalette <em>Palette</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getMapping <em>Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping()
 * @model
 * @generated
 */
public interface SimpleMapping extends SimpleParentNode {
	/**
	 * Returns the value of the '<em><b>Canvas</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Canvas</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Canvas</em>' reference.
	 * @see #setCanvas(Canvas)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Canvas()
	 * @model
	 * @generated
	 */
	Canvas getCanvas();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getCanvas <em>Canvas</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Canvas</em>' reference.
	 * @see #getCanvas()
	 * @generated
	 */
	void setCanvas(Canvas value);

	/**
	 * Returns the value of the '<em><b>Palette</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Palette</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Palette</em>' reference.
	 * @see #setPalette(Palette)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Palette()
	 * @model
	 * @generated
	 */
	Palette getPalette();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getPalette <em>Palette</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Palette</em>' reference.
	 * @see #getPalette()
	 * @generated
	 */
	void setPalette(Palette value);

	/**
	 * Returns the value of the '<em><b>Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping</em>' reference.
	 * @see #setMapping(Mapping)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_Mapping()
	 * @model
	 * @generated
	 */
	Mapping getMapping();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getMapping <em>Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mapping</em>' reference.
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_DomainModel()
	 * @model
	 * @generated
	 */
	EPackage getDomainModel();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainModel <em>Domain Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(EPackage value);

	/**
	 * Returns the value of the '<em><b>Domain Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Meta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Meta Element</em>' reference.
	 * @see #setDomainMetaElement(EClass)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleMapping_DomainMetaElement()
	 * @model
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleMapping#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

} // SimpleMapping
