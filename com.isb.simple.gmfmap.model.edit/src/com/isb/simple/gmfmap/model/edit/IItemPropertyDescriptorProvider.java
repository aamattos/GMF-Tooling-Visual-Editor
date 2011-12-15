package com.isb.simple.gmfmap.model.edit;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

public interface IItemPropertyDescriptorProvider {
	public ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory,
		      ResourceLocator resourceLocator,
		      String displayName,
		      String description,
		      EStructuralFeature feature, 
		      boolean isSettable,
		      boolean multiLine,
		      boolean sortChoices,
		      Object staticImage,
		      String category,
		      String [] filterFlags);
}
