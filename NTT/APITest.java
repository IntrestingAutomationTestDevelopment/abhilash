package NTT;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import org.testng.Assert;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class APITest {

	    // Base URL for the API
	    private static final String BASE_URL = "https://jsonplaceholder.typicode.com";

	    @BeforeClass
	    public void setup() {
	        // Set the base URI for Rest Assured
	        RestAssured.baseURI = BASE_URL;
	    }

	    // Test GET request to fetch posts
	    @Test
	    public void testGetPosts() {
	        Response response = RestAssured
	            .given()
	            .when()
	            .get("/posts")
	            .then()
	            .statusCode(200) // Assert status code is 200
	            .extract()
	            .response();

	        // Assert that the response is a JSON array
	        Assert.assertTrue(response.getBody().asString().startsWith("["));
	    }

	    // Test GET request for a single post
	    @Test
	    public void testGetSinglePost() {
	        Response response = RestAssured
	            .given()
	            .when()
	            .get("/posts/1")
	            .then()
	            .statusCode(200) // Assert status code is 200
	            .extract()
	            .response();

	        // Assert that the response contains a "title" field
	        Assert.assertNotNull(response.jsonPath().get("title"));
	    }

	    // Test POST request to create a new post
	    @Test
	    public void testPostData() {
	        String requestBody = "{\n" +
	                             "  \"title\": \"foo\",\n" +
	                             "  \"body\": \"bar\",\n" +
	                             "  \"userId\": 1\n" +
	                             "}";

	        Response response = RestAssured
	            .given()
	            .header("Content-Type", "application/json")
	            .body(requestBody) // Send request body
	            .when()
	            .post("/posts")
	            .then()
	            .statusCode(201) // Assert status code is 201 (Created)
	            .extract()
	            .response();

	        // Assert that the response contains the same title
	        Assert.assertEquals(response.jsonPath().get("title"), "foo");
	    }

	    // Test PUT request to update an existing post
	    @Test
	    public void testPutData() {
	        String requestBody = "{\n" +
	                             "  \"id\": 1,\n" +
	                             "  \"title\": \"updated title\",\n" +
	                             "  \"body\": \"updated body\",\n" +
	                             "  \"userId\": 1\n" +
	                             "}";

	        Response response = RestAssured
	            .given()
	            .header("Content-Type", "application/json")
	            .body(requestBody) // Send request body
	            .when()
	            .put("/posts/1")
	            .then()
	            .statusCode(200) // Assert status code is 200 (OK)
	            .extract()
	            .response();

	        // Assert that the response contains the updated title
	        Assert.assertEquals(response.jsonPath().get("title"), "updated title");
	    }

	    // Test DELETE request to delete a post
	    @Test
	    public void testDeleteData() {
	        Response response = RestAssured
	            .given()
	            .when()
	            .delete("/posts/1")
	            .then()
	            .statusCode(200) // Assert status code is 200 (OK)
	            .extract()
	            .response();

	        // Optional: Check if the deleted post returns 404 when trying to fetch it
	        Response getResponse = RestAssured
	            .given()
	            .when()
	            .get("/posts/1")
	            .then()
	            .statusCode(404) // Assert status code is 404 (Not Found)
	            .extract()
	            .response();

	        Assert.assertTrue(getResponse.getBody().asString().contains("not found"));
	    }
	}


