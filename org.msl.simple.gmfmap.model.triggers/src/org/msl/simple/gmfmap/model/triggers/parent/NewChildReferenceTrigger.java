package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.CompartmentMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;

public class NewChildReferenceTrigger extends NewElementTrigger {
	
	private SimpleParentNode parent;
	private SimpleChildReference newSimpleChildReference;
	

	public NewChildReferenceTrigger(TransactionalEditingDomain domain, SimpleParentNode parent, SimpleChildReference newSimpleChildReference) {
		super(domain, newSimpleChildReference);
		
		this.newSimpleChildReference = newSimpleChildReference;
		this.parent = parent;
	}

	@Override
	public void executeTrigger() {
		
		if(parent instanceof SimpleNode)
			updateMapping((SimpleNode)parent);
		
		if(parent instanceof SimpleCompartment)
		{
			SimpleNode parentNode = (SimpleNode)((SimpleCompartment)parent).getParent();
			updateMapping(parentNode, ((SimpleCompartment)parent).getCompartmentMapping());
		}
		

	}
	
	
	/**
	 * El padre es un Top Node
	 * @param parentTopNode
	 * @param newNode
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode)
	{
		updateMapping(parentNode, null);
	}

	
	/**
	 * El padre es un Compartment
	 * @param newLabel
	 * @param newCreationTool
	 */
	private void updateMapping(SimpleNode parentNode, CompartmentMapping compartment)
	{
		ChildReference newChildReference = GMFMapFactory.eINSTANCE.createChildReference();
		
		if(compartment!=null)
			newChildReference.setCompartment(compartment);
		
		parentNode.getNodeReference().getChild().getChildren().add(newChildReference);

		newSimpleChildReference.setNodeReference(newChildReference);

	}



}
