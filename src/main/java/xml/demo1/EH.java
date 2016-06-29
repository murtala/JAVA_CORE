package xml.demo1;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

class EH implements ErrorHandler {
	
	public void error(SAXParseException e) throws SAXException {
		System.err.println(e);
		System.exit(0);
	}

	public void fatalError(SAXParseException e) throws SAXException {
		System.err.println(e);
		System.exit(0);
	}

	public void warning(SAXParseException e) throws SAXException {
		System.err.println(e);
	}
}