package org.msl.simple.gmfmap.model.triggers.mapping;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;

public class MappingEntryTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setDomainMetaElementFilter;

	public MappingEntryTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(NodeMapping.class));
	}

	static{
		
		setDomainMetaElementFilter = NotificationFilter
		        .createNotifierTypeFilter(NodeMapping.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		NodeMapping.class,
		            		GMFMapPackage.NODE_MAPPING__DOMAIN_META_ELEMENT));

	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		NodeMapping nodeMapping = (NodeMapping)notification.getNotifier();
		
		if(setDomainMetaElementFilter.matches(notification))
		{
			return new SetDomainMetaElementTrigger(domain, nodeMapping, (EClass)notification.getNewValue());
		}
		
		return null;
	}

}
