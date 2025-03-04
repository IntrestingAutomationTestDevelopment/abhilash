package NTT;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PUTRequest {

	@Test
	public void testPutRequest() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		String requestBody = "{"+
				 "\"id\": 1,n" +
				 "\"name\": \"John Doe Updated\", \n" +
				 "\"username\": \"johndoe\",\n"+
				"\"email\":\"johnupdate@example.com\"\n"+
				 "}";
		}
	}

