/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleDomainMapElement;
import com.isb.simple.gmfmap.simplemappings.SimpleLabelNode;
import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;
import com.isb.simple.gmfmap.simplemappings.SimpleRootNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import com.isb.simple.gmfmap.simplemappings.SimpleTopNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage
 * @generated
 */
public class SimplemappingsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimplemappingsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsSwitch() {
		if (modelPackage == null) {
			modelPackage = SimplemappingsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimplemappingsPackage.SIMPLE_MAPPING: {
				SimpleMapping simpleMapping = (SimpleMapping)theEObject;
				T result = caseSimpleMapping(simpleMapping);
				if (result == null) result = caseSimpleDomainMapElement(simpleMapping);
				if (result == null) result = caseSimpleParentNode(simpleMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_TOP_NODE: {
				SimpleTopNode simpleTopNode = (SimpleTopNode)theEObject;
				T result = caseSimpleTopNode(simpleTopNode);
				if (result == null) result = caseSimpleNode(simpleTopNode);
				if (result == null) result = caseSimpleRootNode(simpleTopNode);
				if (result == null) result = caseSimpleParentNode(simpleTopNode);
				if (result == null) result = caseSimpleChildNode(simpleTopNode);
				if (result == null) result = caseSimpleDomainMapElement(simpleTopNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_COMPARTMENT: {
				SimpleCompartment simpleCompartment = (SimpleCompartment)theEObject;
				T result = caseSimpleCompartment(simpleCompartment);
				if (result == null) result = caseSimpleParentNode(simpleCompartment);
				if (result == null) result = caseSimpleChildNode(simpleCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_LABEL_NODE: {
				SimpleLabelNode simpleLabelNode = (SimpleLabelNode)theEObject;
				T result = caseSimpleLabelNode(simpleLabelNode);
				if (result == null) result = caseSimpleNode(simpleLabelNode);
				if (result == null) result = caseSimpleChildNode(simpleLabelNode);
				if (result == null) result = caseSimpleDomainMapElement(simpleLabelNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_LINK_MAPPING: {
				SimpleLinkMapping simpleLinkMapping = (SimpleLinkMapping)theEObject;
				T result = caseSimpleLinkMapping(simpleLinkMapping);
				if (result == null) result = caseSimpleChildNode(simpleLinkMapping);
				if (result == null) result = caseSimpleParentNode(simpleLinkMapping);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_NODE: {
				SimpleNode simpleNode = (SimpleNode)theEObject;
				T result = caseSimpleNode(simpleNode);
				if (result == null) result = caseSimpleChildNode(simpleNode);
				if (result == null) result = caseSimpleDomainMapElement(simpleNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_PARENT_NODE: {
				SimpleParentNode simpleParentNode = (SimpleParentNode)theEObject;
				T result = caseSimpleParentNode(simpleParentNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_CHILD_NODE: {
				SimpleChildNode simpleChildNode = (SimpleChildNode)theEObject;
				T result = caseSimpleChildNode(simpleChildNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_SUB_NODE_REFERENCE: {
				SimpleSubNodeReference simpleSubNodeReference = (SimpleSubNodeReference)theEObject;
				T result = caseSimpleSubNodeReference(simpleSubNodeReference);
				if (result == null) result = caseSimpleNode(simpleSubNodeReference);
				if (result == null) result = caseSimpleParentNode(simpleSubNodeReference);
				if (result == null) result = caseSimpleChildNode(simpleSubNodeReference);
				if (result == null) result = caseSimpleDomainMapElement(simpleSubNodeReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_DOMAIN_MAP_ELEMENT: {
				SimpleDomainMapElement simpleDomainMapElement = (SimpleDomainMapElement)theEObject;
				T result = caseSimpleDomainMapElement(simpleDomainMapElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_SUB_NODE: {
				SimpleSubNode simpleSubNode = (SimpleSubNode)theEObject;
				T result = caseSimpleSubNode(simpleSubNode);
				if (result == null) result = caseSimpleRootNode(simpleSubNode);
				if (result == null) result = caseSimpleChildNode(simpleSubNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimplemappingsPackage.SIMPLE_ROOT_NODE: {
				SimpleRootNode simpleRootNode = (SimpleRootNode)theEObject;
				T result = caseSimpleRootNode(simpleRootNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleMapping(SimpleMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Top Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Top Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleTopNode(SimpleTopNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleCompartment(SimpleCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Label Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Label Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleLabelNode(SimpleLabelNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Link Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Link Mapping</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleLinkMapping(SimpleLinkMapping object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Child Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Child Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleChildNode(SimpleChildNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Sub Node Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Sub Node Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSubNodeReference(SimpleSubNodeReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Domain Map Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Domain Map Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleDomainMapElement(SimpleDomainMapElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Sub Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Sub Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleSubNode(SimpleSubNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Root Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Root Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRootNode(SimpleRootNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleNode(SimpleNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Parent Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Parent Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleParentNode(SimpleParentNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimplemappingsSwitch