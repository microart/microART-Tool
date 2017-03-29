/*
* 
*/
package MicroservicesArchitecture.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class MicroservicesArchitectureNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
				.getImageRegistry().put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem
				&& !isOwnView(
						((MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) element)
								.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup group = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) element;
			return MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem navigatorItem = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?http://it.univaq.thesis.msa.arch?Product", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Product_1000);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://it.univaq.thesis.msa.arch?MicroService", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001);
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://it.univaq.thesis.msa.arch?Team", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Team_2002);
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?http://it.univaq.thesis.msa.arch?Developer", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2003);
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://it.univaq.thesis.msa.arch?Interface", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return getImage("Navigator?Node?http://it.univaq.thesis.msa.arch?Interface", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://it.univaq.thesis.msa.arch?Link", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://it.univaq.thesis.msa.arch?MicroService?owned", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroServiceOwned_4002);
		case MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://it.univaq.thesis.msa.arch?Team?composedBy", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003);
		case MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID:
			return getImage("Navigator?Link?http://it.univaq.thesis.msa.arch?Link?Dependency", //$NON-NLS-1$
					MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.LinkDependency_4004);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
						.isKnownElementType(elementType)) {
			image = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes
					.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup group = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) {
			MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem navigatorItem = (MicroservicesArchitecture.diagram.navigator.MicroservicesArchitectureNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getVisualID(view)) {
		case MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.VISUAL_ID:
			return getProduct_1000Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceEditPart.VISUAL_ID:
			return getMicroService_2001Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.TeamEditPart.VISUAL_ID:
			return getTeam_2002Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart.VISUAL_ID:
			return getDeveloper_2003Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart.VISUAL_ID:
			return getInterface_3001Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart.VISUAL_ID:
			return getInterface_3002Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.LinkEditPart.VISUAL_ID:
			return getLink_4001Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.MicroServiceOwnedEditPart.VISUAL_ID:
			return getMicroServiceOwned_4002Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.TeamComposedByEditPart.VISUAL_ID:
			return getTeamComposedBy_4003Text(view);
		case MicroservicesArchitecture.diagram.edit.parts.LinkDependencyEditPart.VISUAL_ID:
			return getLinkDependency_4004Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getProduct_1000Text(View view) {
		MicroservicesArchitecture.Product domainModelElement = (MicroservicesArchitecture.Product) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMicroService_2001Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001,
				view.getElement() != null ? view.getElement() : view,
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
						.getType(MicroservicesArchitecture.diagram.edit.parts.MicroServiceNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeam_2002Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Team_2002,
				view.getElement() != null ? view.getElement() : view,
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
						.getType(MicroservicesArchitecture.diagram.edit.parts.TeamNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getDeveloper_2003Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2003,
				view.getElement() != null ? view.getElement() : view,
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
						.getType(MicroservicesArchitecture.diagram.edit.parts.DeveloperEmailEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInterface_3001Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001,
				view.getElement() != null ? view.getElement() : view,
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
						.getType(MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPointEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInterface_3002Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002,
				view.getElement() != null ? view.getElement() : view,
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry
						.getType(MicroservicesArchitecture.diagram.edit.parts.InterfaceEndPoint2EditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLink_4001Text(View view) {
		MicroservicesArchitecture.Link domainModelElement = (MicroservicesArchitecture.Link) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 4001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getMicroServiceOwned_4002Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroServiceOwned_4002,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTeamComposedBy_4003Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getLinkDependency_4004Text(View view) {
		IParser parser = MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureParserProvider.getParser(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.LinkDependency_4004,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			MicroservicesArchitecture.diagram.part.MicroservicesArchitectureDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
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
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return MicroservicesArchitecture.diagram.edit.parts.ProductEditPart.MODEL_ID.equals(
				MicroservicesArchitecture.diagram.part.MicroservicesArchitectureVisualIDRegistry.getModelID(view));
	}

}
