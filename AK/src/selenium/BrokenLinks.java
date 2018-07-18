package selenium;
 
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
 public class BrokenLinks {
 public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
 
 driver.manage().window().maximize();
 
 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
 driver.get("http://driversmirror.com/hp-deskjet-3512-drivers-download-windows-7-8-1-10-xp/");

 Thread.sleep(5000);
 List<WebElement> links = driver.findElements(By.tagName("a")); 
 links.addAll(driver.findElements(By.tagName("img")));
 System.out.println("Total links are "+links.size()); 
 
 for(int i=0; i<links.size(); i++)
 {
 WebElement element = links.get(i);
 String url=element.getAttribute("href");
 verifyLink(url); 
 } 
 }
  public static void verifyLink(String urlLink)
  {
        try
{
 URL link = new URL(urlLink);
 HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
 httpConn.setConnectTimeout(2000);
 httpConn.connect();
 if(httpConn.getResponseCode()== 200)
 { 
 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
 }
 if(httpConn.getResponseCode()== 404)
 {
 System.out.println(urlLink+" - "+httpConn.getResponseMessage());
 }
 }
 catch (Exception e)
 {
	 
 }
    } 
}