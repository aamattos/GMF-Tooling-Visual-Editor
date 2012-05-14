package org.msl.simple.gmf.bridge.transform;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

/**
 * .gmfmap to .gmfgen
 * 
 * @author artem
 */
public class TransformToGenModelAction implements IObjectActionDelegate {

	private static final int WIZARD_WIDTH_INCH = 6;
	private static final int WIZARD_HEIGHT_INCH = 6;

	private IWorkbenchPart myPart;

	private IStructuredSelection sselection;

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		final IStructuredSelection structuredSelection = ((IStructuredSelection) selection);
		sselection = structuredSelection;
	}

	public void run(IAction action) {
		final TransformToGenModelWizard wiz = new TransformToGenModelWizard();
		wiz.setWindowTitle(action.getText());
		wiz.init(PlatformUI.getWorkbench(), sselection);
		WizardDialog wd = new WizardDialog(getShell(), wiz);
		wd.create();
		Rectangle mb = getShell().getMonitor().getClientArea();
		Point dpi = getShell().getDisplay().getDPI();
		if (Platform.OS_MACOSX.equals(Platform.getOS())) {
			dpi = new Point(110, 110); // OSX DPI is always 72; 110 is a common value for modern LCD screens
		}
		int width = dpi.x * WIZARD_WIDTH_INCH;
		int height = dpi.y * WIZARD_HEIGHT_INCH;
		int x = mb.x + (mb.width - width) / 2;
		if (x < mb.x) {
			x = mb.x;
		}
		int y = mb.y + (mb.height - height) / 2;
		if (y < mb.y) {
			y = mb.y;
		}
		wd.getShell().setLocation(x, y);
		wd.getShell().setSize(width, height);
		wd.open();
	}

	private Shell getShell() {
		return myPart.getSite().getShell();
	}
}
