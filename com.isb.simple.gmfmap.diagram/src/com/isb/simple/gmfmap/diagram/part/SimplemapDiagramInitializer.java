package com.isb.simple.gmfmap.diagram.part;

import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.mappings.CanvasMapping;
import org.eclipse.gmf.mappings.GMFMapFactory;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.gmf.tooldef.GMFToolFactory;
import org.eclipse.gmf.tooldef.Palette;

import com.isb.simple.gmfmap.simplemappings.SimpleMapping;

public class SimplemapDiagramInitializer {
	
	public static SimpleMapping initializeMapping(SimpleMapping simpleMapping)
	{
			
		Palette palette = GMFToolFactory.eINSTANCE.createPalette();
		palette.setTitle("uiPalette");
		
		Canvas canvas = GMFGraphFactory.eINSTANCE.createCanvas();
		canvas.setName("ui");
		
		FigureGallery defaultFigureGallery = GMFGraphFactory.eINSTANCE.createFigureGallery();
		defaultFigureGallery.setName("Default");
		
		canvas.getFigures().add(defaultFigureGallery);
		
		Mapping mapping = GMFMapFactory.eINSTANCE.createMapping();
		CanvasMapping canvasMapping = GMFMapFactory.eINSTANCE.createCanvasMapping();
		canvasMapping.setPalette(palette);
		canvasMapping.setDiagramCanvas(canvas);
		
		mapping.setDiagram(canvasMapping);
		
		simpleMapping.setCanvas(canvas);
		simpleMapping.setPalette(palette);
		simpleMapping.setMapping(mapping);
		
		return simpleMapping;
		
	}
	
}
