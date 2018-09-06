package Listeners;

import org.apache.log4j.Logger;

public class LoggerClass {
	
	public static Logger log = Logger.getLogger("devPinoyLogger");
	
	public static void startTest(String testName)
	{
		log.info("*^*^*^*^*^*^*^*^*");
		log.info("Test case starts: "+testName);
		log.info("*^*^*^*^*^*^*^*^*");
	
	}
	
	public static void endTest(String testName)
	{
		log.info("*^*^*^*^*^*^*^*^*");
		log.info("Test case ends: "+testName);
		log.info("*^*^*^*^*^*^*^*^*");
	
	}
	
	
	public static void warnTest(String warnMessage)
	{
		log.warn("XXXXXXXXXXXXXXXXXXXXX");
		log.warn("WARNING: "+warnMessage);
		log.warn("XXXXXXXXXXXXXXXXXXXXX");
	}
	
	public static void errorTest(String errorMessage)
	{
		log.warn("XOXOXOXOXOXOXOXOXOXOXOX");
		log.error("ERROR: "+errorMessage);
		log.warn("XOXOXOXOXOXOXOXOXOXOXOX");
	}
	
	public static void infoTest(String info)
	{
		log.info("IiIiIiIiIiIiIiIiIi");
		log.info(info);
		log.info("IiIiIiIiIiIiIiIiIi");
		
	}
	
	
	

}
