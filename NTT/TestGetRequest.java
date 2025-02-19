package NTT;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class TestGetRequest {

	
	
	@Test
	public void testGetRequest() throws Exception{
		RestAssured.baseURI ="https://jsonplaceholder.typicode.com";
		//Send a GET request to fetch user  with ID 1
		Response response = RestAssured.get("/users/");
		//Validate the response status code and body  content
		response.then().statusCode(200);
		//response.then().body("id",  equalTo(1));
		//response.then().body("name", equalTo("Sai Raghava Abhilash"));
		//response.then().body("email", containsString("Bret"));
		
		
		
	}
}

