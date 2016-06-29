package utilities.xmlRead;

import java.util.*;
import java.io.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ReadXML {
	

public String XMLDataFile="src\\xmlread\\TestData.XML";
	public String sComp;

	public String testCaseDescription, included, ignoreReason, UserName, password;
	    
	public static void main (String args[])
	{
		ReadXML rp= new ReadXML();
		try {
			//rp.readInfo();
			rp.readXML("SGN-0002");
		} catch (Exception e) {
			// 
			e.printStackTrace();
		}
		System.out.println(rp.testCaseDescription);
			
	}
	
	
	

	public void readXML(String testID) throws Exception{
        String testCaseNumber = testID;
        File file = new File(XMLDataFile);
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(file);
        doc.getDocumentElement().normalize();

        NodeList nodeLst = doc.getElementsByTagName("Test");
          for (int s = 0; s < nodeLst.getLength(); s++) {
            Node fstNode = nodeLst.item(s);
            if (fstNode.getNodeType() == Node.ELEMENT_NODE) {
                Element testElmnt = (Element) fstNode;
                String id = testElmnt.getAttribute("id");
                if(id.equals(testCaseNumber))  {
                    testCaseDescription = getNodeElement(testElmnt, "Description");
                    included = getNodeElement(testElmnt, "included");
                    ignoreReason = getNodeElement(testElmnt, "ignoreReason");
                    if(included.equals("No")) 
                    	UserName = getNodeElement(testElmnt, "userName");
                    password = getNodeElement(testElmnt, "password");
                   
                }
            }
       }
    }
	   private static String getNodeElement(Element elementXML ,String ElementTag){
	        NodeList testDescriptionList = elementXML.getElementsByTagName(ElementTag);
	        Element testDescriptionElement = (Element)testDescriptionList.item(0);

	        NodeList textDescrList = testDescriptionElement.getChildNodes();
	        String sValue = ((Node)textDescrList.item(0)).getNodeValue();
	        System.out.println(ElementTag + " : " + sValue);                       
	        return sValue;
	    }
}