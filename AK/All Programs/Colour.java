package sel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Colour {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\app selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/default.asp");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a:nth-child(6)"));
		System.out.println(element.getCssValue("color"));
		element.click();
		WebElement el = driver.findElement(By.cssSelector("#topnav > div > div.w3-bar.w3-left > a.w3-bar-item.w3-button.active"));
		System.out.println(el.getCssValue("color"));
		System.out.println(el.getCssValue("font-size."));
		
		/*System.out.println(el.getCssValue("color-name"));
		System.out.println(el.getCssValue("font-size."));
		
		System.out.println(el.getAttribute("background-color"));*/

		

	}

}
