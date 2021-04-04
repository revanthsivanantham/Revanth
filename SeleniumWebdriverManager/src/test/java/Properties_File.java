import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class Properties_File {

	
	
	//1. Create object for properties class
			static Properties prop = new Properties();
			
	//2.Create object for Inputstream.
		static String projectpath =System.getProperty("user.dir");
	
	
	
	public static void main(String[] args) {

	
		properties_config();
		OutputToFile();
		properties_config();
		
	}

	
	public static void properties_config()
	{
		
		try{
		
		
		
		InputStream input = new FileInputStream(projectpath+"\\src\\test\\java\\config.properties");
		
		//3.Load properties file.
		prop.load(input);
		String browser=prop.getProperty("browser");
		System.out.println(browser);
		
		Google_search_TESTNG_demo_default.browser = prop.getProperty("browser");
		
		
		}
		
		catch(Exception exp)
		{
			System.out.println("error message "+exp.getMessage());
			
			System.out.println("cause message "+exp.getCause());
			
		}	
		
		
	}
	
	public static void OutputToFile()
	{
		try{
			FileOutputStream output = new FileOutputStream(projectpath+"\\src\\test\\java\\config.properties");
			prop.setProperty("browser", "firefox");
			prop.setProperty("result", "sri varna");
			prop.store(output, "browser updated");
		
		}
		catch(Exception exp)
		{
			System.out.println("error message "+exp.getMessage());
			
			System.out.println("cause message "+exp.getCause());
			
		}	
	}
	
	}
