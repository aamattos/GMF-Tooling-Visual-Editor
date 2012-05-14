package org.msl.simple.gmf.migrate.ui;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class Plugin extends AbstractUIPlugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.msl.simple.gmf.bridge.ui"; //$NON-NLS-1$

	// The shared instance
	private static Plugin plugin;
	
	/**
	 * The constructor
	 */
	public Plugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Plugin getDefault() {
		return plugin;
	}
	
	public static IStatus createError(String message, Throwable ex) {
		return createStatus(IStatus.ERROR, message, ex);
	}
	
	public static IStatus createStatus(int statusCode, String message, Throwable ex) {
		return new Status(statusCode, getPluginID(), 0, message, ex);
	}
	
	public static String getPluginID() {
		return getDefault().getBundle().getSymbolicName();
	}
	
	public static IStatus createCancel(String message) {
		return createStatus(IStatus.CANCEL, message, null);
	}

}
