package AllTestCases;


import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import AllPages.SetUrl;
import Utility.ReportDetailsdesign;


public class TC_101_GetHomePage_TestCase extends SetUrl{

	@Test(priority=1)
	public void FindHomePage()
	{
	
	try
	{
		System.out.println("FindHomePage()");
		logger=report.createTest("Ghoori Learning "+ "<br>"	+ "TC-1.0.1,   Feature: HomePage");// this line for reporting  testCase title
		
		////Validation
		WebElement HomepageElement= driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div[2]/header/nav/div/div[2]/ul/li[2]/a"));
		String HomepageElementText= HomepageElement.getAttribute("textContent");		
		System.out.println(HomepageElementText);
		String homepageExpectedText="লগ ইন";		
		
		if( HomepageElementText.equalsIgnoreCase(homepageExpectedText)) 
		{
			
			// write the test case details inside of the Quotation( for passed case) 
			String testDetails= ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.1" + ReportDetailsdesign.Case()+"Hit  the below link in the browser \r\n" + 
					"https://ghoorilearning.com/" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + "Will redirect to ghoori Learning webpage " + ReportDetailsdesign.ActualResult() + " Same as expected" + ReportDetailsdesign.Comment() + "Null" + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
			logger.pass(testDetails);
		}
		else  {
			
			// write the test case details inside of the Quotation( for failed case )
			String testDetails= ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.1" + ReportDetailsdesign.Case()+"Hit  the below link in the browser \r\n" + 
					"https://ghoorilearning.com/" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + "Will redirect to ghoori Learning webpage " + ReportDetailsdesign.ActualResult() + " did not rediect to homepage " + ReportDetailsdesign.Comment() + "DId not find login button " + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
					logger.fail(testDetails);
			
		}
		
		
	}
	catch(Exception exp)
	{
		
		System.out.println("Failed Login()");
	    String getError = exp.getMessage();
	    String failedMessage = getError.substring(0, 150);
	    System.out.println(failedMessage);
	   
		// here customize all testcase related data except faildMessage , it will show auto
	    String testDetails=  ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.1" + ReportDetailsdesign.Case()+"Hit  the below link in the browser \r\n" + 
				"https://qa-stage-v2.ghoorilearning.com" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + "Will redirect to ghoori Learning webpage " + ReportDetailsdesign.ActualResult() + " did not rediect to homepage " + ReportDetailsdesign.Comment() + failedMessage + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
	    logger.fail(testDetails);
	
	}
	
	
	
	
}

	
	
}

