package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class DriverUtilities {
	
	private static DriverUtilities instanceOfDriverUtilities;
	private WebDriver driver;

	private DriverUtilities() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static DriverUtilities getInstance()
	{
		if(instanceOfDriverUtilities == null)
		{
			instanceOfDriverUtilities = new DriverUtilities();
		}
		return instanceOfDriverUtilities;
	}
	
	public WebDriver getDriver()
	{
		if(driver == null)
		{
			createDriver();
		}
			return driver;
	}
	


	private void createDriver() {
		String driverName = getDriverName();
		
		switch(driverName)
		{
		case "Google Chrome" :
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			this.driver = new ChromeDriver();
			break;
			
		case "FireFox" :
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			this.driver = new FirefoxDriver();
			break;
			
			default:
				break;
		}
		
	}

	private String getDriverName() {
	Properties config = new Properties();
	String driverName = "";
	
	try {
		config.load(new FileInputStream("config.properties"));
	
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	for (String Key : config.stringPropertyNames()) {
		if (Key.equals("browser"))
    	{
    		driverName = config.getProperty(Key);
    	}

	}
		return driverName;
	}
	
	
}
