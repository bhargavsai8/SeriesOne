package Listeners;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.LogStatus;

import BaseClass.BaseClass;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestListener extends BaseClass implements ITestListener {

	public void onFinish(ITestContext context) {
		System.out.println("I am on the end method"+context.getName());
		ExtentTestManager.endTest();
		ExtentManager.getReporter().flush();
	
	}

	public void onStart(ITestContext context) {
		System.out.println("I am on the start method"+context.getName());
		context.setAttribute("WebDriver", this.driver);
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult testResult) {
		System.out.println("Test failed but it is in defined success ratio " + getMethodName(testResult));
		
	}

	public void onTestFailure(ITestResult testResult) {
		// TODO Auto-generated method stub
		Screenshot scr = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		try {
			ImageIO.write(scr.getImage(), "png", new File(System.getProperty("user.dir")+"\\src\\main\\resources\\ashot\\screenshot.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("The test case:"+getMethodName(testResult)+"failed");
		ExtentTestManager.getTest().log(LogStatus.FAIL, "The test case has been failed",ExtentTestManager.getTest().addScreenCapture(System.getProperty("user.dir")+"\\src\\main\\resources\\ashot\\screenshot.jpg"));
	
	}

	public void onTestSkipped(ITestResult testResult) {
		System.out.println("I am on the test skip method: "+getMethodName(testResult)+"skips");
		ExtentTestManager.getTest().log(LogStatus.SKIP, "The test case has been skipped");
	}

	public void onTestStart(ITestResult testResult) {
		System.out.println("I am on the start of a test method: " +getMethodName(testResult)+"starts");
		ExtentTestManager.startTest(testResult.getMethod().getMethodName());
		
		
	}

	public void onTestSuccess(ITestResult testResult) {
		System.out.println("The test is a success"+getMethodName(testResult));
		ExtentTestManager.getTest().log(LogStatus.PASS, "The test case has been passed");
	}
	
	
	public static String getMethodName(ITestResult testResult)
	{
		return testResult.getMethod().getConstructorOrMethod().getName();
	}

}
