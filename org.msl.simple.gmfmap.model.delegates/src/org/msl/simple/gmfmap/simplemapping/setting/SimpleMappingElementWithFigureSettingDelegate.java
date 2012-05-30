package org.msl.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.Node;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleMappingElementWithFigureSettingDelegate extends Stateless {

	public SimpleMappingElementWithFigureSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE:
		      		 return getNodeFigure((SimpleMappingElementWithFigure)owner);		
		      	case SimplemappingsPackage.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE:
		      		 return getLabelFigure((SimpleMappingElementWithFigure)owner);
		      }
	    
	    }
		
		return null;
	}
	
	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}
	
	private Figure getLabelFigure(SimpleMappingElementWithFigure target) {
		
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

	private Figure getNodeFigure(SimpleMappingElementWithFigure target) {
		
		Figure figure = null;
		
		if(target instanceof SimpleNode)
		{
			Node node = ((SimpleNode)target).getDiagramNode();
			
			if(node!=null && node.getFigure()!=null)
				figure = node.getFigure().getActualFigure();
		}
		
		if(target instanceof SimpleCompartment)
		{
			Compartment compartment = ((SimpleCompartment)target).getCompartment();
			if(compartment!=null && compartment.getAccessor()!=null)
				figure = compartment.getAccessor().getFigure();
		}
		
		if(target instanceof SimpleLinkMapping)
		{
			Connection connection = ((SimpleLinkMapping)target).getDiagramLink();
			if(connection!=null && connection.getFigure()!=null)
				figure = connection.getFigure().getActualFigure();
		}
		
		return figure;
	}

}
