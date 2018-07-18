package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowsing
{
@Parameters({"usr","pwd"})
@Test
 public void open(String usr, String pwd) throws Exception
 {
	System.setProperty("webdriver.firefox.marionette", "E:\\AK\\AKS\\ak\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver(); 
    driver.get("https://accounts.google.com/ServiceLogin?sacu=1 &scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");
    driver.manage().window().maximize();
   
    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(usr);
    driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(pwd);
    driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
    }
 @Parameters({"usr","pwd"})
@Test
 public void login(String usr,String pwd ) throws Exception
 {
	System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://accounts.google.com/ServiceLogin?sacu=1 &scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");
	    driver.manage().window().maximize();
	   
	    driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys(usr);
	    driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys(pwd);
	    driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
 }
 }

