package com.isb.simple.gmfmap.model.triggers.node;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import com.isb.simple.gmfmap.simplemappings.SimpleNode;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleNodeTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter removeNodeReferenceFilter;
	public static NotificationFilter removeCompartmentFilter;
	public static NotificationFilter setContainmentFeatureFilter;
	public static NotificationFilter setDomainMetaElementFilter;


	
	public SimpleNodeTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleNode.class));
	}

	static{
		
		removeNodeReferenceFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleNode.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleNode.class,
		            		SimplemappingsPackage.SIMPLE_NODE__NODE_REFERENCE));
		
		setDomainMetaElementFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleNode.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleNode.class,
		            		SimplemappingsPackage.SIMPLE_NODE__DOMAIN_META_ELEMENT));
		
		
		setContainmentFeatureFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleNode.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleNode.class,
		            		SimplemappingsPackage.SIMPLE_NODE__CONTAINMENT_FEATURE));

	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		SimpleNode simpleNodeNotifier = (SimpleNode)notification.getNotifier();
		
		if(setDomainMetaElementFilter.matches(notification) && simpleNodeNotifier.getNodeReference()!=null && notification.getNewValue()!=null)
		{
			return new SetDomainMetaElementTrigger(domain, simpleNodeNotifier, (EClass)notification.getNewValue());
		}
		
		if(setContainmentFeatureFilter.matches(notification) && simpleNodeNotifier.getNodeReference()!=null)
		{
			return new SetContainmentFeatureTrigger(domain, simpleNodeNotifier, (EReference)notification.getNewValue());
		}

		return null;
	}

}
