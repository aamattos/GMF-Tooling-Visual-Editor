package org.msl.simple.gmfmap.model.triggers.compartment;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleCompartmentTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setCompartmentNameFilter;
	public static NotificationFilter setCompartmentNeedsTitleFilter;
	
	public SimpleCompartmentTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleCompartment.class));
	}

	static{
		
		setCompartmentNameFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleCompartment.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleCompartment.class,
		            		SimplemappingsPackage.SIMPLE_COMPARTMENT__NAME));
		
		setCompartmentNeedsTitleFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleCompartment.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleCompartment.class,
		            		SimplemappingsPackage.SIMPLE_COMPARTMENT__NEEDS_TITLE));
		
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setCompartmentNameFilter.matches(notification))
		{
			SimpleCompartment compartment = (SimpleCompartment)notification.getNotifier();
			String newName = (String)notification.getNewValue();

			return new SetCompartmentNameTrigger(domain, compartment, newName);
		}
		
		if(setCompartmentNeedsTitleFilter.matches(notification))
		{
			SimpleCompartment compartment = (SimpleCompartment)notification.getNotifier();
			boolean needsTitle = (Boolean)notification.getNewValue();

			return new SetCompartmentNeedsTitleTrigger(domain, compartment, needsTitle);
		}


		return null;
	}

}
