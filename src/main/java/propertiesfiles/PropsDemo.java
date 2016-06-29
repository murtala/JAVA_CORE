package propertiesfiles;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;


public class PropsDemo {
	
	public static void main(String[] args) throws Exception {
		
		
		Properties p = new Properties();
		
		p.load(new FileInputStream("db.properties"));
		
		System.out.println(p.getProperty("name"));
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("pass"));
		System.out.println(p.getProperty("url"));

		
		
		
	}

}
