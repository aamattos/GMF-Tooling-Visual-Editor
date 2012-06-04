/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.gmf.mappings.NodeMapping;

import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Child Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getParentMapping <em>Parent Mapping</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getParentMetaElement <em>Parent Meta Element</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getReferencedChild <em>Referenced Child</em>}</li>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleChildReferenceImpl#getReferencedSimpleNode <em>Referenced Simple Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleChildReferenceImpl extends SimpleNodeReferenceImpl implements SimpleChildReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleChildReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE;
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
	public EClass getParentMetaElement() {
		return (EClass)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentMetaElement(EClass newParentMetaElement) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT, newParentMetaElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeMapping getReferencedChild() {
		return (NodeMapping)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE__REFERENCED_CHILD, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedChild(NodeMapping newReferencedChild) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE__REFERENCED_CHILD, newReferencedChild);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleNode getReferencedSimpleNode() {
		return (SimpleNode)eGet(SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE__REFERENCED_SIMPLE_NODE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedSimpleNode(SimpleNode newReferencedSimpleNode) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE__REFERENCED_SIMPLE_NODE, newReferencedSimpleNode);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleChildNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT;
				case SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_META_ELEMENT: return SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT;
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
		if (baseClass == SimpleChildNode.class) {
			switch (baseFeatureID) {
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_NODE: return SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_NODE;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING: return SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_MAPPING;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT: return SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT;
				case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT: return SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__PARENT_META_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleChildReferenceImpl
