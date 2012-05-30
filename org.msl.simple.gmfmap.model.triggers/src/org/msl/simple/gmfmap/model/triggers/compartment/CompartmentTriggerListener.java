package org.msl.simple.gmfmap.model.triggers.compartment;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

public class CompartmentTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setCompartmentNameFilter;
	
	public CompartmentTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(Compartment.class));
	}

	static{
		
		setCompartmentNameFilter = NotificationFilter
		        .createNotifierTypeFilter(Compartment.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		Compartment.class,
		            		GMFGraphPackage.COMPARTMENT__NAME));
		
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setCompartmentNameFilter.matches(notification))
		{
			Compartment compartment = (Compartment)notification.getNotifier();
			String newName = (String)notification.getNewValue();

			return new SetCompartmentNameTrigger(domain, compartment, newName);
		}
		
		return null;
	}

}
