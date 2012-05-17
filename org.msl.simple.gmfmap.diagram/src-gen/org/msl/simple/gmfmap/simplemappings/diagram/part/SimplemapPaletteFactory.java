package org.msl.simple.gmfmap.simplemappings.diagram.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
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
		paletteContainer.add(createNode1CreationTool());
		paletteContainer.add(createCompartment2CreationTool());
		paletteContainer.add(createLabelNode3CreationTool());
		paletteContainer.add(createLinkMapping4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNode1CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(SimplemapElementTypes.SimpleTopNode_1001);
		types.add(SimplemapElementTypes.SimpleSubNodeReference_2003);
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Node1CreationTool_title,
				Messages.Node1CreationTool_desc, types);
		entry.setId("createNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleTopNode_1001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompartment2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Compartment2CreationTool_title,
				Messages.Compartment2CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleCompartment_2002));
		entry.setId("createCompartment2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleCompartment_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLabelNode3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LabelNode3CreationTool_title,
				Messages.LabelNode3CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleLabelNode_2001));
		entry.setId("createLabelNode3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleLabelNode_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinkMapping4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.LinkMapping4CreationTool_title,
				Messages.LinkMapping4CreationTool_desc,
				Collections
						.singletonList(SimplemapElementTypes.SimpleLinkMapping_1002));
		entry.setId("createLinkMapping4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(SimplemapElementTypes
				.getImageDescriptor(SimplemapElementTypes.SimpleLinkMapping_1002));
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
}
