package log4j;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesRead {

	public static void main(String args[]) throws Exception {
		
		Properties browserProperties = new Properties();
		FileInputStream props = new FileInputStream("src\\work.properties");
	//	FileInputStream props = new FileInputStream("src\\log4j\\test.xml");


		try {

			browserProperties.load(props);
			// System.out.println(browserProperties.toString());
		}

		finally {
			props.close();
		}

		String sComp = browserProperties.getProperty("name");
		String sComp1 = browserProperties.getProperty("city");
		
		System.out.println(sComp);
		System.out.println(sComp1);

	}

}