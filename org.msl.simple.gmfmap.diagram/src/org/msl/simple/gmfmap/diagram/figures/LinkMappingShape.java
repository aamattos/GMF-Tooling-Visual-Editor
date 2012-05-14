/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    Dmitry Stadnik (Borland) - initial API and implementation
 */
package org.msl.simple.gmfmap.diagram.figures;


import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Color;

/**
 * @author dstadnik
 */
public class LinkMappingShape extends Shape {

	private static final Color foreground = new Color(null, 74, 100, 145);
	private static final Color background = new Color(null, 100, 112, 158);
	
	protected void outlineShape(Graphics g) {
		drawPort(g, true);
	}

	protected void fillShape(Graphics g) {
		drawPort(g, true);
	}

	protected void drawPort(Graphics g, boolean fill) {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y  + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);


		// walls
		PointList walls = new PointList(5);
//		walls.addPoint(0, h * 4 / 5);
//		walls.addPoint(w , h * 4 / 5);
//		walls.addPoint(w , h);
//		walls.addPoint(0, h);
		walls.addPoint(0, 0);
		walls.addPoint(0 , h/5);
		walls.addPoint(w / 2 , h * 4 / 5);
		walls.addPoint(w  , h / 5);
		walls.addPoint(w  , 0);
//		walls.addPoint(w ,h);
//		walls.addPoint(0, h/2);
//		walls.addPoint(0, h * 4 / 5);
		walls.performTranslate(x, y);
		if (fill) {
			g.setBackgroundColor(background);
			g.fillPolygon(walls);

			g.setForegroundColor(foreground);
			g.drawPolygon(walls);
		}
//		y = y +15;
//		// main roof
//		PointList mainRoof = new PointList(3);
//		mainRoof.addPoint(w / 2,  h * 3/2 );
//		mainRoof.addPoint(w, h * 4 / 5);
//		mainRoof.addPoint(0, h * 4 / 5);
//		mainRoof.performTranslate(x, y);
//		if (fill) {
//			g.setBackgroundColor(ColorConstants.orange);
//			g.fillPolygon(mainRoof);
//		} else {
//			g.setForegroundColor(ColorConstants.orange);
//			g.drawPolygon(mainRoof);
//		}

		// top roof
//		PointList topRoof = new PointList(3);
//		topRoof.addPoint(w / 2, 0);
//		topRoof.addPoint(w * 5 / 6, h * 2 / 5);
//		topRoof.addPoint(w / 6, h * 2 / 5);
//		topRoof.performTranslate(x, y);
//		if (fill) {
//			g.setBackgroundColor(ColorConstants.orange);
//			g.fillPolygon(topRoof);
//		} else {
//			g.setForegroundColor(ColorConstants.orange);
//			g.drawPolygon(topRoof);
//		}
	}
}
