package Listeners;

import java.util.HashMap;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentTestManager {
	
	public static ExtentReports extent = ExtentManager.getReporter();
	public static Map extentTestMap = new HashMap();
	
	public static synchronized ExtentTest startTest(String testName)
	{
		ExtentTest test = extent.startTest(testName);
		
		extentTestMap.put((int)(long)Thread.currentThread().getId(), test);
		return test;
	}
	
	public static synchronized ExtentTest getTest()
	{
		return (ExtentTest) (extentTestMap.get((int)(long)(Thread.currentThread().getId())));
	}
	
	public static synchronized void endTest()
	{
		extent.endTest((ExtentTest)extentTestMap.get((int)(long)(Thread.currentThread().getId())));
	}

}
