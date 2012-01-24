package org.msl.simple.gmf.bridge.transform;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.gmf.mappings.Mapping;


class MapModelConfigurationPage extends ModelConfigurationPage {
	
	MapModelConfigurationPage(String pageId, ResourceLocationProvider rlp, ResourceSet resourceSet) {
		super(pageId, rlp, resourceSet);
		setTitle(Messages.TransformToGenModelWizard_title_mapmodel);
		setDescription(Messages.TransformToGenModelWizard_descr_mapmodel);
		setModelFileExtension("simplemappings"); //$NON-NLS-1$
	}

	@Override
	protected Resource doLoadResource(IProgressMonitor monitor) throws CoreException {
		SimpleTransformToGenModelOperation o = getOperation();
		Mapping mapping = o.loadMappingModel(getURI(), monitor);
		return mapping.eResource();
	}

	SimpleTransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}
	
	@Override
	protected void resourceChanged() {
		super.resourceChanged();
		Diagnostic load = getOperation().getMapmodelValidationResult();
		if (load != null) {
			if ((load.getSeverity() == IStatus.WARNING) || (load.getSeverity() == IStatus.INFO) ) {
				setStatusMessage(SimpleTransformToGenModelOperation.getFirst(load));
			}
		}
	}
}
