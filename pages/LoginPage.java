package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	// Web elements
	@FindBy(xpath = "username")
	private WebElement usernameField;

	@FindBy(xpath = "password")
	private WebElement passwordField;

	@FindBy(xpath = "loginButton")
	private WebElement loginButton;

	// Constructor
	public LoginPage(WebDriver driver) {
		// Initialize web elements using PageFactory
		PageFactory.initElements(driver, this);
	}

	// Method to perform login
	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}

	// Methods to interact with the elements
	public void enterUsername(String username) {
		usernameField.sendKeys(username);
	}

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickLoginButton() {
		loginButton.click();
	}
}
