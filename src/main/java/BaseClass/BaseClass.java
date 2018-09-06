package BaseClass;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import Listeners.WebListener;

public class BaseClass {
	
	public static WebDriver driver;
	public static Properties prop;
	public static EventFiringWebDriver edriver;
	public static WebListener webListener;
	
	public BaseClass()
	{
		try
		{
		FileInputStream fstream = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Utils\\config.properties");
		prop = new Properties();
		prop.load(fstream);
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
			
		}
	}
	public static void init()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		
		edriver = new EventFiringWebDriver(driver);
		webListener = new WebListener();
		edriver.register(webListener);
		driver=edriver;
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		
		
		
	}
	

}
