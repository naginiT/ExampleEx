package crud;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apsrtc 
{
	@Test
	public void search()
    {
    	System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	     driver.manage().window().maximize();
  	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://www.apsrtconline.in/oprs-web/");
         driver.findElement(By.xpath("//*[@id=\'fromPlaceName\']")).sendKeys("hyd");
         //driver.findElement(By.xpath("//*[@id=\'ui-id-13\']")).click();
         
         List<WebElement> list=driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
         System.out.println(list.size());
         for(WebElement e:list)
         {
        	 if(e.getText().equalsIgnoreCase("HYDERABAD AIRPORT-RGIA"))
        	 {
        		 e.click();
        	 }
         }
}
}
