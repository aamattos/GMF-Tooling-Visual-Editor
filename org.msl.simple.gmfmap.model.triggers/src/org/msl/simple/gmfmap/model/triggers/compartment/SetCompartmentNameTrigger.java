package org.msl.simple.gmfmap.model.triggers.compartment;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.msl.simple.gmfmap.model.triggers.AbstractTrigger;

class SetCompartmentNameTrigger extends AbstractTrigger {
	
	private Compartment compartment;
	private String newName;

	public SetCompartmentNameTrigger(TransactionalEditingDomain domain, Compartment compartment, String newName) {
		super(domain);
		
		this.compartment = compartment;
		this.newName = newName;
	}

	@Override
	public void executeTrigger() {
		
		updateCanvas();
	}
	
	
	private void updateCanvas()
	{

		Label compartmentLabelToRename = getCompartmentLabel(compartment);
		ChildAccess accessorToRename = compartment.getAccessor();
		
		String newCompartmentName = getNewCanvasElementName(newName, compartment);
		
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

	private Label getCompartmentLabel(Compartment compartment) {
		
		if(compartment.getAccessor()!=null)
		{
			Figure compartmentFigure = compartment.getAccessor().getFigure();
			
			if(compartmentFigure instanceof RealFigure)
				for(Figure child:((RealFigure)compartmentFigure).getChildren())
					if(child instanceof Label)
						return (Label)child;
		}
		
		return null;
	}
}
