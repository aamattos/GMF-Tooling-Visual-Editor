package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.LabelMapping;
import org.eclipse.gmf.mappings.LinkMapping;
import org.eclipse.gmf.tooldef.CreationTool;

import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;

class NewLinkMappingTrigger extends NewElementTrigger {
	
	protected SimpleLinkMapping newSimpleLinkMapping;
	protected SimpleParentNode parent;

	public NewLinkMappingTrigger(TransactionalEditingDomain domain, SimpleParentNode parent, SimpleLinkMapping newSimpleLinkMapping) {
		super(domain, newSimpleLinkMapping);
		
		this.newSimpleLinkMapping = newSimpleLinkMapping;
		this.parent = parent;

	}

	@Override
	public void executeTrigger() {
		
		Connection newConnection = GMFGraphFactory.eINSTANCE.createConnection();
		DiagramLabel newLabel = GMFGraphFactory.eINSTANCE.createDiagramLabel();

		updateCanvas(newConnection, newLabel);
		
		CreationTool newCreationTool =  createNewTool();

		updateMapping((SimpleMapping)parent, newConnection, newLabel, newCreationTool);

	}
	
	
	protected void updateCanvas(Connection newConnection, DiagramLabel newLabel)
	{
		canvasFactory.createNewDefaultPolygon(newConnection, newLabel);
	}
	

	/**
	 * El padre es el diagrama:
	 * @param mapping
	 * @param newNode
	 * @param newLabel
	 * @param newCreationTool
	 */
	protected void updateMapping(SimpleMapping mapping, Connection newConnection, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		LinkMapping newLinkMapping = createNewLinkMapping(newConnection, newLabel, newCreationTool);

		mapping.getMapping().getLinks().add(newLinkMapping);
		
		newSimpleLinkMapping.setLinkMapping(newLinkMapping);
		
	}
	
	
	protected LinkMapping createNewLinkMapping(Connection newConnection, DiagramLabel newLabel, CreationTool newCreationTool)
	{
		LinkMapping newLinkMapping = GMFMapFactory.eINSTANCE.createLinkMapping();
		
		//Diagram Node
		newLinkMapping.setDiagramLink(newConnection);
		
		//Tool
		newLinkMapping.setTool(newCreationTool);
		
		//Feature Label Mapping
		LabelMapping labelMapping = GMFMapFactory.eINSTANCE.createLabelMapping();
		labelMapping.setDiagramLabel(newLabel);
		
		newLinkMapping.getLabelMappings().add(labelMapping);
		
		return newLinkMapping;

	}
	

}
