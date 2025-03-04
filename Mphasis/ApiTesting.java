package Mphasis;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTesting {

	// Base URL of the API
	/**
	 *200 OK: Successful request.
	 *201 Created: Resource successfully created.
	 *400 Bad Request: Invalid request syntax.
	 *401 Unauthorized: Authentication required.
	 *404 Not Found: Resource not found.
	 *500 Internal Server Error: Server encountered an error.
	 */
	private static final String BASE_URL = "https://jsonplaceholder.typicode.com/posts";

	public static void main(String[] args) {
		testGetPosts();
		testCreatePost();
		testUpdatePost();
		testDeletePost();
	}

	public static void testGetPosts() {
		System.out.println("\nTesting GET method...");
		Response response = given().when().get(BASE_URL).then().assertThat().statusCode(200)
				.body("size()", greaterThan(0)) // Ensure the response contains data
				.extract().response();

		System.out.println("GET request successful. Total posts: " + response.jsonPath().getList("").size());
	}

	public static void testCreatePost() {
		System.out.println("\nTesting POST method...");
		String payload = "{ \"title\": \"foo\", \"body\": \"bar\", \"userId\": 1 }";

		Response response = given().header("Content-Type", "application/json").body(payload).when().post(BASE_URL)
				.then().assertThat().statusCode(201).extract().response();

		int createdPostId = response.jsonPath().getInt("id");
		System.out.println("POST request successful. Created Post ID: " + createdPostId);
	}

	public static void testUpdatePost() {
		System.out.println("\nTesting PUT method...");
		int postId = 1; // Assuming we update the post with ID 1
		String payload = "{ \"title\": \"updated title\", \"body\": \"updated body\", \"userId\": 1 }";

		Response response = given().header("Content-Type", "application/json").body(payload).when()
				.put(BASE_URL + "/" + postId).then().assertThat().statusCode(200).extract().response();

		String updatedTitle = response.jsonPath().getString("title");
		System.out.println("PUT request successful. Updated Title: " + updatedTitle);
	}

	public static void testDeletePost() {
		System.out.println("\nTesting DELETE method...");
		int postId = 1; // Assuming we delete the post with ID 1

		given().when().delete(BASE_URL + "/" + postId).then().assertThat().statusCode(200);

		System.out.println("DELETE request successful. Post ID: " + postId);
	}
	/**
	 * The PATCH method is used to partially update a resource. 
	 * It modifies only the specified fields in the resource, leaving others unchanged.
	 */
	/**
	 * The PUT method is used to update an entire resource. 
	 * It replaces the current resource representation with the new one provided in the request.
	 */
}
