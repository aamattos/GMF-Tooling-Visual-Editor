package com.isb.simple.gmfmap.model.triggers.node;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

import com.isb.simple.gmfmap.simplemappings.SimpleNode;

public class SetContainmentFeatureTrigger extends AbstractSimpleNodeTrigger {
	
	private EReference newElement;

	public SetContainmentFeatureTrigger(TransactionalEditingDomain domain, SimpleNode simpleNode, EReference newElement) {
		super(domain, simpleNode);
		
		this.newElement = newElement;
	}

	@Override
	public void executeTrigger() {
		
		updateMapping();
		//updateSimpleNodeName();
	}
	
	private void updateMapping()
	{
		if(simpleNode.getNodeReference()!=null)
			simpleNode.getNodeReference().setContainmentFeature(newElement);
	}
	
	

}
