package org.msl.simple.gmfmap.model.triggers.graph;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;

public class FigureDescriptorTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setActualFigureFilter;

	public FigureDescriptorTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(FigureDescriptor.class));
	}

	static{
		
		setActualFigureFilter = NotificationFilter
		        .createNotifierTypeFilter(FigureDescriptor.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		FigureDescriptor.class,
		            		GMFGraphPackage.FIGURE_DESCRIPTOR__ACTUAL_FIGURE));

	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setActualFigureFilter.matches(notification))
		{
			Figure oldFigure = (Figure)notification.getOldValue();
			Figure newFigure = (Figure)notification.getNewValue();
			
			return new SetActualFigureTrigger(domain, oldFigure, newFigure);
		}
		
		return null;
	}

}
