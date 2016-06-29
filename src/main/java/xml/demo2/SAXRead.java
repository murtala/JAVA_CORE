package xml.demo2;

import java.io.FileInputStream;
import java.sql.Timestamp;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import xml.demo2.dao.DbDao;
import xml.demo2.vo.Emp;


class SAXRead extends DefaultHandler {
	
	Emp emp = null;
	String elementName = null;
	
	public void startDocument() throws SAXException {
		
		//System.out.println("Document begins here---------------------------------------*********************----------------------------");
		
	}
	
	public void endDocument() throws SAXException {
		//System.out.println("Document ends here---------------------------------------*********************----------------------------");
	}

	public void startElement(String namespaceURI, String localName,
			String qName, Attributes attrs) throws SAXException {
		System.out.println(qName + " element starts here");
		
		elementName = qName;
		
		if(elementName.equalsIgnoreCase("emp")) {
			emp = new Emp();
		}
		
		int len = attrs.getLength();
		for (int i = 0; i < len; i++) {
			//System.out.println(attrs.getQName(i) + "  " + attrs.getValue(i));
		}
	}
	
	public void endElement(String nuri, String lname, String qn)
			throws SAXException {
		//System.out.println(qn + " element ends here");
		if(qn.equalsIgnoreCase("emp")) {
			DbDao dDao = new DbDao();
			System.out.println(emp);
			dDao.createEmp(emp);
			emp = null;
		}
		
		
		elementName = null;
	}

	public void characters(char ch[], int start, int length)
			throws SAXException {
		
		String data  =  new String(ch, start, length);
		
		
		
		if(data != null && !data.trim().equals("")) {
			
			
			System.out.println("data = " + data);
			
			if(elementName.equalsIgnoreCase("EMPNO")) {
				emp.setEmpNo(Integer.parseInt(data));
			} else if(elementName.equalsIgnoreCase("ENAME")) {
				emp.setEname(data);
			} else if(elementName.equalsIgnoreCase("JOB")) {
				emp.setJob(data);
			} else if(elementName.equalsIgnoreCase("MGR")) {
				emp.setMgr(Integer.parseInt(data));
			} else if(elementName.equalsIgnoreCase("HIREDATE")) {
				/*Date date;
				try {
					DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
					date = format.parse(elementName);
					emp.setHireDate(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}*/
				
			} else if(elementName.equalsIgnoreCase("SAL")) {
				emp.setSal(Float.parseFloat(data));
			} else if(elementName.equalsIgnoreCase("COMM")) {
				emp.setCom(Float.parseFloat(data));
			} else if(elementName.equalsIgnoreCase("DEPTNO")) {
				emp.setDeptNo(Integer.parseInt(data));
			}
		}
		
	}
	

	public static void main(String rags[]) throws Exception {
		SAXParserFactory spf = SAXParserFactory.newInstance();

		SAXParser sp = spf.newSAXParser();
		SAXRead saxRead = new SAXRead();
		
		sp.parse(new FileInputStream("Emp.xml"), saxRead);
	}
}