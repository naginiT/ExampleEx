package sel.com;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\app selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.quackit.com/html/codes/html_popup_window_code.cfm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("html/body/p/a")).click();
		Set<String> window = driver.getWindowHandles();
		//Object[] s = window.toArray();
		Iterator  itr = window.iterator();
		while(itr.hasNext())
		{
			Object s = itr.next();
		}
		
		
		driver.close();

	}

}
