package synechron;

import org.openqa.selenium.WebDriver;
import synechron.LoginPage;
public class TestLoginPage {
	WebDriver driver;
	
	LoginPage loginPage = new LoginPage(driver);
	
	public void test() {
	loginPage.enterUsername("admin");
	loginPage.enterPassword("password");
	loginPage.clickLoginButton();
	}
}
