package com.isb.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;

import com.isb.simple.gmfmap.simplemappings.SimpleCompartment;
import com.isb.simple.gmfmap.simplemappings.SimpleNode;

class NewCompartmentTrigger extends NewElementTrigger {
	
	private SimpleCompartment newSimpleCompartment;
	private SimpleNode parent;
	

	public NewCompartmentTrigger(TransactionalEditingDomain domain, SimpleNode parent, SimpleCompartment newCompartment) {
		super(domain, newCompartment);
		
		this.newSimpleCompartment = newCompartment;
		this.parent = parent;
	}

	@Override
	public void executeTrigger() {
		
		Compartment newCompartment = GMFGraphFactory.eINSTANCE.createCompartment();

		updateCanvas(newCompartment);
		updateMapping(newCompartment);
	}
	
	
	private void updateCanvas(Compartment newCompartment)
	{
		
		//Obtenemos la figura del padre:
		FigureDescriptor parentFigureDesc = parent.getDiagramNode().getFigure();

		//Creamos el compartment:
		canvasFactory.createDefaultCompartmentWithoutLabel(parentFigureDesc, newCompartment);
	}

	
	private void updateMapping(Compartment newCompartment)
	{
		CompartmentMapping compartmentMapping = GMFMapFactory.eINSTANCE.createCompartmentMapping();
		compartmentMapping.setCompartment(newCompartment);
		
		parent.getNodeReference().getChild().getCompartments().add(compartmentMapping);
		
		newSimpleCompartment.setCompartmentMapping(compartmentMapping);
	}




}
