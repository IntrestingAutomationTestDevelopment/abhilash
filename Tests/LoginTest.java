package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.automation.utils.ExcelUtils;

import java.io.IOException;

public class LoginTest {
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void loginWithExcelData() throws IOException {
        // Set up Excel file
		/*
		 * ExcelUtils.setExcelFile("src/test/resources/TestData.xlsx", "Sheet1");
		 * 
		 * // Fetch test data String username = ExcelUtils.getCellData(1, 0); String
		 * password = ExcelUtils.getCellData(1, 1);
		 */
        // Open application and perform login
        driver.get("https://example.com/login");
		/*
		 * driver.findElement(By.id("username")).sendKeys(username);
		 * driver.findElement(By.id("password")).sendKeys(password);
		 * driver.findElement(By.id("loginButton")).click();
		 */
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
