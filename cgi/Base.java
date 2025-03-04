package cgi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");  // Update with your ChromeDriver path
		driver = new ChromeDriver();
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
