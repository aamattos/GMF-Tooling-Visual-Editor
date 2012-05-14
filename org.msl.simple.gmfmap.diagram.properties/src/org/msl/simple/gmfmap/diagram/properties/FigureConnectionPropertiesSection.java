package org.msl.simple.gmfmap.diagram.properties;

import org.eclipse.gmf.mappings.LinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;

public class FigureConnectionPropertiesSection extends AbstractSimplemapPropertySection {

	@Override
	protected Object transformSelection(Object selected) {
		Object transformSelection = super.transformSelection(selected);

		LinkMapping linkMapping = null;
		
		if(transformSelection instanceof SimpleLinkMapping)
		{
			linkMapping = ((SimpleLinkMapping)transformSelection).getLinkMapping();
		}
			
		return linkMapping;
	}

}
