package org.msl.simple.gmf.bridge.transform;

import org.eclipse.emf.common.util.Diagnostic;


class GMFGenModelDiagnosticPage extends ModelDiagnosticPage {

	GMFGenModelDiagnosticPage(String pageName) {
		super(pageName);
		setTitle(Messages.TransformToGenModelWizard_title_gmfgendiagnostic);
		setDescription(Messages.TransformToGenModelWizard_descr_gmfgendiagnostic);
	}

	@Override
	protected boolean getIgnoreOption() {
		return getOperation().getOptions().getIgnoreGMFGenValidation();
	}

	@Override
	protected Diagnostic getValidationResult() {
		return getOperation().getGMFGenValidationResult();
	}

	@Override
	protected void setIgnoreOption(boolean ignore) {
		getOperation().getOptions().setIgnoreGMFGenValidation(ignore);
	}

}
