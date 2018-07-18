package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiBrowser 
{
	
	
	
	 /* driver.get("https://www.shopclues.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Actions act=new Actions(driver);       
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform(); 
    driver.get("https://www.amazon.in/"); 
    act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
    act.keyDown(Keys.CONTROL).sendKeys("t").keyUp(Keys.CONTROL).build().perform(); 
    driver.get("https://www.whaaky.com/"); 
    act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).keyUp(Keys.CONTROL).build().perform();
    */

	
	@Test
	 public void first()
	 {    
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver();
  	   driver.get("https://www.shopclues.com/");
  	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      Boolean find =  driver.findElements(By.xpath("//*[@id='nav-xshop']/a[4]")).size()!= 0;
      if (find == true)
      {
       System.out.print(" Is Present ");
      }
      else
      {
       System.out.print(" Is Not Present ");
      }
  	      
	 }
	 
	@Test
	 public void second()
	 {    
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	   driver.get("https://www.amazon.in/");
  	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
     
      Boolean find =  driver.findElements(By.xpath("//*[@id='nav-xshop']/a[4]")).size()!= 0;
      if (find == true)
      {
       System.out.print(" Is Present");
      }
      else
      {
       System.out.print(" Is Not Present ");
      }
  	      
	 }
	@Test
	
	 public void last()
	 {    
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	   driver.get("https://www.whaaky.com/"); 
  	  driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      Boolean find =  driver.findElements(By.xpath("//*[@id='nav-xshop']/a[4]")).size()!= 0;
      if (find == true)
      {
       System.out.print(" Is Present ");
      }
      else
      {
       System.out.print(" Is Not Present ");
      }
  	      
	 }
	        


	     

	      

	}

