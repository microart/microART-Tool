/*
 * 
 */
package MicroservicesArchitecture.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class MicroservicesArchitectureElementTypes {

	/**
	* @generated
	*/
	private MicroservicesArchitectureElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType Product_1000 = getElementType("MinimalDSL.diagram.Product_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MicroService_2001 = getElementType("MinimalDSL.diagram.MicroService_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Team_2002 = getElementType("MinimalDSL.diagram.Team_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Developer_2003 = getElementType("MinimalDSL.diagram.Developer_2003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Interface_3001 = getElementType("MinimalDSL.diagram.Interface_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Interface_3002 = getElementType("MinimalDSL.diagram.Interface_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Link_4001 = getElementType("MinimalDSL.diagram.Link_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType MicroServiceOwned_4002 = getElementType(
			"MinimalDSL.diagram.MicroServiceOwned_4002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType LinkDependency_4004 = getElementType("MinimalDSL.diagram.LinkDependency_4004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TeamComposedBy_4003 = getElementType("MinimalDSL.diagram.TeamComposedBy_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Product_1000,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getProduct());

			elements.put(MicroService_2001,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getMicroService());

			elements.put(Team_2002, MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getTeam());

			elements.put(Developer_2003,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getDeveloper());

			elements.put(Interface_3001,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface());

			elements.put(Interface_3002,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getInterface());

			elements.put(Link_4001, MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getLink());

			elements.put(MicroServiceOwned_4002,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getMicroService_Owned());

			elements.put(LinkDependency_4004,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getLink_Dependency());

			elements.put(TeamComposedBy_4003,
					MicroservicesArchitecture.MicroservicesArchitecturePackage.eINSTANCE.getTeam_ComposedBy());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Product_1000);
			KNOWN_ELEMENT_TYPES.add(MicroService_2001);
			KNOWN_ELEMENT_TYPES.add(Team_2002);
			KNOWN_ELEMENT_TYPES.add(Developer_2003);
			KNOWN_ELEMENT_TYPES.add(Interface_3001);
			KNOWN_ELEMENT_TYPES.add(Interface_3002);
			KNOWN_ELEMENT_TYPES.add(Link_4001);
			KNOWN_ELEMENT_TYPES.add(MicroServiceOwned_4002);
			KNOWN_ELEMENT_TYPES.add(LinkDependency_4004);
			KNOWN_ELEMENT_TYPES.add(TeamComposedBy_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return Product_1000;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return MicroService_2001;
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return Team_2002;
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return Developer_2003;
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return Interface_3001;
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return Interface_3002;
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return Link_4001;
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID:
			return MicroServiceOwned_4002;
		case MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID:
			return LinkDependency_4004;
		case MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID:
			return TeamComposedBy_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
					.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
					.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
