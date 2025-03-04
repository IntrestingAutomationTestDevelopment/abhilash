package NTT;

import org.testng.annotations.Test;

import Utils.BaseTest;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;

public class UpdateUserTest extends BaseTest {

    @Test
    public void testUpdateUser() {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "John");
        requestParams.put("job", "Senior QA Engineer");

        given()
            .header("Content-Type", "application/json")
            .body(requestParams.toString())
        .when()
            .put("/users/2")
        .then()
            .statusCode(200)
            .body("job", equalTo("Senior QA Engineer"))
            .log().all();
    }
}
