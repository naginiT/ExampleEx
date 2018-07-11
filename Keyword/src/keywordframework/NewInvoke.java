package keywordframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewInvoke 
{
	public static WebDriver driver;
	public static void invokecode()
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Jar files\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void invokeapp()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
	}
	public static void email()
	{
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("aknaidu@india.com");
		
	}
	public static void pass()
	{
		
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("8688767579");
		
	}
}
