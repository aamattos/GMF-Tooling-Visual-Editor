package org.msl.simple.gmfmap.diagram.figures;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

public class WrappingLabelWithColorIcon extends WrappingLabel {

    /** the icon location */
    private Point colorIconLocation;
    
    private Color backroundColor = new Color(Display.getCurrent(), 255, 255, 255);
    private Color foregroundColor = new Color(Display.getCurrent(), 255, 255, 255);

    
	public WrappingLabelWithColorIcon() {
	}
	
	public void setBackgroundColor(RGBColor bckColor)
	{
		if(bckColor!=null)
		{
			this.backroundColor = new Color(Display.getCurrent(), bckColor.getRed(), bckColor.getGreen(), bckColor.getBlue());
			repaint();
		}
	}
	
	public void setForegroundColor(RGBColor foreColor)
	{
		if(foreColor!=null)
		{
			this.foregroundColor = new Color(Display.getCurrent(), foreColor.getRed(), foreColor.getGreen(), foreColor.getBlue());
			repaint();
		}
	}

	@Override
	public void paintFigure(Graphics graphics) {
		
		super.paintFigure(graphics);
		
		if(foregroundColor!=null)
			graphics.setForegroundColor(foregroundColor);

		if(backroundColor!=null)
			graphics.setBackgroundColor(backroundColor);

		paintColorIcon(graphics);
	}

    public void layout() {
    	
    	super.layout();
    	
        Rectangle iconBounds = new Rectangle();
        
        iconBounds.setSize(getTotalIconSize());
        
        iconBounds.x = getParent().getBounds().width - getTotalIconSize().width;
        iconBounds.y = 4;
        
        setColorIconLocation(iconBounds.getLocation());
    }


	private void paintColorIcon(Graphics graphics) {
		
        Point p = Point.SINGLETON;

        p.setLocation(getColorIconLocation());

        org.eclipse.draw2d.geometry.Rectangle figBounds = getBounds();
        graphics.translate(figBounds.x, figBounds.y);
        
		Rectangle colorMonitor = new Rectangle(p, new Dimension(16, 16));

		graphics.fillRectangle(colorMonitor);
		graphics.setLineWidth(2);
        graphics.drawRoundRectangle(colorMonitor, 2, 2);//Image(colorIcon, p);
        graphics.translate(-figBounds.x, -figBounds.y);
        
		
	}

    /**
     * Returns the location of the Label's icon relative to the Label.
     * 
     * @return the icon's location
     * @since 2.0
     */
    protected Point getColorIconLocation() {
        return colorIconLocation;
    }

    protected void setColorIconLocation(Point location) {
    	colorIconLocation = location;
    }

	
}
