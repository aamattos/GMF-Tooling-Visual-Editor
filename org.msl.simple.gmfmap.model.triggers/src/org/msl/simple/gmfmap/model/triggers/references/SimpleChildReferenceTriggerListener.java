package org.msl.simple.gmfmap.model.triggers.references;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.NotificationFilter;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.TriggerListener;
import org.eclipse.gmf.mappings.ChildReference;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.mappings.NodeMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleChildReference;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleChildReferenceTriggerListener extends TriggerListener implements
		ResourceSetListener {
	
	public static NotificationFilter setReferencedSimpleNodeFilter;
	
	public SimpleChildReferenceTriggerListener() {
		super(NotificationFilter.createNotifierTypeFilter(SimpleChildReference.class));
	}

	static{
		
		setReferencedSimpleNodeFilter = NotificationFilter
		        .createNotifierTypeFilter(SimpleChildReference.class).and(
		            NotificationFilter.createEventTypeFilter(Notification.SET)).and(
		            NotificationFilter.createFeatureFilter(
		            		SimpleChildReference.class,
		            		SimplemappingsPackage.SIMPLE_CHILD_REFERENCE__REFERENCED_SIMPLE_NODE));
		
	}

	@Override
	protected Command trigger(TransactionalEditingDomain domain,
			Notification notification) {
		
		if(setReferencedSimpleNodeFilter.matches(notification))
		{
			SimpleChildReference simpleChildReference = (SimpleChildReference)notification.getNotifier();
			SimpleNode newReference = (SimpleNode)notification.getNewValue();
			
			//We set the referenced child
			ChildReference nodeReference = (ChildReference)simpleChildReference.getNodeReference();
			
			if(newReference!=null && newReference.getNodeReference()!=null)
			{
				NodeMapping referencedChild = newReference.getNodeReference().getChild();
				
				if(referencedChild!=null)
					return SetCommand.create(domain, nodeReference, GMFMapPackage.eINSTANCE.getChildReference_ReferencedChild(), referencedChild);
			}
			
		}
		
		return null;
	}

}
