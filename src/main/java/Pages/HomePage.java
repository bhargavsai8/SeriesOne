package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(id="lst-ib")
	WebElement searchBox;
		
	@FindBy(name="btnK")
	WebElement searchBtn;
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public SearchPage searchText()
	{
		searchBox.sendKeys(prop.getProperty("value"));
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		searchBtn.click();
		return new SearchPage();
	}

}
