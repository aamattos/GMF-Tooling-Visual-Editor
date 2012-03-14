package org.msl.simple.gmfmap.simplemappings.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.msl.simple.gmfmap.simplemappings.diagram.providers.SimplemapElementTypes;

/**
 * @generated
 */
public class SimplemapPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createSimplemappings1Group());
	}

	/**
	 * Creates "simplemappings" palette tool group
	 * @generated
	 */
	private PaletteContainer createSimplemappings1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Simplemappings1Group_title);
		paletteContainer.setId("createSimplemappings1Group"); //$NON-NLS-1$
		paletteContainer.add(createTopNode1CreationTool());
		paletteContainer.add(createCompartment2CreationTool());
		paletteContainer.add(createLabelNode3CreationTool());
		paletteContainer.add(createSubNode4CreationTool());
		paletteContainer.add(createParentNode5CreationTool());
		paletteContainer.add(createLinkMapping6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated not
	 */
	private ToolEntry createTopNode1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.TopNode1CreationTool_title,
				Messages.TopNode1CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleTopNode_2003));
		entry.setId("createTopNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapDiagramEditorPlugin
				.getBundledImageDescriptor("icons/obj16/SimpleTopNodePalette.gif"));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompartment2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimplemapElementTypes.SimpleCompartment_3005);
		types.add(SimplemapElementTypes.SimpleCompartment_3019);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Compartment2CreationTool_title,
				Messages.Compartment2CreationTool_desc, types);
		entry.setId("createCompartment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleCompartment_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated not
	 */
	private ToolEntry createLabelNode3CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(SimplemapElementTypes.SimpleLabelNode_3004);
		types.add(SimplemapElementTypes.SimpleLabelNode_3007);
		types.add(SimplemapElementTypes.SimpleLabelNode_3018);
		types.add(SimplemapElementTypes.SimpleLabelNode_3013);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LabelNode3CreationTool_title,
				Messages.LabelNode3CreationTool_desc, types);
		entry.setId("createLabelNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapDiagramEditorPlugin
				.getBundledImageDescriptor("icons/obj16/SimpleLabelNodeC.gif"));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubNode4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(SimplemapElementTypes.SimpleSubNodeReference_3011);
		types.add(SimplemapElementTypes.SimpleSubNodeReference_3012);
		types.add(SimplemapElementTypes.SimpleSubNode_2006);
		types.add(SimplemapElementTypes.SimpleSubNodeReference_3016);
		types.add(SimplemapElementTypes.SimpleSubNodeReference_3020);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.SubNode4CreationTool_title,
				Messages.SubNode4CreationTool_desc, types);
		entry.setId("createSubNode4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleSubNodeReference_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createParentNode5CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ParentNode5CreationTool_title,
				Messages.ParentNode5CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleSubNodeParentRootNode_4003));
		entry.setId("createParentNode5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapDiagramEditorPlugin
				.findImageDescriptor("/org.msl.simple.gmfmap.model.edit/icons/full/obj16/ParentNode.gif")); //$NON-NLS-1$
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkMapping6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LinkMapping6CreationTool_title,
				Messages.LinkMapping6CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleLinkMapping_2007));
		entry.setId("createLinkMapping6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleLinkMapping_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
