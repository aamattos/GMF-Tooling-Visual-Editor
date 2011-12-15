/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.isb.simple.gmfmap.simplemappings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Domain Map Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.isb.simple.gmfmap.simplemappings.SimpleDomainMapElement#getDomainMetaElement <em>Domain Meta Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleDomainMapElement()
 * @model
 * @generated
 */
public interface SimpleDomainMapElement extends EObject {
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
	 * @see com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage#getSimpleDomainMapElement_DomainMetaElement()
	 * @model
	 * @generated
	 */
	EClass getDomainMetaElement();

	/**
	 * Sets the value of the '{@link com.isb.simple.gmfmap.simplemappings.SimpleDomainMapElement#getDomainMetaElement <em>Domain Meta Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Meta Element</em>' reference.
	 * @see #getDomainMetaElement()
	 * @generated
	 */
	void setDomainMetaElement(EClass value);

} // SimpleDomainMapElement
