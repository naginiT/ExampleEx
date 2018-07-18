package pombrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class BrowserInvoking 
{
	public static WebDriver driver;
	public static void invoke() 
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Jar files\\chromedriver.exe");
	     driver = new ChromeDriver(); 
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("https://www.w3schools.com/");
     }
}

