package client;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	//public class LoginPage {
		public class pagefactory {

	    WebDriver driver;

	    @FindBy(id = "username")
	    WebElement usernameField;

	    @FindBy(id = "password")
	    WebElement passwordField;

	    @FindBy(id = "loginButton")
	    WebElement loginButton;

	    // Constructor to initialize the page elements
	  //  public LoginPage(WebDriver driver) {
	    public pagefactory(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    // Method to perform login
	    public void login(String username, String password) {
	        usernameField.sendKeys(username);
	        passwordField.sendKeys(password);
	        loginButton.click();
	    }
	}

//}
