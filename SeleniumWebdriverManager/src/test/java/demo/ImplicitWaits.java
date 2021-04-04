package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitWaits {
	
	public static void main(String[] args) {
		Implicitwait();
	}

	@SuppressWarnings("deprecation")
	public static void Implicitwait()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("Automation");
		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("abcd")));
		driver.findElement(By.name("pqr")).sendKeys("Automation");
		driver.close();
		driver.quit();
	}
}
