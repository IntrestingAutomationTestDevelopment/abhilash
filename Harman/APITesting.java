package Harman;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class APITesting{

	//public class APITest {

	    // Base URI for the API
	    @BeforeClass
	    public void setup() {
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
	    }

	    // Test for GET request
	    @Test
	    public void testGetRequest() {
	        // Send GET request to the API endpoint
	        int statusCode = RestAssured.given()
	            .when()
	            .get("/posts/1") // API endpoint to fetch post with ID 1
	            .getStatusCode();
	        
	        // Assert the status code
	        Assert.assertEquals(statusCode, 200, "Status code should be 200");
	    }

	    // Test for POST request
	    @Test
	    public void testPostRequest() {
	        String payload = "{\n" +
	                "  \"title\": \"foo\",\n" +
	                "  \"body\": \"bar\",\n" +
	                "  \"userId\": 1\n" +
	                "}";

	        // Send POST request to create a new post
	        String responseBody = RestAssured.given()
	            .header("Content-Type", "application/json")
	            .body(payload)
	            .when()
	            .post("/posts")
	            .then()
	            .statusCode(201) // Assert that the status code is 201 (Created)
	            .extract()
	            .response()
	            .asString();

	        // Assert that the response body contains "id" (indicating successful creation)
	        Assert.assertTrue(responseBody.contains("id"), "Response should contain an ID");
	    }

	    // Test for PUT request
	    @Test
	    public void testPutRequest() {
	        String payload = "{\n" +
	                "  \"id\": 1,\n" +
	                "  \"title\": \"Updated Title\",\n" +
	                "  \"body\": \"Updated Body\",\n" +
	                "  \"userId\": 1\n" +
	                "}";

	        // Send PUT request to update a post
	        RestAssured.given()
	            .header("Content-Type", "application/json")
	            .body(payload)
	            .when()
	            .put("/posts/1") // Update post with ID 1
	            .then()
	            .statusCode(200) // Assert that the status code is 200 (OK)
	            .log().all();
	    }

	    // Test for DELETE request
	    @Test
	    public void testDeleteRequest() {
	        // Send DELETE request to remove a post
	        RestAssured.given()
	            .when()
	            .delete("/posts/1") // Delete post with ID 1
	            .then()
	            .statusCode(200); // Assert that the status code is 200 (OK)
	    }
	}

