package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import org.msl.simple.gmfmap.simplemappings.SimpleChildNode;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimpleParentNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import org.msl.simple.gmfmap.simplemappings.SimpleTopNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class ParentNodeTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter newChildNodeFilter;
	public static NotificationFilter removeChildNodeFilter;


	public ParentNodeTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleParentNode.class));
	}

	static{
		
		newChildNodeFilter = NotificationFilter
        .createNotifierTypeFilter(SimpleParentNode.class).and(
            NotificationFilter.createEventTypeFilter(Notification.ADD)).and(
            NotificationFilter.createFeatureFilter(
            		SimpleParentNode.class,
            		SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN));
		
		removeChildNodeFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleParentNode.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.REMOVE)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleParentNode.class,
		            		SimplemappingsPackage.SIMPLE_PARENT_NODE__CHILDREN));
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(newChildNodeFilter.matches(notification))
		{
			SimpleChildNode newChild = (SimpleChildNode)notification.getNewValue();
			Object notifier = notification.getNotifier();
			
			SimpleParentNode parent = null;
			
			if(notifier instanceof SimpleSubNode)
				parent = ((SimpleSubNode)notifier).getParentSubNodeReference();
			else
				parent = (SimpleParentNode)notifier;
			
			if(newChild instanceof SimpleTopNode)
				return new NewTopNodeTrigger(domain, parent, (SimpleTopNode)newChild);
			
			if(newChild instanceof SimpleLinkMapping)
				return new NewLinkMappingTrigger(domain, parent, (SimpleLinkMapping)newChild);
			
			if(newChild instanceof SimpleCompartment)
				return new NewCompartmentTrigger(domain, (SimpleNode)parent, (SimpleCompartment)newChild);

			if(newChild instanceof SimpleSubNodeReference)
				return new NewSubNodeReferenceTrigger(domain, parent, (SimpleSubNodeReference)newChild);

			if(newChild instanceof SimpleLabelNode)
				return new NewLabelNodeTrigger(domain, parent, (SimpleLabelNode)newChild);
			

		}
		
		if(removeChildNodeFilter.matches(notification))
		{
			SimpleChildNode oldChild = (SimpleChildNode)notification.getOldValue();
			
			return new RemoveChildNodeTrigger(domain, oldChild);
			
		}
		
		return null;
	}

}
