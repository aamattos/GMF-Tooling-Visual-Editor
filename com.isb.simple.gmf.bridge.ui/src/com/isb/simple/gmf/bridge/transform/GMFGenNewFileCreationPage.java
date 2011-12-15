package com.isb.simple.gmf.bridge.transform;

import java.text.MessageFormat;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.osgi.service.prefs.Preferences;

class GMFGenNewFileCreationPage extends WizardNewFileCreationPage {

	static final String EXT_GMFGEN = "gmfgen"; //$NON-NLS-1$

	private ResourceGroupEmulator resourceGroupEmulator;

	public GMFGenNewFileCreationPage(IStructuredSelection selection) {
		super(GMFGenNewFileCreationPage.class.getSimpleName(), selection);
		setTitle(Messages.TransformToGenModelWizard_title_gmfgen);
		setDescription(Messages.TransformToGenModelWizard_descr_gmfgen);
	}

	@Override
	public void createControl(Composite parent) {
		resourceGroupEmulator = new ResourceGroupEmulator();
		super.createControl(parent);
		validateFileExists();
	}

	protected boolean validatePage() {
		if (emulateValidate()) {
			// Make sure the file ends in ".gmfgen".
			//
			String enteredExt = new Path(getFileName()).getFileExtension();
			if (enteredExt == null || !enteredExt.equals(EXT_GMFGEN)) {
				String pattern = Messages.GMFGenNewFileCreationPage_e_filename;
				setErrorMessage(MessageFormat.format(pattern, new Object[] { EXT_GMFGEN }));
				return false;
			} else {
				validateFileExists();
				// TODO provide an option (prefpage or e.g. CTRL on kbd while wizard starts) whether toolsmith like
				// to keep project-relative settings (for those who hate /project/.settings/ folder, as I do)
				// e.g. Platform.getPreferenceService().getBoolean("oeg.bridge.ui", "transf-settings-per-gmfgen", true, null)
				Preferences contextOptions = new ProjectScope(getModelFile().getProject()).getNode(getFileName());
				((TransformToGenModelWizard) getWizard()).getTransformOperation().getOptions().setContext(contextOptions);
				return true;
			}
		} else {
			return false;
		}
	}

	private void validateFileExists() {
		IPath resourcePath = getContainerFullPath().append(getFileName());
		if (isFileExists(resourcePath)) {
			setMessage(Messages.ResourceGroup_nameExists, IMessageProvider.WARNING);
		}
	}

	public IFile getModelFile() {
		return ResourcesPlugin.getWorkspace().getRoot().getFile(getContainerFullPath().append(getFileName()));
	}

	private boolean emulateValidate() {
		boolean valid = true;

		if (!resourceGroupEmulator.validateControls()) {
			// if blank name then fail silently
			if (resourceGroupEmulator.getProblemType() == ResourceGroupEmulator.PROBLEM_RESOURCE_EMPTY || resourceGroupEmulator.getProblemType() == ResourceGroupEmulator.PROBLEM_CONTAINER_EMPTY) {
				setMessage(resourceGroupEmulator.getProblemMessage());
				setErrorMessage(null);
			} else {
				setErrorMessage(resourceGroupEmulator.getProblemMessage());
			}
			valid = false;
		}

		String resourceName = getFileName();
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IStatus result = workspace.validateName(resourceName, IResource.FILE);
		if (!result.isOK()) {
			setErrorMessage(result.getMessage());
			return false;
		}

		IStatus linkedResourceStatus = null;
		if (valid) {
			linkedResourceStatus = validateLinkedResource();
			if (linkedResourceStatus.getSeverity() == IStatus.ERROR) {
				valid = false;
			}
		}
		// validateLinkedResource sets messages itself
		if (valid && (linkedResourceStatus == null || linkedResourceStatus.isOK())) {
			setMessage(null);
			setErrorMessage(null);
		}
		return valid;
	}

	boolean isFileExists(IPath resourcePath) {
		if (resourcePath == null) {
			return false;
		}
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		return (workspace.getRoot().getFolder(resourcePath).exists() || workspace.getRoot().getFile(resourcePath).exists());
	}

	// XXX: remove after fix of https://bugs.eclipse.org/bugs/show_bug.cgi?id=172000
	private class ResourceGroupEmulator {

		static final int PROBLEM_NONE = 0;

		static final int PROBLEM_RESOURCE_EMPTY = 1;

		static final int PROBLEM_RESOURCE_EXIST = 2;

		static final int PROBLEM_PATH_INVALID = 4;

		static final int PROBLEM_CONTAINER_EMPTY = 5;

		static final int PROBLEM_PROJECT_DOES_NOT_EXIST = 6;

		static final int PROBLEM_NAME_INVALID = 7;

		static final int PROBLEM_PATH_OCCUPIED = 8;

		private boolean allowExistingResources = true;

		private String problemMessage = "";//$NON-NLS-1$

		private int problemType = PROBLEM_NONE;

		ResourceGroupEmulator() {
			// just create
		}

		boolean validateControls() {
			// don't attempt to validate controls until they have been created
			try {
				getFileName();
			} catch (Exception e) {
				return false;
			}
			problemType = PROBLEM_NONE;
			problemMessage = "";//$NON-NLS-1$

			if (!validateContainer() || !validateResourceName()) {
				return false;
			}

			IPath path = getContainerFullPath().append(getFileName());
			return validateFullResourcePath(path);
		}

		private boolean validateContainer() {
			IPath path = getContainerFullPath();
			if (path == null) {
				problemType = PROBLEM_CONTAINER_EMPTY;
				problemMessage = Messages.ResourceGroup_folderEmpty;
				return false;
			}
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			String projectName = path.segment(0);
			if (projectName == null || !workspace.getRoot().getProject(projectName).exists()) {
				problemType = PROBLEM_PROJECT_DOES_NOT_EXIST;
				problemMessage = Messages.ResourceGroup_noProject;
				return false;
			}
			// path is invalid if any prefix is occupied by a file
			IWorkspaceRoot root = workspace.getRoot();
			while (path.segmentCount() > 1) {
				if (root.getFile(path).exists()) {
					problemType = PROBLEM_PATH_OCCUPIED;
					problemMessage = NLS.bind(Messages.ResourceGroup_pathOccupied, path.makeRelative());
					return false;
				}
				path = path.removeLastSegments(1);
			}
			return true;
		}

		private boolean validateResourceName() {
			String resourceName = getFileName();

			if (resourceName.length() == 0) {
				problemType = PROBLEM_RESOURCE_EMPTY;
				problemMessage = NLS.bind(Messages.ResourceGroup_emptyName, Messages.WizardNewFileCreationPage_file);
				return false;
			}

			if (!Path.ROOT.isValidPath(resourceName)) {
				problemType = PROBLEM_NAME_INVALID;
				problemMessage = NLS.bind(Messages.ResourceGroup_invalidFilename, resourceName);
				return false;
			}
			return true;
		}

		private boolean validateFullResourcePath(IPath resourcePath) {
			IWorkspace workspace = ResourcesPlugin.getWorkspace();

			IStatus result = workspace.validatePath(resourcePath.toString(), IResource.FOLDER);
			if (!result.isOK()) {
				problemType = PROBLEM_PATH_INVALID;
				problemMessage = result.getMessage();
				return false;
			}

			if (!allowExistingResources && isFileExists(resourcePath)) {
				problemType = PROBLEM_RESOURCE_EXIST;
				problemMessage = Messages.ResourceGroup_nameExists;
				return false;
			}
			return true;
		}

		String getProblemMessage() {
			return problemMessage;
		}

		int getProblemType() {
			return problemType;
		}
	}
}
