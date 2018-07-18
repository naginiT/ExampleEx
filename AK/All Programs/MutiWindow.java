package sel.com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MutiWindow
{
	public WebDriver driver;
	public void shiftWindow()
	{
		 Set<String> window =driver.getWindowHandles();
		   Iterator itr = window.iterator();
		   String s = "";
		   while(itr.hasNext())
		   {
			   s = (String) itr.next();
		   }
		   driver.switchTo().window(s);
		 driver.manage().window().maximize();
	}

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\app selenium\\chromedriver.exe");
		MutiWindow m = new MutiWindow();
	   m. driver = new ChromeDriver();
		m.driver.get("file:///C:/Users/NSSS%20KKISHORE/Desktop/Ramya/index.html");
		m.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		m.driver.manage().window().maximize();
	   m.driver.findElement(By.xpath("/html/body/button")).click();
	   m.shiftWindow();
	   m.driver.findElement(By.xpath("/html/body/button")).click();
	   m.shiftWindow();
	   
	   Set<String> browser = m.driver.getWindowHandles();
	   Iterator itr = browser.iterator();
	   String str = "";
	  
	   while(itr.hasNext())
	   {
		   str = (String) itr.next();
		   m.driver.switchTo().window(str);
			String title = m.driver.getCurrentUrl();
			if (title.equalsIgnoreCase("file:///C:/Users/NSSS%20KKISHORE/Desktop/Ramya/index1.html")) 
			{
				m.driver.close();
				
			}
	   }
	  
	 }
	

	   
	
		

	}


