package keywordframework;

import java.util.Properties;

import org.openqa.selenium.By;

public class CompareExcel extends Invoke
{
public void compare(Properties prop, String operations, String locator, String value) 
{
	if(operations.equalsIgnoreCase("OpenURL"))
	{
		System.out.println("open url");
		driver.get(prop.getProperty(value));
		
	}
	
	else if (operations.equalsIgnoreCase("EnterUserName"))
	{
		driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(value);
		System.out.println("Enter username");
	}
	
	else if (operations.equalsIgnoreCase("EnterPassword"))
			{

		driver.findElement(By.xpath(prop.getProperty(locator))).sendKeys(value);
		System.out.println("Enter password");
		
			}
}
}
