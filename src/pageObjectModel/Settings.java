package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Settings {

	private static WebElement element;
	
	public static WebElement clickSettings(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/header/nav/ul/li[4]/a"));
		return element;
	}
	

	
	public static WebElement changePassword(WebDriver driver)
	{
		element = driver.findElement(By.xpath("	//*[@id=\'app\']/div/div[1]/div/div/div/div/div/div/a[2]"));
		return element;
	}
	
	public static WebElement currentPassword(WebDriver driver)
	{
		element = driver.findElement(By.name("currentPassword"));
		return element;
	}
	
	
	public static WebElement newPassword(WebDriver driver)
	{
		element = driver.findElement(By.name("newPassword"));
		return element;
	}
	
	public static WebElement confirmNewPassword(WebDriver driver)
	{
		element = driver.findElement(By.name("newPassword2"));
		return element;
	}
	
	
	public static WebElement clickUpdatePasswordButton(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/div[2]/div/div/div/div/div[4]/button"));
		return element;
	}
	
	public static WebElement mainPage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/header/nav/ul/li[1]/a/img"));
		return element;
	}
	
	

}
