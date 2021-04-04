package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeDemo {

	public static void main(String[] args) {
		demo1();
	}
	public static void demo1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharmila shri\\workspace\\Revanth\\SeleniumWebdriverManager\\drivers\\geckodriver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");
		WebDriver driver = new ChromeDriver(options);
		System.out.println(driver.getTitle());
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("Abcd");
		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		driver.close();
		driver.quit();
		System.out.println("Completed the test");
	}
}
