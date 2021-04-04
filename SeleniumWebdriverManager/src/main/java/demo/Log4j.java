package demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j {

	
	static Logger logger = LogManager.getLogger(Log4j.class);
	
	
	public static void main(String[] args) {
		
		System.out.println("\n Hello world \n");

		
		logger.trace("This is a trace message");
		
		logger.error("This is an error message");
		
		logger.warn("This is a warning message");
		
		logger.info("This is an info message");
		
		logger.fatal("This is a fatal message");
		
		System.out.println("Completed");
		
		
	
	}

}
