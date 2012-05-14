package org.msl.simple.gmfmap.diagram.properties;

import org.eclipse.jface.viewers.IFilter;
import org.msl.simple.gmfmap.simplemappings.diagram.sheet.SimplemapPropertySection;

public abstract class AbstractSimplemapPropertySection extends
		SimplemapPropertySection implements IFilter{
	
	@Override
	public boolean select(Object toTest) {
		
		return transformSelection(toTest)!=null;
	}

}
