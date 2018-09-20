package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private static WebElement element;
	
	public static WebElement clickPortfolioLink(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[1]/div[3]/div[2]/div/div[2]/a"));
		return element;
	}
	
	public static WebElement clickLoginButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'root\']/div/div/header/div/button/span[1]"));
		return element;
	}
	
	public static WebElement clickCreateBlockstackId(WebDriver driver)
	{
		element = driver.findElement(By.xpath("	//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/div"));
		return element;
	}
	
	
	public static WebElement email(WebDriver driver)
	{
		element = driver.findElement(By.name("email"));
		return element;
	}
	
	public static WebElement clicknextButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[2]/form/div[2]/button"));
		return element;
	}
	
	public static WebElement password(WebDriver driver)
	{
		element = driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement confirmpassword(WebDriver driver)
	{
		element = driver.findElement(By.name("passwordConfirm"));
		return element;
	}
	
	public static WebElement clickNextPasswordButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[2]/form/div[3]/button/div[1]"));
		return element;
	}
	
	public static WebElement userName(WebDriver driver)
	{
		element = driver.findElement(By.name("username"));
		return element;
	}
	
	public static WebElement clickCheckAvailablity(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[2]/form/div[2]/button"));
		return element;
	}
	
	
	
	public static WebElement clickConfirmUserName(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[2]/form/div[2]/button"));
		return element;
	}
	
	
	public static WebElement clickContinue(WebDriver driver)
	{
		
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[3]/div/div/div"));
		return element;
	}
	
	public static WebElement clickGotoBlockstack(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div[1]/div/div/div/div/div[3]/div/div[1]/div"));
		return element;
	}
}
