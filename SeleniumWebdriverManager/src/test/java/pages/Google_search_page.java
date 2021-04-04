package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google_search_page {

	static WebElement element = null;
	
	
	public static WebElement searchbox(WebDriver driver)
	{
	    element	=driver.findElement(By.xpath("//input[@id='header-search-input']"));
	    									//input[@id='header-search-input']
	    
	 
	   return element;
	   
	}
	
	public static WebElement searchbutton(WebDriver driver)
	{
	    element	=driver.findElement(By.xpath("//button[@id='header-desktop-search-button']"));
	    
	  //button[@id='header-desktop-search-button']
	                                    
	   return element;
	   
	}
}
