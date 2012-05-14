package org.msl.simple.gmfmap.model.delegates;

import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate;
import org.eclipse.emf.ecore.EOperation.Internal.InvocationDelegate.Factory;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleMappingInvocationDelegateFactory implements Factory {

	@Override
	public InvocationDelegate createInvocationDelegate(EOperation operation) {
		
	    if (operation.getEContainingClass() == SimplemappingsPackage.Literals.SIMPLE_CHILD_NODE)
	    	return new SimpleChildNodeInvocationDelegate(operation);
	    
		return null;
	}

}
