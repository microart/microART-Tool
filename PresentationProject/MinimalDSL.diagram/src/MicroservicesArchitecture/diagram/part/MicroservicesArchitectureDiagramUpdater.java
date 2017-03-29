/*
* 
*/
package MicroservicesArchitecture.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class MicroservicesArchitectureDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> getSemanticChildren(
			View view) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_1000SemanticChildren(view);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID:
			return getMicroServiceMicroServiceExposeCompartment_7001SemanticChildren(view);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID:
			return getMicroServiceMicroServiceRequireCompartment_7002SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> getProduct_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		MicroservicesArchitecture.Product modelElement = (MicroservicesArchitecture.Product) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor>();
		for (Iterator<?> it = modelElement.getComposedBy().iterator(); it.hasNext();) {
			MicroservicesArchitecture.MicroService childElement = (MicroservicesArchitecture.MicroService) it.next();
			int visualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getTeams().iterator(); it.hasNext();) {
			MicroservicesArchitecture.Team childElement = (MicroservicesArchitecture.Team) it.next();
			int visualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getDevelopers().iterator(); it.hasNext();) {
			MicroservicesArchitecture.Developer childElement = (MicroservicesArchitecture.Developer) it.next();
			int visualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> getMicroServiceMicroServiceExposeCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MicroservicesArchitecture.MicroService modelElement = (MicroservicesArchitecture.MicroService) containerView
				.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor>();
		for (Iterator<?> it = modelElement.getExpose().iterator(); it.hasNext();) {
			MicroservicesArchitecture.Interface childElement = (MicroservicesArchitecture.Interface) it.next();
			int visualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> getMicroServiceMicroServiceRequireCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		MicroservicesArchitecture.MicroService modelElement = (MicroservicesArchitecture.MicroService) containerView
				.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor>();
		for (Iterator<?> it = modelElement.getRequire().iterator(); it.hasNext();) {
			MicroservicesArchitecture.Interface childElement = (MicroservicesArchitecture.Interface) it.next();
			int visualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(view, childElement);
			if (visualID == MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor(
						childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getContainedLinks(
			View view) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_1000ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return getMicroService_2001ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return getTeam_2002ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return getDeveloper_2003ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return getInterface_3001ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return getInterface_3002ContainedLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getIncomingLinks(
			View view) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return getMicroService_2001IncomingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return getTeam_2002IncomingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return getDeveloper_2003IncomingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return getInterface_3001IncomingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return getInterface_3002IncomingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return getMicroService_2001OutgoingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return getTeam_2002OutgoingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return getDeveloper_2003OutgoingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return getInterface_3001OutgoingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return getInterface_3002OutgoingLinks(view);
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getProduct_1000ContainedLinks(
			View view) {
		MicroservicesArchitecture.Product modelElement = (MicroservicesArchitecture.Product) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getMicroService_2001ContainedLinks(
			View view) {
		MicroservicesArchitecture.MicroService modelElement = (MicroservicesArchitecture.MicroService) view
				.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MicroService_Owned_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getTeam_2002ContainedLinks(
			View view) {
		MicroservicesArchitecture.Team modelElement = (MicroservicesArchitecture.Team) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_ComposedBy_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getDeveloper_2003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getLink_4001ContainedLinks(
			View view) {
		MicroservicesArchitecture.Link modelElement = (MicroservicesArchitecture.Link) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_Dependency_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getMicroService_2001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getTeam_2002IncomingLinks(
			View view) {
		MicroservicesArchitecture.Team modelElement = (MicroservicesArchitecture.Team) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_MicroService_Owned_4002(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getDeveloper_2003IncomingLinks(
			View view) {
		MicroservicesArchitecture.Developer modelElement = (MicroservicesArchitecture.Developer) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Team_ComposedBy_4003(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3001IncomingLinks(
			View view) {
		MicroservicesArchitecture.Interface modelElement = (MicroservicesArchitecture.Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3002IncomingLinks(
			View view) {
		MicroservicesArchitecture.Interface modelElement = (MicroservicesArchitecture.Interface) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Link_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getLink_4001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getMicroService_2001OutgoingLinks(
			View view) {
		MicroservicesArchitecture.MicroService modelElement = (MicroservicesArchitecture.MicroService) view
				.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_MicroService_Owned_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getTeam_2002OutgoingLinks(
			View view) {
		MicroservicesArchitecture.Team modelElement = (MicroservicesArchitecture.Team) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Team_ComposedBy_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getDeveloper_2003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3001OutgoingLinks(
			View view) {
		MicroservicesArchitecture.Interface modelElement = (MicroservicesArchitecture.Interface) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getInterface_3002OutgoingLinks(
			View view) {
		MicroservicesArchitecture.Interface modelElement = (MicroservicesArchitecture.Interface) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Link_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getLink_4001OutgoingLinks(
			View view) {
		MicroservicesArchitecture.Link modelElement = (MicroservicesArchitecture.Link) view.getElement();
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Link_Dependency_4004(modelElement));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getContainedTypeModelFacetLinks_Link_4001(
			MicroservicesArchitecture.Product container) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MicroservicesArchitecture.Link) {
				continue;
			}
			MicroservicesArchitecture.Link link = (MicroservicesArchitecture.Link) linkObject;
			if (MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID != MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MicroservicesArchitecture.Interface dst = link.getTarget();
			MicroservicesArchitecture.Interface src = link.getSource();
			result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(src, dst,
					link, MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001,
					MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getIncomingTypeModelFacetLinks_Link_4001(
			MicroservicesArchitecture.Interface target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE
					.getLink_Target() || false == setting.getEObject() instanceof MicroservicesArchitecture.Link) {
				continue;
			}
			MicroservicesArchitecture.Link link = (MicroservicesArchitecture.Link) setting.getEObject();
			if (MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID != MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MicroservicesArchitecture.Interface src = link.getSource();
			result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(src, target,
					link, MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001,
					MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getIncomingFeatureModelFacetLinks_MicroService_Owned_4002(
			MicroservicesArchitecture.Team target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE
					.getMicroService_Owned()) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(
						setting.getEObject(), target,
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroServiceOwned_4002,
						MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getIncomingFeatureModelFacetLinks_Team_ComposedBy_4003(
			MicroservicesArchitecture.Developer target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE
					.getTeam_ComposedBy()) {
				result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(
						setting.getEObject(), target,
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003,
						MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingTypeModelFacetLinks_Link_4001(
			MicroservicesArchitecture.Interface source) {
		MicroservicesArchitecture.Product container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof MicroservicesArchitecture.Product) {
				container = (MicroservicesArchitecture.Product) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		for (Iterator<?> links = container.getLinks().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof MicroservicesArchitecture.Link) {
				continue;
			}
			MicroservicesArchitecture.Link link = (MicroservicesArchitecture.Link) linkObject;
			if (MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID != MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			MicroservicesArchitecture.Interface dst = link.getTarget();
			MicroservicesArchitecture.Interface src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(src, dst,
					link, MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001,
					MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingFeatureModelFacetLinks_MicroService_Owned_4002(
			MicroservicesArchitecture.MicroService source) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		MicroservicesArchitecture.Team destination = source.getOwned();
		if (destination == null) {
			return result;
		}
		result.add(
				new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(source, destination,
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroServiceOwned_4002,
						MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingFeatureModelFacetLinks_Link_Dependency_4004(
			MicroservicesArchitecture.Link source) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		MicroservicesArchitecture.Product destination = source.getDependency();
		if (destination == null) {
			return result;
		}
		result.add(
				new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(source, destination,
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.LinkDependency_4004,
						MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID));
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingFeatureModelFacetLinks_Team_ComposedBy_4003(
			MicroservicesArchitecture.Team source) {
		LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> result = new LinkedList<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor>();
		for (Iterator<?> destinations = source.getComposedBy().iterator(); destinations.hasNext();) {
			MicroservicesArchitecture.Developer destination = (MicroservicesArchitecture.Developer) destinations.next();
			result.add(new MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor(source,
					destination,
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003,
					MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureNodeDescriptor> getSemanticChildren(
				View view) {
			return MicroservicesArchitectureDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getContainedLinks(
				View view) {
			return MicroservicesArchitectureDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getIncomingLinks(
				View view) {
			return MicroservicesArchitectureDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<MicroservicesArchitecture.diagram.part.MicroservicesArchitectureLinkDescriptor> getOutgoingLinks(
				View view) {
			return MicroservicesArchitectureDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
