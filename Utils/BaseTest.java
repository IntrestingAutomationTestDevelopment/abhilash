package Utils;

	import io.restassured.RestAssured;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

	public class BaseTest {

		public static WebDriver driver;
	    @BeforeClass
	    public void setup() {
	        //RestAssured.baseURI = "https://reqres.in/api";  // Base URL for API Testing
	    }
	    
	    @AfterClass
	    public void tearDown() {
	        //RestAssured.baseURI = "https://reqres.in/api";  // Base URL for API Testing
	    }
	}


