/*
 * 
 */
package MicroservicesArchitecture.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MicroservicesArchitectureModelingAssistantProviderOfDeveloperEditPart
		extends MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(
			MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart) targetEditPart,
				relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(MicroservicesArchitecture.diagram.edit.parts.DeveloperEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003) {
			types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Team_2002);
		}
		return types;
	}

}
