import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webelements {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver= new ChromeDriver();
	
		 
		 driver.get("https://in.yahoo.com/?p=us");
		 
		 WebElement textbox = driver.findElement(By.xpath("//input[@id='header-search-input']"));
		 textbox.sendKeys("Brandi love sexy");
		 
		List<WebElement> ListOfWebElements = driver.findElements(By.xpath("//input"));
		 
		
		int size = ListOfWebElements.size();
		
		System.out.println("Size of WebElements is - "+size);
		 
		 
	}

}
