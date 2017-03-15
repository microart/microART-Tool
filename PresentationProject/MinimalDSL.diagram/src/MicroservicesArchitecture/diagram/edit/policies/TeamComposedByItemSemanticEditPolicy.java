/*
* 
*/
package MicroservicesArchitecture.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class TeamComposedByItemSemanticEditPolicy
		extends MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TeamComposedByItemSemanticEditPolicy() {
		super(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.TeamComposedBy_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
