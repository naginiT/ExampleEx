package crud;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Date {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
 	     WebDriver driver = new ChromeDriver(); 
 	     driver.manage().window().maximize();
 	     driver.get("https://demos.telerik.com/aspnet-ajax/datepicker/overview/defaultcs.aspx");
 	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 	     driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceholder1_RadDatePicker1_popupButton']")).click();
 	    WebElement el =driver.findElement(By.xpath(".//*[@id='ctl00_ContentPlaceholder1_RadDatePicker1_calendar_Title']"));
         Actions act = new Actions(driver);
         act.contextClick(el).perform();
         List<WebElement> year=driver.findElements(By.xpath(".//*[@id='ctl00_ContentPlaceholder1_RadDatePicker1_calendar_FastNavPopup']/tbody/tr/td[@class='']"));
         System.out.println(year.size());
	}

}
