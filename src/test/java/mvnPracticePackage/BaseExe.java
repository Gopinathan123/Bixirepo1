package mvnPracticePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class BaseExe {
	public WebDriver driver;
	
	@Test
	public void s5test()
	{
	String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
	
	System.out.println(BROWSER);
	System.out.println(URL);
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("Firefox"))
	{
		driver=new FirefoxDriver();
	}
	else if(BROWSER.equalsIgnoreCase("Edge"))
	{
		driver= new EdgeDriver();
	}
	else
	{
		driver=new ChromeDriver();
	}
	 driver.get(URL);
	
	}

}
