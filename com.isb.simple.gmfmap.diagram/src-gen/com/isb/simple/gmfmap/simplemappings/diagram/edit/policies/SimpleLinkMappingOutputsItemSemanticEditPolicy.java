package com.isb.simple.gmfmap.simplemappings.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import com.isb.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

/**
 * @generated
 */
public class SimpleLinkMappingOutputsItemSemanticEditPolicy extends
		SimplemapBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SimpleLinkMappingOutputsItemSemanticEditPolicy() {
		super(SimplemapElementTypes.SimpleLinkMappingOutputs_4004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
