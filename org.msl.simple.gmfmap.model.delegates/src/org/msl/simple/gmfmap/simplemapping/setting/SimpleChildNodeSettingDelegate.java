package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

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
		      	case SimplemappingsPackage.SIMPLE_CHILD_NODE__PARENT_META_ELEMENT:
		      		return getParentMetaElement((SimpleChildNode)owner);			      		
		      }
	    
	    }
		
		return null;
	}
	
	
	private SimpleNode getParent(SimpleChildNode owner) {
		
		SimpleParentNode parent = owner.getParentNode();
		
		if(parent instanceof SimpleCompartment)
			return getParent((SimpleCompartment)parent);
		
		if(parent instanceof SimpleNode)
			return (SimpleNode)parent;
		
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

	private Object getParentMetaElement(SimpleChildNode owner) {
		
		if(owner.getParent() instanceof SimpleNode)
		{
			SimpleNode parent = (SimpleNode)owner.getParent();
			return parent.getDomainMetaElement();
		}
		
		if(owner.getParent() instanceof SimpleCompartment)
		{
			SimpleNode parent = (SimpleNode)((SimpleCompartment)owner.getParent()).getParent();
			return parent.getDomainMetaElement();
		}
		
		if(owner.getParentNode()instanceof SimpleMapping)
		{
			SimpleMapping parent = (SimpleMapping)owner.getParentNode();
			return parent.getMapping().getDiagram().getDomainMetaElement();
		}

		
		return null;
	}

	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
