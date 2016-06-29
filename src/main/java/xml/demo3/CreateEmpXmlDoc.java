package xml.demo3;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import xml.demo3.dao.DbDao;
import xml.demo3.vo.Emp;



public class CreateEmpXmlDoc {
	
	public static void main(String[] args) throws Exception {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document doc = db.newDocument();
		
		List<Emp> empList = DbDao.getEmps();
		
		Element empsRootEle = doc.createElement("emps");
		
		Element empEle = null;		
		Element empno    = null;
		Element ename    = null;
		Element job      = null;
		Element mgr      = null;
		Element hiredate = null;
		Element sal      = null;
		Element comm     = null;
		Element deptno   = null;
		
		Text empnoText    = null;
		Text enameText    = null;
		Text jobText      = null;
		Text mgrText      = null;
		Text hiredateText = null;
		Text salText      = null;
		Text commText     = null;
		Text deptnoText   = null;
		
		
		

		
		for(int i = 0; i < empList.size(); i ++) {
			empEle = doc.createElement("emp");
			empno    = doc.createElement("EMPNO");
			ename    = doc.createElement("ENAME");
			job      = doc.createElement("JOB");
			mgr      =   doc.createElement("MGR");    
			hiredate = doc.createElement("HIREDATE");
			sal      = doc.createElement("SAL");
			comm     = doc.createElement("COMM");
			deptno   = doc.createElement("DEPTNO");
			
			Emp emp = empList.get(i);
			
			
			 empnoText    = doc.createTextNode(Integer.toString(emp.getEmpNo()));
			 enameText    =  doc.createTextNode(emp.getEname());
			 jobText      =  doc.createTextNode(emp.getJob());
			 mgrText      =  doc.createTextNode(Integer.toString(emp.getMgr()));
			 
			 SimpleDateFormat format = new SimpleDateFormat ("MM/dd/yyyy");
			 String hireDateStr = format.format(emp.getHireDate());
			 
			 hiredateText =  doc.createTextNode(hireDateStr);			 
			 salText      =  doc.createTextNode(Float.toString(emp.getSal()));
			 commText     =  doc.createTextNode(Float.toString(emp.getCom()));
			 deptnoText   =  doc.createTextNode(Integer.toString(emp.getDeptNo()));
			 
			 empno.appendChild(empnoText);
			 ename.appendChild(enameText);
			 job.appendChild(jobText);
			 mgr.appendChild(mgrText);
			 hiredate.appendChild(hiredateText);
			 sal.appendChild(salText);
			 comm.appendChild(commText);
			 deptno.appendChild(deptnoText);
			 
			 
			 empEle.appendChild(empno);
			 empEle.appendChild(ename);
			 empEle.appendChild(job);
			 empEle.appendChild(mgr);
			 empEle.appendChild(hiredate);
			 empEle.appendChild(sal);
			 empEle.appendChild(comm);
			 empEle.appendChild(deptno);
			 
			 empsRootEle.appendChild(empEle);
			 
			
		}
		
		doc.appendChild(empsRootEle);

		// write doc object into file
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		
		DOMSource docObj = new DOMSource(doc);
		StreamResult sr = new StreamResult(new FileOutputStream("Emp.xml"));
		t.transform(docObj, sr);
		System.out.println("Emp.xml file has been created");
	
		
	}

}
