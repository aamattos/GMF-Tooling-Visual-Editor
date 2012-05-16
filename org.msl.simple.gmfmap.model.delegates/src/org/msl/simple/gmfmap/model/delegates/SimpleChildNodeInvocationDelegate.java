package org.msl.simple.gmfmap.model.delegates;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicInvocationDelegate;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleChildNodeInvocationDelegate extends BasicInvocationDelegate {

	public SimpleChildNodeInvocationDelegate(EOperation operation) {
		super(operation);
	}

	@Override
	public Object dynamicInvoke(InternalEObject target, EList<?> arguments)
			throws InvocationTargetException {

	    if (eOperation.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE)
	    {
	      switch (eOperation.getEContainingClass().getEAllOperations().indexOf(eOperation))
	      {
	        case SimplemappingsPackage.SIMPLE_CHILD_NODE___GET_NODE_FIGURE:
	            return getNodeFigure((SimpleChildNode)target);	
	        case SimplemappingsPackage.SIMPLE_CHILD_NODE___GET_LABEL_FIGURE:
	            return getLabelFigure((SimpleChildNode)target);	
	      }
	    }
		
		return super.dynamicInvoke(target, arguments);
	}

	private Figure getLabelFigure(SimpleChildNode target) {
		
		Figure figure = null;
		
		if(target instanceof SimpleNode)
		{
			DiagramLabel diagramLabel = ((SimpleNode)target).getDiagramLabel();
			if(diagramLabel!=null && diagramLabel.getAccessor()!=null)
				figure = diagramLabel.getAccessor().getFigure();
		}
			
		if(target instanceof SimpleLabelNode)
		{
			figure = ((SimpleNode)target).getDiagramLabel().getFigure().getActualFigure();
		}

		
		if(target instanceof SimpleCompartment)
		{
			figure = ((SimpleCompartment)target).getCompartment().getFigure().getActualFigure();
		}
		
		if(target instanceof SimpleLinkMapping)
		{
			figure = ((SimpleLinkMapping)target).getDiagramLabel().getFigure().getActualFigure();

		}
		
		return figure;
	}

	private Figure getNodeFigure(SimpleChildNode target) {
		
		Figure figure = null;
		
		if(target instanceof SimpleNode)
		{
			figure = ((SimpleNode)target).getDiagramNode().getFigure().getActualFigure();
		}
		
		if(target instanceof SimpleCompartment)
		{
			figure = ((SimpleCompartment)target).getCompartment().getAccessor().getFigure();
		}
		
		if(target instanceof SimpleLinkMapping)
		{
			FigureDescriptor figDesc = ((SimpleLinkMapping)target).getDiagramLink().getFigure();
			figure = figDesc!=null?figDesc.getActualFigure():null;

		}
		
		return figure;
	}
}
