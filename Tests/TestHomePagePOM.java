package Tests;

import org.testng.annotations.Test;
import pageObjectModel.Base;
public class TestHomePagePOM extends Base{

	@Test(priority =1)
	public void testCase2(){
		driver.get("https://www.github.com");
	}
	
	
}
