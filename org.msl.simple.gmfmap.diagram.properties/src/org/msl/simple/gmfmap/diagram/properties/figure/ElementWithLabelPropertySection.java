package org.msl.simple.gmfmap.diagram.properties.figure;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.Figure;
import org.eclipse.gmf.gmfgraph.FontStyle;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.runtime.diagram.ui.internal.util.FontHelper;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.properties.internal.l10n.DiagramUIPropertiesImages;
import org.eclipse.gmf.runtime.diagram.ui.properties.internal.l10n.DiagramUIPropertiesMessages;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.accessibility.AccessibleAdapter;
import org.eclipse.swt.accessibility.AccessibleEvent;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.msl.simple.gmfmap.diagram.properties.AbstractExtendedPropertiesSection;
import org.msl.simple.gmfmap.simplemappings.SimpleCompartment;
import org.msl.simple.gmfmap.simplemappings.SimpleLabelNode;
import org.msl.simple.gmfmap.simplemappings.SimpleLinkMapping;
import org.msl.simple.gmfmap.simplemappings.SimpleNode;

public abstract class ElementWithLabelPropertySection extends AbstractExtendedPropertiesSection {
	
	protected static final String FONTS_AND_COLORS_LABEL = DiagramUIPropertiesMessages.
		FontAndColor_nameLabel;

	// font family drop down
	protected CCombo fontFamilyCombo;

	// font size drop down
	private CCombo fontSizeCombo;

	private Button fontBoldButton;

	private Button fontItalicButton;
	
	protected Group fontsGroup;

	private DataBindingContext bindingContext = new DataBindingContext();;
	
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
		fontsGroup = getWidgetFactory().createGroup(parent,
			FONTS_AND_COLORS_LABEL);
		GridLayout layout = new GridLayout(1, false);
		fontsGroup.setLayout(layout);

		createFontsGroup(fontsGroup);

		return fontsGroup;

	}
	
	/**
	 * Create  font tool bar group
	 * 
	 * @param parent - parent composite
	 * @return - font tool bar
	 */
	protected Composite createFontsGroup(Composite parent) {
		Composite familySize = getWidgetFactory().createComposite(parent);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = 0;
		layout.verticalSpacing = 0;
		layout.marginHeight = 0;
		layout.marginWidth = 0;
		familySize.setLayout(layout);
		
		
		
		fontFamilyCombo = getWidgetFactory().createCCombo(familySize,
			SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontFamilyCombo.setItems(FontHelper.getFontNames());

		fontSizeCombo = getWidgetFactory().createCCombo(familySize,
			SWT.DROP_DOWN | SWT.READ_ONLY | SWT.BORDER);
		fontSizeCombo.setItems(FontHelper.getFontSizes());

		Composite toolBar = new Composite(parent, SWT.SHADOW_NONE);
		toolBar.setLayout(new GridLayout(7, false));
		toolBar.setBackground(parent.getBackground());

		fontBoldButton = new Button(toolBar, SWT.TOGGLE);
		fontBoldButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_BOLD));
        fontBoldButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontStyle_Bold;
            }
        });
	
		
		fontItalicButton = new Button(toolBar, SWT.TOGGLE );
		fontItalicButton.setImage(DiagramUIPropertiesImages.get(DiagramUIPropertiesImages.IMG_ITALIC));
        fontItalicButton.getAccessible().addAccessibleListener(new AccessibleAdapter() {
            public void getName(AccessibleEvent e) {
                e.result = DiagramUIMessages.PropertyDescriptorFactory_FontStyle_Italic;
            }
        });


		return toolBar;
	}


	protected Figure getLabelFigure(Object transformSelection)
	{
		Figure figure = null;
		
		if(transformSelection instanceof SimpleNode)
		{
			DiagramLabel diagramLabel = ((SimpleNode)transformSelection).getDiagramLabel();
			if(diagramLabel!=null && diagramLabel.getAccessor()!=null)
				figure = diagramLabel.getAccessor().getFigure();
		}
			
		if(transformSelection instanceof SimpleLabelNode)
		{
			figure = ((SimpleNode)transformSelection).getDiagramLabel().getFigure().getActualFigure();
		}

		
		if(transformSelection instanceof SimpleCompartment)
		{
			figure = ((SimpleCompartment)transformSelection).getCompartment().getFigure().getActualFigure();
		}
		
		if(transformSelection instanceof SimpleLinkMapping)
		{
			figure = ((SimpleLinkMapping)transformSelection).getDiagramLabel().getFigure().getActualFigure();

		}
		
		return figure;
	}

	
	
	@Override
	public void dispose() {

		if(bindingContext!=null)
			bindingContext.dispose();

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

	/**
	 * @param object
	 *            The eObject to set.
	 */	
	protected void setEObject(EObject object) {
		this.eObject = object;
		
		bindingContext.bindValue(
				WidgetProperties.selection().observe(fontFamilyCombo),
				EMFProperties.value(GMFGraphPackage.eINSTANCE.getBasicFont_FaceName())
						.observe(eObject));
		
		bindingContext.bindValue(
				WidgetProperties.selection().observe(fontSizeCombo),
				EMFProperties.value(GMFGraphPackage.eINSTANCE.getBasicFont_Height())
						.observe(eObject), new UpdateSizeTargetToModel(), new UpdateSizeModelToTarget());

		bindingContext.bindValue(
				WidgetProperties.selection().observe(fontBoldButton),
				EMFProperties.value(GMFGraphPackage.eINSTANCE.getBasicFont_Style())
						.observe(eObject), new UpdateBoldButtonTargetToModel(), new UpdateBoldButtonModelToTarget());

	}
	
	class UpdateSizeTargetToModel extends UpdateValueStrategy
	{

		@Override
		public Object convert(Object value) {
			// TODO Auto-generated method stub
			return Integer.parseInt((String)value);
		}
		
	}
	
	class UpdateSizeModelToTarget extends UpdateValueStrategy
	{

		@Override
		public Object convert(Object value) {
			// TODO Auto-generated method stub
			return Integer.toString((Integer)value);
		}
		
	}
	
	class UpdateBoldButtonTargetToModel extends UpdateValueStrategy
	{

		@Override
		public Object convert(Object value) {
			boolean isBold = (Boolean)value;
			FontStyle style = isBold? FontStyle.BOLD_LITERAL:FontStyle.NORMAL_LITERAL;
			return style;
		}
		
	}
	
	class UpdateBoldButtonModelToTarget extends UpdateValueStrategy
	{

		@Override
		public Object convert(Object value) {
			return value==FontStyle.BOLD_LITERAL;
		}
		
	}
}
