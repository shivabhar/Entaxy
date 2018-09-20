package testScript;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;



import pageObjectModel.LoginPage;
import testData.DataFile;
import util.DriverUtilities;

public class ForumAppTest {

	DriverUtilities myDriverUtilities;
	WebDriver driver;
	
	@Before
	public void init()
	{
		myDriverUtilities = DriverUtilities.getInstance();
		driver = myDriverUtilities.getDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest() throws InterruptedException
	{
		driver.get(testData.DataFile.mainPageurl);
		pageObjectModel.ForumAppPage.clickForum(driver).click();
		Thread.sleep(1000);
		
	}
}
