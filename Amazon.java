package ecommerceproject_1;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Amazon {

	@Test 
	public void amazontest() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		Reporter.log("opening amazon", true);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.close();
		
	}
}