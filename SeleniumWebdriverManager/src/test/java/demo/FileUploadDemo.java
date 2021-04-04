package demo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadDemo {

	public static void main(String[] args) throws IOException {
		demo();
	}
	
	public static void demo() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://easyupload.io/");
		driver.findElement(By.id("dropzone")).click();
		Runtime.getRuntime().exec("C:\\Users\\sharmila shri\\workspace\\Revanth\\SeleniumWebdriverManager\\drivers\\geckodriver\\FileUploadScript.exe");
	}

}
