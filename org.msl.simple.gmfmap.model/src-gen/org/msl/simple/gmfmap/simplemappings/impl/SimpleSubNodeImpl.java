/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Sub Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.msl.simple.gmfmap.simplemappings.impl.SimpleSubNodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleSubNodeImpl extends SimpleNodeImpl implements SimpleSubNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSubNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_SUB_NODE;
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
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SimpleParentNode.class) {
			switch (derivedFeatureID) {
				case SimplemappingsPackage.SIMPLE_SUB_NODE__CHILDREN: return SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN;
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
				case SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN: return SimplemappingsPackage.SIMPLE_SUB_NODE__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SimpleSubNodeImpl
