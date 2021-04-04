package test_Scripts_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Extent_Reports {

	private static WebDriver driver = null;
	
	
	public static void main(String[] args) {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentTest.html");
		ExtentReports extent = new ExtentReports();
		
		extent.attachReporter(htmlReporter);
		
		
		  // creates a toggle for the given test, adds all log events under it    
        ExtentTest test = extent.createTest("Google search test 1", "To check Google search functionality");
        
        WebDriverManager.chromedriver().setup();
		
	    driver = new ChromeDriver();
		
	    test.log(Status.INFO, "Starting test case execution");
	    
	      
		driver.get("https://in.yahoo.com/");
		test.pass("Navigated to google.com");
		
		driver.findElement(By.name("p")).sendKeys("Uganda");
		test.pass("Entered India in google search");
		
		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		test.pass("Pressed enter key");
		
		driver.close();
		driver.quit();
		test.pass("Closed the driver");
		
		test.info("Test completed");
		
		 test.log(Status.INFO, "Finishing test case execution");
		 
		 test.info("Finished everything");
		 
		 
		 
		 ExtentTest test1 = extent.createTest("Google search test 2nd time", "To check Google search functionality");
	        
	        WebDriverManager.chromedriver().setup();
	        
		    driver = new ChromeDriver();
			
		    test1.log(Status.INFO, "Starting test case execution");
		    
		      
			driver.get("https://in.yahoo.com/");
			test1.fail("Navigated to google.com");
			
			driver.findElement(By.name("p")).sendKeys("Brandi love");
			test1.pass("Entered India in google search");
			
			driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
			test1.fail("Pressed enter key");
			
			driver.close();
			driver.quit();
			test1.pass("Closed the driver");
			
			test1.info("Test completed");
			
			 test1.log(Status.INFO, "Finishing test case execution");
			 
			 test1.info("Finished everything");
		 
		
		// calling flush writes everything to the log file
        extent.flush();
		
        
	}

}
