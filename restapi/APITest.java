package restapi;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APITest {
	public static void main(String[] args) {
		RestAssured.baseURI = "https://app.beeceptor.com/console/testsairaghava";

		given().param("userId", 123).when().get("/users").then().statusCode(200).body("name",
				equalTo("Sai Raghava Abhilash Kakarla"));
	}
	
	//https:www.ksra.ct.ws
}
