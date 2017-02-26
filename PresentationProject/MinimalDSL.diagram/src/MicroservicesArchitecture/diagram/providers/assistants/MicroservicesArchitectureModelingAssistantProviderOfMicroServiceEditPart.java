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
public class MicroservicesArchitectureModelingAssistantProviderOfMicroServiceEditPart
		extends MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		return types;
	}

}
