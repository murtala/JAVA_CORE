package propertiesfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropFile {

	Properties prop = new Properties();
	static OutputStream output = null;
	InputStream input = null;

	public void readProp(File propFile) {
		try {
			prop = new Properties();
			input = new FileInputStream(propFile);

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			System.out.println(prop.getProperty("database"));
			System.out.println(prop.getProperty("dbuser"));
			System.out.println(prop.getProperty("dbpassword"));

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	public void writeProp(File propFile) {

		// create object for Properties class
		prop = new Properties();

		// File file = new File("../resources/files/Config.properties");

		propFile = new File(propFile.getAbsolutePath().replace("..", "src\\main"));

		try {

			output = new FileOutputStream(propFile);

			// set the properties value
			prop.setProperty("database", "localhost");
			prop.setProperty("dbuser", "mkyong");
			prop.setProperty("dbpassword", "password");

			// save properties to project root folder
			prop.store(output, null);

		} catch (Exception io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
