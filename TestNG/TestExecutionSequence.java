package TestNG;

	import org.testng.annotations.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	public class TestExecutionSequence {
	public String baseUrl = "https://www.browserstack.com/";
	String driverPath = "D:\\Selenium\\chromedriver.exe";
	public WebDriver driver ;
	@BeforeTest
	public void launchBrowser() {
	System.out.println("launching Chrome browser");
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
	driver.get(baseUrl);
	}
	@Test
	public void verifyHomepageTitle() {
	String expectedTitle = "Most Reliable App & Cross Browser Testing Platform | BrowserStack";
	String actualTitle = driver.getTitle();
	Assert.assertEquals(actualTitle, expectedTitle);
	}
	@AfterTest
	public void terminateBrowser(){
	driver.close();
	}
	}

