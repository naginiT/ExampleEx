package sel.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Toprint
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\app selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/NSSS%20KKISHORE/Desktop/app.html");
		WebElement element =driver.findElement(By.xpath("/html/body/select"));
		Select s = new Select(element);
		List<WebElement> list = s.getOptions();
		for(WebElement e : list)
		{
			System.out.println(e.getText());
		}
	

	}

}
