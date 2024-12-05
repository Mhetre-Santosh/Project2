package ClearTrip.Project2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Launch_Quit {

	static WebDriver driver;
	
	@BeforeMethod
	public void login ()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	/*@AfterMethod
	public void Quit ()
	{
		driver.quit();
	}*/
}
