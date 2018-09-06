package Listeners;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getReporter()
	{
		if(extent==null)
		{
			String path = System.getProperty("user.dir");
			extent = new ExtentReports(path+"\\ExtentReports\\ExtentReport.html");
		}
		return extent;
	}

	
}
