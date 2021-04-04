package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Google_Search_pom_demo2 {

	WebDriver driver = null;
	
	By searchbox_name = By.name("q");
	
	By search_button = By.name("btnK");
	
	public Google_Search_pom_demo2(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterTextInBox(String text)
	{
	    driver.findElement(searchbox_name).sendKeys(text);
	    
	}
	
	public void clickSearchBox()
	{
		driver.findElement(search_button).sendKeys(Keys.RETURN);
	}
	
			
	
	
}
