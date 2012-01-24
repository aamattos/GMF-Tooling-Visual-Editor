package org.msl.simple.gmf.bridge.transform;

import java.io.IOException;
import java.net.URL;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ContentHandler;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.EcoreUtil.ExternalCrossReferencer;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.gmf.codegen.gmfgen.GenEditorGenerator;
import org.eclipse.gmf.graphdef.codegen.MapModeCodeGenStrategy;
import org.eclipse.gmf.internal.bridge.genmodel.BasicDiagramRunTimeModelHelper;
import org.eclipse.gmf.internal.bridge.genmodel.DiagramGenModelTransformer;
import org.eclipse.gmf.internal.bridge.genmodel.DiagramRunTimeModelHelper;
import org.eclipse.gmf.internal.bridge.genmodel.GenModelProducer;
import org.eclipse.gmf.internal.bridge.genmodel.InnerClassViewmapProducer;
import org.eclipse.gmf.internal.bridge.genmodel.RuntimeGenModelAccess;
import org.eclipse.gmf.internal.bridge.genmodel.ViewmapProducer;
import org.eclipse.gmf.internal.bridge.naming.gen.GenNamingMediatorImpl;
import org.eclipse.gmf.internal.bridge.transform.GenModelDetector;
import org.eclipse.gmf.internal.bridge.transform.Messages;
import org.eclipse.gmf.internal.bridge.transform.StaleGenModelDetector;
import org.eclipse.gmf.internal.bridge.transform.ValidationHelper;
import org.eclipse.gmf.internal.bridge.transform.VisualIdentifierDispenserProvider;
import org.eclipse.gmf.internal.bridge.ui.Plugin;
import org.eclipse.gmf.internal.codegen.util.GMFGenConfig;
import org.eclipse.gmf.internal.common.migrate.ModelLoadHelper;
import org.eclipse.gmf.internal.common.reconcile.Reconciler;
import org.eclipse.gmf.mappings.Mapping;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.ModelExtent;
import org.eclipse.m2m.qvt.oml.runtime.util.QvtoTransformationHelper.TransfExecutionResult;

import org.msl.simple.gmfmap.simplemappings.SimpleMapping;

//[artem] XXX Why it's in the bridge.ui??? 
public class SimpleTransformToGenModelOperation 
{

	private URI myGMFGenModelURI;
	private TransformOptions myOptions;
	private Mapping myMapping;
	private GenModelDetector myGMDetector;
	private GenModel myGenModel;
	
	private Diagnostic myMapmodelValidationResult = Diagnostic.CANCEL_INSTANCE;
	private Diagnostic myGMFGenValidationResult = Diagnostic.CANCEL_INSTANCE;

	private IStatus myStaleGenmodelStatus = Status.CANCEL_STATUS;
	private final ResourceSet myResourceSet;
	
	public SimpleTransformToGenModelOperation(ResourceSet rs) {
		assert rs != null;
		myResourceSet = rs;
		this.myOptions = new TransformOptions();
	}

	public TransformOptions getOptions() {
		return myOptions;
	}
	
	public URI getGenURI() {
		return this.myGMFGenModelURI;
	}

	public void setGenURI(URI gmfGen) {
		this.myGMFGenModelURI = gmfGen;
	}

	public GenModel getGenModel() {
		return this.myGenModel;
	}

	public final ResourceSet getResourceSet() {
		return myResourceSet;
	}

	Mapping getMapping() {
		return this.myMapping;
	}
	
	private void setMapping(Mapping m, Diagnostic validationResult) {
		this.myMapping = m;
		this.myMapmodelValidationResult = validationResult;
		myGMDetector = (m != null) ? new GenModelDetector(m) : null;
		myGenModel = null;
	}
	
	private void setGMFGenValidationResult(Diagnostic validationResult) {
		this.myGMFGenValidationResult = validationResult;
	}

	public GenModelDetector getGenModelDetector() {
		return myGMDetector;
	}
	
	public Diagnostic getGMFGenValidationResult() {
		return this.myGMFGenValidationResult;
	}

	public Diagnostic getMapmodelValidationResult() {
		return this.myMapmodelValidationResult;
	}
	
	public IStatus getStaleGenmodelStatus() {
		return this.myStaleGenmodelStatus;
	}

	public Mapping loadMappingModel(URI uri, IProgressMonitor pm) throws CoreException {
		Mapping content = null;
		IStatus status = Status.CANCEL_STATUS;
		Diagnostic validation = Diagnostic.CANCEL_INSTANCE;
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
			if (!(root instanceof SimpleMapping)) {
				String msg = MessageFormat.format(Messages.TransformToGenModelOperation_e_wrong_root_element, root.getClass().getName());
				status = Plugin.createError(msg, null);
				throw new CoreException(status);
			}
			content = ((SimpleMapping) loadHelper.getContentsRoot()).getMapping();
			validation = ValidationHelper.validate(content, true, monitor);
			monitor.worked(60);
			if (Diagnostic.CANCEL == validation.getSeverity()) {
				throw new CoreException(Plugin.createCancel(cancelMessage));
			}
			return content;
		} catch (CoreException e) {
			throw e;
		} catch (Exception e) {
			IStatus error = Plugin.createError(Messages.TransformToGenModelOperation_e_load_mapping_model, e);
			throw new CoreException(error);
		} finally {
			setMapping(content, validation);
			if (monitor != null) {
				monitor.done();
			}
		}
	}
	
	public GenModel findGenmodel() throws CoreException {
		IStatus detect;
		try {
			checkMapping();
			GenModelDetector gmd = getGenModelDetector();
			detect = gmd.detect();
			if (detect.isOK()) {
				GenModel genModel = gmd.get(getResourceSet());
				this.myGenModel = genModel;
				return genModel;
			}
		} catch (Exception e) {
			IStatus error = Plugin.createError(Messages.TransformToGenModelOperation_e_mapping_invalid, e);
			throw new CoreException(error);
		}
		throw new CoreException(detect);
	}

	public GenModel loadGenModel(URI uri, IProgressMonitor pm) throws CoreException {
		IProgressMonitor monitor = null;
		try {
			checkMapping();
			monitor = (pm != null) ? new SubProgressMonitor(pm, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK) : new NullProgressMonitor(); 
			String cancelMessage = Messages.TransformToGenModelOperation_e_genmodel_load_cancelled;
			monitor.beginTask("", 100); //$NON-NLS-1$
			monitor.subTask(Messages.TransformToGenModelOperation_task_detect);
			GenModelDetector gmd = getGenModelDetector();
			IStatus status = Status.OK_STATUS;
			if (uri == null) {
				status = gmd.detect();
			} else {
				status = gmd.advise(uri); 
			}
			if (!status.isOK()) {
				throw new CoreException(status);
			}
			subTask(monitor, 30, Messages.TransformToGenModelOperation_task_load, cancelMessage);
			GenModel genModel = gmd.get(getResourceSet());
			if (genModel == null) {
				if (uri == null) {
					this.myStaleGenmodelStatus = Status.CANCEL_STATUS;
					this.myGenModel = null;
					return null;
				}
				IStatus notFound = Plugin.createError(Messages.GenModelDetector_e_not_found, null);
				throw new CoreException(notFound);
			}
			subTask(monitor, 40, Messages.TransformToGenModelOperation_task_validate, cancelMessage);
			StaleGenModelDetector staleDetector = new StaleGenModelDetector(genModel);
			IStatus stale = staleDetector.detect();
			this.myGenModel = genModel;
			this.myStaleGenmodelStatus = stale;
			return genModel;

		} catch (CoreException e) {
			throw e;
		} catch (Exception e) {
			IStatus error = Plugin.createError(Messages.TransformToGenModelOperation_e_genmodel_load, e);
			throw new CoreException(error);
		} finally {
			if (monitor != null) {
				monitor.done();
			}
		}
	}
	
	public IStatus executeTransformation(IProgressMonitor pm) {
		IProgressMonitor monitor = null;
		Diagnostic validation = Diagnostic.CANCEL_INSTANCE;
		try {
			if (getGenURI() == null) {
				throw new IllegalStateException(Messages.TransformToGenModelOperation_e_null_gmfgen_uri);
			}
			checkMapping();
			monitor = (pm != null) ? new SubProgressMonitor(pm, 1, SubProgressMonitor.PREPEND_MAIN_LABEL_TO_SUBTASK) : new NullProgressMonitor(); 
			monitor.beginTask("", 100); //$NON-NLS-1$
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			final VisualIdentifierDispenserProvider idDispenser = getVisualIdDispenser();
			idDispenser.acquire();

			GenModelProducer t = createGenModelProducer(idDispenser);

			monitor.subTask(Messages.TransformToGenModelOperation_task_generate);
			GenEditorGenerator genEditor = t.process(getMapping(), new SubProgressMonitor(monitor, 20));
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			monitor.subTask(Messages.TransformToGenModelOperation_task_reconcile);
			if (Plugin.needsReconcile()) {
				handlePreReconcileHooks(genEditor);
				reconcile(genEditor);
				handlePostReconcileHooks(genEditor);
			}
			GenNamingMediatorImpl namer = new GenNamingMediatorImpl();
			namer.setMode(GenNamingMediatorImpl.Mode.COLLECT_NAMES);
			namer.traverse(genEditor); // collect reconciled names
			namer.setMode(GenNamingMediatorImpl.Mode.DISPENSE_NAMES);
			namer.traverse(genEditor); // dispense names to new elements
			monitor.worked(20);
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			monitor.subTask(Messages.TransformToGenModelOperation_task_save);
			save(genEditor);
			monitor.worked(20);
			if (monitor.isCanceled()) {
				return Status.CANCEL_STATUS;
			}
			monitor.subTask(Messages.TransformToGenModelOperation_task_validate);
			try {
				validation = ValidationHelper.validate(genEditor, true, monitor);
			} catch (RuntimeException re) {
				validation = BasicDiagnostic.toDiagnostic(re);
			}
			if (Diagnostic.CANCEL != validation.getSeverity()) {
				idDispenser.release();
			}
			return Status.OK_STATUS;
		} catch (CoreException ex) {
			return ex.getStatus();
		} catch (Exception ex) {
			String message = ex.getMessage();
			if (message == null) {
				message = Messages.TransformToGenModelOperation_e_generator_creation;
			}
			return Plugin.createError(message, ex);
		} finally {
			setGMFGenValidationResult(validation);
			if (monitor != null) {
				monitor.done();
			}
		}
	}

	protected void handlePreReconcileHooks(GenEditorGenerator result) {
		if (getOptions().getPreReconcileTransform() != null) {
			try {
				URI transfURI = URI.createURI(getOptions().getPreReconcileTransform().toExternalForm());
				new QvtoTransformationHelper(transfURI).executeTransformation(Collections.<EObject>singletonList(result), Collections.<String, Object>emptyMap(), getResourceSet());
			} catch (CoreException ex) {
				Plugin.log(ex);
			}
		}
	}

	protected void handlePostReconcileHooks(GenEditorGenerator result) {
		if (getOptions().getPostReconcileTransform() != null) {
			try {
				URI transfURI = URI.createURI(getOptions().getPostReconcileTransform().toExternalForm());
				List<EObject> in = Collections.<EObject>singletonList(result);
				Map<String, Object> props = Collections.<String, Object>emptyMap();
				new QvtoTransformationHelper(transfURI).executeTransformation(in, props, getResourceSet());
			} catch (CoreException ex) {
				Plugin.log(ex);
			}
		}
	}


	private void checkMapping() {
		if (getMapping() == null) {
			throw new IllegalStateException(Messages.TransformToGenModelOperation_e_null_mapping);
		}
	}
	
	static IStatus getFirst(Diagnostic d) {
		if (d == null) {
			return Status.OK_STATUS;
		}
		List<Diagnostic> children = d.getChildren();
		if (children.isEmpty()) {
			return BasicDiagnostic.toIStatus(d);
		} else {
			return BasicDiagnostic.toIStatus(children.get(0));
		}
	}
	
	private DiagramRunTimeModelHelper detectRunTimeModel() {
		return new BasicDiagramRunTimeModelHelper();
	}

	private ViewmapProducer detectTransformationOptions() {
		String runtimeToken = getOptions().getUseRuntimeFigures() ? "full" : "lite";
		MapModeCodeGenStrategy mmStrategy = getOptions().getUseMapMode() ? MapModeCodeGenStrategy.DYNAMIC : MapModeCodeGenStrategy.STATIC;
		URL dynamicFigureTemplates = getOptions().getFigureTemplatesPath();
		return new InnerClassViewmapProducer(runtimeToken, mmStrategy, dynamicFigureTemplates == null ? null : new URL[] {dynamicFigureTemplates});
	}

	private VisualIdentifierDispenserProvider getVisualIdDispenser() {
		return new VisualIdentifierDispenserProvider(getGenURI());
	}

	private GenModelProducer createGenModelProducer(VisualIdentifierDispenserProvider idDespenser) {
		if (getOptions().getMainTransformation() != null) {
			final Map<String, Object> configProps = new HashMap<String, Object>();
			configProps.put("useMapMode", getOptions().getUseMapMode());
			configProps.put("useFullRunTime", getOptions().getUseRuntimeFigures());
			configProps.put("rcp", getOptions().getGenerateRCP());
			return new GenModelProducer() {
				public GenEditorGenerator process(Mapping mapping, IProgressMonitor progress) throws CoreException {
					progress.beginTask(null, 1);
					try {
						URI transfURI = URI.createURI(getOptions().getMainTransformation().toExternalForm());
						QvtoTransformationHelper helper = new QvtoTransformationHelper(transfURI);
						ArrayList<EObject> args = new ArrayList<EObject>(5);
						args.add(mapping);
						args.add(getGenModel());
						RuntimeGenModelAccess runtimeAccess = new RuntimeGenModelAccess();
						runtimeAccess.ensure(); 
						args.add(runtimeAccess.genPackage() == null ? null : runtimeAccess.genPackage().getGenModel());
						TransfExecutionResult result = helper.executeTransformation(args, configProps, getResourceSet());
						if (Plugin.printTransformationConsole()) {
							System.err.println(result.getConsoleOutput());
						}
						for (ModelExtent me : result.getOutModelExtents()) {
							for (EObject r : me.getAllRootElements()) {
								if (r instanceof GenEditorGenerator) {
									return (GenEditorGenerator) r;
								}
							}
						}
						throw new CoreException(new Status(IStatus.ERROR, Plugin.getPluginID(), "Transformation has no out parameter of GenEditorGenerator type"));
					} finally {
						progress.done();
					}
				}
			};
		} else {
			final DiagramRunTimeModelHelper drtModelHelper = detectRunTimeModel();
			final ViewmapProducer viewmapProducer = detectTransformationOptions();
			DiagramGenModelTransformer.Parameters opts = new DiagramGenModelTransformer.Parameters(drtModelHelper, viewmapProducer, idDespenser.get(), getOptions().getGenerateRCP());
			final DiagramGenModelTransformer t = new DiagramGenModelTransformer(opts);
			if (getGenModel() != null) {
				t.setEMFGenModel(getGenModel());
			}
			return new GenModelProducer() {
	
				public GenEditorGenerator process(Mapping mapping, IProgressMonitor progress) {
					progress.beginTask(null, 1);
					try {
						t.transform(mapping);
						return t.getResult();
					} finally {
						progress.done();
					}
				}
			};
		}
	}

	private void reconcile(GenEditorGenerator genBurdern) {
		GenEditorGenerator old = null;
		Resource resource = null;
		try {
			resource = getResourceSet().getResource(getGenURI(), false);
			if (resource == null) {
				resource = getResourceSet().createResource(getGenURI(), ContentHandler.UNSPECIFIED_CONTENT_TYPE);
				resource.load(getResourceSet().getLoadOptions());
			}
			List<EObject> contents = resource.getContents();
			if (!contents.isEmpty() && contents.get(0) instanceof GenEditorGenerator) {
				old = (GenEditorGenerator) contents.get(0);
			}
			if (old != null) {
				new Reconciler(new GMFGenConfig()).reconcileTree(genBurdern, old);
			}
		} catch (IOException e) {
			// can't load resource, means no old file, IGNORE the exception
		} catch (RuntimeException e) {
			Plugin.log(e);
			old = null;
		} finally {
			if (resource != null) {
				if (resource.isLoaded()) {
					// not sure I need to unload given I'll remove the resource from resource set anyway, but it doesn't hurt? 
					resource.unload();
				}
				// Need to remove created resource from resource set, not to affect further load attempts
				// (e.g. the one in #save() method, with another content type)
				// Another option would be use of correct content type here, but what 
				// if loaded/reconciled model has old content type? 
				getResourceSet().getResources().remove(resource);
			}
		}
	}

	private void save(GenEditorGenerator genBurdern) throws IOException {
		HashMap<String, Object> saveOptions = new HashMap<String, Object>();
		saveOptions.put(XMLResource.OPTION_ENCODING, "UTF-8"); //$NON-NLS-1$
		Resource gmfgenRes = getResourceSet().getResource(getGenURI(), false);
		try {
			if (gmfgenRes == null) {
				gmfgenRes = getResourceSet().createResource(getGenURI(), "org.eclipse.gmf.gen" /*GMFGen contentType, defined in oeg.codegen*/); //$NON-NLS-1$
				gmfgenRes.load(getResourceSet().getLoadOptions());
			}
			updateExistingResource(gmfgenRes, genBurdern);
			// one might want to ignore dangling href on save when there are more than one
			// content object - there are chances we don't match them during reconcile and 
			// failed update all the references.
			if (gmfgenRes.getContents().size() > 1 && Plugin.ignoreDanglingHrefOnSave()) {
				saveOptions.put(XMLResource.OPTION_PROCESS_DANGLING_HREF, XMLResource.OPTION_PROCESS_DANGLING_HREF_RECORD);
			}
			gmfgenRes.save(saveOptions);
		} catch (IOException ex) {
			// load failed, no file exists
			gmfgenRes.getContents().add(genBurdern);
			gmfgenRes.save(saveOptions);
		} catch (RuntimeException ex) {
			Plugin.log(ex);
			// save anyway, for later examination
			gmfgenRes.getContents().add(genBurdern);
			gmfgenRes.save(saveOptions);
		}
	}

	private static void updateExistingResource(Resource gmfgenRes, GenEditorGenerator genBurden) {
		boolean editorGenFound = false;
		for (int i = 0; !editorGenFound && i < gmfgenRes.getContents().size(); i++) {
			if (gmfgenRes.getContents().get(i) instanceof GenEditorGenerator) {
				if (gmfgenRes.getContents().size() > 1) {
					// chances there are other content eobjects that reference 
					// some parts of old GenEditorGenerator, hence need update
					LinkedList<EObject> rest = new LinkedList<EObject>(gmfgenRes.getContents());
					GenEditorGenerator oldEditorGenerator = (GenEditorGenerator) rest.remove(i);
					updateExternalReferences(genBurden, oldEditorGenerator, rest);
				}
				gmfgenRes.getContents().set(i, genBurden); // replace with new one
				editorGenFound = true;
			}
		}
		if (!editorGenFound) {
			gmfgenRes.getContents().add(genBurden);
		}
	}

	private static void updateExternalReferences(GenEditorGenerator newEditorGenerator, final GenEditorGenerator oldEditorGenerator, List<EObject> allContentButOldGenerator) {
		// find references from rest of the content to old generator
		final Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = new ExternalCrossReferencer(allContentButOldGenerator) {
			@Override
			protected boolean crossReference(EObject object, EReference reference, EObject crossReferencedEObject) {
				return super.crossReference(object, reference, crossReferencedEObject) && EcoreUtil.isAncestor(oldEditorGenerator, crossReferencedEObject);
			}

			Map<EObject, Collection<EStructuralFeature.Setting>> find() {
				return findExternalCrossReferences();
			}
		}.find();
		// match new and old objects using reconciler without decisions
		new Reconciler(new GMFGenConfig()) {
			@Override
			protected void handleNotMatchedCurrent(EObject current) {/*no-op*/};
			@Override
			protected EObject handleNotMatchedOld(EObject currentParent, EObject notMatchedOld) {
				return null; /*no-op*/
			};
			@Override
			protected void reconcileVertex(EObject current, EObject old) {
				if (!crossReferences.containsKey(old)) {
					return;
				}
				// and replace old values with new
				for (EStructuralFeature.Setting s : crossReferences.get(old)) {
					EcoreUtil.replace(s, old, current);
				}
			}
		}.reconcileTree(newEditorGenerator, oldEditorGenerator);
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
