package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGpoc {
	public static	WebDriver driver;
	
	@BeforeMethod
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//abhilash//src//main//resources//vendor//chrome-win32//chrome.exe");
		 driver = new ChromeDriver();

	}
	public static void verifyTitle() {
		driver.get("https://www.browserstack.com/");
		Assert.assertEquals(driver.getTitle(), "Most Reliable App & Cross Browser Testing Platform | BrowserStack");
		}
	@Test
	public  void checkTestNGRuns() {
		verifyTitle();
	}
	@AfterMethod
	public static void tearDown() {
		driver.quit();
	}

}
