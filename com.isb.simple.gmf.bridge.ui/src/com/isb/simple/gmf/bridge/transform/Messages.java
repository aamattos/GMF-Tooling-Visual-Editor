package com.isb.simple.gmf.bridge.transform;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "com.isb.simple.gmf.bridge.transform.messages"; //$NON-NLS-1$

	public static String GenModelConfigurationPage_btn_create_default;

	public static String GenModelConfigurationPage_btn_new_wizard;

	public static String GenModelConfigurationPage_btn_refresh_stale;

	public static String GenModelDetector_e_no_genmodelaccess;

	public static String GenModelDetector_e_not_found;

	public static String GenModelDetector_e_save;

	public static String GMFGenNewFileCreationPage_e_filename;

	public static String MapModelDiagnosticPage_btn_ignore_text;

	public static String StaleGenModelDetector_stale;

	public static String TransformToGenModelOperation_e_generator_creation;

	public static String TransformToGenModelOperation_e_genmodel_load;

	public static String TransformToGenModelOperation_e_genmodel_load_cancelled;

	public static String TransformToGenModelOperation_e_load_mapping_model;

	public static String TransformToGenModelOperation_e_map_load_cancelled;

	public static String TransformToGenModelOperation_e_mapping_invalid;

	public static String TransformToGenModelOperation_e_null_gmfgen_uri;

	public static String TransformToGenModelOperation_e_null_map_uri;

	public static String TransformToGenModelOperation_e_null_mapping;

	public static String TransformToGenModelOperation_e_wrong_root_element;

	public static String TransformToGenModelOperation_task_detect;

	public static String TransformToGenModelOperation_task_generate;

	public static String TransformToGenModelOperation_task_load;

	public static String TransformToGenModelOperation_task_reconcile;

	public static String TransformToGenModelOperation_task_save;

	public static String TransformToGenModelOperation_task_validate;

	public static String TransformToGenModelWizard_descr_genmodel;

	public static String TransformToGenModelWizard_descr_gmfgen;

	public static String TransformToGenModelWizard_descr_mapdiagnostic;

	public static String TransformToGenModelWizard_descr_mapmodel;

	public static String TransformToGenModelWizard_descr_options;

	public static String TransformToGenModelWizard_e_operation_cancelled;

	public static String TransformToGenModelWizard_title_genmodel;

	public static String TransformToGenModelWizard_title_gmfgen;

	public static String TransformToGenModelWizard_title_mapdiagnostic;

	public static String TransformToGenModelWizard_title_mapmodel;

	public static String TransformToGenModelWizard_title_options;

	public static String TransformToGenModelWizard_title_wizard;

	public static String TransformToGenModelWizard_descr_gmfgendiagnostic;

	public static String TransformToGenModelWizard_title_gmfgendiagnostic;

	public static String ValidationHelper_e_marker_creation;

	public static String ValidationHelper_task_validate;

	public static String ViewmapProducerWizardPage_btn_mapmode;

	public static String ViewmapProducerWizardPage_btn_rcp;

	public static String ViewmapProducerWizardPage_btn_runtime;

	public static String ViewmapProducerWizardPage_i_not_recommended;
	
	//XXX: remove after fix of https://bugs.eclipse.org/bugs/show_bug.cgi?id=172000
	public static String ResourceGroup_nameExists;
	public static String ResourceGroup_folderEmpty;
	public static String ResourceGroup_noProject;
	public static String ResourceGroup_emptyName;
	public static String ResourceGroup_invalidFilename;
	public static String ResourceGroup_pathOccupied;
	public static String WizardNewFileCreationPage_file;

	
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
		//
	}
}

