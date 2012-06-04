package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.mappings.ChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleChildReferenceSettingDelegate extends Stateless {

	public SimpleChildReferenceSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_CHILD_REFERENCE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__REFERENCED_CHILD:
		      		return getReferencedChild((SimpleChildReference)owner);
		      }
	    
	    }
		
		return null;
	}
	
	private Object getReferencedChild(SimpleChildReference owner) {
		if(owner.getNodeReference() instanceof ChildReference)
			return ((ChildReference)owner.getNodeReference()).getReferencedChild();
		
		return null;
	}


	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
