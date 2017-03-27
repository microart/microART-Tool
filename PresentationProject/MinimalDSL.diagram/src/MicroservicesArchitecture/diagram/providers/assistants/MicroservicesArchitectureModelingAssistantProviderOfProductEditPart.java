/*
 * 
 */
package MicroservicesArchitecture.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class MicroservicesArchitectureModelingAssistantProviderOfProductEditPart
		extends MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Team_2002);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2003);
		return types;
	}

}
