package restassuredAPI;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class ApiTest {

	    // Base URL for the API
	    private static final String BASE_URL = "https://example.com/api"; // Replace with your API's base URL

	    @BeforeClass
	    public void setup() {
	        // Set the base URI for RestAssured
	        RestAssured.baseURI = BASE_URL;
	    }

	    @Test
	    public void testInvalidAgeType() {
	        // JSON body with an invalid "age" (as a string instead of a number)
	        String requestBody = "{\n" +
	                             "    \"name\": \"John\",\n" +
	                             "    \"age\": \"twenty-five\",\n" + // Invalid: "age" is a string
	                             "    \"email\": \"john@example.com\"\n" +
	                             "}";

	        // Sending the request and getting the response
	        Response response = RestAssured.given()
	                                      .header("Content-Type", "application/json")
	                                      .body(requestBody)  // Pass the invalid body
	                                      .post("/user");     // Replace with your actual endpoint

	        // Validate the response status code
	        Assert.assertEquals(response.statusCode(), 400, "Expected status code 400 for invalid input");

	        // Optionally, assert the error message or validation response
	        String errorMessage = response.jsonPath().getString("message");
	        Assert.assertTrue(errorMessage.contains("Invalid input: 'age' should be a number but a string was provided"),
	                          "Expected error message related to 'age' being a string.");
	    }

	    @Test
	    public void testInvalidEmailFormat() {
	        // JSON body with an invalid email (not a proper email format)
	        String requestBody = "{\n" +
	                             "    \"name\": \"John\",\n" +
	                             "    \"age\": 25,\n" +
	                             "    \"email\": \"johnexample.com\"\n" +  // Invalid: email is not in proper format
	                             "}";

	        // Sending the request and getting the response
	        Response response = RestAssured.given()
	                                      .header("Content-Type", "application/json")
	                                      .body(requestBody)  // Pass the invalid body
	                                      .post("/user");     // Replace with your actual endpoint

	        // Validate the response status code
	        Assert.assertEquals(response.statusCode(), 400, "Expected status code 400 for invalid input");

	        // Optionally, assert the error message or validation response
	        String errorMessage = response.jsonPath().getString("message");
	        Assert.assertTrue(errorMessage.contains("Invalid email format"),
	                          "Expected error message related to email format.");
	    }
	}


