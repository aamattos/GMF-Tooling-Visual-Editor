package org.msl.simple.gmfmap.simplemappings.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.msl.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;

/**
 * @generated
 */
public class SimplemapNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 2006;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof SimplemapNavigatorItem) {
			SimplemapNavigatorItem item = (SimplemapNavigatorItem) element;
			return SimplemapVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
