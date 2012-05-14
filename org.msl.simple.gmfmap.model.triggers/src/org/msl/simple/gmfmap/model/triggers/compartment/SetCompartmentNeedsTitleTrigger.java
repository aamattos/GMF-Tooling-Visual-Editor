package org.msl.simple.gmfmap.model.triggers.compartment;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.msl.simple.gmfmap.model.triggers.AbstractTrigger;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;

class SetCompartmentNeedsTitleTrigger extends AbstractTrigger {
	
	private SimpleCompartment simpleCompartment;
	private boolean needsTitle;

	public SetCompartmentNeedsTitleTrigger(TransactionalEditingDomain domain, SimpleCompartment compartment, boolean needsTitle) {
		super(domain);
		
		this.simpleCompartment = compartment;
		this.needsTitle = needsTitle;
	}

	@Override
	public void executeTrigger() {
		
		updateCanvas();
	}
	
	
	private void updateCanvas()
	{

		Compartment canvasCompartment = simpleCompartment.getCompartment();
		
		if(canvasCompartment!=null)
			canvasCompartment.setNeedsTitle(needsTitle);
			
	}


}
