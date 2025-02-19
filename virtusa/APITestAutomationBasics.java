package virtusa;

	import io.restassured.RestAssured;
	import io.restassured.http.ContentType;
	import io.restassured.response.Response;
	import org.testng.Assert;
	import org.testng.annotations.Test;

	public class APITestAutomationBasics {

	    @Test
	    public void testCreatePost() {
	        // Specify the base URL
	        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

	        // Request body
	        String requestBody = "{\n" +
	            "  \"title\": \"foo\",\n" +
	            "  \"body\": \"bar\",\n" +
	            "  \"userId\": 1\n" +
	            "}";

	        // Send POST request
	        Response response = RestAssured.given()
	                                        .contentType(ContentType.JSON)
	                                        .body(requestBody)
	                                        .when()
	                                        .post("/posts")
	                                        .then()
	                                        .extract()
	                                        .response();

	        // Validate response status code
	        Assert.assertEquals(response.getStatusCode(), 201);

	        // Validate response body
	        String responseBody = response.getBody().asString();
	        Assert.assertTrue(responseBody.contains("foo"));
	        Assert.assertTrue(responseBody.contains("bar"));

	        // Validate that the userId is returned correctly in the response
	        Assert.assertTrue(responseBody.contains("\"userId\": 1"));
	    }
	}


