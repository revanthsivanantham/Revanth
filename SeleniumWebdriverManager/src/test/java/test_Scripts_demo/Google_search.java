package test_Scripts_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_search {

	public static void main(String[] args) {

		Googlesearch2222();
	}

	public static void Googlesearch2222()
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://in.yahoo.com/");
		

		driver.findElement(By.name("p")).sendKeys("AMERICAAAA");
		
		

		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		System.out.println("Google search successful");
		

		
	}
}
