package keywordframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser
{
	public static WebDriver driver;
	public static void brosercode()
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Jar files\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void fbappInvoke()
	{
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
	
	}
	public static void fbemail()
	{
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("8688767379");
		
	}
	public static void fbpass()
	{
		
	driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1424235");
		
	}
}