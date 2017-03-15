/*
 * 
 */
package MicroservicesArchitecture.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MicroservicesArchitectureModelingAssistantProviderOfInterfaceEditPart
		extends MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget(
				(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
		}
		if (targetEditPart instanceof MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MicroservicesArchitecture.diagram.edit.parts.InterfaceEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		}
		return types;
	}

}
