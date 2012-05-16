package org.msl.simple.gmfmap.simplemappings.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleLinkMappingCreateCommand;
import org.msl.simple.gmfmap.simplemappings.diagram.edit.commands.SimpleTopNodeCreateCommand;
import org.msl.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

/**
 * @generated
 */
public class SimpleMappingItemSemanticEditPolicy extends
		SimplemapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleMappingItemSemanticEditPolicy() {
		super(SimplemapElementTypes.SimpleMapping_79);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimplemapElementTypes.SimpleTopNode_1001 == req.getElementType()) {
			return getGEFWrapper(new SimpleTopNodeCreateCommand(req));
		}
		if (SimplemapElementTypes.SimpleLinkMapping_1002 == req
				.getElementType()) {
			return getGEFWrapper(new SimpleLinkMappingCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
