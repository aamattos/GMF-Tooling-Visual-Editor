package com.isb.simple.gmfmap.simplemappings.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import com.isb.simple.gmfmap.simplemappings.SimpleLinkMapping;
import com.isb.simple.gmfmap.simplemappings.SimpleRootNode;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.policies.SimplemapBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class SimpleLinkMappingOutputsReorientCommand extends EditElementCommand {

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
	public SimpleLinkMappingOutputsReorientCommand(
			ReorientReferenceRelationshipRequest request) {
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
		if (false == referenceOwner instanceof SimpleLinkMapping) {
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
		if (!(oldEnd instanceof SimpleRootNode && newEnd instanceof SimpleLinkMapping)) {
			return false;
		}
		return SimplemapBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSimpleLinkMappingOutputs_4004(getNewSource(),
						getOldTarget());
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof SimpleRootNode && newEnd instanceof SimpleRootNode)) {
			return false;
		}
		return SimplemapBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistSimpleLinkMappingOutputs_4004(getOldSource(),
						getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
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
		getOldSource().getOutputs().remove(getOldTarget());
		getNewSource().getOutputs().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getOutputs().remove(getOldTarget());
		getOldSource().getOutputs().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	 * @generated
	 */
	protected SimpleLinkMapping getOldSource() {
		return (SimpleLinkMapping) referenceOwner;
	}

	/**
	 * @generated
	 */
	protected SimpleLinkMapping getNewSource() {
		return (SimpleLinkMapping) newEnd;
	}

	/**
	 * @generated
	 */
	protected SimpleRootNode getOldTarget() {
		return (SimpleRootNode) oldEnd;
	}

	/**
	 * @generated
	 */
	protected SimpleRootNode getNewTarget() {
		return (SimpleRootNode) newEnd;
	}
}
