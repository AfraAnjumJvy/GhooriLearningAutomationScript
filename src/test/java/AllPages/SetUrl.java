package AllPages;


import org.openqa.selenium.WebDriver;

import Utility.BaseClass;
import Utility.BrowserDriverInformation;




public class SetUrl extends BaseClass  {
	

	public static  WebDriver driver;
	
	public void Url()
	{
	
		String URL="https://ghoorilearning.com/";
		driver=BrowserDriverInformation.startApplication(driver, "Chrome", URL);
		
	}
	

}
