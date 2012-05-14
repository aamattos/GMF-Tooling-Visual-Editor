package org.msl.simple.gmfmap.diagram.properties.figure;

import org.eclipse.jface.viewers.IFilter;
import org.msl.simple.gmfmap.diagram.properties.AbstractExtendedPropertiesSection;

/**
 * @generated
 */
public class SimplemapExtendedPropertySection extends AbstractExtendedPropertiesSection implements
	 IFilter {


//	/**
//	 * Modify/unwrap selection.
//	 * @generated
//	 */
//	protected Object transformSelection(Object selected) {
//
//		if (selected instanceof EditPart) {
//			Object model = ((EditPart) selected).getModel();
//			return model instanceof View ? ((View) model).getElement() : null;
//		}
//		if (selected instanceof View) {
//			return ((View) selected).getElement();
//		}
//		if (selected instanceof IAdaptable) {
//			View view = (View) ((IAdaptable) selected).getAdapter(View.class);
//			if (view != null) {
//				return view.getElement();
//			}
//		}
//		return selected;
//	}

//	/**
//	 * @generated
//	 */
//	public void setInput(IWorkbenchPart part, ISelection selection) {
//		if (selection.isEmpty()
//				|| false == selection instanceof StructuredSelection) {
//			super.setInput(part, selection);
//			return;
//		}
//		final StructuredSelection structuredSelection = ((StructuredSelection) selection);
//		ArrayList transformedSelection = new ArrayList(
//				structuredSelection.size());
//		for (Iterator it = structuredSelection.iterator(); it.hasNext();) {
//			Object r = transformSelection(it.next());
//			if (r != null) {
//				transformedSelection.add(r);
//			}
//		}
//		
//		selection = new StructuredSelection(transformedSelection);
//		
//        IEditingDomainProvider provider = (IEditingDomainProvider) part
//                .getAdapter(IEditingDomainProvider.class);
//            if (provider != null) {
//                EditingDomain theEditingDomain = provider.getEditingDomain();
//                if (theEditingDomain instanceof TransactionalEditingDomain) {
//                    setEditingDomain((TransactionalEditingDomain) theEditingDomain);
//                }
//            }
//            
//            // Set the eObject for the section, too. The workbench part may not
//    		// adapt to IEditingDomainProvider, in which case the selected EObject
//    		// will be used to derive the editing domain.
//    		if (!selection.isEmpty() && selection instanceof IStructuredSelection) {
//                Object firstElement = ((IStructuredSelection) selection)
//                    .getFirstElement();
//                
//                if (firstElement != null) {
//    	               setEObject((EObject)firstElement);
//                }
//            }
//		
//	}



//	@Override
//	public boolean select(Object toTest) {
//		
//		return transformSelection(toTest)!=null;
//	}
}
