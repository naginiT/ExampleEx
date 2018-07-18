package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.Test;

public class Demotest {

	@Test
	public void m() throws InterruptedException
	{
		System.setProperty("webdriver.opera.driver", "E:\\AK\\operadriver_win32\\operadriver.exe");
		WebDriver driver = new OperaDriver();
		driver.get("https://accounts.google.com");
		Thread.sleep(3000);
	}

}
