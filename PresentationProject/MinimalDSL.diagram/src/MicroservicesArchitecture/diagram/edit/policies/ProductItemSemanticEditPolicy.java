/*
* 
*/
package MicroservicesArchitecture.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class ProductItemSemanticEditPolicy
		extends MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public ProductItemSemanticEditPolicy() {
		super(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Product_1000);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001 == req
				.getElementType()) {
			return getGEFWrapper(new MicroservicesArchitecture.diagram.edit.commands.MicroServiceCreateCommand(req));
		}
		if (MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Team_2002 == req
				.getElementType()) {
			return getGEFWrapper(new MicroservicesArchitecture.diagram.edit.commands.TeamCreateCommand(req));
		}
		if (MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2003 == req
				.getElementType()) {
			return getGEFWrapper(new MicroservicesArchitecture.diagram.edit.commands.DeveloperCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	* @generated
	*/
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		* @generated
		*/
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}

	}

}
