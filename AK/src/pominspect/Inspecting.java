package pominspect;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pombrowser.BrowserInvoking;

public class Inspecting extends BrowserInvoking
{
	static By learn=By.xpath("/html/body/div[7]/div[1]/div[1]/a[1]");
	static WebElement ele;
	
public static WebElement learn()
{
  	ele=driver.findElement(learn);
  	return ele;
  	
}
}
