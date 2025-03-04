package Tests;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.BaseTest;

public class LaunchTest extends BaseTest {
	WebDriver driver;
	/**
	 * Can Priority be negative o positive
	 */
	
	@Test(priority=1)
	public  void pageTitleCheck() {
	 String pageTitle = driver.getTitle();
	 
	}

	@Test(priority=2)
	public void launchUrl() {
		driver.get("www.amazon.com");
	}

	@Test(priority=1)
	public  void reload() {
	 //String pageTitle = driver.getTitle();
	 driver.navigate().refresh();
	}

}
