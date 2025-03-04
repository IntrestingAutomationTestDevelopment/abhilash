package tcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LaunchBrowserAndOpenUrl {

	public static WebDriver driver;
	
	@BeforeMethod
	public static void testfunction() {
	 System.setProperty("webdriver.chrome.driver", "C://Users//hp//eclipse-workspace//abhilash//src//main//resources//vendor");
      driver = new ChromeDriver();

	}

     @AfterMethod
    public static void testTearDown() {
     System.out.println("Title of the page: " + driver.getTitle());
     driver.quit();
     
	}
     
     @Test
     public static void qa() {
    	 driver.get("https://www.example.com");
     }
}
