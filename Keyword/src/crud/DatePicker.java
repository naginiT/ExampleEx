package crud;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DatePicker 
{
	@Test
	public void datepic() throws Exception
    {
    	System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
  	     WebDriver driver = new ChromeDriver(); 
  	     driver.manage().window().maximize();
  	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  	     
         //driver.get("https://demos.telerik.com/aspnet-ajax/datepicker/overview/defaultcs.aspx");
         //driver.findElement(By.xpath("//*[@id=\'ctl00_ContentPlaceholder1_RadDatePicker1_popupButton\']")).click();
  	     
         driver.get("https://vuetifyjs.com/en/components/date-pickers");
         driver.findElement(By.xpath("//*[@id=\'usage--1\']/div[2]/div/div/div[2]/div[1]/div/div[1]")).click();
         List<WebElement> year=driver.findElements(By.xpath(".//*[@id='usage--1']/div[2]/div/div/div[2]/div[2]/div/ul/li"));
         System.out.println(year.size());
         for(WebElement y:year)
         {
        	 if(y.getText().equalsIgnoreCase("2000"))
        	 {
        		 y.click();
        		 
        		 WebElement date = driver.findElement(By.xpath(".//*[@id='usage--1']/div[2]/div/div/div[2]/div[2]/div/div[2]"));
        	        List<WebElement> dt =date.findElements(By.tagName("td"));
        	        System.out.println(dt.size());
        		 
        		/* List<WebElement> month =driver.findElements(By.xpath(".//*[@id='usage--1']/div[2]/div/div/div[2]/div[2]/div/div[@class='v-date-picker-table v-date-picker-table--month']/table/tbody/tr/td/button[@class='v-btn v-btn--flat']/div"));
                 System.out.println(month.size());
                 for(WebElement m:month)
                 {
                	 if(m.getText().equalsIgnoreCase("Feb"))
                	 {
                		 m.click();
                		 
                		 List<WebElement> day =driver.findElements(By.xpath(".//*[@id='usage--1']/div[2]/div/div/div[2]/div[2]/div/div[2]/table/tbody/tr/td/button[@class='v-btn v-btn--flat v-btn--floating']/div"));
                		 for(WebElement d:day)
                		 {
                			 if(d.getText().equalsIgnoreCase("8"))
                			 {
                				 d.click();
                			 }
                		 }
                	 }
                 }*/
        	 }
    }
         
         
         
         
       
         
}
	
}
