package org.msl.simple.gmfmap.model.triggers;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.msl.simple.gmfmap.simplemappings.SimpleMapping;

public class SetDomainMetaElementTrigger extends AbstractTrigger {
	
	private EClass newElement;
	private SimpleMapping simpleMapping;

	public SetDomainMetaElementTrigger(TransactionalEditingDomain domain, SimpleMapping mapping, EClass newElement) {
		super(domain);
		
		this.newElement = newElement;
		this.simpleMapping = mapping;
	}

	@Override
	public void executeTrigger() {
		simpleMapping.getMapping().getDiagram().setDomainMetaElement(newElement);
	}
	
	

}
