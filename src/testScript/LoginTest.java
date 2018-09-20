package testScript;


import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import pageObjectModel.LoginPage;
import testData.DataFile;
import util.DriverUtilities;

public class LoginTest {

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
		driver.get(testData.DataFile.homePageurl);

		pageObjectModel.LoginPage.clickPortfolioLink(driver).click();
		
		Thread.sleep(2000);
		pageObjectModel.LoginPage.clickLoginButton(driver).click();
		Thread.sleep(1000);
		pageObjectModel.LoginPage.clickCreateBlockstackId(driver).click();
		pageObjectModel.LoginPage.email(driver).sendKeys(testData.DataFile.email);
		pageObjectModel.LoginPage.clicknextButton(driver).click();
		Thread.sleep(1000);
		pageObjectModel.LoginPage.password(driver).sendKeys(testData.DataFile.password);
		pageObjectModel.LoginPage.confirmpassword(driver).sendKeys(testData.DataFile.password);
		pageObjectModel.LoginPage.clickNextPasswordButton(driver).click();
		pageObjectModel.LoginPage.userName(driver).sendKeys(testData.DataFile.username);
		//	pageObjectModel.LoginPage.userName(driver).sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		pageObjectModel.LoginPage.clickCheckAvailablity(driver).click();
		Thread.sleep(2000);
		pageObjectModel.LoginPage.clickConfirmUserName(driver).click();
		Thread.sleep(3000);
		pageObjectModel.LoginPage.clickContinue(driver).click();
		Thread.sleep(2000);
		pageObjectModel.LoginPage.clickGotoBlockstack(driver).click();
		

	}
}
