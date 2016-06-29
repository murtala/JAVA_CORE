package xml.demo3.eroors;

import org.xml.sax.*;

public class EH implements ErrorHandler {
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