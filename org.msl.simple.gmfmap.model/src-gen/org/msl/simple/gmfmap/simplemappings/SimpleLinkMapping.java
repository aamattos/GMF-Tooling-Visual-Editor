/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;

import org.eclipse.gmf.mappings.LinkMapping;

import org.eclipse.gmf.tooldef.AbstractTool;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getLinkMapping <em>Link Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getTool <em>Tool</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping()
 * @model
 * @generated
 */
public interface SimpleLinkMapping extends SimpleChildNode, SimpleParentNode {
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Link Mapping</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Mapping</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Mapping</em>' reference.
	 * @see #setLinkMapping(LinkMapping)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping_LinkMapping()
	 * @model derived="true"
	 * @generated
	 */
	LinkMapping getLinkMapping();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getLinkMapping <em>Link Mapping</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Mapping</em>' reference.
	 * @see #getLinkMapping()
	 * @generated
	 */
	void setLinkMapping(LinkMapping value);

	/**
	 * Returns the value of the '<em><b>Diagram Link</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Link</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Link</em>' reference.
	 * @see #setDiagramLink(Connection)
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping_DiagramLink()
	 * @model
	 * @generated
	 */
	Connection getDiagramLink();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLink <em>Diagram Link</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagram Link</em>' reference.
	 * @see #getDiagramLink()
	 * @generated
	 */
	void setDiagramLink(Connection value);

	/**
	 * Returns the value of the '<em><b>Diagram Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Label</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Label</em>' reference.
	 * @see #isSetDiagramLabel()
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping_DiagramLabel()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	DiagramLabel getDiagramLabel();

	/**
	 * Returns whether the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getDiagramLabel <em>Diagram Label</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagram Label</em>' reference is set.
	 * @see #getDiagramLabel()
	 * @generated
	 */
	boolean isSetDiagramLabel();

	/**
	 * Returns the value of the '<em><b>Tool</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool</em>' reference.
	 * @see #isSetTool()
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleLinkMapping_Tool()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	AbstractTool getTool();

	/**
	 * Returns whether the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping#getTool <em>Tool</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tool</em>' reference is set.
	 * @see #getTool()
	 * @generated
	 */
	boolean isSetTool();

} // SimpleLinkMapping
