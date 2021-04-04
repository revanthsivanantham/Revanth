package test_Scripts_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_search_TESTNG_demo2 {

	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}
	@Test
	public void GooglesearchTestone() {

		//driver.get("https://google.com/");
		
		driver.get("https://in.yahoo.com/");
		

		driver.findElement(By.name("p")).sendKeys("We are americans by method1");
		
		

		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		
		
		


		
	}
	
	
	
	
	
	@Test
	public void GooglesearchTesttwo() {

		//driver.get("https://google.com/");
		
		driver.get("https://in.yahoo.com/");
		

		driver.findElement(By.name("p")).sendKeys("We are americans executed by method 2 ");
		
		

		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		
		
		


		
	}
	
	
	@AfterTest
	public void CloseDriver() {
		
		System.out.println("Google search successful");
	}
}
