/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.msl.simple.gmfmap.model.edit.IItemPropertyDescriptorProvider;
import org.msl.simple.gmfmap.simplemappings.SimpleSubNode;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsFactory;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * This is the item provider adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleSubNodeItemProvider
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleSubNodeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addParentSubNodeReferencePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Parent Sub Node Reference feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParentSubNodeReferencePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleSubNode_parentSubNodeReference_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleSubNode_parentSubNodeReference_feature", "_UI_SimpleSubNode_type"),
				 SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__PARENT_SUB_NODE_REFERENCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SimpleSubNode.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleSubNode"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimpleSubNode)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleSubNode_type") :
			label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(SimpleSubNode.class)) {
			case SimplemappingsPackage.SIMPLE_SUB_NODE__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimplemappingsPackage.SIMPLE_SUB_NODE__CHILDREN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleTopNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleLabelNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleLinkMapping()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleSubNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleSubNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleTopNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleCompartment()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleLabelNode()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleLinkMapping()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleSubNodeReference()));

		newChildDescriptors.add
			(createChildParameter
				(SimplemappingsPackage.Literals.SIMPLE_SUB_NODE__CHILDREN,
				 SimplemappingsFactory.eINSTANCE.createSimpleSubNode()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SimplemapEditPlugin.INSTANCE;
	}

    /**
	 * @generated
     */
	protected ItemPropertyDescriptor createItemPropertyDescriptor(AdapterFactory adapterFactory,
															       ResourceLocator resourceLocator,
															       String displayName,
															       String description,
															       EStructuralFeature feature, 
															       boolean isSettable,
															       boolean multiLine,
															       boolean sortChoices,
															       Object staticImage,
															       String category,
															       String [] filterFlags) {
		
		ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		
		IItemPropertyDescriptorProvider descriptorProvider = (IItemPropertyDescriptorProvider)composedAdapterFactory.adapt(getTarget(), IItemPropertyDescriptorProvider.class);
		
		if(descriptorProvider!=null)
			return descriptorProvider.createItemPropertyDescriptor(
					adapterFactory, 
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

		return super.createItemPropertyDescriptor(
				adapterFactory, 
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
}
