package com.isb.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;

import com.isb.simple.gmfmap.simplemappings.SimpleChildNode;
import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimpleParentNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleChildNodeSettingDelegate extends Stateless {

	public SimpleChildNodeSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_MAPPING:
		      		return getParentMapping((SimpleChildNode)owner);
		      	case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT:
		      		return getParent((SimpleChildNode)owner);
		      	case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_ROOT:
		      		return getParentRoot((SimpleChildNode)owner);		      		
		      }
	    
	    }
		
		return null;
	}
	
	

	private SimpleParentNode getParentRoot(SimpleChildNode owner) {
	
		SimpleChildNode child = owner;
		SimpleParentNode parent = owner.getParentNode();
		
		while(parent instanceof SimpleChildNode)
		{
			child = (SimpleChildNode)parent;
			parent = child.getParentNode();
		}

		if(child instanceof SimpleSubNode)
			return null;
		
		return (SimpleParentNode)child;
	}

	private SimpleNode getParent(SimpleChildNode owner) {
		
		SimpleParentNode parent = owner.getParentNode();
		
		if(parent instanceof SimpleCompartment)
			return getParent((SimpleCompartment)parent);
		
		if(parent instanceof SimpleNode)
			return (SimpleNode)parent;
		
		if(parent instanceof SimpleSubNode)
			return ((SimpleSubNode)parent).getParentSubNodeReference();
		
		if(owner instanceof SimpleSubNode)
			return ((SimpleSubNode)owner).getParentSubNodeReference();

		return null;
	}

	private SimpleMapping getParentMapping(SimpleChildNode owner) {
		
		SimpleParentNode parent = owner.getParentNode();
		
		while(parent instanceof SimpleChildNode)
			parent = ((SimpleChildNode)parent).getParentNode();
		
		if(parent instanceof SimpleMapping)
			return (SimpleMapping)parent;
			
		return null;
	}


	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
