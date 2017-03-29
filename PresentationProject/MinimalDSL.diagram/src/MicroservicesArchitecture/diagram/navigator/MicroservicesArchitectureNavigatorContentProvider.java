/*
* 
*/
package MicroservicesArchitecture.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
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

/**
 * @generated
 */
public class MicroservicesArchitectureNavigatorContentProvider implements ICommonContentProvider {

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
	public MicroservicesArchitectureNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
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
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
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

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
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
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
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
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem> result = new ArrayList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup group = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem navigatorItem = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {

		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup links = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Product_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Node sv = (Node) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup outgoinglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_MicroService_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getType(
							MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getType(
							MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Node sv = (Node) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup incominglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Team_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup outgoinglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Team_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Node sv = (Node) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup incominglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Developer_2003_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Node sv = (Node) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup incominglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Interface_3001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup outgoinglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Interface_3001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Node sv = (Node) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup incominglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Interface_3002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup outgoinglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Interface_3002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup target = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Link_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup source = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Link_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup outgoinglinks = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_Link_4001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup target = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_MicroServiceOwned_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup source = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_MicroServiceOwned_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup target = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_TeamComposedBy_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup source = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_TeamComposedBy_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
							.getType(MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID: {
			LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem> result = new LinkedList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup source = new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup(
					MicroservicesArchitecture.diagram.part.Messages.NavigatorGroupName_LinkDependency_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
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
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
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
		return MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem> result = new ArrayList<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem(nextView,
					parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem abstractNavigatorItem = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureAbstractNavigatorItem) element;
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
