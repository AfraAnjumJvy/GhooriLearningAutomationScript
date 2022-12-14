package AllPages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage{
	
	private static WebElement languageElement = null;
	
	/*
	@FindBy(xpath="//*[@id=\"__layout\"]/div/div[2]/header/nav/div/div[2]/ul/li[1]/a") WebElement webVersion;

*/
	// Header Menu
	public static  WebElement webLanguage(WebDriver driver)
	{

		languageElement = driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/header/nav/div/div[2]/ul/li[1]/a"));
		return languageElement;
	}
}

