package appiumTestNGTest;

	import io.appium.java_client.MobileElement;
	import io.appium.java_client.android.AndroidDriver;
	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
	import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
	import org.testng.annotations.Test;

	import java.net.MalformedURLException;
	import java.net.URL;

	import static org.testng.Assert.assertTrue;

	public class AppiumTestNGTest {

	    private AndroidDriver<MobileElement> driver;

	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	        // Desired capabilities
	        DesiredCapabilities capabilities = new DesiredCapabilities();
	        capabilities.setCapability("platformName", "Android");
	        capabilities.setCapability("deviceName", "Xiaomi 11i"); // Replace with your device name
	        capabilities.setCapability("platformVersion", "13"); // Replace with your device's Android version
	        capabilities.setCapability("appPackage", "com.example.android"); // Replace with your app's package
	        capabilities.setCapability("appActivity", "com.example.android.MainActivity"); // Replace with your app's main activity
	        capabilities.setCapability("noReset", true); // Keep app state between sessions

	        // Appium server URL
	        URL url = new URL("http://127.0.0.1:4723/wd/hub");

	        // Initialize AndroidDriver with Appium server and desired capabilities
	        driver = new AndroidDriver<>(url, capabilities);
	    }

	    @Test
	    public void testAppFunctionality() {
	        // Find the button element by ID and click it
	    	// AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("https://127.0.0.1:4723/wd/hub"),dc);

	      WebElement button = driver.findElement(By.id("com.example.android:id/button")); // Replace with actual button ID
	        button.click();

	        // Verify that the TextView contains the expected text after the button click
	        WebElement textView = driver.findElement(By.id("com.example.android:id/textView")); // Replace with actual TextView ID
	        String text = textView.getText();

	        // Assert that the text is correct
	        Assert.assertTrue( text.contains("Expected Text"));
           
	        // Optionally, print the text to the console
	        System.out.println("Text displayed in TextView: " + text);
	    }

	    @AfterClass
	    public void tearDown() {
	        // Quit the driver (close the app session)
	        if (driver != null) {
	            driver.quit();
	        }
	    }
	}


