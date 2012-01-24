package org.msl.simple.gmf.migrate.ui;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.gmf.internal.common.migrate.ModelLoadHelper;
import org.eclipse.gmf.mappings.Mapping;

//[artem] XXX Why it's in the bridge.ui??? 
public class TransformToSimpleMappingOperation 
{

	private Mapping myMapping;
	
	private final ResourceSet myResourceSet;
	
	public TransformToSimpleMappingOperation(ResourceSet rs) {
		assert rs != null;
		myResourceSet = rs;
	}

	public final ResourceSet getResourceSet() {
		return myResourceSet;
	}

	Mapping getMapping() {
		return this.myMapping;
	}
	
	private void setMapping(Mapping m) {
		this.myMapping = m;
	}
	
	public Mapping loadMappingModel(URI uri, IProgressMonitor pm) throws CoreException {
		Mapping content = null;
		IStatus status = Status.CANCEL_STATUS;
		IProgressMonitor monitor = null;
		try {
			if (uri == null) {
				throw new IllegalArgumentException(Messages.TransformToGenModelOperation_e_null_map_uri);
			}
			monitor = (pm != null) ? new SubProgressMonitor(pm, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK) : new NullProgressMonitor(); 
			String cancelMessage = Messages.TransformToGenModelOperation_e_map_load_cancelled;
			monitor.beginTask("", 100); //$NON-NLS-1$
			subTask(monitor, 0, Messages.TransformToGenModelOperation_task_load, cancelMessage);
			ModelLoadHelper loadHelper = new ModelLoadHelper(getResourceSet(), uri);
			if (!loadHelper.isOK()) {
				throw new CoreException(loadHelper.getStatus());
			}
			subTask(monitor, 20, Messages.TransformToGenModelOperation_task_validate, cancelMessage);
			EObject root = loadHelper.getContentsRoot();
			if (!(root instanceof Mapping)) {
				String msg = MessageFormat.format(Messages.TransformToGenModelOperation_e_wrong_root_element, root.getClass().getName());
				status = Plugin.createError(msg, null);
				throw new CoreException(status);
			}
			content = (Mapping) loadHelper.getContentsRoot();
			monitor.worked(60);

			return content;
		} catch (CoreException e) {
			throw e;
		} catch (Exception e) {
			IStatus error = Plugin.createError(Messages.TransformToGenModelOperation_e_load_mapping_model, e);
			throw new CoreException(error);
		} finally {
			setMapping(content);
			if (monitor != null) {
				monitor.done();
			}
		}
	}
	

	private static void subTask(IProgressMonitor monitor, int ticks, String name, String cancelMessage) throws CoreException {
		if (monitor == null) {
			return;
		}
		if (monitor.isCanceled()) {
			IStatus cancel = Plugin.createCancel(cancelMessage);
			throw new CoreException(cancel);
		}
		if (ticks > 0) {
			monitor.worked(ticks);
		}
		if (name != null) {
			monitor.subTask(name);
		}
	}
}
