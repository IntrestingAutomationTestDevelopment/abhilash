package NTT;

	import org.testng.annotations.Test;

import Utils.BaseTest;

import static io.restassured.RestAssured.*;
	import static org.hamcrest.Matchers.*;
	import org.json.JSONObject;

	public class CreateUserTest extends BaseTest {

	    @Test
	    public void testCreateUser() {
	        JSONObject requestParams = new JSONObject();
	        requestParams.put("name", "John");
	        requestParams.put("job", "QA Engineer");

	        given()
	            .header("Content-Type", "application/json")
	            .body(requestParams.toString())
	        .when()
	            .post("/users")
	        .then()
	            .statusCode(201)
	            .body("name", equalTo("John"))
	            .body("job", equalTo("QA Engineer"))
	            .log().all();
	    }
	}
	
	

