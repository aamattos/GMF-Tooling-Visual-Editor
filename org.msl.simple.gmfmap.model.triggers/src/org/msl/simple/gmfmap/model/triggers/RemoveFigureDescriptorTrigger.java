package org.msl.simple.gmfmap.model.triggers;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;

public class RemoveFigureDescriptorTrigger extends AbstractTrigger {
	
	private FigureDescriptor figDesc;

	public RemoveFigureDescriptorTrigger(TransactionalEditingDomain domain, FigureDescriptor figDesc) {
		super(domain);
		
		this.figDesc = figDesc;
	}

	@Override
	public void executeTrigger() {
		
		EcoreUtil.delete(figDesc);
	}

}
