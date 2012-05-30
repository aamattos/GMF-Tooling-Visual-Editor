package org.msl.simple.gmfmap.diagram.util;

import java.io.File;
import java.io.FileReader;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.ExtendedMetaData;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;
import org.msl.simple.gmfmap.simplemappings.diagram.part.Messages;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class SimpleMapMigrationUtil {
	
	private static final String LATEST_RELEASE = "http://org.msl.simple.gmfmap/simplemappings_1.1";
	
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

	public static boolean needsToMigrate(IEditorInput element) {
		
		File inputFile = getFile(element);
		
		if(inputFile==null)
			return false;
		
		String nsUri = getNamespaceURI_SAX(inputFile);
		
		if(!nsUri.equals(LATEST_RELEASE))
			return true;
		
		return false;
	}

	public static void checkMigration(IEditorInput element) {

		if(needsToMigrate(element))
			MessageDialog.openInformation(Display.getCurrent().getActiveShell(), "Incompatible Version", Messages.bind(Messages.SimplemapDocumentProvider_MigrationNeeded, element.getName()));
	}
	
	private static File getFile(IEditorInput element) {
		
		if (element instanceof FileEditorInput)
			return ((FileEditorInput)element).getPath().toFile();
		else if (element instanceof URIEditorInput)
		{
			URI uri = ((URIEditorInput) element).getURI();
			return getJavaFile(uri);
		}
		
		return null;
	}

}
