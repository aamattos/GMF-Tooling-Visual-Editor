package org.msl.simple.gmfmap.diagram.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IStorage;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.emf.ecore.xmi.FeatureNotFoundException;
import org.eclipse.emf.ecore.xmi.PackageNotFoundException;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.util.Log;
import org.eclipse.gmf.runtime.common.core.util.Trace;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorDebugOptions;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorPlugin;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.EditorStatusCodes;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.l10n.EditorMessages;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.internal.util.DiagramIOUtil;
import org.eclipse.gmf.runtime.emf.core.resources.GMFResourceFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.util.NotationExtendedMetaData;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;


public class SimpleMapDiagramIOUtil{
	
	// localized labels
	private static String UNABLE_TO_LOAD_DIAGRAM = EditorMessages.Diagram_UNABLE_TO_LOAD_RESOURCE;

	private static String NO_DIAGRAM_IN_RESOURCE = EditorMessages.Diagram_NO_DIAGRAM_IN_RESOURCE;
	
	
	private static final String LATEST_RELEASE = "http://org.msl.simple.gmfmap/simplemappings_1.1";

	private static interface ILoader {
		public Resource load(TransactionalEditingDomain domain, Map loadOptions, IProgressMonitor monitor) throws IOException, CoreException;
	}
	
	private static class FileLoader implements ILoader {
		private IFile fFile;
		public FileLoader(IFile file) {
			assert file != null;
			fFile = file;
		}
		
		public Resource load(TransactionalEditingDomain domain, Map loadOptions, IProgressMonitor monitor) throws IOException, CoreException {
			fFile.refreshLocal(IResource.DEPTH_ZERO, monitor);
			URI uri = URI.createPlatformResourceURI(fFile.getFullPath()
                .toString(), true);
			
			Resource resource = domain.getResourceSet().getResource(uri, false);
			
			if (resource == null) {
				resource = domain.getResourceSet().createResource(uri);
			}
			
			if (!resource.isLoaded()) {
				Map loadingOptions = new HashMap(GMFResourceFactory.getDefaultLoadOptions());
				
                // propogate passed in options to the defaults
                Iterator iter = loadOptions.keySet().iterator();
                while (iter.hasNext()) {
                    Object key = iter.next();
                    loadingOptions.put(key, loadOptions.get(key));
                }
                
                try {
                	resource.load(loadingOptions);
                } catch (IOException e) {
                	resource.unload();
                	throw e;
                }
			}
			
			logResourceErrorsAndWarnings(resource);
						
			return resource;
		}
	}

	private static void logResourceErrorsAndWarnings(Resource resource) {
		for (Iterator iter = resource.getErrors().iterator(); iter.hasNext();) {
			Resource.Diagnostic diagnostic = (Resource.Diagnostic) iter.next();
			Log.error(EditorPlugin.getInstance(), EditorStatusCodes.ERROR, diagnostic.getMessage());				
		}

		for (Iterator iter = resource.getWarnings().iterator(); iter.hasNext();) {
			Resource.Diagnostic diagnostic = (Resource.Diagnostic) iter.next();
			Log.warning(EditorPlugin.getInstance(), EditorStatusCodes.WARNING, diagnostic.getMessage());				
		}
	}

	
	private static class StorageLoader implements ILoader {
		private IStorage fStorage;
		public StorageLoader(IStorage storage) {
			assert storage != null;
			fStorage = storage;
		}
		
		public Resource load(TransactionalEditingDomain editingDomain,
				Map loadOptions, IProgressMonitor monitor)
			throws IOException, CoreException {
            String storageName = fStorage.getName();
            URI uri = URI.createPlatformResourceURI(storageName);
            Resource resource = editingDomain.getResourceSet().getResource(uri,false);
            if (resource == null) {
                resource = editingDomain.getResourceSet().createResource(uri);
            }
            if (!resource.isLoaded()) {
                resource.load(fStorage.getContents(), loadOptions);
            }
			logResourceErrorsAndWarnings(resource);
			return resource;
		}
	}
	
	static public Diagram load(final TransactionalEditingDomain domain, final IFile file, boolean bTryCompatible, IProgressMonitor monitor) throws CoreException {
		FileLoader loader = new FileLoader(file);
		return load(domain, loader, bTryCompatible, monitor);
	}
	
	static public Diagram load(final TransactionalEditingDomain domain, final IStorage storage, boolean bTryCompatible, IProgressMonitor monitor) throws CoreException {
		ILoader loader = null;
		if(storage instanceof IFile) {
			loader = new FileLoader((IFile)storage);
		} else {
			loader = new StorageLoader(storage);
		}
		return load(domain, loader, bTryCompatible, monitor);
	}
	
	/**
	 * load an existing diagram file.
	 * 
	 * @param file
	 * @return
	 * @throws CoreException
	 */
	static private Diagram load(final TransactionalEditingDomain domain, final ILoader loader, boolean bTryCompatible, IProgressMonitor monitor) throws CoreException  {
		Resource notationModel = null;
		try {
			try {	
				// File exists with contents..
				notationModel = loader.load(domain, new HashMap(), monitor);
			} catch (Resource.IOWrappedException e) {
				if (bTryCompatible) {
					Throwable causeError = e.getCause();
					
					if (causeError == null) {
						causeError = e;
					}
					
					String errMsg = causeError.getLocalizedMessage();
					if (causeError instanceof Resource.IOWrappedException) {
						Exception exc = (Exception)((Resource.IOWrappedException) causeError)
							.getCause();
						if (exc != null) {
							causeError = exc;
						}
					}
					
					if ((causeError instanceof PackageNotFoundException 
							|| causeError instanceof ClassNotFoundException
							|| causeError instanceof FeatureNotFoundException)) {
						if (shouldLoadInCompatibilityMode(errMsg)) {
                            Map loadOptions = new HashMap();
            				
                            // We will place a special extended metadata in here to ensure that we can load diagrams
            				//  from older versions of our metamodel.
            				loadOptions.put(XMLResource.OPTION_EXTENDED_META_DATA, new NotationExtendedMetaData());
            				
                            loadOptions.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
							notationModel = loader.load(domain, loadOptions, monitor);
						} else {
							// user does not want to load in compatibility mode.
							return null; 
						}
					} else {
                        throw e;
					}
				} else {
					throw e;
				}
			}
			if(notationModel == null)
				throw new RuntimeException(UNABLE_TO_LOAD_DIAGRAM);

			Iterator rootContents = notationModel.getContents().iterator();
			while(rootContents.hasNext()) {
				EObject rootElement = (EObject)rootContents.next();
				
				if(rootElement instanceof Diagram)
				{
					String nsUri = getNamespaceURI(notationModel.getURI());
					
					if(!nsUri.equals(LATEST_RELEASE))
					{
						Diagram migratedDiagram = migrate((Diagram)rootElement, domain); 
						notationModel.save(new HashMap());
						
						return migratedDiagram;
					}
					
					return (Diagram)rootElement;
				}
					
			}
			
			throw new RuntimeException(NO_DIAGRAM_IN_RESOURCE);
		} catch(Exception e) {
			Trace.catching(EditorPlugin.getInstance(), EditorDebugOptions.EXCEPTIONS_CATCHING, DiagramIOUtil.class, "load(IFile, boolean)", e); //$NON-NLS-1$
			CoreException thrownExcp = null;
			if(e instanceof CoreException) {
				thrownExcp = (CoreException)e;
            } else {
                String exceptionMessage = e.getLocalizedMessage();
                thrownExcp = new CoreException(new Status(IStatus.ERROR,
                    EditorPlugin.getPluginId(), EditorStatusCodes.ERROR,
                    exceptionMessage != null ? exceptionMessage
                        : "load(IFile, boolean)", e)); //$NON-NLS-1$
            }
			Trace.throwing(EditorPlugin.getInstance(), EditorDebugOptions.EXCEPTIONS_THROWING, DiagramIOUtil.class, "load(IFile, boolean)", thrownExcp); //$NON-NLS-1$
			throw thrownExcp;
		}
	}
	
	public static String getNamespaceURI(URI uri) {
		return getNamespaceURI_SAX(getJavaFile(uri));
	}
	
	/** Extract the namespace URI from a model file using SAX. */
	public static String getNamespaceURI_SAX(File file) {

		ContentHandler contentHandler = new ContentHandler();
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			reader.setContentHandler(contentHandler);

			FileReader fileReader = new FileReader(file);

			reader.parse(new InputSource(fileReader));
		} catch (Exception e) {
			// loading should fail
		}

		return contentHandler.getNsURI();
	}
	
	/** Content handler for extraction of namespace URI using SAX. */
	private static class ContentHandler extends DefaultHandler {

		/** Namespace URI. */
		private String nsURI;

		/** {@inheritDoc} */
		@Override
		public void startElement(String uri, String localName, String qName,
				Attributes attributes) throws SAXException {
			if (!ExtendedMetaData.XMI_URI.equals(uri)
					&& !ExtendedMetaData.XML_SCHEMA_URI.equals(uri)) {
				nsURI = uri;
				throw new SAXException();
			}
		}

		/** Returns the namespace URI. */
		public String getNsURI() {
			return nsURI;
		}
	}
	
	/**
	 * Get the Java file for a URI
	 * 
	 * @param uri
	 * @return Java file
	 */
	public static File getJavaFile(URI uri) {
		if (uri.isPlatform()) {
			IFile file = getFile(uri);
			IPath location = file.getLocation();
			return location.toFile();
		}
		return new File(uri.toFileString());
	}
	
	/**
	 * Convert EMF URI to Eclipse file
	 */
	public static IFile getFile(URI uri) {
		String platformString = uri.toPlatformString(true);
		if (platformString != null) {
			Path path = new Path(platformString);
			return ResourcesPlugin.getWorkspace().getRoot().getFile(path);
		}
		return null;
	}


	private static Diagram migrate(Diagram diagram, TransactionalEditingDomain domain) {
		
		CompoundCommand cc = new CompoundCommand("migration");
		
		doMigrate(diagram, domain, cc);
		
		domain.getCommandStack().execute(cc);

		return diagram;
		
	}
	
	private static void doMigrate(EObject eObject, TransactionalEditingDomain domain, CompoundCommand cc)
	{
		for(EObject eObj:eObject.eContents())
		{
			if(eObj instanceof View)
			{
				int type = Integer.parseInt(((View)eObj).getType());
				String newType = null;
				switch(type)
				{
					case 1000:newType="79";   break;//SimpleMappingEditPart
					case 2003:newType="1001"; break;// SimpleTopNodeEditPart
					case 5004:newType="4003"; break;// SimpleTopNodeNameEditPart
					case 3004:newType="2001"; break;// SimpleLabelNodeEditPart
					case 3005:newType="2002"; break;// SimpleCompartmentEditPart
					case 5003:newType="4002"; break;// SimpleCompartmentNameEditPart
					case 5007:newType="4002"; break;// SimpleCompartmentName2EditPart --> SimpleCompartmentNameEditPart
					case 3011:newType="2003"; break;// SimpleSubNodeReferenceEditPart
					case 2007:newType="1002"; break;// SimpleLinkMappingEditPart
					case 5010:newType="4004"; break;// SimpleLinkMappingNameEditPart
				}
			
				if(newType!=null)
					cc.append(SetCommand.create(domain, eObj, NotationPackage.eINSTANCE.getView_Type(), newType));
				else
					cc.append(DeleteCommand.create(domain, eObj));
			}
			
			doMigrate(eObj, domain, cc);
		}
	}

	static public void save(TransactionalEditingDomain domain, IFile file, Diagram diagram, boolean bKeepUnrecognizedData, IProgressMonitor progressMonitor) throws CoreException {
        Map options = new HashMap();
		if(bKeepUnrecognizedData)
            options.put(XMLResource.OPTION_RECORD_UNKNOWN_FEATURE, Boolean.TRUE);
        save(domain, file, diagram, progressMonitor, options);
	}
    
    static public void save(TransactionalEditingDomain domain, IFile file, Diagram diagram, IProgressMonitor progressMonitor) throws CoreException {
        Map options = new HashMap();
        save(domain, file, diagram, progressMonitor, options);
    }
	
	static public void save(TransactionalEditingDomain domain, IFile file, Diagram diagram, IProgressMonitor progressMonitor, Map options) throws CoreException {
		Resource notationModel = ((EObject) diagram).eResource();
		String fileName = file.getFullPath().toOSString();
		notationModel.setURI(URI.createPlatformResourceURI(fileName, true));
		try {
			notationModel.save(options);
		} catch (IOException e) {
			throw new CoreException(new Status(IStatus.ERROR, EditorPlugin
				.getPluginId(), EditorStatusCodes.RESOURCE_FAILURE, e
				.getLocalizedMessage(), null));
		}

		if (progressMonitor != null)
			progressMonitor.done();
		
		logResourceErrorsAndWarnings(notationModel);
	}
	
		/**
	 * @param errMsg
	 * @return
	 */
	private static boolean shouldLoadInCompatibilityMode(String errMsg) {
		return true;
	}
	
	public static void unload(TransactionalEditingDomain domain, Diagram diagram) {
		if (diagram.eResource() != null) {
			diagram.eResource().unload();
		}
	}

	public static boolean hasUnrecognizedData(Resource resource) {
		// no compatibility support at present
		return false;
	}


}
