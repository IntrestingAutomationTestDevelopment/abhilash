package synechron;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	    WebDriver driver;
	    
	    // Locators for login fields
	    By username = By.id("username");
	    By password = By.id("password");
	    By loginButton = By.id("login");

	    // Constructor
	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    // Actions on login page
	    public void enterUsername(String user) {
	        driver.findElement(username).sendKeys(user);
	    }

	    public void enterPassword(String pass) {
	        driver.findElement(password).sendKeys(pass);
	    }

	    public void clickLoginButton() {
	        driver.findElement(loginButton).click();
	    }
	}


