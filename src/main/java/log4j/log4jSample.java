package log4j;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;


public class log4jSample {

		//private static Logger Log = Logger.getLogger(log4jSample.class.getName());
	    static final Logger Log = LogManager.getLogger(log4jSample.class.getName());
		public static void main(String[] args) {

			DOMConfigurator.configure("log4j.xml");

			Log.trace("tracing stuff");
	        Log.info("New driver instantiated");
	        Log.debug("Implicit wait applied on the driver for 10 seconds");
	        Log.error("Web application launched");

	        Log.fatal("Click action performed on My Account link");

	        Log.warn("Username entered in the Username text box");


		}

	}
	
	

