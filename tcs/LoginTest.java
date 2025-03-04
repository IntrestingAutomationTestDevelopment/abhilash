package tcs;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

/*
 * import org.testng.annotations.DataProvider; import
 * org.testng.annotations.Test; import org.testng.Assert;
 * 
 * public class LoginTest {
 * 
 * // DataProvider that uses Excel data
 * 
 * @DataProvider(name = "excelData") public Object[][] getExcelData() throws
 * IOException { return
 * ExcelUtils.getTestData("path_to_your_excel_file/testdata.xlsx", "Sheet1"); }
 * 
 * // Test method that takes data from Excel
 * 
 * @Test(dataProvider = "excelData") public void testLogin(String username,
 * String password) { // Simulate a login test with the provided username and
 * password System.out.println("Testing login with username: " + username +
 * " and password: " + password);
 * 
 * // Assume some login method exists // login(username, password);
 * 
 * // For the purpose of this example, we'll assert the login should succeed
 * Assert.assertTrue(username.length() > 0 && password.length() > 0,
 * "Username and password cannot be empty!"); } }
 * 
 * }
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import Utils.ExcelUtils;

import java.io.IOException;

public class LoginTest {
    WebDriver driver;
    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        // Set the path to the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("http://example.com/login");
    }

    @DataProvider(name = "loginData")
    public Object[][] getLoginData() throws IOException, InvalidFormatException {
        // Set the path of the Excel file and sheet
        String excelPath = "C:\\Users\\hp\\eclipse-workspace\\abhilash\\src\\test\\resources\\testData\\TestData.xlsx";
        ExcelUtils.setExcelFile(excelPath, "Sheet1");
        
        int rowCount = ExcelUtils.getRowCount();
        Object[][] data = new Object[rowCount][2]; // Assuming 2 columns (username, password)

        for (int i = 0; i < rowCount; i++) {
            data[i][0] = ExcelUtils.getCellData(i, 0); // Username
            data[i][1] = ExcelUtils.getCellData(i, 1); // Password
        }
        return data;
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
        loginPage.clickLogin();
        
        // Verify login error (adjust based on your application)
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Invalid credentials";  // Adjust this based on expected message
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
