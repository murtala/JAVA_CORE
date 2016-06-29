package xml.demo1;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;

class DOMGen {
	public static void main(String rags[]) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		dbf.setValidating(true);
		
		DocumentBuilder db = dbf.newDocumentBuilder();
		db.setErrorHandler(new EH());
		Document doc = db.newDocument();

		// create root element
		Element rootEle = doc.createElement("students");
		Element studentEle = doc.createElement("student");
		Element sidEle = doc.createElement("sid");
		Element snameEle = doc.createElement("sname");
		Element email = doc.createElement("email1");
		Element mobileEle = doc.createElement("mobile");

		// create 4 text nodes
		Text t1 = doc.createTextNode("1");
		Text t2 = doc.createTextNode("ABC");
		Text t3 = doc.createTextNode("abc@gomail.com");
		Text t4 = doc.createTextNode("9848022338");

		// adding text to element
		sidEle.appendChild(t1);
		snameEle.appendChild(t2);
		email.appendChild(t3);
		mobileEle.appendChild(t4);

		// adding elements to studentEle
		studentEle.appendChild(sidEle);
		studentEle.appendChild(snameEle);
		studentEle.appendChild(email);
		studentEle.appendChild(mobileEle);

		// adding studentEle to rootEle
		rootEle.appendChild(studentEle);

		// add rootEle to doc
		doc.appendChild(rootEle);

		// write doc object into file
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		t.transform(new DOMSource(doc), new StreamResult(new FileOutputStream(
				"students.xml")));
	}
}