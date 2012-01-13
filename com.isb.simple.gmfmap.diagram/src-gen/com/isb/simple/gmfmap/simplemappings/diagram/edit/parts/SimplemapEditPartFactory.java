package com.isb.simple.gmfmap.simplemappings.diagram.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;

import com.isb.simple.gmfmap.simplemappings.diagram.part.SimplemapVisualIDRegistry;

/**
 * @generated
 */
public class SimplemapEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SimplemapVisualIDRegistry.getVisualID(view)) {

			case SimpleMappingEditPart.VISUAL_ID:
				return new SimpleMappingEditPart(view);

			case SimpleTopNodeEditPart.VISUAL_ID:
				return new SimpleTopNodeEditPart(view);

			case SimpleTopNodeNameEditPart.VISUAL_ID:
				return new SimpleTopNodeNameEditPart(view);

			case SimpleSubNodeEditPart.VISUAL_ID:
				return new SimpleSubNodeEditPart(view);

			case SimpleSubNodeNameEditPart.VISUAL_ID:
				return new SimpleSubNodeNameEditPart(view);

			case SimpleLinkMappingEditPart.VISUAL_ID:
				return new SimpleLinkMappingEditPart(view);

			case SimpleLinkMappingNameEditPart.VISUAL_ID:
				return new SimpleLinkMappingNameEditPart(view);

			case SimpleLabelNodeEditPart.VISUAL_ID:
				return new SimpleLabelNodeEditPart(view);

			case SimpleCompartmentEditPart.VISUAL_ID:
				return new SimpleCompartmentEditPart(view);

			case SimpleCompartmentNameEditPart.VISUAL_ID:
				return new SimpleCompartmentNameEditPart(view);

			case SimpleLabelNode2EditPart.VISUAL_ID:
				return new SimpleLabelNode2EditPart(view);

			case SimpleSubNodeReferenceEditPart.VISUAL_ID:
				return new SimpleSubNodeReferenceEditPart(view);

			case SimpleSubNodeReference2EditPart.VISUAL_ID:
				return new SimpleSubNodeReference2EditPart(view);

			case SimpleLabelNode4EditPart.VISUAL_ID:
				return new SimpleLabelNode4EditPart(view);

			case SimpleCompartment2EditPart.VISUAL_ID:
				return new SimpleCompartment2EditPart(view);

			case SimpleCompartmentName2EditPart.VISUAL_ID:
				return new SimpleCompartmentName2EditPart(view);

			case SimpleLabelNode3EditPart.VISUAL_ID:
				return new SimpleLabelNode3EditPart(view);

			case SimpleSubNodeReference3EditPart.VISUAL_ID:
				return new SimpleSubNodeReference3EditPart(view);

			case SimpleSubNodeReference4EditPart.VISUAL_ID:
				return new SimpleSubNodeReference4EditPart(view);

			case SimpleSubNodeParentRootNodeEditPart.VISUAL_ID:
				return new SimpleSubNodeParentRootNodeEditPart(view);

			case ParentSubNodeLabelEditPart.VISUAL_ID:
				return new ParentSubNodeLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				if (getWrapLabel().isTextWrapOn()
						&& getWrapLabel().getText().length() > 0) {
					rect.setSize(new Dimension(text.computeSize(rect.width,
							SWT.DEFAULT)));
				} else {
					int avr = FigureUtilities.getFontMetrics(text.getFont())
							.getAverageCharWidth();
					rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
							SWT.DEFAULT)).expand(avr * 2, 0));
				}
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			if (!text.getFont().isDisposed()) {
				int avr = FigureUtilities.getFontMetrics(text.getFont())
						.getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT,
						SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
