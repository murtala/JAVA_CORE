package propertiesfiles;

import java.io.FileInputStream;
import java.util.Properties;

import collections.list.List;

public class Client {
	
	public static void main(String[] args) throws Exception {

		Properties p = new Properties();
		
		p.load(new FileInputStream("db.properties"));
		
		String type = p.getProperty("type");
		
	/*	List list = ObjectFactory.getInstance(type);
		list.m1();
		list.m2();*/

	}

}
