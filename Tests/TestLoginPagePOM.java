package Tests;

import org.testng.annotations.Test;
import pageObjectModel.Base;
public class TestLoginPagePOM extends Base {

	
	
	@Test(priority =1)
	public static void testCase1(){
		driver.get("https://www.chatgpt.com");
	}
	
}
