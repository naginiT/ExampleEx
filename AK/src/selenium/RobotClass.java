package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException
	{

		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
   	     WebDriver driver = new ChromeDriver(); 
   	     driver.get("http://imagetopdf.com/");
   	     driver.manage().window().maximize();
   	     driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
   	     /*driver.findElement(By.xpath("//*[@id=\"pick-files\"]/span[2]")).click();
   	     Thread.sleep(4000);
         StringSelection ss= new StringSelection("C:\\Users\\PC\\Desktop\\Cubic_files\\logo.png");
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
         Robot rr=new Robot();
         rr.keyPress(KeyEvent.VK_CONTROL);
         rr.keyPress(KeyEvent.VK_C);
         rr.keyRelease(KeyEvent.VK_CONTROL);
         rr.keyRelease(KeyEvent.VK_C);
         
         rr.keyPress(KeyEvent.VK_CONTROL);
         rr.keyPress(KeyEvent.VK_V);
         rr.keyRelease(KeyEvent.VK_CONTROL);
         rr.keyRelease(KeyEvent.VK_V);
         
         rr.keyPress(KeyEvent.VK_ENTER);
         rr.keyRelease(KeyEvent.VK_ENTER);
         
         
         
         */
         
	}

}
