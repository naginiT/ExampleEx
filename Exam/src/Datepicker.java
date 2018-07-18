import java.sql.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Datepicker {
	
	@Test
	public void m()
	{
		String m="June"; int y=1996;
		System.setProperty("webdriver.chrome.driver","D:\\Harish\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/button/span[1]")).click();	
		
	//  driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[2]/span")).click();
	
	  WebElement year= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/div/span[2]"));
	  int yer =Integer.parseInt(year.getText());
	  
	 if(y<yer)
	 {
		
		 WebElement prev= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[1]/span")); 
	   while(y!=yer)
	   {
		  prev.click();
		  yer =Integer.parseInt(year.getText());
	   }
	  WebElement month= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/div/span[1]"));
	  while(!(month.getText().equalsIgnoreCase(m)))
	  {
		  prev.click();
	  }
	  List< WebElement> day=driver.findElements(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr/td/a"));
	
	  for(WebElement e:day)
      {
      	if(e.getText().equalsIgnoreCase("14"))
      	{
      		e.click();
      	}
	  }
	 }
	  else if(y>yer)
		 {
			
			 WebElement next=  driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/a[2]/span")); 
		   while(y!=yer)
		   {
			  next.click();
			  yer =Integer.parseInt(year.getText());
		   }
		  WebElement month1= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/div/span[1]"));
		  while(!(month1.getText().equalsIgnoreCase(m)))
		  {
			  next.click();
		  }
		  List< WebElement> day1=driver.findElements(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr/td/a"));
		
		  for(WebElement e:day1)
	      {
	      	if(e.getText().equalsIgnoreCase("15"))
	      	{
	      		e.click();
	      	}
		  }
       }
	  else if(y==yer)
	  {
		  WebElement month2= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/div/div/span[1]"));
		  while((month2.getText().equalsIgnoreCase(m)))
		  {
		  List< WebElement> day2=driver.findElements(By.xpath("//*[@id='divMain']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar/span/div/table/tbody/tr/td/a"));
	
		
		  for(WebElement e1:day2)
	      {
	      	if(e1.getText().equalsIgnoreCase("20"))
	      	{
	      		e1.click();
	      		System.out.println("Today");
	      		java.util.Date d = new java.util.Date();
	    		System.out.println(d);
	    		WebElement f= driver.findElement(By.xpath("//*[@id=\'divMain\']/div/app-main-page/div[2]/div/div[1]/div/div/div[1]/div/app-jp-input/div[3]/form/div[3]/p-calendar"));
	    	    System.out.println(f.getText());
	      	}
		  }
		  }
	  }
	}
}
