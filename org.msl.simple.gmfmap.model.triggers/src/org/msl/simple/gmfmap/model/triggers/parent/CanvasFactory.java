package org.msl.simple.gmfmap.model.triggers.parent;

import org.eclipse.gmf.gmfgraph.Alignment;
import org.eclipse.gmf.gmfgraph.AlignmentFacet;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.Canvas;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.Connection;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Dimension;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FigureGallery;
import org.eclipse.gmf.gmfgraph.FlowLayout;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphFactory;
import org.eclipse.gmf.gmfgraph.Insets;
import org.eclipse.gmf.gmfgraph.Label;
import org.eclipse.gmf.gmfgraph.Node;
import org.eclipse.gmf.gmfgraph.Point;
import org.eclipse.gmf.gmfgraph.PolygonDecoration;
import org.eclipse.gmf.gmfgraph.PolylineConnection;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.RealFigure;
import org.eclipse.gmf.gmfgraph.Rectangle;
import org.eclipse.gmf.gmfgraph.RoundedRectangle;

public class CanvasFactory {
	
	private Canvas canvas;
	
	private static String DEFAULT_LABEL_FACE = "Verdana";
	private static String DEFAULT_LABEL_TEXT = "<..>";
	private static int DEFAULT_LABEL_HEIGHT = 9;
	
	private static int[] DEFAULT_RECTANGLE_BACKGROUND = {242, 245, 252}; //RED, GREEN, BLUE
	private static int[] DEFAULT_RECTANGLE_FOREGROUND = {111, 142, 194}; //RED, GREEN, BLUE
	
	private static int[] DEFAULT_COMPARTMENT_RECTANGLE_BACKGROUND = {251, 252, 255}; //RED, GREEN, BLUE
	private static int[] DEFAULT_COMPARTMENT_RECTANGLE_FOREGROUND = {133, 156, 194}; //RED, GREEN, BLUE
	
	private static int[] DEFAULT_POLYGON_DECORATION_FOREGROUND = {32, 104, 160}; //RED, GREEN, BLUE
	private static int[] DEFAULT_POLYLINE_CONNECTION_FOREGROUND = {32, 104, 160}; //RED, GREEN, BLUE
	
	private static int[] DEFAULT_TOP_NODE_INSETS = {5,3,3,3}; //TOP; LEFT; RIGHT; BOTTOM
	private static int[] DEFAULT_SUB_NODE_INSETS = {5,5,5,5}; //TOP; LEFT; RIGHT; BOTTOM
	
	private static int[] DEFAULT_COMPARTMENT_INSETS = {5,5,5,5}; //TOP; LEFT; RIGHT; BOTTOM
	

	public CanvasFactory(Canvas canvas)
	{
		this.canvas = canvas;
	}
	
	public FigureDescriptor createDefaultLabelFigure(DiagramLabel newLabel, BasicFont parentFont)
	{
		FigureDescriptor newFigureDescriptor = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
		
		int height = parentFont!=null?parentFont.getHeight()-1:DEFAULT_LABEL_HEIGHT;
		
		//Label
		Label label = createLabelFigure(DEFAULT_LABEL_TEXT, DEFAULT_LABEL_FACE, height, null);
		
		newFigureDescriptor.setActualFigure(label);
		
		newLabel.setFigure(newFigureDescriptor);
		
		canvas.getFigures().get(0).getDescriptors().add(newFigureDescriptor);
		canvas.getLabels().add(newLabel);
		
		return newFigureDescriptor;
		
	}
	
	private Label createLabelFigure(String defaultText, String faceName, int height, FontStyle fontStyle)
	{
		//Label
		Label label = GMFGraphFactory.eINSTANCE.createLabel();
		label.setText(defaultText);
		
		BasicFont defaultFont = GMFGraphFactory.eINSTANCE.createBasicFont();
		defaultFont.setFaceName(faceName);
		
		//No permitimos tamaños menores de 6 (no se ve nada)
		if(height<=6)
			height = 7;
		
		defaultFont.setHeight(height);
		
		if(fontStyle!=null)
			defaultFont.setStyle(fontStyle);
		
		label.setFont(defaultFont);
		
		return label;
		
	}

	
	public void createDefaultRoundedRectangleWithLabel(Node newNode, DiagramLabel newLabel, boolean topNode, BasicFont parentFont)
	{
		
		//Creamos el descriptor:
		FigureDescriptor newFigureDescriptor = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
		
		int fontSize = parentFont!=null?parentFont.getHeight()-1:DEFAULT_LABEL_HEIGHT;
		
		//Label
		Label label = createLabelFigure(DEFAULT_LABEL_TEXT, DEFAULT_LABEL_FACE, fontSize, FontStyle.BOLD_LITERAL);
		
		//Rectangle
		RoundedRectangle defaultRectangle = createDefaultRoundedRectangle(label, topNode);
		newFigureDescriptor.setActualFigure(defaultRectangle);
		
		//Accesor al label:
		ChildAccess labelAccessor = GMFGraphFactory.eINSTANCE.createChildAccess();
		labelAccessor.setFigure(label);
		
		newFigureDescriptor.getAccessors().add(labelAccessor);
		
		//Node
		newNode.setFigure(newFigureDescriptor);
		
		//Diagram Label
		newLabel.setFigure(newFigureDescriptor);
		newLabel.setAccessor(labelAccessor);
		
		AlignmentFacet alignmentFacet = GMFGraphFactory.eINSTANCE.createAlignmentFacet();
		alignmentFacet.setAlignment(Alignment.CENTER_LITERAL);
		
		newLabel.getFacets().add(alignmentFacet);
		
		if(canvas.getFigures().isEmpty())
		{
			FigureGallery defaultFigureGallery = GMFGraphFactory.eINSTANCE
					.createFigureGallery();
			defaultFigureGallery.setName("Default");
			
			canvas.getFigures().add(defaultFigureGallery);

		}
		
		canvas.getFigures().get(0).getDescriptors().add(newFigureDescriptor);
		canvas.getNodes().add(newNode);
		canvas.getLabels().add(newLabel);
		

	}
	
	public void createDefaultCompartmentWithoutLabel(FigureDescriptor parentFigureDescriptor, Compartment newCompartment)
	{
		createDefaultCompartment(parentFigureDescriptor, newCompartment, null);
	}
	
	public void createDefaultCompartmentWithLabel(FigureDescriptor parentFigureDescriptor, Compartment newCompartment)
	{
		Label compartmentLabel = createLabelFigure("Compartment", DEFAULT_LABEL_FACE, 7, FontStyle.BOLD_LITERAL);
		createDefaultCompartment(parentFigureDescriptor, newCompartment, compartmentLabel);
	}

	
	private void createDefaultCompartment(FigureDescriptor parentFigureDescriptor, Compartment newCompartment, Label compartmentLabel)
	{
		//Creamos y agregamos el rectangulo a la figura del padre:
		
		Rectangle newCompartmentRectangle = createDefaultCompartmentRectangle();
		
		if(compartmentLabel!=null)
			newCompartmentRectangle.getChildren().add(compartmentLabel);
			
		RealFigure actualFigure = (RealFigure)parentFigureDescriptor.getActualFigure();
		
		actualFigure.getChildren().add(newCompartmentRectangle);
		
		//Accessor:
		
		ChildAccess compartmentAccessor = GMFGraphFactory.eINSTANCE.createChildAccess();
		compartmentAccessor.setFigure(newCompartmentRectangle);
		
		parentFigureDescriptor.getAccessors().add(compartmentAccessor);
		
		newCompartment.setAccessor(compartmentAccessor);
		newCompartment.setCollapsible(true);
		newCompartment.setFigure(parentFigureDescriptor);
		
		//Agregamoa el Compartment al Canvas:
		canvas.getCompartments().add(newCompartment);
		
	}
	

	
	private RoundedRectangle createDefaultRoundedRectangle(Label rectangleLabel, boolean topNode)
	{
		RoundedRectangle defaultRectangle = GMFGraphFactory.eINSTANCE.createRoundedRectangle();
		
		//Layout
		FlowLayout flowLayout = GMFGraphFactory.eINSTANCE.createFlowLayout();
		
		flowLayout.setVertical(true);
		flowLayout.setMatchMinorSize(true);
		flowLayout.setForceSingleLine(true);
		
		
		//Minimum size
		Dimension minimumSize = GMFGraphFactory.eINSTANCE.createDimension();
		minimumSize.setDx(160);
		minimumSize.setDy(150);
				
		int[] insetsData = topNode?DEFAULT_TOP_NODE_INSETS:DEFAULT_SUB_NODE_INSETS;
		
		//Insets
		Insets insets = createInsets(insetsData);
		
		
		if(topNode)
		{
			defaultRectangle.setLineWidth(3);
			defaultRectangle.setCornerWidth(6);
			defaultRectangle.setCornerHeight(6);
		}
		else
		{
			defaultRectangle.setLineWidth(1);
			defaultRectangle.setCornerWidth(8);
			defaultRectangle.setCornerHeight(8);
		}
			
		
		defaultRectangle.setLayout(flowLayout);

		//Foreground Color
		RGBColor foregroundColor = createRGBColor(DEFAULT_RECTANGLE_FOREGROUND);
		
		//Background Color
		RGBColor backgroundColor = createRGBColor(DEFAULT_RECTANGLE_BACKGROUND);
		
		
		defaultRectangle.setForegroundColor(foregroundColor);
		
		
		defaultRectangle.setBackgroundColor(backgroundColor);
		
		if(topNode)
			defaultRectangle.setMinimumSize(minimumSize);
		
		defaultRectangle.setXorFill(!topNode);

		defaultRectangle.setInsets(insets);
		
		if(rectangleLabel!=null)
			defaultRectangle.getChildren().add(rectangleLabel);
		
		
		return defaultRectangle;

	}
	
	private PolylineConnection createDefaultPolyLineConnection()
	{
		PolylineConnection newPolylineConnection = GMFGraphFactory.eINSTANCE.createPolylineConnection();
		
		//Foreground Color
		RGBColor foregroundColor = createRGBColor(DEFAULT_POLYLINE_CONNECTION_FOREGROUND);
		
		newPolylineConnection.setForegroundColor(foregroundColor);
		
		return newPolylineConnection;
		
	}
	
	private PolygonDecoration createDefaultPolygonDecoration()
	{
		PolygonDecoration newPolygonDecoration = GMFGraphFactory.eINSTANCE.createPolygonDecoration();
		
		//Foreground Color
		
		RGBColor foregroundColor = createRGBColor(DEFAULT_POLYGON_DECORATION_FOREGROUND);
		
		newPolygonDecoration.setForegroundColor(foregroundColor);
		
		Point point1 = GMFGraphFactory.eINSTANCE.createPoint();
		point1.setX(-1);
		point1.setY(1);
		
		Point point2 = GMFGraphFactory.eINSTANCE.createPoint();
		point2.setX(-1);
		point2.setY(-1);
		
		Point point3 = GMFGraphFactory.eINSTANCE.createPoint();
		point3.setX(0);
		point3.setY(0);
		
		newPolygonDecoration.getTemplate().add(point1);
		newPolygonDecoration.getTemplate().add(point2);
		newPolygonDecoration.getTemplate().add(point3);
		
		return newPolygonDecoration;
		
	}

	
	private Rectangle createDefaultRectangle()
	{
		Rectangle newRectangle = GMFGraphFactory.eINSTANCE.createRectangle();
		
		//Foreground Color
		RGBColor foregroundColor = createRGBColor(DEFAULT_RECTANGLE_FOREGROUND);
		
		//Background Color
		RGBColor backgroundColor = createRGBColor(DEFAULT_RECTANGLE_BACKGROUND);
		
		newRectangle.setForegroundColor(foregroundColor);
		newRectangle.setBackgroundColor(backgroundColor);
		
		return newRectangle;
		
	}
	
	private Rectangle createDefaultCompartmentRectangle()
	{
		Rectangle newRectangle = GMFGraphFactory.eINSTANCE.createRectangle();
		
		//Foreground Color
		RGBColor foregroundColor = createRGBColor(DEFAULT_COMPARTMENT_RECTANGLE_FOREGROUND);
		
		//Background Color
		RGBColor backgroundColor = createRGBColor(DEFAULT_COMPARTMENT_RECTANGLE_BACKGROUND);
		
		newRectangle.setForegroundColor(foregroundColor);
		newRectangle.setBackgroundColor(backgroundColor);
		
		newRectangle.setInsets(createInsets(DEFAULT_COMPARTMENT_INSETS));

		//Minimum size
		Dimension minimumSize = GMFGraphFactory.eINSTANCE.createDimension();
		minimumSize.setDx(160);
		minimumSize.setDy(150);
		
		newRectangle.setMinimumSize(minimumSize);
		
		return newRectangle;
		
	}

	public void createNewDefaultPolygon(Connection newConnection, DiagramLabel newLabel) {
		
		//Creamos el descriptor:
		FigureDescriptor newPolylineFigureDescriptor = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
		
		//Polyline Connection
		PolylineConnection defaultPolylineConnection = createDefaultPolyLineConnection();
		
		//Polygon
		PolygonDecoration defaultPolygonDecoration = createDefaultPolygonDecoration();
		
		defaultPolylineConnection.setTargetDecoration(defaultPolygonDecoration);
		
		newPolylineFigureDescriptor.setActualFigure(defaultPolylineConnection);

		//Label Figure Descriptor
		FigureDescriptor newLabelFigureDescriptor = GMFGraphFactory.eINSTANCE.createFigureDescriptor();
		
		//Label
		Label label = createLabelFigure(DEFAULT_LABEL_TEXT, DEFAULT_LABEL_FACE, DEFAULT_LABEL_HEIGHT, FontStyle.BOLD_LITERAL);

		newLabelFigureDescriptor.setActualFigure(label);

		
		//Connection
		newConnection.setFigure(newPolylineFigureDescriptor);
		
		//Diagram Label
		newLabel.setFigure(newLabelFigureDescriptor);
		
		canvas.getFigures().get(0).getDescriptors().add(newPolylineFigureDescriptor);
		canvas.getFigures().get(0).getDescriptors().add(newLabelFigureDescriptor);
		canvas.getFigures().get(0).getFigures().add(defaultPolygonDecoration);
		canvas.getConnections().add(newConnection);
		canvas.getLabels().add(newLabel);		
	}
	
	/**
	 * 
	 * @param color (Red, Green, Blue)
	 * @return
	 */
	private RGBColor createRGBColor(int[] color)
	{
		RGBColor backgroundColor = GMFGraphFactory.eINSTANCE.createRGBColor();
		backgroundColor.setRed(color[0]);
		backgroundColor.setGreen(color[1]);
		backgroundColor.setBlue(color[2]);
		
		return backgroundColor;
	}
	
	private Insets createInsets(int[] insetsData)
	{
		//Insets
		Insets insets = GMFGraphFactory.eINSTANCE.createInsets();
		
		insets.setTop(insetsData[0]);
		insets.setLeft(insetsData[1]);
		insets.setRight(insetsData[2]);
		insets.setBottom(insetsData[3]);
		
		return insets;
	}

}
