package ecommerceproject_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.junit.Test;

public class Flipkart {
	
	@Test
	public void flipkarttest() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		Reporter.log("opening flipkart", true);
		driver.get("www.flipkart.com");
		Thread.sleep(3000);
		driver.close();
		
	}
}
