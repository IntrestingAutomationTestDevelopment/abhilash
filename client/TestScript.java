package client;

/*import org.junit.After;
import org.junit.Before;
import org.junit.Test;*/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//public class LoginTest {
	public class TestScript {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Initialize WebDriver
        driver = new ChromeDriver();
        driver.get("https://www.example.com/login");
    }

    @Test
    public void testLogin() {
        // Create a POJO instance with test data
        //UserData user = new UserData("testUser", "testPassword");
    	pojo user = new pojo("testUser", "testPassword");
        // Pass the POJO data to your Page Object (or other actions)
        //LoginPage loginPage = new LoginPage(driver);
    	pagefactory p = new pagefactory(driver);
        //loginPage.login(user.getUsername(), user.getPassword());
    	p.login(user.getUsername(), user.getPassword());

        // You can also add assertions to verify the test
        // For example, verifying that login was successful
        // Assert.assertTrue(driver.getTitle().contains("Dashboard"));
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser after the test
        driver.quit();
    }
}

