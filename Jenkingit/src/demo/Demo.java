package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	@Test
	public void mthd()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NSSS KKISHORE\\Desktop\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	System.out.println("saydtgtyawd");
	}

}
