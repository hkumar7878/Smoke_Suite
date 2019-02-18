package SmokeSuite;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_001_SmokeTest {
	
	
	
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void smokeTest()
	{
		String url=driver.getCurrentUrl();
		System.out.println("URL is" +url);
		Assert.assertEquals(url, "https://www.google.com/?gws_rd=ssl");
		
	}
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}

}
