package com.isb.simple.gmf.bridge.transform;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.common.ui.ModelSelectionPage;
import org.eclipse.gmf.internal.common.ui.ResourceLocationProvider;
import org.eclipse.jface.dialogs.IMessageProvider;
import org.eclipse.ui.actions.WorkspaceModifyOperation;


public class ModelConfigurationPage extends ModelSelectionPage {

	public ModelConfigurationPage(String pageId, ResourceLocationProvider rlp, ResourceSet resourceSet) {
		super(pageId, rlp, resourceSet);
	}

	@Override
	protected Resource loadResource() {
		Resource current = getResource();
		if (current != null) {
			current.getResourceSet().getResources().remove(current);
		}
		
		final Resource[] result = new Resource[1];
	    WorkspaceModifyOperation initializeOperation = new WorkspaceModifyOperation()
	      {

			protected void execute(IProgressMonitor progressMonitor) throws CoreException {
				IProgressMonitor monitor = null;
				try {
					monitor = (progressMonitor != null) ? new SubProgressMonitor(progressMonitor, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK) : new NullProgressMonitor(); 
					setStatusMessage(Status.OK_STATUS);
					result[0] = doLoadResource(monitor);
				} catch (CoreException exception) {
					throw exception;
				} catch (Exception exception) {
					throw new CoreException(Plugin.createError(exception.getMessage(), exception));
				} finally {
					if (monitor != null) {
						monitor.done();
					}
				}
			}
		};

		try {
			getContainer().run(false, false, initializeOperation);
			setStatusMessage(Status.OK_STATUS);
		} catch (InvocationTargetException e) {
			Throwable target = e.getTargetException();
			if (target instanceof CoreException) {
				CoreException ce = (CoreException) target;
				setStatusMessage(ce.getStatus());
			} else {
				setStatusMessage(Plugin.createError(target.getMessage(), target));
			}
		} catch (InterruptedException e) {
			setStatusMessage(Status.CANCEL_STATUS);
		}
		return result[0];
	}

	protected Resource doLoadResource(IProgressMonitor monitor) throws CoreException {
		try {
			Resource r = super.loadResource();
			return r;
		} catch (Exception e) {
			throw new CoreException(Plugin.createError(e.getMessage(), e));
		} finally {
			if (monitor != null) {
				monitor.done();
			}
		}
	}
	
	void setStatusMessage(IStatus status) {
		if (status == null || status.isOK()) {
			setMessage(null);
			setErrorMessage(null);
		} else if (IStatus.INFO == status.getSeverity()) {
			setMessage(status.getMessage(), IMessageProvider.INFORMATION);
			setErrorMessage(null);
		} else if (IStatus.WARNING == status.getSeverity()) {
			setMessage(status.getMessage(), IMessageProvider.WARNING);
			setErrorMessage(null);
		} else if (IStatus.ERROR == status.getSeverity()) {
			setMessage(null);
			setErrorMessage(status.getMessage());
		} else if (IStatus.CANCEL == status.getSeverity()) {
			setMessage(null);
			setErrorMessage(status.getMessage());
		}
	}

}
