package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames 
{

	public static void main(String[] args) 
	{
		 
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
 	     WebDriver driver = new ChromeDriver();
 	     driver.get("file:///E:/AK/AKS/ak/HtmlTask1/WebContent/frames.html");
 	     driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         List <WebElement> list=driver.findElements(By.tagName("frame"));
        System.out.println(list.size());
        driver.switchTo().frame(0);
         driver.findElement(By.xpath("/html/body/form/input[4]")).click();
         driver.switchTo().defaultContent();
        
         
        /*int find = list.size();

        if(find == 0)
        {
        	System.out.println("element found");
        }
        else
        {
        	System.out.println("element found");
        }

	}*/
        
        
}
}
