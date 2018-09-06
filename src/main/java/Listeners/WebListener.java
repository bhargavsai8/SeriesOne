package Listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebListener implements WebDriverEventListener{

	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before Navigating to the url: "+url);
		
	}

	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("After Navigating to the url: "+url);
		
	}

	public void beforeNavigateBack(WebDriver driver) {
		System.out.println("Before navigating back");
		
	}

	public void afterNavigateBack(WebDriver driver) {
		System.out.println("After navigating back");
		
	}

	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Before find by: "+by.toString());
		
	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("After find by: "+by.toString());
		
	}

	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Before click on element: "+element.toString());
		
	}

	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println("After click on element: "+element.toString());
		
	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}

	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

}
