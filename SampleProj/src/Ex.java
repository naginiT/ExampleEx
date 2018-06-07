import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex {
	@Test
	public void m() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","H:\\app selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]")).click();
		System.out.println("click");
	}

}
