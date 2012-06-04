/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.msl.simple.gmfmap.simplemappings.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.msl.simple.gmfmap.simplemappings.util.SimplemappingsAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SimplemappingsItemProviderAdapterFactory extends SimplemappingsAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimplemappingsItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMappingItemProvider simpleMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleMappingAdapter() {
		if (simpleMappingItemProvider == null) {
			simpleMappingItemProvider = new SimpleMappingItemProvider(this);
		}

		return simpleMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleTopNodeItemProvider simpleTopNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleTopNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleTopNodeAdapter() {
		if (simpleTopNodeItemProvider == null) {
			simpleTopNodeItemProvider = new SimpleTopNodeItemProvider(this);
		}

		return simpleTopNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleCompartmentItemProvider simpleCompartmentItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleCompartment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleCompartmentAdapter() {
		if (simpleCompartmentItemProvider == null) {
			simpleCompartmentItemProvider = new SimpleCompartmentItemProvider(this);
		}

		return simpleCompartmentItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleLabelNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleLabelNodeItemProvider simpleLabelNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleLabelNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleLabelNodeAdapter() {
		if (simpleLabelNodeItemProvider == null) {
			simpleLabelNodeItemProvider = new SimpleLabelNodeItemProvider(this);
		}

		return simpleLabelNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleLinkMappingItemProvider simpleLinkMappingItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleLinkMappingAdapter() {
		if (simpleLinkMappingItemProvider == null) {
			simpleLinkMappingItemProvider = new SimpleLinkMappingItemProvider(this);
		}

		return simpleLinkMappingItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNodeItemProvider simpleNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleNodeAdapter() {
		if (simpleNodeItemProvider == null) {
			simpleNodeItemProvider = new SimpleNodeItemProvider(this);
		}

		return simpleNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleSubNodeItemProvider simpleSubNodeItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleSubNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleSubNodeAdapter() {
		if (simpleSubNodeItemProvider == null) {
			simpleSubNodeItemProvider = new SimpleSubNodeItemProvider(this);
		}

		return simpleSubNodeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleMappingElementWithFigureItemProvider simpleMappingElementWithFigureItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleMappingElementWithFigureAdapter() {
		if (simpleMappingElementWithFigureItemProvider == null) {
			simpleMappingElementWithFigureItemProvider = new SimpleMappingElementWithFigureItemProvider(this);
		}

		return simpleMappingElementWithFigureItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleChildReferenceItemProvider simpleChildReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleChildReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleChildReferenceAdapter() {
		if (simpleChildReferenceItemProvider == null) {
			simpleChildReferenceItemProvider = new SimpleChildReferenceItemProvider(this);
		}

		return simpleChildReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleNodeReferenceItemProvider simpleNodeReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link org.msl.simple.gmfmap.simplemappings.SimpleNodeReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSimpleNodeReferenceAdapter() {
		if (simpleNodeReferenceItemProvider == null) {
			simpleNodeReferenceItemProvider = new SimpleNodeReferenceItemProvider(this);
		}

		return simpleNodeReferenceItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (simpleMappingItemProvider != null) simpleMappingItemProvider.dispose();
		if (simpleTopNodeItemProvider != null) simpleTopNodeItemProvider.dispose();
		if (simpleCompartmentItemProvider != null) simpleCompartmentItemProvider.dispose();
		if (simpleLabelNodeItemProvider != null) simpleLabelNodeItemProvider.dispose();
		if (simpleLinkMappingItemProvider != null) simpleLinkMappingItemProvider.dispose();
		if (simpleNodeItemProvider != null) simpleNodeItemProvider.dispose();
		if (simpleSubNodeItemProvider != null) simpleSubNodeItemProvider.dispose();
		if (simpleMappingElementWithFigureItemProvider != null) simpleMappingElementWithFigureItemProvider.dispose();
		if (simpleChildReferenceItemProvider != null) simpleChildReferenceItemProvider.dispose();
		if (simpleNodeReferenceItemProvider != null) simpleNodeReferenceItemProvider.dispose();
	}

}
