package org.msl.simple.gmfmap.simplemappings.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.icon.GetIconOperation;
import org.eclipse.gmf.runtime.common.ui.services.icon.IIconProvider;
import org.eclipse.swt.graphics.Image;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapDiagramEditorPlugin;

/**
 * @generated
 */
public class SimplemapIconProvider extends AbstractProvider implements
		IIconProvider {

	/**
	 * @generated not
	 */
	public Image getIcon(IAdaptable hint, int flags) {
		if (SimplemapElementTypes.getElement(hint).getName()
				.equals("SimpleTopNode"))
			return SimplemapDiagramEditorPlugin.getBundledImageDescriptor(
					"icons/obj16/SimpleTopNodePalette.gif").createImage();

		if (SimplemapElementTypes.getElement(hint).getName()
				.equals("SimpleLabelNode"))
			return SimplemapDiagramEditorPlugin.getBundledImageDescriptor(
					"icons/obj16/SimpleLabelNodeC.gif").createImage();

		if (SimplemapElementTypes.getElement(hint).getName()
				.equals("SimpleSubNode")
				|| SimplemapElementTypes.getElement(hint).getName()
						.equals("SimpleSubNodeReference"))
			return SimplemapDiagramEditorPlugin.getBundledImageDescriptor(
					"icons/obj16/SimpleSubNodeReferencePalette.gif")
					.createImage();

		if (SimplemapElementTypes.getElement(hint).getName()
				.equals("SimpleLinkMapping"))
			return SimplemapDiagramEditorPlugin.getBundledImageDescriptor(
					"icons/obj16/SimpleLinkPalette.gif").createImage();

		return SimplemapElementTypes.getImage(hint);
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetIconOperation) {
			return ((GetIconOperation) operation).execute(this) != null;
		}
		return false;
	}
}
