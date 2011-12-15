package com.isb.simple.gmfmap.simplemappings.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleLinkMappingOutputsCreateCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleLinkMappingOutputsReorientCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleRootNodeOutputsCreateCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleRootNodeOutputsReorientCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLinkMappingOutputsEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleRootNodeOutputsEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;
import com.isb.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

/**
 * @generated
 */
public class SimpleLinkMappingItemSemanticEditPolicy extends
		SimplemapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleLinkMappingItemSemanticEditPolicy() {
		super(SimplemapElementTypes.SimpleLinkMapping_2007);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (SimplemapVisualIDRegistry.getVisualID(incomingLink) == SimpleRootNodeOutputsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (SimplemapVisualIDRegistry.getVisualID(outgoingLink) == SimpleLinkMappingOutputsEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimplemapElementTypes.SimpleLinkMappingOutputs_4004 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleLinkMappingOutputsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (SimplemapElementTypes.SimpleRootNodeOutputs_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimplemapElementTypes.SimpleLinkMappingOutputs_4004 == req
				.getElementType()) {
			return null;
		}
		if (SimplemapElementTypes.SimpleRootNodeOutputs_4005 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleRootNodeOutputsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SimpleLinkMappingOutputsEditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleLinkMappingOutputsReorientCommand(
					req));
		case SimpleRootNodeOutputsEditPart.VISUAL_ID:
			return getGEFWrapper(new SimpleRootNodeOutputsReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
