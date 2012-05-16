package org.msl.simple.gmfmap.simplemappings.diagram.providers;

import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = SimplemapDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SimplemapDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
