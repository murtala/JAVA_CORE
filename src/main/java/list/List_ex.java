package list;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class List_ex 
{
	public static void main(String[] args) 
	{
		List<String> lst=new ArrayList<String>();
		lst.add("selenium");
		lst.add("testing");
		lst.add("java");
		lst.add("programming");
		
		lst.add(2, "qtp");
		
		for(String x : lst)
			System.out.println(x);
		
		lst.remove(2);
		
		HashMap<String, String> hm=new HashMap<String,String>();
		hm.put("sno", "9878");
		hm.put("ename","james");
		hm.put("sal","5000");
		
		hm.put("ename","jack");
		
		System.out.println(hm.get("ename"));
		
		
		
		
		

	}

}
