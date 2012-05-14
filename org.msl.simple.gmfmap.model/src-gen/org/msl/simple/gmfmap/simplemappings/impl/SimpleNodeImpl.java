/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.mappings.NodeReference;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.msl.simple.gmfmap.simplemappings.SimpleDomainMapElement;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getParentRoot <em>Parent Root</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getNodeReference <em>Node Reference</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getContainmentFeature <em>Containment Feature</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getParentMetaElement <em>Parent Meta Element</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getTool <em>Tool</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getLabelAttributes <em>Label Attributes</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getDiagramNode <em>Diagram Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleNodeImpl#getDiagramLabel <em>Diagram Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleNodeImpl extends EObjectImpl implements SimpleNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_NODE;
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
	public EClass getDomainMetaElement() {
		return (EClass)eGet(SimplemappingsPackage.Literals.SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaElement(EClass newDomainMetaElement) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT, newDomainMetaElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeReference getNodeReference() {
		return (NodeReference)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__NODE_REFERENCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNodeReference(NodeReference newNodeReference) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE__NODE_REFERENCE, newNodeReference);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainmentFeature() {
		return (EReference)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__CONTAINMENT_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainmentFeature(EReference newContainmentFeature) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE__CONTAINMENT_FEATURE, newContainmentFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParentMetaElement() {
		return (EClass)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__PARENT_META_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMetaElement(EClass newParentMetaElement) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_NODE__PARENT_META_ELEMENT, newParentMetaElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractTool getTool() {
		return (AbstractTool)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__TOOL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTool() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_NODE__TOOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<EAttribute> getLabelAttributes() {
		return (EList<EAttribute>)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__LABEL_ATTRIBUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node getDiagramNode() {
		return (Node)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__DIAGRAM_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagramNode() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_NODE__DIAGRAM_NODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagramLabel getDiagramLabel() {
		return (DiagramLabel)eGet(SimplemappingsPackage.Literals.SIMPLE_NODE__DIAGRAM_LABEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDiagramLabel() {
		return eIsSet(SimplemappingsPackage.Literals.SIMPLE_NODE__DIAGRAM_LABEL);
	}

	/**
	 * The cached invocation delegate for the '{@link #getNodeFigure() <em>Get Node Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeFigure()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_NODE_FIGURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE___GET_NODE_FIGURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getNodeFigure() {
		try {
			return (Figure)GET_NODE_FIGURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #getLabelFigure() <em>Get Label Figure</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelFigure()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate GET_LABEL_FIGURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE___GET_LABEL_FIGURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Figure getLabelFigure() {
		try {
			return (Figure)GET_LABEL_FIGURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleDomainMapElement.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT: return SimplemappingsPackage.SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT;
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
		if (baseClass == SimpleDomainMapElement.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_DOMAIN_MAP_ELEMENT__DOMAIN_META_ELEMENT: return SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SimplemappingsPackage.SIMPLE_NODE___GET_NODE_FIGURE:
				return getNodeFigure();
			case SimplemappingsPackage.SIMPLE_NODE___GET_LABEL_FIGURE:
				return getLabelFigure();
		}
		return super.eInvoke(operationID, arguments);
	}

} //SimpleNodeImpl
