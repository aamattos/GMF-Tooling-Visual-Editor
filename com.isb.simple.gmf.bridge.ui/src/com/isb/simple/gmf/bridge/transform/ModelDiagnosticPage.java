package com.isb.simple.gmf.bridge.transform;

import org.eclipse.emf.common.ui.DiagnosticComposite;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;


abstract class ModelDiagnosticPage extends WizardPage {
	
	private DiagnosticComposite myDiagnosticComposite;
	private Button myIgnoreButton;


	ModelDiagnosticPage(String pageName) {
		super(pageName);
	}

	void applyValidation() {
		boolean ignore = myIgnoreButton.getSelection();
		setIgnoreOption(ignore);
		setPageComplete(ignore);
	}

	public void createControl(Composite parent) {
		Composite plate = new Composite(parent, SWT.NONE);
		{
			GridLayout layout = new GridLayout();
			plate.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			plate.setLayoutData(data);
		}
		createDiagnosticComposite(plate);
		createIgnoreButton(plate);
		setControl(plate);

	}

	private void createDiagnosticComposite(Composite parent) {
		myDiagnosticComposite = new DiagnosticComposite(parent, SWT.NONE);
		myDiagnosticComposite.initialize(null);
		myDiagnosticComposite.setShowRootDiagnostic(true);
		myDiagnosticComposite.setSeverityMask(Diagnostic.ERROR);
		GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
		myDiagnosticComposite.setLayoutData(data);
	}
	
	private void createIgnoreButton(Composite parent) {
		myIgnoreButton = new Button(parent, SWT.CHECK);
		myIgnoreButton.setText(Messages.MapModelDiagnosticPage_btn_ignore_text);
		setButtonLayoutData(myIgnoreButton);
		myIgnoreButton.addSelectionListener(new SelectionAdapter(){
			
			@Override
			public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
				applyValidation();
			}
			
		});
	}

	protected abstract boolean getIgnoreOption();

	protected SimpleTransformToGenModelOperation getOperation() {
		TransformToGenModelWizard wizard = (TransformToGenModelWizard) getWizard();
		return wizard.getTransformOperation();
	}
	
	protected abstract Diagnostic getValidationResult();

	private void initControls() {
		Diagnostic diagnostic = getValidationResult();
		myDiagnosticComposite.setDiagnostic(diagnostic);
		boolean ignore = getIgnoreOption();
		myIgnoreButton.setSelection(ignore);
		setPageComplete(ignore);
	}

	protected abstract void setIgnoreOption(boolean ignore);

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			initControls();
		}
		super.setVisible(visible);
	}
	
}
