package com.isb.simple.gmfmap.model.triggers.link;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleLinkMappingTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setLinkMappingNameFilter;
	
	public SimpleLinkMappingTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleLinkMapping.class));
	}

	static{
		
		setLinkMappingNameFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleLinkMapping.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleLinkMapping.class,
		            		SimplemappingsPackage.SIMPLE_LINK_MAPPING__NAME));
		
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setLinkMappingNameFilter.matches(notification))
		{
			SimpleLinkMapping linkMapping = (SimpleLinkMapping)notification.getNotifier();
			String newName = (String)notification.getNewValue();

			return new SetLinkMappingNameTrigger(domain, linkMapping, newName);
		}

		
		return null;
	}

}
