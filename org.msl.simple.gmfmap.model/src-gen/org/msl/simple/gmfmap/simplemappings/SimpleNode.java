/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

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
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getTool <em>Tool</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getLabelAttributes <em>Label Attributes</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode <em>Diagram Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode()
 * @model
 * @generated
 */
public interface SimpleNode extends SimpleChildNode, SimpleMappingElementWithFigure, SimpleNodeReference {
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_Tool()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	AbstractTool getTool();

	/**
	 * Returns whether the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getTool <em>Tool</em>}' reference is set.
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_LabelAttributes()
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_DiagramNode()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	Node getDiagramNode();

	/**
	 * Returns whether the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramNode <em>Diagram Node</em>}' reference is set.
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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_DiagramLabel()
	 * @model unsettable="true" changeable="false" derived="true"
	 * @generated
	 */
	DiagramLabel getDiagramLabel();

	/**
	 * Returns whether the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDiagramLabel <em>Diagram Label</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Diagram Label</em>' reference is set.
	 * @see #getDiagramLabel()
	 * @generated
	 */
	boolean isSetDiagramLabel();

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
	 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleNode_DomainMetaElement()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link org.msl.simple.gmfmap.simplemappings.SimpleNode#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

} // SimpleNode
