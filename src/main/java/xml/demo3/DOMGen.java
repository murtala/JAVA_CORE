package xml.demo3;

import java.io.FileOutputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class DOMGen {
	public static void main(String rags[]) throws Exception {
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();

		// create root element
		Element rootEle = doc.createElement("students");
		Element studentEle = doc.createElement("student");
		Element sidEle = doc.createElement("sid");
		Element snameEle = doc.createElement("sname");
		Element emailEle = doc.createElement("email");
		Element mobileEle = doc.createElement("mobile");

		// create 4 text nodes
		Text t1 = doc.createTextNode("1");
		Text t2 = doc.createTextNode("ABC");
		Text t3 = doc.createTextNode("abc@gomail.com");
		Text t4 = doc.createTextNode("9848022338");

		// adding text to element
		sidEle.appendChild(t1);
		snameEle.appendChild(t2);
		emailEle.appendChild(t3);
		mobileEle.appendChild(t4);

		// adding elements to studentEle
		studentEle.appendChild(sidEle);
		studentEle.appendChild(snameEle);
		studentEle.appendChild(emailEle);
		studentEle.appendChild(mobileEle);

		// adding studentEle to rootEle
		rootEle.appendChild(studentEle);

		// add rootEle to doc
		doc.appendChild(rootEle);

		// write doc object into file
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		
		DOMSource docObj = new DOMSource(doc);
		StreamResult sr = new StreamResult(new FileOutputStream("C:\\ws_2\\XmlDemo\\students.xml"));
		t.transform(docObj, sr);
		System.out.println("students.xml file has been created");
	}
}