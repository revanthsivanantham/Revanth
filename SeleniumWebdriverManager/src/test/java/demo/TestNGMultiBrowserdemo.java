package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGMultiBrowserdemo {
	
	WebDriver driver = null;
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName)
	{
		System.out.println("browser name is "+browserName+"  Thread is "+Thread.currentThread().getId());
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.out.println("inside chrome");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			System.out.println("exiting chrome");
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
	}
	
	@Test
	public void test1() throws Exception
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(4000);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
		System.out.println("driver closed suuccessfully");
	}
}
