package org.msl.simple.gmfmap.model.triggers.node;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;

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
		if(simpleNode.getNodeReference()!=null){
		
			simpleNode.getNodeReference().setContainmentFeature(newElement);
//			
////			ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
////					ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
////			
////			ItemProviderAdapter itemProvider = (ItemProviderAdapter)composedAdapterFactory.adapt(simpleNode, ItemProviderAdapter.class);
////
////			itemProvider.getPropertyDescriptor(object, propertyId)
////			
////			List<EClass> choiceOfValues = new ArrayList<EClass>();
////			
////			if(newElement!=null)
////				for(Object choice:ItemPropertyDescriptor.getReachableObjectsOfType(simpleNode, newElement.getEType()))
////					if(choice instanceof EClass && ((EClass)newElement.getEType()).isSuperTypeOf((EClass)choice))
////							choiceOfValues.add((EClass)choice);	
//			
//			
//			
//			if(choiceOfValues.size()==1)
//				simpleNode.setDomainMetaElement(choiceOfValues.get(0));
		}
		
	}
	
	

}
