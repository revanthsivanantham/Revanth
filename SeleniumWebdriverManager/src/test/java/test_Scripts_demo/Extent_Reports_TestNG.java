package test_Scripts_demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports_TestNG {

	ExtentReports extent = null;
	
	
	 ExtentTest test = null;
	 
	 WebDriver driver = null;
	 
	 
	@BeforeSuite
	public void setUp()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
	    
        // create ExtentReports and attach reporter(s)
         extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        
	}
	
	@BeforeTest
	public void setupTest()
	{
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	
	@Test
	public void TestScripts1() throws IOException
	{
		 test = extent.createTest("MyFirstTest", "Sample description");
		 
		 driver.get("https://in.yahoo.com/");
			test.pass("Navigated to google.com");
			
			driver.findElement(By.name("p")).sendKeys("Uganda");
			test.pass("Entered India in google search");
			
			driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
			test.pass("Pressed enter key");
		 
		 test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.info("This step shows usage of info(details)");
	        
	        // log with snapshot
	        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        //test.addScreenCaptureFromPath("screenshot.png");
	}
	
	
	@Test
	public void TestScripts2() throws IOException
	{
		 test = extent.createTest("MysecondTest", "Sample description");
		 
		 test.log(Status.INFO, "This step shows usage of log(status, details)");

	        // info(details)
	        test.pass("This step shows usage of info(details)");
	        
	        // log with snapshot
	        //test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
	        
	        // test with snapshot
	        //test.addScreenCaptureFromPath("screenshot.png");
	}
	
	@AfterTest
	public void CloseDriver() {
		driver.close();
		driver.quit();
		System.out.println("Google search successful");
	}
	
	@AfterSuite
	public void Teardown()
	{
		// calling flush writes everything to the log file
        extent.flush();
	}
	
}
