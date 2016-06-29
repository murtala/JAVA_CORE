package xml.demo3.domread;

//DOMRead.java
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import xml.demo3.dao.DbDao;
import xml.demo3.eroors.EH;
import xml.demo3.vo.Student;


public class DOMRead {
	public static void main(String rags[])  {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();			
			//dbf.setValidating(true);
			dbf.setNamespaceAware(true);				
			DocumentBuilder db = dbf.newDocumentBuilder();
			db.setErrorHandler(new EH());
			Document doc = db.parse(new FileInputStream("students.xml"));
			Element rootEle = doc.getDocumentElement();
			NodeList nl1 = rootEle.getChildNodes();
			int len1 = nl1.getLength(); // 1
			List<Student> studList = new ArrayList<Student>();
			for (int i = 0; i < len1; i++) {
				Node n1 = nl1.item(i); // STUDENT
				NodeList nl2 = n1.getChildNodes();
				int len2 = nl2.getLength(); // 4
				
				Student stud = new Student();
				boolean isAddtoList = false;

				for (int j = 0; j < len2; j++) {
					Node n2 = nl2.item(j);
					NodeList nl3 = n2.getChildNodes(); // text node
					Node n3 = nl3.item(0);
					//Text t = (Text) n3;
					
					if(n3 != null) {
						isAddtoList = true;
						System.out.println(n2.getNodeName() + " : " + n3.getNodeValue());
						if(n2.getNodeName().equalsIgnoreCase("sid")) {
							stud.setSid(Integer.parseInt(n3.getNodeValue()));
						} else if(n2.getNodeName().equalsIgnoreCase("sname")) {
							stud.setSname(n3.getNodeValue());
						} else if(n2.getNodeName().equalsIgnoreCase("email")) {
							stud.setEmail(n3.getNodeValue());
						} else if(n2.getNodeName().equalsIgnoreCase("mobile")) {
							stud.setMobile(n3.getNodeValue());
						}
					}
					//System.out.println(n3.getTextContent());
					//System.out.println(t.getData());
				}// for 2
				if(isAddtoList) {
					studList.add(stud);
				}
				
			}// for 1
			
			
			DbDao.insertStuds(studList);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}// main()
}// class