/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings.impl;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.gmfgraph.Canvas;

import org.eclipse.gmf.mappings.Mapping;

import org.eclipse.gmf.tooldef.Palette;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getCanvas <em>Canvas</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getPalette <em>Palette</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getMapping <em>Mapping</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getDomainModel <em>Domain Model</em>}</li>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.impl.SimpleMappingImpl#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimpleMappingImpl extends EObjectImpl implements SimpleMapping {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimplemappingsPackage.Literals.SIMPLE_MAPPING;
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
	@SuppressWarnings("unchecked")
	public EList<SimpleChildNode> getChildren() {
		return (EList<SimpleChildNode>)eGet(SimplemappingsPackage.Literals.SIMPLE_PARENT_NODE__CHILDREN, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Canvas getCanvas() {
		return (Canvas)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__CANVAS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCanvas(Canvas newCanvas) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__CANVAS, newCanvas);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Palette getPalette() {
		return (Palette)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__PALETTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPalette(Palette newPalette) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__PALETTE, newPalette);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mapping getMapping() {
		return (Mapping)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__MAPPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapping(Mapping newMapping) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__MAPPING, newMapping);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EPackage getDomainModel() {
		return (EPackage)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__DOMAIN_MODEL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainModel(EPackage newDomainModel) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__DOMAIN_MODEL, newDomainModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDomainMetaElement() {
		return (EClass)eGet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__DOMAIN_META_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainMetaElement(EClass newDomainMetaElement) {
		eSet(SimplemappingsPackage.Literals.SIMPLE_MAPPING__DOMAIN_META_ELEMENT, newDomainMetaElement);
	}

} //SimpleMappingImpl
