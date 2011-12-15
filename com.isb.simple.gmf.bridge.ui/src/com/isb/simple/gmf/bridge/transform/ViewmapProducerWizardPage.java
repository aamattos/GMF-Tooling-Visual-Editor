package com.isb.simple.gmf.bridge.transform;

import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.ExpandBar;
import org.eclipse.swt.widgets.ExpandItem;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

/*
 * XXX: duplicates functionality of org.eclipse.gmf.internal.graphdef.codegen.ui.FigureGeneratorOptionsDialog
 */
class ViewmapProducerWizardPage extends WizardPage {

	private boolean myInitingControls;
    private Button generateRCPButton;
    private Button useMapModeButton;
    private Button useRuntimeFiguresButton;
	private Text templatesPathText;
	private Text qvtoFileControl;
	private Text preReconcileTranfsormText;
	private Text postReconcileTranfsormText;
	private Button radioDGMT;
	private Button radioQVT;
	private Button preReconcileTransformBtn;
	private Button postReconcileTransformBtn;
	private ExpandItem myTemplatePathItem;
	private ExpandItem myTransformsItem;

	protected ViewmapProducerWizardPage(String pageName) {
		super(pageName);
		setTitle(Messages.TransformToGenModelWizard_title_options);
		setDescription(Messages.TransformToGenModelWizard_descr_options);
	}
	
	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout());
		createControls(composite);

		setControl(composite);
		Dialog.applyDialogFont(composite);
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			initControls();
			validatePage();
		}
	}

	private void createControls(Composite result) {
        useMapModeButton = new Button(result, SWT.CHECK);
        useMapModeButton.setText(Messages.ViewmapProducerWizardPage_btn_mapmode);
        useMapModeButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        useRuntimeFiguresButton = new Button(result, SWT.CHECK);
        useRuntimeFiguresButton.setText(Messages.ViewmapProducerWizardPage_btn_runtime);
        useRuntimeFiguresButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        generateRCPButton = new Button(result, SWT.CHECK);
        generateRCPButton.setText(Messages.ViewmapProducerWizardPage_btn_rcp);
        generateRCPButton.setLayoutData(new GridData(GridData.HORIZONTAL_ALIGN_BEGINNING | GridData.VERTICAL_ALIGN_CENTER));
        SelectionListener selectionListener = new SelectionListener() {
        	public void widgetDefaultSelected(SelectionEvent e) {
        		widgetSelected(e);
        	}

			public void widgetSelected(SelectionEvent e) {
				if (generateRCPButton == e.widget) {
					getOperation().getOptions().setGenerateRCP(generateRCPButton.getSelection());
				} else if (useMapModeButton == e.widget) {
					getOperation().getOptions().setUseMapMode(useMapModeButton.getSelection());
				} else if (useRuntimeFiguresButton == e.widget) {
					getOperation().getOptions().setUseRuntimeFigures(useRuntimeFiguresButton.getSelection());
				}
				validatePage();
			}
		};
        useMapModeButton.addSelectionListener(selectionListener);
        useRuntimeFiguresButton.addSelectionListener(selectionListener);
        generateRCPButton.addSelectionListener(selectionListener);
        createAdvancedControls(result);
        Composite glue = new Composite(result, SWT.NONE);
        glue.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
	}

	private void createAdvancedControls(Composite result) {
		Group parent = new Group(result, SWT.SHADOW_ETCHED_IN);
		parent.setText("Provisional");
		parent.setLayout(new FillLayout());
		parent.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		ExpandBar c = new ExpandBar(parent, SWT.NONE);
		c.setBackground(parent.getBackground());
        templatesPathText = new Text(c, SWT.SINGLE | SWT.BORDER);
		Listener modifyListener = new Listener() {
			public void handleEvent(Event event) {
				validatePage();
			}
		};
		templatesPathText.addListener(SWT.Modify, modifyListener);
        myTemplatePathItem = new ExpandItem(c, SWT.NONE, 0);
        myTemplatePathItem.setText("GMFGraph dynamic templates");
		myTemplatePathItem.setHeight(templatesPathText.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		myTemplatePathItem.setControl(templatesPathText);
		//
		Composite map2genControls = new Composite(c, SWT.NONE);
		map2genControls.setLayout(new FillLayout(SWT.VERTICAL));
		radioDGMT = new Button(map2genControls, SWT.RADIO);
		radioDGMT.setText("Use Java transformation");
		radioQVT = new Button(map2genControls, SWT.RADIO);
		radioQVT.setText("Use QVTO transformation");
		qvtoFileControl = new Text(map2genControls, SWT.SINGLE | SWT.BORDER);
		qvtoFileControl.addListener(SWT.Modify, modifyListener);
		class EnablementListener implements Listener {
			private final Button myControl;
			private final Control myTarget;
			public EnablementListener(Button control, Control target) {
				assert control != null && target != null;
				myControl = control;
				myTarget = target;
			}
			public void handleEvent(Event event) {
				myTarget.setEnabled(myControl.getSelection());
			}
			
		};
		EnablementListener l = new EnablementListener(radioQVT, qvtoFileControl);
		radioDGMT.addListener(SWT.Selection, l);
		radioQVT.addListener(SWT.Selection, l);
		preReconcileTransformBtn = new Button(map2genControls, SWT.CHECK);
		preReconcileTransformBtn.setText("Extra in-place gmfgen transformation before a reconcile step");
		preReconcileTranfsormText = new Text(map2genControls, SWT.SINGLE | SWT.BORDER);
		postReconcileTransformBtn = new Button(map2genControls, SWT.CHECK);
		postReconcileTransformBtn.setText("Extra in-place gmfgen transformation after a reconcile step");
		postReconcileTranfsormText = new Text(map2genControls, SWT.SINGLE | SWT.BORDER);
		preReconcileTransformBtn.addListener(SWT.Selection, new EnablementListener(preReconcileTransformBtn, preReconcileTranfsormText));
		postReconcileTransformBtn.addListener(SWT.Selection, new EnablementListener(postReconcileTransformBtn, postReconcileTranfsormText));
		preReconcileTranfsormText.addListener(SWT.Modify, modifyListener);
		postReconcileTranfsormText.addListener(SWT.Modify, modifyListener);
		String hint = "Transformation should take single inout parameter of GMFGen model type, e.g.\n\nmodeltype GMFGEN uses gmfgen('http://www.eclipse.org/gmf/2009/GenModel');\n\ntransformation %s(inout gmfgenModel : GMFGEN);\n\n main() {...}";
		preReconcileTranfsormText.setToolTipText(String.format(hint, "PreReconcile"));
		postReconcileTranfsormText.setToolTipText(String.format(hint, "PostReconcile"));
		myTransformsItem = new ExpandItem(c, SWT.NONE, 1);
		myTransformsItem.setText("Map to Gen transformation");
		myTransformsItem.setHeight(map2genControls.computeSize(SWT.DEFAULT, SWT.DEFAULT).y);
		myTransformsItem.setControl(map2genControls);
		//
	}
	
	void validatePage() {
		if (myInitingControls) {
			return;
		}
		setStatus(Status.OK_STATUS);
		boolean hasLite = TransformOptions.checkLiteOptionPresent();
		if (hasLite) {
			if (!useRuntimeFiguresButton.getSelection() && useMapModeButton.getSelection()) {
				setStatus(Plugin.createInfo(Messages.ViewmapProducerWizardPage_i_not_recommended));
			}
		}
		TransformOptions options = getOperation().getOptions();
		// safe to set option value now as they get flushed into storage only on Wizard.performFinish
		options.setFigureTemplatesPath(checkTextFieldURI(templatesPathText));
		options.setTransformation(checkTextFieldURI(qvtoFileControl));
		options.setPreReconcileTransform(checkTextFieldURI(preReconcileTranfsormText));
		options.setPostReconcileTransform(checkTextFieldURI(postReconcileTranfsormText));
	}

	private URL checkTextFieldURI(Text widget) {
		if (!widget.isEnabled()) {
			return null;
		}
		if (widget.getText().trim().length() > 0) {
			try {
				return new URL(guessAndResolvePathURL(widget.getText().trim()));
			} catch (MalformedURLException ex) {
				setStatus(Plugin.createWarning(ex.getMessage()));
			}
		}
		return null;
	}

	private void initControls() {
		myInitingControls = true;
		try {
			TransformOptions options = getOperation().getOptions();
			generateRCPButton.setSelection(options.getGenerateRCP());
			useRuntimeFiguresButton.setSelection(options.getUseRuntimeFigures());
			useMapModeButton.setSelection(options.getUseMapMode());
			if (null != options.getFigureTemplatesPath()) {
				templatesPathText.setText(options.getFigureTemplatesPath().toString());
				// reveal the value to avoid confusion.
				// FIXME extract expand bar with template path as separate control and
				// move expand logic there (based on setInitialValue event
				myTemplatePathItem.setExpanded(true);
			}
	
			radioDGMT.setSelection(options.getMainTransformation() == null);
			radioQVT.setSelection(!radioDGMT.getSelection());
			qvtoFileControl.setEnabled(radioQVT.getSelection());
			qvtoFileControl.setText(options.getMainTransformation() != null ? options.getMainTransformation().toString() : ""); //$NON-NLS-1$
			preReconcileTransformBtn.setSelection(options.getPreReconcileTransform() != null);
			preReconcileTranfsormText.setEnabled(preReconcileTransformBtn.getSelection());
			preReconcileTranfsormText.setText(options.getPreReconcileTransform() != null ? options.getPreReconcileTransform().toString() : ""); //$NON-NLS-1$
			postReconcileTransformBtn.setSelection(options.getPostReconcileTransform() != null);
			postReconcileTranfsormText.setEnabled(postReconcileTransformBtn.getSelection());
			postReconcileTranfsormText.setText(options.getPostReconcileTransform() != null ? options.getPostReconcileTransform().toString() : ""); //$NON-NLS-1$
			if (radioQVT.getSelection() || preReconcileTransformBtn.getSelection() || postReconcileTransformBtn.getSelection()) {
				myTransformsItem.setExpanded(true);
			}
		} finally {
			myInitingControls = false;
		}
	}

	private SimpleTransformToGenModelOperation getOperation() {
		return ((TransformToGenModelWizard) getWizard()).getTransformOperation();
	}

	private void setStatus(IStatus s) {
		if (s.isOK()) {
			setMessage(null);
			setPageComplete(true);
		} else {
    		setMessage(s.getMessage(), IMessageProvider.INFORMATION);
			setPageComplete(s.getSeverity() < IStatus.WARNING);
		}
	}

	private static String guessAndResolvePathURL(String path) {
		assert path != null;
		if (path.indexOf(':') == -1) {
			try {
				URI templatesURI = URI.createPlatformResourceURI(path, true);
				return templatesURI.toString();
			} catch (IllegalArgumentException ex) {
				// IGNORE. URI#validate throws IAE if path is incorrect, e.g. once user typed in "platform:" - opaquePart is illegal
			}
		}
		return path;
	}
}
