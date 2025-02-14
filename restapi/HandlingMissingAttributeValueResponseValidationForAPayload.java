package restapi;
	import io.restassured.RestAssured;
	import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;

	public class HandlingMissingAttributeValueResponseValidationForAPayload {
	    public static void main(String[] args) {
	        RestAssured.baseURI = "https://api.example.com";
	        
	        given().
	            param("userId", 123).
	        when().
	            get("/users").
	        then().
	            statusCode(200).
	            body("user.name", notNullValue())  // Ensure 'name' exists
	            .body("user.email", either(equalTo("test@example.com")).or(isEmptyOrNullString()));  // Email may be missing or null
	    }
	}


