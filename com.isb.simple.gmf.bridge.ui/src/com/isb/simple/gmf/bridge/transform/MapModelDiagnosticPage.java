package com.isb.simple.gmf.bridge.transform;

import org.eclipse.emf.common.util.Diagnostic;


class MapModelDiagnosticPage extends ModelDiagnosticPage {
	
	MapModelDiagnosticPage(String pageName) {
		super(pageName);
		setTitle(Messages.TransformToGenModelWizard_title_mapdiagnostic);
		setDescription(Messages.TransformToGenModelWizard_descr_mapdiagnostic);
	}

	@Override
	protected boolean getIgnoreOption() {
		return getOperation().getOptions().getIgnoreMapModelValidation();
	}

	@Override
	protected Diagnostic getValidationResult() {
		return getOperation().getMapmodelValidationResult();
	}

	@Override
	protected void setIgnoreOption(boolean ignore) {
		getOperation().getOptions().setIgnoreMapModelValidation(ignore);
	}

}