package NTT;

	import io.restassured.RestAssured;
	import io.restassured.response.Response;
	import static io.restassured.RestAssured.given;
	import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import Utils.BaseTest;

	public class GETUserTest extends BaseTest {

	    @Test
	    public void testGetUser() {
	        Response response = given()
	                .when()
	                .get("/users/2")
	                .then()
	                .statusCode(200)
	                .body("data.id", equalTo(2))
	                .body("data.email", containsString("@reqres.in"))
	                .log().all()
	                .extract().response();

	        Assert.assertEquals(response.getStatusCode(), 200, "Expected Status Code: 200");
	    }
	}
	


