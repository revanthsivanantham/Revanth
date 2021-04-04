import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesiredCapabilitiess_demo {

	public static void main(String[] args) {

		String projectpath = System.getProperty("user.dir");
		
		System.setProperty("webdriver.ie.driver",projectpath+"\\drivers\\geckodriver\\IEDriverServer.exe");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("ignoreProtectedModeSettings", true);
		
		WebDriver driver = new InternetExplorerDriver(dc);
		
		driver.get("https://in.yahoo.com/");
		
		driver.findElement(By.name("p")).sendKeys("Milf Brandi love hot");
		
		driver.findElement(By.id("header-desktop-search-button")).sendKeys(Keys.RETURN);
		
		//driver.close();
		
		//driver.quit();
		
		
		
	}

}
