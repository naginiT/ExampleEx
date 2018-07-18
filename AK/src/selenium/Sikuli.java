package selenium;

import java.io.File;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.App;
import org.sikuli.script.Button;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Location;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sikuli 
{
	@Test
	public void m() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		/*driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();*/
		Screen s = new Screen();
		s.find("C:\\Users\\PC\\Desktop\\bhavania.PNG");
		s.click();
		/*Reporter.log("element is clicked");
		TakesScreenshot s = (TakesScreenshot)driver;
		File f = s.getScreenshotAs(OutputType.FILE);
		File fd =new File("E:\\AK\\AKS\\screenimage.png");
		FileUtils.copyFile(f,fd );
		Reporter.log("<br><img src='"+fd+"' height='50' width='50'/><br>");
		*/
		App.open("Notepad.exe");
		s.click();
		s.type("AK");
	    /*s.find("C:\\Users\\PC\\Desktop\\akkk.PNG");
        Pattern p = new Pattern("C:\\Users\\PC\\Desktop\\akkk.PNG");
        s.click(p);*/
	    //ScreenImage im = s.capture();
	   /* Region l = s.offset(0, 10);
	    s.wheel(l, Button.WHEEL_DOWN, 20);*/
        //ImageIO.write(im.getImage(), "png", new File("E:\\AK\\AKS\\Bhav.png"));
	
	}

}