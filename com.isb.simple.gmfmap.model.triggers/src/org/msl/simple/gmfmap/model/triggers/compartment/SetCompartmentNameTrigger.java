package org.msl.simple.gmfmap.model.triggers.compartment;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.RealFigure;

import org.msl.simple.gmfmap.model.triggers.AbstractTrigger;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;

class SetCompartmentNameTrigger extends AbstractTrigger {
	
	private SimpleCompartment simpleCompartment;
	private String newName;

	public SetCompartmentNameTrigger(TransactionalEditingDomain domain, SimpleCompartment compartment, String newName) {
		super(domain);
		
		this.simpleCompartment = compartment;
		this.newName = newName;
	}

	@Override
	public void executeTrigger() {
		
		updateCanvas();
	}
	
	
	private void updateCanvas()
	{

		Compartment canvasCompartment = simpleCompartment.getCompartment();
		Label compartmentLabelToRename = simpleCompartment.getCompartmentLabel();
		ChildAccess accessorToRename = canvasCompartment.getAccessor();
		
		String newCompartmentName = getNewCanvasElementName(newName, canvasCompartment);
		
		canvasCompartment.setName(newCompartmentName);
 		
		String newRectangleFigureName = newCompartmentName + "CompartmentFigure";
		String newAccessorName = "getFigure" + newRectangleFigureName;
		String newLabelFigureName = newCompartmentName + "CompartmentNameFigure";

		if(accessorToRename!=null)
		{
			accessorToRename.setAccessor(newAccessorName);

			Figure compartmentFigureToRename = accessorToRename.getFigure();
			
			if(compartmentFigureToRename instanceof RealFigure)
				((RealFigure)compartmentFigureToRename).setName(newRectangleFigureName);
		}

		if(compartmentLabelToRename!=null)
		{
			compartmentLabelToRename.setName(newLabelFigureName);
			compartmentLabelToRename.setText(newName);
		}
			
	}


}
