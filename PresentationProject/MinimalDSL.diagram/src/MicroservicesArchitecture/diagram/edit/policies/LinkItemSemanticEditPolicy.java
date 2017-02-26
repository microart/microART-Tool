/*
* 
*/
package MicroservicesArchitecture.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

/**
 * @generated
 */
public class LinkItemSemanticEditPolicy
		extends MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public LinkItemSemanticEditPolicy() {
		super(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001);
	}

	/**
	* @generated
	*/
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
