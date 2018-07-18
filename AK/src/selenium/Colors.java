package selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.testng.annotations.Test;


public class Colors 
{
@Test
    public void mth()
    {
    	System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	     driver.manage().window().maximize();
  	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         driver.get("http://cubicitsolution.co.in/project/quikrdeal/");
       /*  String Color = driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
         System.out.println(Color);
         String hexcode = String.format("#%02x%02x%02x", 25, 180, 83, 1);
         System.out.println(hexcode);*/
        
         
    	
    	String color = driver.findElement(By.xpath("//*[@id=\"locpanel1\"]/div[1]/div/center/h6[2]/a[1]")).getCssValue("color");
    	System.out.println(color);
    	String hex = Color.fromString(color).asHex();
    	System.out.println(hex);
         
         
         
    }
}