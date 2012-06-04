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
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimplemappingsPackage;

/**
 * This is the item provider adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleLinkMappingItemProvider
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
	public SimpleLinkMappingItemProvider(AdapterFactory adapterFactory) {
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

			addNodeFigurePropertyDescriptor(object);
			addLabelFigurePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addLinkMappingPropertyDescriptor(object);
			addDiagramLinkPropertyDescriptor(object);
			addDiagramLabelPropertyDescriptor(object);
			addToolPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Node Figure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNodeFigurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleMappingElementWithFigure_nodeFigure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleMappingElementWithFigure_nodeFigure_feature", "_UI_SimpleMappingElementWithFigure_type"),
				 SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__NODE_FIGURE,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label Figure feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelFigurePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleMappingElementWithFigure_labelFigure_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleMappingElementWithFigure_labelFigure_feature", "_UI_SimpleMappingElementWithFigure_type"),
				 SimplemappingsPackage.Literals.SIMPLE_MAPPING_ELEMENT_WITH_FIGURE__LABEL_FIGURE,
				 false,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleLinkMapping_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleLinkMapping_name_feature", "_UI_SimpleLinkMapping_type"),
				 SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Link Mapping feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLinkMappingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleLinkMapping_linkMapping_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleLinkMapping_linkMapping_feature", "_UI_SimpleLinkMapping_type"),
				 SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__LINK_MAPPING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Link feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramLinkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleLinkMapping_diagramLink_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleLinkMapping_diagramLink_feature", "_UI_SimpleLinkMapping_type"),
				 SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LINK,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Diagram Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiagramLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleLinkMapping_diagramLabel_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleLinkMapping_diagramLabel_feature", "_UI_SimpleLinkMapping_type"),
				 SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__DIAGRAM_LABEL,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tool feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SimpleLinkMapping_tool_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SimpleLinkMapping_tool_feature", "_UI_SimpleLinkMapping_type"),
				 SimplemappingsPackage.Literals.SIMPLE_LINK_MAPPING__TOOL,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SimpleLinkMapping.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SimpleLinkMapping"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SimpleLinkMapping)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SimpleLinkMapping_type") :
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

		switch (notification.getFeatureID(SimpleLinkMapping.class)) {
			case SimplemappingsPackage.SIMPLE_LINK_MAPPING__CHILDREN:
			case SimplemappingsPackage.SIMPLE_LINK_MAPPING__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
