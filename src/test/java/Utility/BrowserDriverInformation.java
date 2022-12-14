package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import AllPages.SetUrl;


public class BrowserDriverInformation {
	
	public static WebDriver startApplication(WebDriver driver,String browserName,String URL)
	
	{
		if(browserName.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe" );
			driver=new ChromeDriver();
		}
		
		else if(browserName.equals("Firefox")) 
		{
			{
				System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe" );
				driver=new FirefoxDriver();
			}
			
		}
		
	/*	else if(browserName.contentEquals("IE")) 
		{
			System.setProperty("webdriver.ie.driver","./Drivers/IEDriverServer.exe" );
				driver=new InternetExploreDriver();
			}
		}
		*/
		else
		{
		
			System.out.println("We do not support this browser");
		}
		
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(URL); // here hit the url
		
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		
		SetUrl.driver.quit();
		
		
	}




}
