package com.isb.simple.gmfmap.model.edit.properties;

import java.util.Collection;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;

import com.isb.simple.gmfmap.model.edit.IItemPropertyDescriptorProvider;
import com.isb.simple.gmfmap.simplemappings.SimpleRootNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNode;
import com.isb.simple.gmfmap.simplemappings.SimpleSubNodeReference;
import com.isb.simple.gmfmap.simplemappings.SimplemappingsPackage;

public class SimpleSubNodeItemPropertyDescriptorProvider extends
		AdapterImpl implements IItemPropertyDescriptorProvider {
	
	@Override
	public ItemPropertyDescriptor createItemPropertyDescriptor(
			AdapterFactory adapterFactory, ResourceLocator resourceLocator,
			String displayName, String description, EStructuralFeature feature,
			boolean isSettable, boolean multiLine, boolean sortChoices,
			Object staticImage, String category, String[] filterFlags) {

		return new SimpleSubNodeItemPropertyDescriptor(adapterFactory, 
				  resourceLocator, 
				  displayName, 
				  description, 
				  feature, 
				  isSettable, 
				  multiLine, 
				  sortChoices, 
				  staticImage, 
				  category, 
				  filterFlags);
	}

	
	class SimpleSubNodeItemPropertyDescriptor extends ItemPropertyDescriptor {
  
		public SimpleSubNodeItemPropertyDescriptor
		     (AdapterFactory adapterFactory,
		      ResourceLocator resourceLocator,
		      String displayName,
		      String description,
		      EStructuralFeature feature, 
		      boolean isSettable,
		      boolean multiLine,
		      boolean sortChoices,
		      Object staticImage,
		      String category,
		      String [] filterFlags)
		{
			super(adapterFactory, 
				  resourceLocator, 
				  displayName, 
				  description, 
				  feature, 
				  isSettable, 
				  multiLine, 
				  sortChoices, 
				  staticImage, 
				  category, 
				  filterFlags);
		}
		
		@Override
		public Collection<?> getChoiceOfValues(Object object) {
			
			if(feature==SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_SUB_NODE_REFERENCE)
			{
				Collection<Object> choiceOfValues = new UniqueEList<Object>();
				
				SimpleRootNode parentNode = ((SimpleSubNode)object).getParentRootNode();
				
				if(parentNode!=null)
				{
					for(Object choice:super.getChoiceOfValues(object))
						if(choice instanceof SimpleSubNodeReference && ((SimpleSubNodeReference)choice).getParentRoot()==parentNode)
							choiceOfValues.add(choice);
				}
				
				return choiceOfValues;
			}
			
			return super.getChoiceOfValues(object); 
		}
		
		@Override
		public boolean canSetProperty(Object object) {
			
			boolean defaultValue = super.canSetProperty(object);
			
			return defaultValue;
		}

	}
	
}
