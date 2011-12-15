package com.isb.simple.gmfmap.simplemappings.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;

import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleLabelNode2CreateCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleSubNodeReferenceCreateCommand;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleLabelNode2EditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.edit.parts.SimpleSubNodeReferenceEditPart;
import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;
import com.isb.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

/**
 * @generated
 */
public class SimpleCompartmentItemSemanticEditPolicy extends
		SimplemapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleCompartmentItemSemanticEditPolicy() {
		super(SimplemapElementTypes.SimpleCompartment_3005);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimplemapElementTypes.SimpleLabelNode_3007 == req.getElementType()) {
			return getGEFWrapper(new SimpleLabelNode2CreateCommand(req));
		}
		if (SimplemapElementTypes.SimpleSubNodeReference_3011 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleSubNodeReferenceCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyChildNodesCommand(cmd);
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
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator<?> nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (SimplemapVisualIDRegistry.getVisualID(node)) {
			case SimpleLabelNode2EditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			case SimpleSubNodeReferenceEditPart.VISUAL_ID:
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(
						getEditingDomain(), node.getElement(), false))); // directlyOwned: true
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
				break;
			}
		}
	}

}
