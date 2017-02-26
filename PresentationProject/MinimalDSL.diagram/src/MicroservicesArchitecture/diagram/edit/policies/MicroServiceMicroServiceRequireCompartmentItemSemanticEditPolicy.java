/*
* 
*/
package MicroservicesArchitecture.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class MicroServiceMicroServiceRequireCompartmentItemSemanticEditPolicy
		extends MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public MicroServiceMicroServiceRequireCompartmentItemSemanticEditPolicy() {
		super(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002 == req
				.getElementType()) {
			return getGEFWrapper(new MicroservicesArchitecture.diagram.edit.commands.Interface2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
