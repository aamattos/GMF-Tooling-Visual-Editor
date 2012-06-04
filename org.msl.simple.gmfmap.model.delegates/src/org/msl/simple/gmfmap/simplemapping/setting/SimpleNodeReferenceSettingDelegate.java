package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.mappings.NodeMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleNodeReference;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleNodeReferenceSettingDelegate extends Stateless {

	public SimpleNodeReferenceSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE:
		      		return getContainmentFeature((SimpleNodeReference)owner);
		      	case SimplemappingsPackage.SIMPLE_NODE_REFERENCE__NAME:
		      		return getName((SimpleNodeReference)owner);			
		      }
	    
	    }
		
		return null;
	}
	
	private String getName(SimpleNodeReference owner) {
		
		String name = null;
		
		if(owner.getContainmentFeature()!=null)
			name = owner.getContainmentFeature().getName();
			
		EClass domainMetaElement = null;
		
		if(owner instanceof SimpleNode)
			domainMetaElement = ((SimpleNode)owner).getDomainMetaElement();
		else if(owner instanceof SimpleChildReference)
		{
			NodeMapping referencedChild = (((SimpleChildReference)owner)).getReferencedChild();
			if(referencedChild!=null)
				domainMetaElement = referencedChild.getDomainMetaElement();
		}
		
		if(domainMetaElement!=null)
			name += ":" +  domainMetaElement.getName();
		
		return name;
	}

	private Object getContainmentFeature(SimpleNodeReference owner) {
		return owner.getNodeReference()!=null?owner.getNodeReference().getContainmentFeature():null;
	}

	@Override
	protected void set(InternalEObject owner, Object newValue) {
		
	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE:
		      		setContainmentFeature((SimpleNodeReference)owner, (EReference)newValue); break;
		      }
	    
	    }
		
	}

	private void setContainmentFeature(SimpleNodeReference owner, EReference newValue) {
		if(owner.getNodeReference()!=null)
			owner.getNodeReference().setContainmentFeature(newValue);
	}

	@Override
	protected boolean isSet(InternalEObject owner) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_NODE_REFERENCE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_NODE_REFERENCE__CONTAINMENT_FEATURE:
		      		return getContainmentFeature((SimpleNodeReference)owner)!=null;
		      }
	    
	    }
		
		return false;
	}

}
