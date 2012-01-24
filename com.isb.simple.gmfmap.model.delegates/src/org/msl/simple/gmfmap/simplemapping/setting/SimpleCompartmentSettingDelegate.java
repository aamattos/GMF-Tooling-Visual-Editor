package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.RealFigure;

import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleCompartmentSettingDelegate extends Stateless {

	public SimpleCompartmentSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_COMPARTMENT)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_COMPARTMENT__COMPARTMENT:
		      		return getCompartment((SimpleCompartment)owner);
		      	case SimplemappingsPackage.SIMPLE_COMPARTMENT__COMPARTMENT_LABEL:
		      		return getCompartmentLabel((SimpleCompartment)owner);		      		
		      }
	    
	    }
		
		return null;
	}
	
	

	private Label getCompartmentLabel(SimpleCompartment owner) {
		
		Compartment canvasCompartment = getCompartment(owner);
		
		if(canvasCompartment!=null && canvasCompartment.getAccessor()!=null)
		{
			Figure compartmentFigure = canvasCompartment.getAccessor().getFigure();
			
			if(compartmentFigure instanceof RealFigure)
				for(Figure child:((RealFigure)compartmentFigure).getChildren())
					if(child instanceof Label)
						return (Label)child;
		}
		
		return null;
	}

	private Compartment getCompartment(SimpleCompartment owner) {
		
		if(owner.getCompartmentMapping()!=null)
			return owner.getCompartmentMapping().getCompartment();
		
		return null;
	}


	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
