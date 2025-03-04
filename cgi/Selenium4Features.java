package cgi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Selenium4Features extends Base{

	// public static By element = By.tagName("div");
	public static By someOtherElement = By.xpath("//*[test='username']");
	public static By someOtherElement1 = By.xpath("//*[test='username']");
	public static WebDriver driver;

	public static WebElement ele;
	public static WebElement ele1;
	@Test
	public static void selenium4W3CWebDriverManager() throws Exception{
		try {
			//ele = driver.findElement(with(By.tagName("div").toLeftOf(someOtherElement)));
			//ele1 = driver.findElement(with(By.tagName("div").toRightOf(someOtherElement1)));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
