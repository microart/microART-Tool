/*
 * 
 */
package MicroservicesArchitecture.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class LinkDependencyReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public LinkDependencyReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof MicroservicesArchitecture.Link) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof MicroservicesArchitecture.Product
				&& newEnd instanceof MicroservicesArchitecture.Link)) {
			return false;
		}
		return MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLinkDependency_4004(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof MicroservicesArchitecture.Product
				&& newEnd instanceof MicroservicesArchitecture.Product)) {
			return false;
		}
		return MicroservicesArchitecture.diagram.edit.policies.MicroservicesArchitectureBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistLinkDependency_4004(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().setDependency(null);
		getNewSource().setDependency(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().setDependency(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.Link getOldSource() {
		return (MicroservicesArchitecture.Link) referenceOwner;
	}

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.Link getNewSource() {
		return (MicroservicesArchitecture.Link) newEnd;
	}

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.Product getOldTarget() {
		return (MicroservicesArchitecture.Product) oldEnd;
	}

	/**
	* @generated
	*/
	protected MicroservicesArchitecture.Product getNewTarget() {
		return (MicroservicesArchitecture.Product) newEnd;
	}
}
