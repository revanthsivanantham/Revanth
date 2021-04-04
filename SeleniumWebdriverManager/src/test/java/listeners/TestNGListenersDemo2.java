package listeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestNGListenersDemo2 {
	
	@Test
	public void test3()
	{
		System.out.println("I am inside test 3");
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://in.yahoo.com/");
		driver.findElement(By.name("p")).sendKeys("We are americans by method1");
		driver.findElement(By.name("abc")).sendKeys("We are americans by method1");
		driver.close();
	}
	@Test
	public void test4()
	{
		System.out.println("I am inside test 4");
		Assert.assertTrue(false);
	}
	@Test
	public void test5()
	{
		System.out.println("I am inside test 5");
		throw new SkipException("This test is skipped");
	}
	

}
