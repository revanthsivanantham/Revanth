

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google_search_TESTNG_demo_default {

	
	public static String browser = null;
	
	public static String projectpath = System.getProperty("user.dir");
	
	
	
	
	static WebDriver driver = null;
	
	@BeforeTest
	public static void setUpTest() {

		Properties_File.properties_config();
		
		System.out.println("browser is "+browser); 
		
		System.out.println("Project path is "+projectpath);
		
			
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",projectpath+"\\drivers\\geckodriver\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Driver set success");
		}
		
		else
		{
			
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sharmila shri\\Desktop\\NewChrome\\geckodriver.exe");
			driver = new FirefoxDriver();
		System.out.println("Firefox driver set by revanth");
		}
		
	}
	@Test
	public void GooglesearchTest() {

		//driver.get("https://google.com/");
		System.out.println("Before entering google");
		driver.get("https://in.yahoo.com/");
		
		System.out.println("after entering google");

		driver.findElement(By.name("p")).sendKeys("India");
		
		

		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);

		
	}
	@AfterTest
	public void CloseDriver() {
		
		System.out.println("Google search successful");
		Properties_File.OutputToFile();
	}
}
