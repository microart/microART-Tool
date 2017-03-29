/*
* 
*/
package MicroservicesArchitecture.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class MicroservicesArchitectureVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "MinimalDSL.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(view.getType())) {
				return MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getProduct().isSuperTypeOf(
				domainElement.eClass()) && isDiagram((MicroservicesArchitecture.Product) domainElement)) {
			return MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
				.getModelID(containerView);
		if (!MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(containerModelID)
				&& !"MicroservicesArchitecture".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getMicroService()
					.isSuperTypeOf(domainElement.eClass())) {
				return MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID;
			}
			if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getTeam()
					.isSuperTypeOf(domainElement.eClass())) {
				return MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID;
			}
			if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getDeveloper()
					.isSuperTypeOf(domainElement.eClass())) {
				return MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface()
					.isSuperTypeOf(domainElement.eClass())) {
				return MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface()
					.isSuperTypeOf(domainElement.eClass())) {
				return MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
				.getModelID(containerView);
		if (!MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(containerModelID)
				&& !"MicroservicesArchitecture".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.MicroServiceNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.TeamNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.DeveloperEmailEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPoint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.WrappingLabel2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID:
			if (MicroservicesArchitecture.diagram.edit.parts.WrappingLabel3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getLink()
				.isSuperTypeOf(domainElement.eClass())) {
			return MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(MicroservicesArchitecture.Product element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceExposeCompartmentEditPart.VISUAL_ID:
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceMicroServiceRequireCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return false;
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
