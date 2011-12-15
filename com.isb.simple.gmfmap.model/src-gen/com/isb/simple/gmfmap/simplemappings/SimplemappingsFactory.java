/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage
 * @generated
 */
public interface SimplemappingsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplemappingsFactory eINSTANCE = com.isb.simple.gmfmap.simplemappings.impl.SimplemappingsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Simple Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Mapping</em>'.
	 * @generated
	 */
	SimpleMapping createSimpleMapping();

	/**
	 * Returns a new object of class '<em>Simple Top Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Top Node</em>'.
	 * @generated
	 */
	SimpleTopNode createSimpleTopNode();

	/**
	 * Returns a new object of class '<em>Simple Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Compartment</em>'.
	 * @generated
	 */
	SimpleCompartment createSimpleCompartment();

	/**
	 * Returns a new object of class '<em>Simple Label Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Label Node</em>'.
	 * @generated
	 */
	SimpleLabelNode createSimpleLabelNode();

	/**
	 * Returns a new object of class '<em>Simple Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Link Mapping</em>'.
	 * @generated
	 */
	SimpleLinkMapping createSimpleLinkMapping();

	/**
	 * Returns a new object of class '<em>Simple Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Node</em>'.
	 * @generated
	 */
	SimpleNode createSimpleNode();

	/**
	 * Returns a new object of class '<em>Simple Sub Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sub Node Reference</em>'.
	 * @generated
	 */
	SimpleSubNodeReference createSimpleSubNodeReference();

	/**
	 * Returns a new object of class '<em>Simple Domain Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Domain Map Element</em>'.
	 * @generated
	 */
	SimpleDomainMapElement createSimpleDomainMapElement();

	/**
	 * Returns a new object of class '<em>Simple Sub Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sub Node</em>'.
	 * @generated
	 */
	SimpleSubNode createSimpleSubNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplemappingsPackage getSimplemappingsPackage();

} //SimplemappingsFactory
