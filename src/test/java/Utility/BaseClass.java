package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;



import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import AllPages.SetUrl;





public class BaseClass{
	
	public  WebDriver driver;
	public static ExtentReports report;
	public static ExtentTest logger;
	
	@BeforeSuite
	
		public void setUpSuite() // here wrote code for creating report and set its name with date 
		{
		 System.out.println("before suit text-1");
			Reporter.log("Test is getting ready", true);
			ExtentHtmlReporter extent=new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"/Reports/GhooriLearningTestReport_"+Helper.getCurrentDateTime()+".html"));
			report=new ExtentReports();
			report.attachReporter(extent);
			
			Reporter.log("Test started", true);
		}
	
	
	
	@BeforeSuite
	public void setup()

	{
		

		 System.out.println("before suit text-2");
		Reporter.log("Browser is getting ready", true);
		
		
	
		SetUrl HitUrlObj = new SetUrl();
		HitUrlObj.Url();
		
		
		Reporter.log("Browser running", true);
		try
		{
			Thread.sleep(3000);
		}
		catch(InterruptedException e)
		{
			System.out.println("It will handle by qa");
		}
		
	}
	

  	@AfterSuite
	public void tearDown() 
	{	
		BrowserDriverInformation.quitBrowser(driver);	
		Reporter.log("Quit driver", true);
  		
	}
	
	

	
	@AfterMethod
	
	public void tearDownMethod(ITestResult result) throws IOException
	{
		/*
		Reporter.log("Test is about to end", true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshot(driver);
			logger.fail("Test Failed");
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			//Helper.captureScreenshot(driver);
			logger.pass("Test Passed");
		}
		*/
		System.out.println("before report flush");
		report.flush();
		System.out.println("after teardown method");
		Reporter.log("Report generated", true);
	}
	

		
	
/*	
 * This code block needed when want to capture screenshot and erase previous method
	@AfterMethod
	public void tearDownMethod(ITestResult result) throws IOException
	{
		Reporter.log("Test is about to end", true);
		if(result.getStatus()==ITestResult.FAILURE)
		{
			//Helper.captureScreenshot(driver);
			logger.fail("Test Failed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			//Helper.captureScreenshot(driver);
			logger.pass("Test Passed", MediaEntityBuilder.createScreenCaptureFromPath(Helper.captureScreenshot(driver)).build());
		}
		report.flush();
		
		Reporter.log("Report generated", true);
	}
	*/

}
