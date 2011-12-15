package com.isb.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleSubNodeSettingDelegate extends Stateless {

	public SimpleSubNodeSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_SUB_NODE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_SUB_NODE__NAME:
		      		return getSubNodeName((SimpleSubNode)owner);
		      	case SimplemappingsPackage.SIMPLE_SUB_NODE__CHILDREN:
		      		return getChildren((SimpleSubNode)owner);		      		
		      }
	    
	    }
		
		return null;
	}
	
	
	private Object getChildren(SimpleSubNode owner) {
		
		if(owner.getParentSubNodeReference()!=null)
			return owner.getParentSubNodeReference().getChildren();
		
		return new BasicEList<SimpleChildNode>();
	}

	private String getSubNodeName(SimpleSubNode owner) {
		// TODO Auto-generated method stub
		return owner.getParentSubNodeReference()!=null?owner.getParentSubNodeReference().getName():null;
	}

	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
