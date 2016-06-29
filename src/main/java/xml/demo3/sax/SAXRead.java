package xml.demo3.sax;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import xml.demo3.dao.DbDao;
import xml.demo3.vo.Student;


class SAXRead extends DefaultHandler {
	
	List<Student> studList = null; 
	Student stud = null;
	String nodeName = null;
	
	public void startDocument() throws SAXException {
		System.out.println("Document begins here");
		studList = new ArrayList<Student>();
	}

	public void startElement(String namespaceURI, String localName,
			String qName, Attributes attrs) throws SAXException {
		
		nodeName = qName;
		
		if(qName != null && qName.equals("student")) {
			stud = new Student();
			System.out.println(qName + " element starts here");
		}
		
		/*int len = attrs.getLength();
		for (int i = 0; i < len; i++) {
			System.out.println(attrs.getQName(i) + "  " + attrs.getValue(i));
		}*/
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		String nodeValue = new String (ch,start, length);
		System.out.println(nodeValue);
		//System.out.println(new String(ch, start, length));
		
		if(nodeName != null && !nodeName.trim().equals("") && nodeValue != null && !nodeValue.trim().equals("") ) {
			if(nodeName.trim().equals("sid")) {
				stud.setSid(Integer.parseInt(nodeValue.trim()));
			} else if(nodeName.trim().equals("sname")) {
				stud.setSname(nodeValue.trim());
			} else if(nodeName.trim().equals("email")) {
				stud.setEmail(nodeValue.trim());
			} else if(nodeName.trim().equals("mobile")) {
				stud.setMobile(nodeValue.trim());
			}
		}
		
	}

	public void endElement(String nuri, String lname, String qn)
			throws SAXException {
		System.out.println(qn + " element ends here");
		if(qn.equals("student")) {
			studList.add(stud);
		}
	}

	public void endDocument() throws SAXException {
		System.out.println("Document ends here");
		DbDao.insertStuds(studList);
	}

	public static void main(String rags[]) throws Exception {
		SAXParserFactory spf = SAXParserFactory.newInstance();
		spf.setNamespaceAware(true);
		spf.setValidating(true);
		
		System.setProperty("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
		System.setProperty("http://java.sun.com/xml/jaxp/properties/schemaSource", "students.xsd");

		SAXParser sp = spf.newSAXParser();
		sp.parse(new FileInputStream("students.xml"), new SAXRead());
	}
}