package test_Scripts_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import pages.Google_Search_pom_demo2;


public class Google_search_Test {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		
		
		GoogleSearch();
		

	}

	
	public static void GoogleSearch()
	{
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		 
	Google_Search_pom_demo2 obj = new Google_Search_pom_demo2(driver);
	
	System.out.println("Before entering google");
	
	driver.get("https://google.com/"); 
	
	System.out.println("after entering google");
	
	obj.enterTextInBox("Learning selenium");
	
	obj.clickSearchBox();
	
	driver.close();
	
	}
}
