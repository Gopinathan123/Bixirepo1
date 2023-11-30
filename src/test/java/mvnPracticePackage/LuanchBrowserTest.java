package mvnPracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LuanchBrowserTest {
	
	public WebDriver driver;
	@Test
	public void launchtest()
	{
		driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		System.out.println("TestScript running successfully");
	}
}
