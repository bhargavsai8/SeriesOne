package Listeners;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import BaseClass.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class RetryAnalyserOne extends BaseClass implements IRetryAnalyzer{

	int counter= 0;
	int retryLimit=2;
	public boolean retry(ITestResult testResult) {
		if(!testResult.isSuccess())
		{
		if(counter<retryLimit)
		{
			counter++;
			try {
				extentReportsFailureOperation(testResult, counter);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			testResult.setStatus(ITestResult.FAILURE);
			return true;
		}
		}
		else
		{
			testResult.setStatus(ITestResult.SUCCESS);
		}
		return false;
	}

	public static void extentReportsFailureOperation(ITestResult testResult, int counter) throws IOException
	{
		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(screenshot.getImage(), "png",  new File(System.getProperty("user.dir")+"\\src\\main\\resources\\ashot\\screenshot"+counter+".jpg"));
		ExtentTestManager.getTest().log(LogStatus.FAIL, "The test case has failed", ExtentTestManager.getTest().addScreenCapture(System.getProperty("user.dir")+"\\src\\main\\resources\\ashot\\screenshot"+counter+".jpg"));
	}

}
