package selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test

public class Download 
{

	 public static void m() throws IOException, Exception
	 {
	 		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
	   	     WebDriver driver = new ChromeDriver(); 
	   	     driver.get("http://cubicitsolution.co.in/project/mpower-admin/admin");
	   	     driver.manage().window().maximize();
	   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   	     driver.findElement(By.xpath("/html/body/div/div/div[1]/div/div/div/form/div/div[2]/div[1]/div/input")).sendKeys("admin");
			 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[2]/div[2]/div/input")).sendKeys("admin321");
			 driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/form/div/div[3]/button")).click();
			 driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div/div[2]/div/div[3]/div/b/a")).click(); 
	         driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/div/div[2]/p/a[1]")).click();
	         
	         Thread.sleep(4000);
	         File file = new File("E:\\AK\\downloads\\Candidates_list.csv");
	         file.delete();
	         
	          File fs= new File("E:\\AK\\downloads");
	          File f= new File("C:\\Users\\PC\\Downloads\\Candidates_list.csv");
	      //  System.out.println(f.exists());
	       
	        FileUtils.moveFileToDirectory(f, fs, true);
	         
	   	     
}
}
