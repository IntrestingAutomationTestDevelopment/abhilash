package Harman;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPostRequest{
@DataProvider(name = "postsData")
public Object[][] postData() {
    return new Object[][] {
        { "foo", "bar", 1 },
        { "title2", "body2", 2 }
    };
}

@Test(dataProvider = "postsData")
public void testPostRequest(String title, String body, int userId) {
    String payload = "{\n" +
            "  \"title\": \"" + title + "\",\n" +
            "  \"body\": \"" + body + "\",\n" +
            "  \"userId\": " + userId + "\n" +
            "}";
    // POST request code here...
}
}