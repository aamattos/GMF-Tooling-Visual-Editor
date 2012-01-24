package org.msl.simple.gmfmap.model.triggers;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;

import org.msl.simple.gmfmap.simplemappings.SimpleMapping;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleMappingTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setDomainMetaElementFilter;
	
	public SimpleMappingTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleMapping.class));
	}

	static{
		
		setDomainMetaElementFilter = NotificationFilter
        .createNotifierTypeFilter(SimpleMapping.class).and(
            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
            NotificationFilter.createFeatureFilter(
            		SimpleMapping.class,
            		SimplemappingsPackage.SIMPLE_MAPPING__DOMAIN_META_ELEMENT));
		
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setDomainMetaElementFilter.matches(notification) && notification.getNewValue()!=null)
		{
			EClass newElement = (EClass)notification.getNewValue();
			SimpleMapping mapping = (SimpleMapping)notification.getNotifier();
			return new SetDomainMetaElementTrigger(domain, mapping, newElement);
		}
		
		
		return null;
	}

}
