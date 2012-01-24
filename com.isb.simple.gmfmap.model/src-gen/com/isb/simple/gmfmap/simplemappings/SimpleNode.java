/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Node;

import org.eclipse.gmf.mappings.NodeReference;

import org.eclipse.gmf.tooldef.AbstractTool;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getName <em>Name</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getParentMetaElement <em>Parent Meta Element</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getTool <em>Tool</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getLabelAttributes <em>Label Attributes</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode <em>Diagram Node</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel <em>Diagram Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode()
 * @model
 * @generated
 */
public interface SimpleNode extends SimpleChildNode, SimpleDomainMapElement {
	/**
	 * Returns the value of the '<em><b>Node Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Reference</em>' reference.
	 * @see #setNodeReference(NodeReference)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_NodeReference()
	 * @model derived="true"
	 * @generated
	 */
	NodeReference getNodeReference();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getNodeReference <em>Node Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Reference</em>' reference.
	 * @see #getNodeReference()
	 * @generated
	 */
	void setNodeReference(NodeReference value);

	/**
	 * Returns the value of the '<em><b>Containment Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Containment Feature</em>' reference.
	 * @see #setContainmentFeature(EReference)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_ContainmentFeature()
	 * @model
	 * @generated
	 */
	EReference getContainmentFeature();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getContainmentFeature <em>Containment Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Containment Feature</em>' reference.
	 * @see #getContainmentFeature()
	 * @generated
	 */
	void setContainmentFeature(EReference value);

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
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parent Meta Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Meta Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Meta Element</em>' reference.
	 * @see #setParentMetaElement(EClass)
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_ParentMetaElement()
	 * @model transient="true"
	 * @generated
	 */
	EClass getParentMetaElement();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getParentMetaElement <em>Parent Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Meta Element</em>' reference.
	 * @see #getParentMetaElement()
	 * @generated
	 */
	void setParentMetaElement(EClass value);

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
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_Tool()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	AbstractTool getTool();

	/**
	 * Returns whether the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getTool <em>Tool</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Tool</em>' reference is set.
	 * @see #getTool()
	 * @generated
	 */
	boolean isSetTool();

	/**
	 * Returns the value of the '<em><b>Label Attributes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Attributes</em>' reference list.
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_LabelAttributes()
	 * @model transient="true"
	 * @generated
	 */
	EList<EAttribute> getLabelAttributes();

	/**
	 * Returns the value of the '<em><b>Diagram Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagram Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagram Node</em>' reference.
	 * @see #isSetDiagramNode()
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_DiagramNode()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	Node getDiagramNode();

	/**
	 * Returns whether the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode <em>Diagram Node</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagram Node</em>' reference is set.
	 * @see #getDiagramNode()
	 * @generated
	 */
	boolean isSetDiagramNode();

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
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_DiagramLabel()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	DiagramLabel getDiagramLabel();

	/**
	 * Returns whether the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel <em>Diagram Label</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagram Label</em>' reference is set.
	 * @see #getDiagramLabel()
	 * @generated
	 */
	boolean isSetDiagramLabel();

} // SimpleNode
