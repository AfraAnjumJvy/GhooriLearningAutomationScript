package AllTestCases;

import org.testng.annotations.Test;

import AllPages.HomePage;
import AllPages.SetUrl;
import Utility.ReportDetailsdesign;


public class TC_102_HeaderMenu_TestCase extends  SetUrl {
	
	@Test(priority=2)
	public void HeaderMenuCheck()
	{
	
	try
	{
		logger=report.createTest("TC-1.0.2,   Feature:HomePage");
		//logger=report.createTest("TC-1.0.2   Feature: HomePage");// this line for reporting  testCase title
		
		System.out.println("HeaderMenuCheck()");
		String versionText=HomePage.webLanguage(driver).getAttribute("textContent");
		System.out.println("versionText" +versionText);
		
		String webVersionExpectedText = "বাংলা                                    " ;		
		//String categoryExpectedText="ক্যাটাগরি সমূহ";	&& categoryText.equalsIgnoreCase(categoryExpectedText)
		
		////Validation
		if( versionText.equalsIgnoreCase(webVersionExpectedText) ) 
		{
			
			// write the test case details inside of the Quotation( for passed case) 
			String testDetails= ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.2" + ReportDetailsdesign.Case()+"Showed header menu properly when choose bangla  web version" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + " Will show all menu properly" + ReportDetailsdesign.ActualResult() + " Same as expected" + ReportDetailsdesign.Comment() + "Null" + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
			logger.pass(testDetails);
		}
		else  {
			
			// write the test case details inside of the Quotation( for failed case )
			String testDetails= ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.2" + ReportDetailsdesign.Case()+"Showed header menu properly when choose bangla  web version" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + "Will show all menu properly " + ReportDetailsdesign.ActualResult() + " did not show headers properly " + ReportDetailsdesign.Comment() + "DId not match with the web language " + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
					logger.fail(testDetails);
			
		}
		
		
	}
	catch(Exception exp)
	{
		
		System.out.println("HeaderMenu()");
	    String getError = exp.getMessage();
	    System.out.println(getError);
	    String failedMessage = getError.substring(0, 200);
	    System.out.println(failedMessage);
	   
		// here customize all testcase related data except faildMessage , it will show auto
	    String testDetails=  ReportDetailsdesign.ReportTableHeader() + ReportDetailsdesign.CaseNo()+ "1.0.2" + ReportDetailsdesign.Case()+"Showed header menu properly when choose bangla  web version" + ReportDetailsdesign.Prerequisite() + "Null"+ ReportDetailsdesign.Steps() +"Null" + ReportDetailsdesign.ExpectedResult() + "Will show all menu properly" + ReportDetailsdesign.ActualResult() + " did not run the test code  " + ReportDetailsdesign.Comment() + failedMessage + ReportDetailsdesign.PreVersion()+ "1.0.0" + ReportDetailsdesign.PostVersion() ; 
	    logger.fail(testDetails);
	
	}
	
	
	
	
	}

}
