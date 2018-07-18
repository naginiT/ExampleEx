package property;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	public static WebDriver driver;
	
	public static void brosercode()
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void fbappInvoke()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		
	}	
	public static void fbemail() throws Exception
	{
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(Propertyclass.file().getProperty("Email"));
		
	}
	public static void fbpass() throws Exception
	{
		
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Propertyclass.file().getProperty("Password"));
		
	}
}
