package org.msl.simple.gmfmap.diagram.core;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.WorkspaceEditingDomainFactory;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;

import org.msl.simple.gmfmap.model.triggers.SimpleMappingTriggerListener;
import org.msl.simple.gmfmap.model.triggers.compartment.SimpleCompartmentTriggerListener;
import org.msl.simple.gmfmap.model.triggers.link.SimpleLinkMappingTriggerListener;
import org.msl.simple.gmfmap.model.triggers.node.SimpleNodeTriggerListener;
import org.msl.simple.gmfmap.model.triggers.parent.ParentNodeTriggerListener;

public class SimpleMapDiagramEditingDomainFactory extends
		DiagramEditingDomainFactory {
	
    /**
     * The single shared instance of the GMF diagram editing domain factory.
     */
    private static SimpleMapDiagramEditingDomainFactory instance = new SimpleMapDiagramEditingDomainFactory();
	
    /**
     * Gets the single shared instance of the GMF diagram editing domain factory.
     * 
     * @return the editing domain factory
     */
    public static WorkspaceEditingDomainFactory getInstance() {
        return instance;
    }  

	@Override
	protected void configure(TransactionalEditingDomain domain) {
		// TODO Auto-generated method stub
		super.configure(domain);
		
		domain.addResourceSetListener(new SimpleCompartmentTriggerListener());
		domain.addResourceSetListener(new SimpleNodeTriggerListener());
		domain.addResourceSetListener(new ParentNodeTriggerListener());
		domain.addResourceSetListener(new SimpleLinkMappingTriggerListener());
		domain.addResourceSetListener(new SimpleMappingTriggerListener());
	}

	
}
