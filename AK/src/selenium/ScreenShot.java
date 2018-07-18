package selenium;
import java.io.File;
	import java.io.IOException;
	import java.util.concurrent.TimeUnit;

	import javax.imageio.ImageIO;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;

	import ru.yandex.qatools.ashot.AShot;
	import ru.yandex.qatools.ashot.Screenshot;
	import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

	public class ScreenShot
	{
		@Test
		public void shot() throws Exception
		{
		 System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.amazon.in");
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     driver.manage().window().maximize();
	     ScreenShot s= new ScreenShot();
	     /*TakesScreenshot ts = (TakesScreenshot)driver;
	     File f =ts.getScreenshotAs(OutputType.FILE);
	     File fs= new File("E:\\app\\img.jpg");
	     FileUtils.copyFile(f, fs);*/
	     
	     File fs= new File("E:\\AK\\image.jpg");
	     Screenshot s1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
	     ImageIO.write(s1.getImage(),"jpg", fs);
	     
		}

	}

	

