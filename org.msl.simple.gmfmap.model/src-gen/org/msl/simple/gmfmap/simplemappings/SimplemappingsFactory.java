/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage
 * @generated
 */
public interface SimplemappingsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimplemappingsFactory eINSTANCE = org.msl.simple.gmfmap.simplemappings.impl.SimplemappingsFactoryImpl.init();

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
	 * Returns a new object of class '<em>Simple Sub Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Sub Node</em>'.
	 * @generated
	 */
	SimpleSubNode createSimpleSubNode();

	/**
	 * Returns a new object of class '<em>Simple Mapping Element With Figure</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Mapping Element With Figure</em>'.
	 * @generated
	 */
	SimpleMappingElementWithFigure createSimpleMappingElementWithFigure();

	/**
	 * Returns a new object of class '<em>Simple Child Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Child Reference</em>'.
	 * @generated
	 */
	SimpleChildReference createSimpleChildReference();

	/**
	 * Returns a new object of class '<em>Simple Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Node Reference</em>'.
	 * @generated
	 */
	SimpleNodeReference createSimpleNodeReference();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SimplemappingsPackage getSimplemappingsPackage();

} //SimplemappingsFactory
