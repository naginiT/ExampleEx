package sel.com;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frame
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\app selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/NSSS%20KKISHORE/Desktop/Ramya/WebContent/index.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		List<WebElement> list = driver.findElements(By.tagName("frame"));
		System.out.println(list.size());
		driver.switchTo().frame(0);
	    driver.findElement(By.linkText("cubicit")).click();
	    driver.switchTo().defaultContent();
	    driver.switchTo().frame(driver.findElement(By.xpath(".//frame[@src='index3.html']")));
	    driver.findElement(By.xpath(".//a[@href='https://www.cubicitsolution.in/webmail']")).click();
	    
	    
	  
	   
		
		
	   
	    
	    
	    

	}

}
