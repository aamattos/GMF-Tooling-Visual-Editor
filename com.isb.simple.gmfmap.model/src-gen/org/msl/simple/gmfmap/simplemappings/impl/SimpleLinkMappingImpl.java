/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleRootNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Link Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getParentRoot <em>Parent Root</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getLinkMapping <em>Link Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getDiagramLink <em>Diagram Link</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getDiagramLabel <em>Diagram Label</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleLinkMappingImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleLinkMappingImpl extends EObjectImpl implements SimpleLinkMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleLinkMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParentNode getParentNode() {
		return (SimpleParentNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentNode(SimpleParentNode newParentNode) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_NODE, newParentNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleMapping getParentMapping() {
		return (SimpleMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMapping(SimpleMapping newParentMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_MAPPING, newParentMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNode getParent() {
		return (SimpleNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SimpleNode newParent) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleParentNode getParentRoot() {
		return (SimpleParentNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_ROOT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParentRoot() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_ROOT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleChildNode> getChildren() {
		return (EList<SimpleChildNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_PARENT_NODE__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkMapping getLinkMapping() {
		return (LinkMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__LINK_MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLinkMapping(LinkMapping newLinkMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__LINK_MAPPING, newLinkMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getDiagramLink() {
		return (Connection)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LINK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagramLink(Connection newDiagramLink) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LINK, newDiagramLink);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLabel getDiagramLabel() {
		return (DiagramLabel)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagramLabel() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LABEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTool getTool() {
		return (AbstractTool)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__TOOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTool() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__TOOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleRootNode> getOutputs() {
		return (EList<SimpleRootNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__OUTPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SimpleRootNode> getInputs() {
		return (EList<SimpleRootNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__INPUTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleParentNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_LINK_MAPPING__CHILDREN: return SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleParentNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN: return SimplemappingsPackage.SIMPLE_LINK_MAPPING__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleLinkMappingImpl
