package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;

import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleMappingSettingDelegate extends Stateless {

	public SimpleMappingSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_MAPPING)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_MAPPING__DOMAIN_MODEL:
		      		return getDomainModel((SimpleMapping)owner);
		      	case SimplemappingsPackage.SIMPLE_MAPPING__DOMAIN_META_ELEMENT:
		      		return getDomainMetaElement((SimpleMapping)owner);		      		
		      }
	    
	    }
		
		return null;
	}
	
	

	private Object getDomainMetaElement(SimpleMapping owner) {
		return owner.getMapping().getDiagram().getDomainMetaElement();

	}

	private Object getDomainModel(SimpleMapping owner) {
		return owner.getMapping().getDiagram().getDomainModel();
	}



	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
