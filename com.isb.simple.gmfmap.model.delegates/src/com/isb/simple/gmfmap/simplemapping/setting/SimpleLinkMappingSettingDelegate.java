package com.isb.simple.gmfmap.simplemapping.setting;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.BasicSettingDelegate.Stateless;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.tooldef.AbstractTool;

import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleLinkMappingSettingDelegate extends Stateless {

	public SimpleLinkMappingSettingDelegate(EStructuralFeature arg0) {
		super(arg0);
	}

	@Override
	protected Object get(InternalEObject owner, boolean resolve,
			boolean coreType) {

	    if (eStructuralFeature.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING)
	    {
		      switch (eStructuralFeature.getEContainingClass().getEAllStructuralFeatures().indexOf(eStructuralFeature))
		      {	
		      	case SimplemappingsPackage.SIMPLE_LINK_MAPPING__DIAGRAM_LINK:
		      		return getDiagramLink((SimpleLinkMapping)owner);
		      	case SimplemappingsPackage.SIMPLE_LINK_MAPPING__DIAGRAM_LABEL:
		      		return getDiagramLabel((SimpleLinkMapping)owner);		
		      	case SimplemappingsPackage.SIMPLE_LINK_MAPPING__TOOL:
		      		return getTool((SimpleLinkMapping)owner);				      		
		      }
	    
	    }
		
		return null;
	}
	
	

	private Connection getDiagramLink(SimpleLinkMapping owner) {
		
		if(owner.getLinkMapping()!=null)
			return owner.getLinkMapping().getDiagramLink();
		
		return null;
	}

	/**
	 * Devuelve el label por defecto (El primero definido)
	 * @param owner
	 * @return
	 */
	private DiagramLabel getDiagramLabel(SimpleLinkMapping owner) {
		
		LinkMapping linkMapping = owner.getLinkMapping();
		
		if(linkMapping!=null && !linkMapping.getLabelMappings().isEmpty())
			//Devolvemos el primer label definido
			return linkMapping.getLabelMappings().get(0).getDiagramLabel();
		
		return null;
	}
	
	private AbstractTool getTool(SimpleLinkMapping owner) {
		
		LinkMapping linkMapping = owner.getLinkMapping();
		
		if(linkMapping!=null)
			return linkMapping.getTool();
		
		return null;
	}

	@Override
	protected boolean isSet(InternalEObject owner) {

		return false;
	}

}
