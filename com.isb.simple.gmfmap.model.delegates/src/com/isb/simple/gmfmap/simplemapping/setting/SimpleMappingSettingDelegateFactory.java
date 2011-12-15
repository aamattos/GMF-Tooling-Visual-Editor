package com.isb.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate.Factory;

import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

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
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_MAPPING)
			return new SimpleMappingSettingDelegate(eStructuralFeature);
		
		if(eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_SUB_NODE)
			return new SimpleSubNodeSettingDelegate(eStructuralFeature);
		
		return null;
	}

}
