package org.msl.simple.gmfmap.diagram.properties.figure;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EContentsEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.gmf.gmfgraph.BasicFont;
import org.eclipse.gmf.gmfgraph.Color;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.RGBColor;
import org.eclipse.gmf.gmfgraph.Shape;
import org.eclipse.gmf.gmfgraph.provider.GMFGraphItemProviderAdapterFactory;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.FontHelper;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.properties.internal.l10n.DiagramUIPropertiesImages;
import org.eclipse.gmf.runtime.diagram.ui.properties.sections.appearance.ColorPalettePopup;
import org.eclipse.gmf.runtime.draw2d.ui.figures.FigureUtilities;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.CompositeImageDescriptor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.IWorkbenchPart;
import org.msl.simple.gmfmap.diagram.properties.AbstractExtendedPropertiesSection;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleMappingElementWithFigure;

public class FigurePropertiesSection extends AbstractExtendedPropertiesSection {
	
	protected static final String FONTS_LABEL = "Label Font";
	
	protected static final String COLORS_LABEL = "Figure";
	
	protected Button backgroundColorButton;
	
	protected Button foregroundColorButton;
	
	/** the default preference color */
	protected static final RGB DEFAULT_TOP_NODE_BACKGROUND = new RGB(242, 245, 252);
	protected static final RGB DEFAULT_TOP_NODE_FOREGROUND = new RGB(111, 142, 194);
	
	protected static final RGB DEFAULT_COMPARTMENT_BACKGROUND = new RGB(251, 252, 255); //RED, GREEN, BLUE
	protected static final RGB DEFAULT_COMPARTMENT_FOREGROUND  = new RGB(133, 156, 194); //RED, GREEN, BLUE
	
	// font family drop down
	protected CCombo fontFamilyCombo;
	
	protected CCombo shapeFamilyCombo;
	
	protected Map<Shape, Integer> shapeFamilyMap;

	// font size drop down
	private CCombo fontSizeCombo;

	private Button fontBoldButton;

	private Button fontItalicButton;

	protected Group fontGroup;

	protected Group colorsGroup;
	
	protected Group shapeGroup;
	
	private Figure nodeFigure;
	
	private RGB defaultBackgroundColor = DEFAULT_TOP_NODE_BACKGROUND;
	
	private RGB defaultForegroundColor = DEFAULT_TOP_NODE_FOREGROUND;
	
	private BasicFont labelFont;
	
	private GMFGraphItemProviderAdapterFactory adapterFactory = new GMFGraphItemProviderAdapterFactory();
	
	private static List<EClass> availableFigures = new ArrayList<EClass>();
	
	static{
		availableFigures.add(GMFGraphPackage.eINSTANCE.getRoundedRectangle());
		availableFigures.add(GMFGraphPackage.eINSTANCE.getRectangle());
	}
	
	protected static class ColorOverlayImageDescriptor
		extends CompositeImageDescriptor {

		/** default color icon width */
		private static final Point ICON_SIZE = new Point(16, 16);

		/** the basic icon */
		private ImageData basicImgData;

		/** the color of the thin color bar */
		private RGB rgb;

		/**
		 * Creates a new color menu image descriptor
		 * 
		 * @param basicIcon
		 *            The basic Image data
		 * @param rgb
		 *            The color bar RGB value
		 */
		public ColorOverlayImageDescriptor(ImageData basicImgData, RGB rgb) {
			this.basicImgData = basicImgData;
			this.rgb = rgb;
		}

		/**
		 * @see org.eclipse.jface.resource.CompositeImageDescriptor#drawCompositeImage(int,
		 *      int)
		 */
		protected void drawCompositeImage(int width, int height) {

			// draw the thin color bar underneath
			if (rgb != null) {
				ImageData colorBar = new ImageData(width, height / 5, 1,
				
					new PaletteData(new RGB[] {rgb}));
				drawImage(colorBar, 0, height - height / 5);
				
			}
			// draw the base image
			drawImage(basicImgData, 0, 0);
		}

		/**
		 * @see org.eclipse.jface.resource.CompositeImageDescriptor#getSize()
		 */
		protected Point getSize() {
			return ICON_SIZE;
		}
	}   	
	
	/* (non-Javadoc)
	 * @see org.eclipse.gmf.runtime.diagram.ui.properties.sections.AbstractNotationPropertiesSection#initializeControls(org.eclipse.swt.widgets.Composite)
	 */
	protected void initializeControls(Composite parent) {
		super.initializeControls(parent);
		createFontsAndColorsGroups(composite);		
	}

	/**
	 * Create  fonts and colors group
	 * 
	 * @param parent - parent composite
	 */
	protected Group createFontsAndColorsGroups(Composite parent) {

		Group fontsLabelGroup = getWidgetFactory().createGroup(parent, "");
		fontsLabelGroup.setLayout(new GridLayout(2, false));
		
		GridLayout layout = new GridLayout(1, false);
		
		colorsGroup = getWidgetFactory().createGroup(fontsLabelGroup, COLORS_LABEL);
		colorsGroup.setLayout(layout);

		createColorsGroup(colorsGroup);

		fontGroup = getWidgetFactory().createGroup(fontsLabelGroup, FONTS_LABEL);
		fontGroup.setLayout(layout);
		
		createFontGroup(fontGroup);

		
		return fontsLabelGroup;

	}
	
	/**
	 * Create  font tool bar group
	 * 
	 * @param parent - parent composite
	 * @return - font tool bar
	 */
	protected Composite createFontGroup(Composite parent) {
		Composite familySize = getWidgetFactory().createComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		familySize.setLayout(layout);

		Composite toolBar = new Composite(parent, SWT.SHADOW_NONE);
		toolBar.setLayout(new GridLayout(7, false));
		toolBar.setBackground(parent.getBackground());
		
		fontFamilyCombo = getWidgetFactory().createCCombo(familySize,
				SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontFamilyCombo.setItems(FontHelper.getFontNames());
		fontFamilyCombo.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				updateFontFamily();
			}
		});

		fontSizeCombo = getWidgetFactory().createCCombo(familySize,
			SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontSizeCombo.setItems(FontHelper.getFontSizes());
		fontSizeCombo.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				updateFontSize();
			}
		});

		fontBoldButton = new Button(toolBar, SWT.TOGGLE);
		fontBoldButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_BOLD));
        fontBoldButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontStyle_Bold;
            }
        });
        
		fontBoldButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				updateFontBold();
			}
		});
	
		
		fontItalicButton = new Button(toolBar, SWT.TOGGLE );
		fontItalicButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_ITALIC));
        fontItalicButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontStyle_Italic;
            }
        });
        
		fontItalicButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				updateFontItalic();
			}
		});

		return toolBar;
	}

	/**
	 * Create  font tool bar group
	 * 
	 * @param parent - parent composite
	 * @return - font tool bar
	 */
	protected Composite createColorsGroup(Composite parent) {

		Composite toolBar = new Composite(parent, SWT.SHADOW_NONE);
		toolBar.setLayout(new GridLayout(2, false));
		toolBar.setBackground(parent.getBackground());
		
		Label figureLabel = new Label(toolBar, SWT.LEFT);
		figureLabel.setText("Shape");
		
		shapeFamilyCombo = getWidgetFactory().createCCombo(toolBar,
				SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		shapeFamilyCombo.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				updateShapeFamily();
			}
		});
		
		Label bckLabel = new Label(toolBar, SWT.LEFT);
		bckLabel.setText("Background");
		
		backgroundColorButton = new Button(toolBar, SWT.PUSH);
		//backgroundColorButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_FILL_COLOR));
        backgroundColorButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontColor;
            }
        });
		backgroundColorButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				changeBackgroundColor(event);
			}
		});
		
        GridData data = new GridData(GridData.HORIZONTAL_ALIGN_FILL);
        Point minSize = backgroundColorButton.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);
        data.widthHint = Math.max(120, minSize.x);
        backgroundColorButton.setLayoutData(data);
		
		Label foreLabel = new Label(toolBar, SWT.LEFT);
		foreLabel.setText("Foreground");

		foregroundColorButton = new Button(toolBar, SWT.PUSH);
		//foregroundColorButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_FILL_COLOR));
		foregroundColorButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontColor;
            }
        });
		foregroundColorButton.addSelectionListener(new SelectionAdapter() {

			public void widgetSelected(SelectionEvent event) {
				changeForegroundColor(event);
			}
		});

        foregroundColorButton.setLayoutData(data);
		
		return toolBar;
	}

	/**
     * Update font property
     */
	protected void updateFontBold() {

		// Update model in response to user
		List<ICommand> commands = new ArrayList<ICommand>();
		
		final FontStyle newStyle = Boolean.valueOf(fontBoldButton.getSelection())? FontStyle.BOLD_LITERAL:FontStyle.NORMAL_LITERAL;
		
		commands.add(createCommand("UpdateFontStyle", labelFont.eResource(), new Runnable() {

				public void run() {
					labelFont.setStyle(newStyle);
				}
			}));

		executeAsCompositeCommand("UpdateFontStyle", commands);

	}

	/**
	 * Update font property
	 */
	protected void updateFontItalic() {

		// Update model in response to user
		
		List<ICommand> commands = new ArrayList<ICommand>();
		
		final FontStyle newStyle = Boolean.valueOf(fontItalicButton.getSelection())? FontStyle.ITALIC_LITERAL:FontStyle.NORMAL_LITERAL;
		
		commands.add(createCommand("UpdateFontStyle", labelFont.eResource(), new Runnable() {

				public void run() {
					labelFont.setStyle(newStyle);
				}
			}));

		executeAsCompositeCommand("UpdateFontStyle", commands);
	}

	/**
	 * Update font family property
	 */
	protected void updateFontFamily() {

		// Update model in response to user
		
		List<ICommand> commands = new ArrayList<ICommand>();
		
		if (fontFamilyCombo.getText() != null
				&& !fontFamilyCombo.getText().equals("")) { //$NON-NLS-1$
			
			final String newFontFamily = fontFamilyCombo.getText();

			commands.add(createCommand("UpdateFontFamily", labelFont.eResource(), new Runnable() {

				public void run() {
					labelFont.setFaceName(newFontFamily);
				}
			}));

		executeAsCompositeCommand("UpdateFontFamily", commands);

		}
	}
	
	/**
	 * Update font family property
	 */
	protected void updateShapeFamily() {

		// Update model in response to user
		
		List<ICommand> commands = new ArrayList<ICommand>();

		final int newShapeID = shapeFamilyCombo.getSelectionIndex();
		
		commands.add(createCommand("UpdateFontFamily", nodeFigure.eResource(), new Runnable() {

			public void run() {

				Shape newShape = null;
				
				for(Map.Entry<Shape, Integer> entry:shapeFamilyMap.entrySet())
				{
					if(entry.getValue()==newShapeID)
						newShape = entry.getKey();
				}
				
				Figure newFigure = (Figure)EcoreUtil.copy(newShape);
				EStructuralFeature containingFeature = nodeFigure.eContainingFeature();
				EObject container = nodeFigure.eContainer();
				
				for(Setting setting: EcoreUtil.UsageCrossReferencer.find(nodeFigure, nodeFigure.eResource()))
					if(!setting.getEStructuralFeature().isDerived())
						EcoreUtil.replace(setting, nodeFigure, newFigure);
				
				if(containingFeature!=null)
					EcoreUtil.replace(container, containingFeature, nodeFigure, newFigure);
				
				nodeFigure = newFigure;
			}
		}));

		executeAsCompositeCommand("UpdateShape", commands);

		
	}

	/**
	 * Update font size property
	 */
	protected void updateFontSize() {

		List<ICommand> commands = new ArrayList<ICommand>();
		
		if (fontSizeCombo.getText() != null
				&& !fontSizeCombo.getText().equals("")) { //$NON-NLS-1$
			
			final int newFontSize = new Integer(fontSizeCombo.getText());

			commands.add(createCommand("UpdateFontSize", labelFont.eResource(), new Runnable() {

				public void run() {
					labelFont.setHeight(newFontSize);
				}
			}));

		executeAsCompositeCommand("UpdateFontSize", commands);

		}
	}

	
	/**
	 * Apply font color change
	 * 
	 * @param event -
	 *            font button selection event
	 */
	protected void changeBackgroundColor(SelectionEvent event) {
		
		Color figureBackgroundColor = nodeFigure!=null?nodeFigure.getBackgroundColor():null;
		
		final RGBColor figureBackgroundRGBColor = figureBackgroundColor instanceof RGBColor ? (RGBColor)figureBackgroundColor:null;

		RGB rgbBackgroundColor = getBackgroungRGBColor();
		
		int previousBackgroundColor = rgbBackgroundColor != null?FigureUtilities.RGBToInteger(rgbBackgroundColor):FigureUtilities.RGBToInteger(defaultBackgroundColor);

		final RGB pickedColor = pickColor(backgroundColorButton, previousBackgroundColor, defaultBackgroundColor);
		
		if(pickedColor!=null)
		{
			List<ICommand> commands = new ArrayList<ICommand>();
			
			backgroundColorButton.setBackground(new org.eclipse.swt.graphics.Color(null, pickedColor));
			
			commands.add(createCommand("ChangeBackgroundColor", nodeFigure.eResource(), new Runnable() {

				public void run() {
					figureBackgroundRGBColor.setBlue(pickedColor.blue);
					figureBackgroundRGBColor.setGreen(pickedColor.green);
					figureBackgroundRGBColor.setRed(pickedColor.red);
				}
			}));

			executeAsCompositeCommand("ChangeBackgroundColor", commands);
		}
			
	}
	
	
	/**
	 * Apply font color change
	 * 
	 * @param event -
	 *            font button selection event
	 */
	protected void changeForegroundColor(SelectionEvent event) {
		
		Color figureForegroundColor = nodeFigure!=null?nodeFigure.getForegroundColor():null;
		
		final RGBColor figureForegroundRGBColor = figureForegroundColor instanceof RGBColor ? (RGBColor)figureForegroundColor:null;

		RGB rgbForegroundColor = getForegroundRGBColor();
		
		int previousForegroundColor = rgbForegroundColor != null?FigureUtilities.RGBToInteger(rgbForegroundColor):FigureUtilities.RGBToInteger(defaultForegroundColor);

		final RGB pickedColor = pickColor(foregroundColorButton, previousForegroundColor, defaultForegroundColor);
		
		if(pickedColor!=null)
		{
			List<ICommand> commands = new ArrayList<ICommand>();
			
			foregroundColorButton.setBackground(new org.eclipse.swt.graphics.Color(null, pickedColor));
			
			commands.add(createCommand("ChangeForegroundColor", nodeFigure.eResource(), new Runnable() {

				public void run() {
					figureForegroundRGBColor.setBlue(pickedColor.blue);
					figureForegroundRGBColor.setGreen(pickedColor.green);
					figureForegroundRGBColor.setRed(pickedColor.red);
				}
			}));

			executeAsCompositeCommand("ChangeForegroundColor", commands);
		}
			

	}
	


    /**
     * @param event -
     *            selection event
     * @param button -
     *            event source
     * @param propertyId -
     *            id of the property
     * @param commandName -
     *            name of the command
     * @param imageDescriptor -
     *            the image to draw overlay on the button after the new color is
     *            set
     * @return - new RGB color, or null if none selected
     */
    protected RGB pickColor(Button button, int previousColor, RGB defaultColor) {

        ColorPalettePopup popup = new ColorPalettePopup(button.getParent()
            .getShell(), IDialogConstants.BUTTON_BAR_HEIGHT);        
        popup.setPreviousColor(previousColor);
        Rectangle r = button.getBounds();
        Point location = button.getParent().toDisplay(r.x, r.y);
        popup.open(new Point(location.x - r.height/6 ,location.y - 6*r.height ));        

        final RGB selectedColor = popup.getSelectedColor();
        
        if (selectedColor == null && popup.useDefaultColor()) {
            return defaultColor;
        }        

        return selectedColor;

    }

	
    /**
     * @param event -
     *            selection event
     * @param button -
     *            event source
     * @param propertyId -
     *            id of the property
     * @param commandName -
     *            name of the command
     * @param imageDescriptor -
     *            the image to draw overlay on the button after the new color is
     *            set
     * @return - new RGB color, or null if none selected
     */
    protected RGB changeColor(SelectionEvent event, Button button,
            String commandName,
            ImageDescriptor imageDescriptor,
            final RGBColor inputColor, int previousColor) {

        ColorPalettePopup popup = new ColorPalettePopup(button.getParent()
            .getShell(), IDialogConstants.BUTTON_BAR_HEIGHT);        
        popup.setPreviousColor(previousColor);
        Rectangle r = button.getBounds();
        Point location = button.getParent().toDisplay(r.x, r.y);
        popup.open(new Point(location.x, location.y + r.height));        
        if (popup.getSelectedColor() == null && !popup.useDefaultColor()) {
            return null;
        }        
        // selectedColor should be null if we are to use the default color
        final RGB selectedColor = popup.getSelectedColor();

        // Update model in response to user

        List<ICommand> commands = new ArrayList<ICommand>();

        RGB colorToReturn = selectedColor;
        RGB color = selectedColor;
        
       
        color = selectedColor;
//        if (popup.useDefaultColor()) {
//            Object preferredValue = ep.getPreferredValue(feature);
//            if (preferredValue instanceof Integer) {
//                color = FigureUtilities
//                    .integerToRGB((Integer) preferredValue);
//            }
//        }
            
        // If we are using default colors, we want to return the color of the first selected element to be consistent
        if (colorToReturn == null) {
            colorToReturn = color;
        }

        if (color != null) {
            final RGB finalColor = color; // need a final variable
           commands.add(createCommand(commandName, inputColor.eResource(), new Runnable() {

                public void run() {
                	inputColor.setBlue(finalColor.blue);
                	inputColor.setGreen(finalColor.green);
                	inputColor.setRed(finalColor.red);
                }
            }));
        }

       if (!commands.isEmpty()){
	        executeAsCompositeCommand(commandName, commands);
    	    Image overlyedImage = new ColorOverlayImageDescriptor(
            imageDescriptor.getImageData(), color).createImage();
        	disposeImage(button.getImage());
	        button.setImage(overlyedImage);
	    }
        return colorToReturn;
    }
    
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#refresh()
	 */
	public void refresh() {
		if(!isDisposed()){

		executeAsReadAction(new Runnable() {

			public void run() {

                boolean isReadOnly = isReadOnly();

				boolean enableFontWidgets = labelFont!=null && !isReadOnly;
                
                fontFamilyCombo.setEnabled(enableFontWidgets);
				fontSizeCombo.setEnabled(enableFontWidgets);
				fontBoldButton.setEnabled(enableFontWidgets);
				fontItalicButton.setEnabled(enableFontWidgets);
				
				if(labelFont!=null)
				{
					fontFamilyCombo.setText(labelFont.getFaceName());
					fontSizeCombo.setText(Integer.toString(labelFont.getHeight()));
					fontBoldButton.setSelection(labelFont.getStyle()==FontStyle.BOLD_LITERAL);
					fontItalicButton.setSelection(labelFont.getStyle()==FontStyle.ITALIC_LITERAL);
				}else
				{
					fontFamilyCombo.setText("");
					fontSizeCombo.setText("");
					fontBoldButton.setSelection(false);
					fontItalicButton.setSelection(false);
				}
				
				for(Shape shape: shapeFamilyMap.keySet())
					if(nodeFigure.eClass().equals(shape.eClass()))
						shapeFamilyCombo.setText(getFigureLabel(shape));
				
				RGB rgbBackgroundColor = getBackgroungRGBColor();
				RGB rgbForegroundColor = getForegroundRGBColor();
				
				backgroundColorButton.setEnabled(rgbBackgroundColor!=null && !isReadOnly);
				
				if(backgroundColorButton.isEnabled())
				{
					org.eclipse.swt.graphics.Color newButtonColor = new org.eclipse.swt.graphics.Color(null, rgbBackgroundColor);
					
					backgroundColorButton.setBackground(newButtonColor);
					backgroundColorButton.setForeground(newButtonColor);
					
					setButtonImage(backgroundColorButton, rgbBackgroundColor, backgroundColorButton.getDisplay());
					
					backgroundColorButton.setToolTipText(rgbBackgroundColor.toString());
				}
				
				foregroundColorButton.setEnabled(rgbForegroundColor!=null && !isReadOnly);
				
				if(foregroundColorButton.isEnabled())
				{
					org.eclipse.swt.graphics.Color newButtonColor = new org.eclipse.swt.graphics.Color(null, rgbForegroundColor);
					
					foregroundColorButton.setBackground(newButtonColor);
					foregroundColorButton.setForeground(newButtonColor);
					
					setButtonImage(foregroundColorButton, rgbForegroundColor, foregroundColorButton.getDisplay());
					
					foregroundColorButton.setToolTipText(rgbForegroundColor.toString());
				}

			}
		});
		}

	}

	/**
	 * Sets the image for a color button (square filled with the color that
	 * button represents)
	 */
	protected void setButtonImage(Button btn, RGB rgbColor, Display display) {
		// First, dispose the current image, if any
        Image image = btn.getImage();
        if (image != null) {
        	image.dispose();
        }
		// Now set the new image based on rgbColor
        org.eclipse.swt.graphics.Color color1 = new org.eclipse.swt.graphics.Color(display, rgbColor);
		image = new Image(display, 80, 16);
		GC gc = new GC(image);
		gc.setBackground(color1);
		Rectangle rect = image.getBounds();
		gc.fillRectangle(rect);
		gc.setForeground(display.getSystemColor(SWT.COLOR_BLACK));		
		gc.drawRectangle(rect.x, rect.y, rect.width - 1, rect.height - 1);
		gc.dispose();		
		color1.dispose();
		btn.setImage(image);
	}
	
	/**
	 * Update if nessesary, upon receiving the model event. This event will only
	 * be processed when the reciever is visible (the default behavior is not to
	 * listen to the model events while not showing). Therefore it is safe to
	 * refresh the UI. Sublclasses, which will choose to override event
	 * listening behavior should take into account that the model events are
	 * sent all the time - regardless of the section visibility. Thus special
	 * care should be taken by the section that will choose to listen to such
	 * events all the time. Also, the default implementation of this method
	 * synchronizes on the GUI thread. The subclasses that overwrite it should
	 * do the same if they perform any GUI work (because events may be sent from
	 * a non-GUI thread).
	 * 
	 * @see #aboutToBeShown()
	 * @see #aboutToBeHidden()
	 * 
	 * @param notification
	 *            notification object
	 * @param element
	 *            element that has changed
	 */
	public void update(final Notification notification, final EObject element) {
		if (!isDisposed() && isCurrentSelection(notification, element)) {
			postUpdateRequest(new Runnable() {

				public void run() {
					if (!isDisposed()
						&& isCurrentSelection(notification, element)
						&& !isNotifierDeleted(notification))
						//updateColorCache();
					refresh();

				}
			});
		}
	}

    
//	/**
//	 * react to selection or model change - updatye local cache
//	 */
//	protected void updateColorCache() {
//
//		executeAsReadAction(new Runnable() {
//
//			public void run() {
//
//				if(nodeFigure!=null)
//				{
//					Color figureBackgroundColor = nodeFigure!=null?nodeFigure.getBackgroundColor():null;
//					Color figureForegroundColor = nodeFigure!=null?nodeFigure.getForegroundColor():null;
//					
//					figureBackgroundRGBColor = figureBackgroundColor instanceof RGBColor ? (RGBColor)figureBackgroundColor:null;
//					figureForegroundRGBColor = figureForegroundColor instanceof RGBColor ? (RGBColor)figureForegroundColor:null;
//
//					if (figureBackgroundRGBColor != null)
//						rgbBackgroundColor = new RGB(figureBackgroundRGBColor.getRed(),figureBackgroundRGBColor.getGreen(), figureBackgroundRGBColor.getBlue());
//					
//					if (figureForegroundRGBColor != null)
//						rgbForegroundColor = new RGB(figureForegroundRGBColor.getRed(),figureForegroundRGBColor.getGreen(), figureForegroundRGBColor.getBlue());
//
//				}
//
//			}
//		});
//
//	}
    
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.views.properties.tabbed.ISection#setInput(org.eclipse.ui.IWorkbenchPart,
	 *      org.eclipse.jface.viewers.ISelection)
	 */
	public void setInput(IWorkbenchPart part, ISelection selection) {
		super.setInput(part, selection);
		
		nodeFigure = ((SimpleMappingElementWithFigure)getEObject()).getNodeFigure();
		
		shapeFamilyMap = new HashMap<Shape, Integer>();
		
		List<Object> childClasses = new ArrayList<Object>();
		
		shapeFamilyCombo.removeAll();
		
		for(Object childDescriptor:getEditingDomain().getNewChildDescriptors(null, nodeFigure))
			if(childDescriptor instanceof CommandParameter)
				childClasses.add(((CommandParameter)childDescriptor).getValue());
		
		Collection<Object> figures = EcoreUtil.getObjectsByType(childClasses, GMFGraphPackage.eINSTANCE.getShape());
		
		int i=0;
		
		for(Object figure:figures)
		{
			shapeFamilyMap.put(((Shape)figure), i++);
			shapeFamilyCombo.add(getFigureLabel(figure));
		}
			
		Figure labelFigure = ((SimpleMappingElementWithFigure)getEObject()).getLabelFigure();
		
		labelFont = (labelFigure!=null && labelFigure.getFont() instanceof BasicFont)?(BasicFont)labelFigure.getFont():null; 
		
		if(getEObject() instanceof SimpleCompartment)
		{
			defaultBackgroundColor = DEFAULT_COMPARTMENT_BACKGROUND;
			defaultForegroundColor = DEFAULT_COMPARTMENT_FOREGROUND;
		}else
		{
			defaultBackgroundColor = DEFAULT_TOP_NODE_BACKGROUND;
			defaultForegroundColor = DEFAULT_TOP_NODE_FOREGROUND;
		}
		
		//updateColorCache();
	}
	
	/**
	 * @generated
	 */
	public String getFigureLabel(Object item) {
		IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory
				.adapt(item, IItemLabelProvider.class);
		if (labelProvider != null) {
			return labelProvider.getText(item);
		}
		return null;
	}
	
    /**
     * Dispose the image if it was created locally to avoid a leak. Do not
     * dispose the images in the registry.
     * 
     * @param image
     */
    protected void disposeImage(Image image) {
        if (image == null) {
            return;
        }
        
        if (image.equals(DiagramUIPropertiesImages
            .get(DiagramUIPropertiesImages.IMG_FILL_COLOR)))
        {
            return;
        }

        if (! image.isDisposed()) {
            image.dispose();
        }
    }

    public void dispose() {
        if (backgroundColorButton != null && ! backgroundColorButton.isDisposed()) {
            disposeImage(backgroundColorButton.getImage());
        }
        
        if (foregroundColorButton != null && ! foregroundColorButton.isDisposed()) {
            disposeImage(foregroundColorButton.getImage());
        }
        
		if(shapeFamilyCombo!=null)
			shapeFamilyCombo.dispose();
        
		if(fontFamilyCombo!=null)
			fontFamilyCombo.dispose();
		
		if(fontSizeCombo!=null)
			fontSizeCombo.dispose();
		
		if(fontBoldButton!=null)
			fontBoldButton.dispose();
		
		if(fontItalicButton!=null)
			fontItalicButton.dispose();
		

        
        super.dispose();
    }
    
	
	private RGB getBackgroungRGBColor()
	{
		final RGBColor figureBackgroundRGBColor = nodeFigure.getBackgroundColor() instanceof RGBColor ? (RGBColor)nodeFigure.getBackgroundColor():null;

		RGB rgbBackgroundColor = null;
		
		if (figureBackgroundRGBColor != null)
			rgbBackgroundColor = new RGB(figureBackgroundRGBColor.getRed(),figureBackgroundRGBColor.getGreen(), figureBackgroundRGBColor.getBlue());

		return rgbBackgroundColor;
	}
	
	private RGB getForegroundRGBColor()
	{
		final RGBColor figureForegroundRGBColor = nodeFigure.getForegroundColor() instanceof RGBColor ? (RGBColor)nodeFigure.getForegroundColor():null;

		RGB rgbForegroundColor = null;
		
		if (figureForegroundRGBColor != null)
			rgbForegroundColor = new RGB(figureForegroundRGBColor.getRed(),figureForegroundRGBColor.getGreen(), figureForegroundRGBColor.getBlue());

		return rgbForegroundColor;
	}
	

}
