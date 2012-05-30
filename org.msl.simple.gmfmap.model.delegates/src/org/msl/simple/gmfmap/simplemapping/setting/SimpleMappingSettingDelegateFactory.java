package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate.Factory;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleMappingSettingDelegateFactory implements Factory {

	@Override
	public SettingDelegate createSettingDelegate(
			EStructuralFeature eStructuralFeature) {
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE)
			return new SimpleNodeSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT)
			return new SimpleCompartmentSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING)
			return new SimpleLinkMappingSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE)
			return new SimpleChildNodeSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE)
			return new SimpleMappingElementWithFigureSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_MAPPING)
			return new SimpleMappingSettingDelegate(eStructuralFeature);
		
		return new Stateless(eStructuralFeature) {
			
			@Override
			protected boolean isSet(InternalEObject owner) {
				// TODO Auto-generated method stub
				return false;
			}
			
			@Override
			protected Object get(InternalEObject owner, boolean resolve,
					boolean coreType) {
				// TODO Auto-generated method stub
				return null;
			}
		};
	}

}
