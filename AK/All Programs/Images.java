package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Images 
{
	 public static void main(String[] args)
{
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	     driver.get("http://cubicitsolution.co.in/#");
  	     //driver.manage().window().maximize();
  	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
  	     for(int i=1;i<=4;i++)
  	     {
  	     driver.findElement(By.xpath("//*[@id=\'nav-dots\']/span["+i+"]")).click();
  	     WebElement element = driver.findElement(By.xpath("//*[@id='sb-slider']/li["+i+"]/div/h3"));
  	     System.out.println(element.getText());
  	     
  	    // driver.findElement(By.xpath("//*[@id=\'sb-slider\']/li[2]/div/h3"));
  	    // System.out.println(element.getText());
  	     }
  	     
}
}