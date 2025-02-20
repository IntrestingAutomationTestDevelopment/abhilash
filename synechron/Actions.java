package synechron;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions {

	public static WebDriver driver;
	/**
	 * Implicit Wait
	 */
	public static void waitForPageLoad() {
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	/**
	 * Explicit Wait
	 */
	public static void waitForElement(By by,WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));

	}
	/**
	 * Fluent Wait
	 */
	public static void waitFor(By by,WebDriver driver) {
	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(Duration.ofSeconds(10))
		    .pollingEvery(Duration.ofSeconds(2))
		    .ignoring(NoSuchElementException.class);
	}
	
}
