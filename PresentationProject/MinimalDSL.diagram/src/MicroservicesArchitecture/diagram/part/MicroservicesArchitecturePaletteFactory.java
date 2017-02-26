
/*
 * 
 */
package MicroservicesArchitecture.diagram.part;

import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class MicroservicesArchitecturePaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				MicroservicesArchitecture.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createDeveloper1CreationTool());
		paletteContainer.add(createInterface2CreationTool());
		paletteContainer.add(createMicroService3CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				MicroservicesArchitecture.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createLink1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createDeveloper1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MicroservicesArchitecture.diagram.part.Messages.Developer1CreationTool_title,
				MicroservicesArchitecture.diagram.part.Messages.Developer1CreationTool_desc, Collections.singletonList(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2002));
		entry.setId("createDeveloper1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.getImageDescriptor(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Developer_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInterface2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001);
		types.add(MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3002);
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MicroservicesArchitecture.diagram.part.Messages.Interface2CreationTool_title,
				MicroservicesArchitecture.diagram.part.Messages.Interface2CreationTool_desc, types);
		entry.setId("createInterface2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.getImageDescriptor(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Interface_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createMicroService3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				MicroservicesArchitecture.diagram.part.Messages.MicroService3CreationTool_title,
				MicroservicesArchitecture.diagram.part.Messages.MicroService3CreationTool_desc,
				Collections.singletonList(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001));
		entry.setId("createMicroService3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.getImageDescriptor(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.MicroService_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createLink1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				MicroservicesArchitecture.diagram.part.Messages.Link1CreationTool_title,
				MicroservicesArchitecture.diagram.part.Messages.Link1CreationTool_desc, Collections.singletonList(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001));
		entry.setId("createLink1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(
				MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.getImageDescriptor(
						MicroservicesArchitecture.diagram.providers.MicroservicesArchitectureElementTypes.Link_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
