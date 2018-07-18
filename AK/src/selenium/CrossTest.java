package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossTest
{

	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void invoke(String browser) throws Exception
	{
		
		if(browser.equalsIgnoreCase("browser"))
		{
		
			System.setProperty("webdriver.firefox.marionette", "E:\\AK\\AKS\\ak\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		else if(browser.equalsIgnoreCase("browser"))
		{
			 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
	   	     WebDriver driver = new ChromeDriver(); 
		}
		
	}
	
	@Test
	public void passing() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		
		WebElement un = driver.findElement(By.xpath("//*[@id=\'email\']"));
		
		un.sendKeys("8688767379");
		
		WebElement pwd = driver.findElement(By.xpath("//*[@id=\'pass\']"));
		
		pwd.sendKeys("Ak/naidu/8688@");
	}
}