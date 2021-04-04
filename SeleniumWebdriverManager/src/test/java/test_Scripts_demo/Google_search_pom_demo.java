package test_Scripts_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.Google_search_page;


public class Google_search_pom_demo {
	
	
	static WebDriver driver = null;
	

	public static void main(String[] args) {

		Googlesearch();
	}

	public static void Googlesearch()
	{
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		
		driver.get("https://in.yahoo.com/?p=us");
		
		//driver.findElement(By.name("q")).sendKeys("India");
		
		Google_search_page.searchbox(driver).sendKeys("Brandi love sexy");
		
		System.out.println("Searched Brandi love");
		
		//driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
		
		Google_search_page.searchbutton(driver).sendKeys(Keys.RETURN);
		
		System.out.println("Google search successful");
		

		
	}
}
