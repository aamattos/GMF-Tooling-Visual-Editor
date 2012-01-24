package org.msl.simple.gmfmap.model.triggers;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AbstractOverrideableCommand;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.gmfgraph.ChildAccess;
import org.eclipse.gmf.gmfgraph.Compartment;
import org.eclipse.gmf.gmfgraph.DiagramElement;
import org.eclipse.gmf.gmfgraph.DiagramLabel;
import org.eclipse.gmf.gmfgraph.FigureDescriptor;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.gmfgraph.Identity;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.tooldef.AbstractTool;
import org.eclipse.gmf.tooldef.ToolContainer;

/**
 * Trigger abstracto con un RecordingCommand interno que se encarga de grabar las modificaciones hechas por el comando
 * y del undo y el redo
 * Todos los triggers que precisen de undo/redo deberian extender esta clase
 * @author xIS05655
 *
 */
public abstract class AbstractTrigger extends AbstractOverrideableCommand {

	private RecordingCommand internalCommand;
	
	public AbstractTrigger(TransactionalEditingDomain domain) {
		super(domain);
		
		internalCommand = new RecordingCommand(domain) {
			@Override
			protected void doExecute() {
				try
				{
					executeTrigger();	
				}catch(Exception exc)
				{
					exc.printStackTrace();
				}
				
			}
		};
	}
	
	@Override
	public final void doExecute() {
		internalCommand.execute();
	}

	public abstract void executeTrigger();

	@Override
	public final void doRedo() {
		internalCommand.redo();		
	}

	@Override
	public final void doUndo() {
		internalCommand.undo();
	}

	@Override
	/**
	 * Sobreescribir si se quiere evitar la ejecución en determinados casos
	 */
	protected boolean prepare() {
		return true;
	}
	
	/**
	 * Devuelve true si solo tiene una referencia
	 * @param element
	 * @return
	 */
	protected boolean canRemove(EObject element)
	{
		return findReferencingElements(element).size()==1;
	}
	
	/**
	 * Devuelve true si solo tiene una referencia
	 * @param element
	 * @return
	 */
	protected boolean canRename(EObject element)
	{
		return findReferencingElements(element).size()==1;
	}

	
	private List<EObject> findReferencingElements(EObject element)
	{
		EClass elementType = GMFGraphPackage.eINSTANCE.getDiagramElement();
		
		if(element instanceof DiagramElement || element instanceof AbstractTool)
			elementType = GMFMapPackage.eINSTANCE.getMappingEntry();

		if(element instanceof DiagramLabel)
			elementType = GMFMapPackage.eINSTANCE.getLabelMapping();
		
		if(element instanceof Compartment)
			elementType = GMFMapPackage.eINSTANCE.getCompartmentMapping();

		if(element instanceof ChildAccess || element instanceof FigureDescriptor)
			elementType = GMFGraphPackage.eINSTANCE.getDiagramElement();	
		
		return findReferencingElements(element, elementType);
	}

		
	private List<EObject> findReferencingElements(EObject element, EClass elementType)
	{
		List<EObject> referencingElements = new ArrayList<EObject>();
		
		for(Setting setting: EcoreUtil.UsageCrossReferencer.find(element, domain.getResourceSet()))
			if(elementType.isSuperTypeOf(setting.getEObject().eClass()) && !referencingElements.contains(setting.getEObject()))
				referencingElements.add(setting.getEObject());
		
		return referencingElements;
	}
	
	
	protected String getNewCanvasElementName(String baseName, Identity elementToRename)
	{
		String newName = baseName;
		
		int i = 2;
		
		while(nameCollides(elementToRename, newName))
			newName = newName + i++;
		
		return newName;
	}
	

	protected String getNewToolName(String baseName, AbstractTool toolToRename)
	{
		String newName = baseName;
		
		int i = 2;
		
		while(nameCollides(toolToRename, newName))
			newName = newName + i++;
		
		return newName;
	}
	
	protected boolean nameCollides(Identity myElement, String baseName)
	{
		EObject elementContainer = myElement.eContainer();
		
		for(EObject child:elementContainer.eContents())
			if(child instanceof Identity)
			{
				Identity element = (Identity)child;
				if(element!=myElement && 
						element.getName()!=null && 
						element.getName().equals(baseName))
					return true;
			}
		
		return false;
	}
	
	protected boolean nameCollides(AbstractTool myTool, String baseName)
	{
		List<AbstractTool> tools = ((ToolContainer)myTool.eContainer()).getTools();
		
		for(AbstractTool tool:tools)
			if(tool!=myTool && tool.getTitle()!=null && tool.getTitle().equals(baseName))
				return true;
		
		return false;
	}

}
