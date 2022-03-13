package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements AutoConstant
{
	public WebDriver driver;
	
	@BeforeMethod
	public void setup()
	{
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.quit();
	}
}