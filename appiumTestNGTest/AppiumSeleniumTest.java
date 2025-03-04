package appiumTestNGTest;
//public class AppiumSeleniumTest {
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumSeleniumTest {

	private AndroidDriver<MobileElement> driver;

	@BeforeClass
	public void setUp() throws MalformedURLException {
		// Set up DesiredCapabilities
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "Android Emulator"); // Replace with your device name
		capabilities.setCapability("platformVersion", "11.0"); // Replace with your device's Android version
		capabilities.setCapability("appPackage", "com.example.android"); // Replace with your app's package
		capabilities.setCapability("appActivity", "com.example.android.MainActivity"); // Replace with your app's main
																						// activity
		capabilities.setCapability("noReset", true); // Keep app state between sessions

		// Set the Appium server URL
		URL url = new URL("http://127.0.0.1:4723/wd/hub");

		// Initialize AndroidDriver with Appium server and desired capabilities
		driver = new AndroidDriver<>(url, capabilities);
	}

	@Test
	public void testUIInteractions() {
		// Find and click a button by ID
		MobileElement button = driver.findElement(By.id("com.example.android:id/button")); // Replace with actual button
																							// ID
		button.click();

		// Find a TextField (EditText) and input text
		MobileElement textField = driver.findElement(By.id("com.example.android:id/editText")); // Replace with actual
																								// TextField ID
		textField.sendKeys("Appium and Selenium Automation");

		// Find a TextView and verify the text displayed
		MobileElement textView = driver.findElement(By.id("com.example.android:id/textView")); // Replace with actual
																								// TextView ID
		String displayedText = textView.getText();

		// Assert that the text is displayed correctly
		Assert.assertTrue(displayedText.contains("Expected Text"));

		// Optionally, print the displayed text to the console
		System.out.println("Text displayed in TextView: " + displayedText);
	}

	@AfterClass
	public void tearDown() {
		// Quit the driver (close the app session)
		if (driver != null) {
			driver.quit();
		}
	}
}

//}
