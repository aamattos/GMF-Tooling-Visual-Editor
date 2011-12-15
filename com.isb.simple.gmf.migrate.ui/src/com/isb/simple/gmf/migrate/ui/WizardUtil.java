package com.isb.simple.gmf.migrate.ui;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.jface.viewers.IStructuredSelection;

public class WizardUtil {
	
	public static String getDefaultFileName(IStructuredSelection selection, String defaultName, String extension) {
		if (selection != null && !selection.isEmpty()) {
			Object selected = selection.getFirstElement();
			if (selected instanceof IFile) {
				return getDefaultFileName((IFile) selected, extension);
			}
		}
		return defaultName + '.' + extension;
	}
	
	public static String getDefaultFileName(IFile file, String extension) {
		String fileNameBase = getFileBaseName(file);
		String modelFilename = fileNameBase + '.' + extension;
		for (int i = 1; file.getParent().findMember(modelFilename) != null; ++i) {
			modelFilename = fileNameBase + i + '.' + extension;
		}
		return modelFilename;
	}
	
	/**
	 * In case selection points to file resource, tries to find file 
	 * with same name and specified extension.
	 * 
	 * @param selection context to look at
	 * @param fileExt filename extension to look for
	 * @return 
	 */
	public static IFile findExistingFile(IStructuredSelection selection, String fileExt) {
		if (selection == null || selection.isEmpty() || false == selection.getFirstElement() instanceof IFile) {
			return null;
		}
		IFile selected = (IFile) selection.getFirstElement();
		String fileNameBase = getFileBaseName(selected);
		IResource candidate = selected.getParent().findMember(fileNameBase + '.' + fileExt);
		if (candidate != null && candidate.getType() == IResource.FILE && candidate.exists()) {
			return (IFile) candidate;
		}
		return null;
	}
	
	private static String getFileBaseName(IFile file) {
		String fileNameBase = file.getName();
		if (file.getFileExtension() != null) {
			fileNameBase = fileNameBase.substring(0, fileNameBase.length() - (file.getFileExtension().length() + 1));
		}
		return fileNameBase;
	}
}
