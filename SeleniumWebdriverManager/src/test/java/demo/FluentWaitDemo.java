package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitDemo {

	public static void main(String[] args) throws Exception {
		demo1();
	}

	public static void demo1() throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("Abcd");
		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.ENTER);
		// driver.findElement(By.linkText("ABCD (Any Body Can Dance")).click();

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.

		// Waiting 30 seconds for an element to be present on the page, checking
		// for its presence once every 5 seconds.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				WebElement linkelement = driver.findElement(By.linkText("Alphabet Song | abc Songs | abcd song"));
				if (linkelement.isEnabled()) {
					System.out.println("Linkelement is enabled");
				}

				return linkelement;
			}
		});

		element.click();
		Thread.sleep(3000);

		driver.close();
		driver.quit();
	}
}
