package org.msl.simple.gmfmap.simplemappings.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartment2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleCompartmentEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleMappingEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeParentRootNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference2EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference3EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReference4EditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleTopNodeEditPart;
import org.msl.simple.gmfmap.simplemappings.diagram.part.Messages;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;

/**
 * @generated
 */
public class SimplemapNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public SimplemapNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<SimplemapNavigatorItem> result = new ArrayList<SimplemapNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			return result.toArray();
		}

		if (parentElement instanceof SimplemapNavigatorGroup) {
			SimplemapNavigatorGroup group = (SimplemapNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof SimplemapNavigatorItem) {
			SimplemapNavigatorItem navigatorItem = (SimplemapNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (SimplemapVisualIDRegistry.getVisualID(view)) {

		case SimpleCompartment2EditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleLabelNode3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeReference3EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SimpleCompartmentEditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleLabelNode2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeReferenceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			return result.toArray();
		}

		case SimpleTopNodeEditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimplemapNavigatorGroup incominglinks = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleTopNode_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleLabelNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleCompartmentEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeReference2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			SimplemapNavigatorGroup target = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleSubNodeParentRootNode_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimplemapNavigatorGroup source = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleSubNodeParentRootNode_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleTopNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SimpleMappingEditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			SimplemapNavigatorGroup links = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleMapping_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleTopNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleLinkMappingEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(
					Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SimpleSubNodeEditPart.VISUAL_ID: {
			LinkedList<SimplemapAbstractNavigatorItem> result = new LinkedList<SimplemapAbstractNavigatorItem>();
			Node sv = (Node) view;
			SimplemapNavigatorGroup incominglinks = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleSubNode_2006_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			SimplemapNavigatorGroup outgoinglinks = new SimplemapNavigatorGroup(
					Messages.NavigatorGroupName_SimpleSubNode_2006_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleLabelNode4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleCompartment2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeReference4EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getIncomingLinksByType(
					Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(
					Collections.singleton(sv),
					SimplemapVisualIDRegistry
							.getType(SimpleSubNodeParentRootNodeEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return SimpleMappingEditPart.MODEL_ID.equals(SimplemapVisualIDRegistry
				.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<SimplemapNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<SimplemapNavigatorItem> result = new ArrayList<SimplemapNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new SimplemapNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof SimplemapAbstractNavigatorItem) {
			SimplemapAbstractNavigatorItem abstractNavigatorItem = (SimplemapAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
