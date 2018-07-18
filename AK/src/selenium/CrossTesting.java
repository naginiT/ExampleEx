package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import org.testng.annotations.Test;

public class CrossTesting {

	public WebDriver driver;

  @Parameters("browser")

  @BeforeTest


  public void beforeTest(String browser) 
  {


  if(browser.equalsIgnoreCase("firefox"))
  {
	  System.setProperty("webdriver.firefox.marionette", "E:\\AK\\AKS\\ak\\geckodriver.exe");
	   driver = new FirefoxDriver();


  }else if (browser.equalsIgnoreCase("Chrome")) 
  { 


	  System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
	   driver = new ChromeDriver(); 

  } 


  driver.get("https://accounts.google.com/ServiceLogin?sacu=1 &scc=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&ss=1&ltmpl=default&rm=false");

  }


  @Test 
  public void login() throws InterruptedException {

	  driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("seelamanilkumar95");
	    driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("Ak/naidu/77300#");
	    driver.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();

	}  

  @AfterClass 
  public void afterTest()
  {
   }

}