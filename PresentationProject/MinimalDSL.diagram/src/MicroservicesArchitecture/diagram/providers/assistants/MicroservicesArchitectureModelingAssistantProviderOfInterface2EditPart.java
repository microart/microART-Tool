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
public class MicroservicesArchitectureModelingAssistantProviderOfInterface2EditPart
		extends MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(
			MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart source) {
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
				(MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(
			MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart source, IGraphicalEditPart targetEditPart) {
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
		return doGetTypesForTarget((MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) sourceEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(
			MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart source, IElementType relationshipType) {
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
		return doGetRelTypesOnTarget((MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart target) {
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
		return doGetTypesForSource((MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(
			MicroservicesArchitecture.diagram.edit.parts.Interface2EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		}
		return types;
	}

}
