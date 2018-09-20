package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForumAppPage {

	private static WebElement element;
	
	public static WebElement mainPage(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/header/nav/ul/li[1]/a/img"));
		return element;
	}
	
	public static WebElement clickForum(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'app\']/div/div[1]/div/div/div/div/div[1]/div/div[3]/a/div/picture/img"));
		return element;
	}
	

	public static WebElement clickAllCategories(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//*[@id=\'ember745\']/header/div/div/div[2]/span/button[1]/span"));
		return element;
	}
	
}
