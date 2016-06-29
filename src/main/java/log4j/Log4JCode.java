package log4j;
//package log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

/**
 * Parent class for all automation test classes <br>
 * 
 * @author Praveen Reddy
 */
public class Log4JCode {
	static Logger mylogger = Logger.getLogger(Log4JCode.class);
	public static void main(String args[]) {
		mylogger.trace("trace");
		mylogger.debug("debug");
		mylogger.info("info");
		mylogger.warn("warn");
		mylogger.error("error");
		mylogger.fatal("fatal");
		
		
		//mylogger.log(null, "logged");  how to use?
		
	}
}