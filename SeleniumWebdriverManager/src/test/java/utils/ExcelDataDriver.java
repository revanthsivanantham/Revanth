package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataDriver {
	
	WebDriver driver = null;
	
	@BeforeTest
	public void setUpTest() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test(dataProvider = "test1data")
	public void test1(String UserName1, String Password1) throws Exception
	{
		System.out.println(UserName1+"  -  "+Password1);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys(UserName1);
		driver.findElement(By.id("txtPassword")).sendKeys(Password1);
		Thread.sleep(2000);
	}
	
	@DataProvider(name = "test1data")
	public Object[][] getData()
	{
		String projectpath = System.getProperty("user.dir");
		String ExcelPath = projectpath+"\\excel\\data.xlsx";
		Object[][] data1 = testData(ExcelPath, "Sheet1");
		return data1;
	}
		
	public Object[][] testData(String excelpath, String sheetname) {
		
		ExcelUtils obj1 = new ExcelUtils(excelpath, sheetname);
		int rowsCount = ExcelUtils.countRow();
		int columnsCount = ExcelUtils.countColumn();
		Object data[][] = new Object[rowsCount-1][columnsCount];
		System.out.println(data.length);
		
		for(int i=1;i<rowsCount;i++){
			
			for(int j=0;j<columnsCount;j++){
				String cellData = ExcelUtils.getCellData(i,j);
				//System.out.print(cellData+" | ");
				data[i-1][j] = cellData;
			}
			System.out.println("");
		}
		return 	data;
		
	}

	}
