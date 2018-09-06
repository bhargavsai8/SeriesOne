package Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BaseClass;

public class SearchPage extends BaseClass{
	
	@FindAll( value = { @FindBy(xpath=".//div[@class='rSr7Wd']//descendant::div[contains(@class,'So9e7d')]")})
	List<WebElement> clickText;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnText()

	{
		for(int i = 0;i<clickText.size();i++)
		{
			System.out.println(prop.getProperty("clickOn"));
		if(clickText.get(i).getText().contains(prop.getProperty("clickOn")))
		{
			System.out.println(clickText.get(i).getText());
		clickText.get(i).click();
		break;
		}
		}
		
	}
}
