package keywordframework;

import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invoke 
{
	
	public static WebDriver driver;
	
	@Test
	public void invok() throws Exception
	{
	  System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver_win32 (1)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  System.out.println("Opens browser");
	  driver.manage().window().maximize();
	  CompareExcel cp=new CompareExcel();
	  ExcelData ed=new ExcelData();
	  facebook fc=new facebook();
	  //cp.compare(prop, operations, locator, value);
	  Properties p=fc.getvaluepro();
      XSSFSheet xf=ed.dataretrieve("C:\\Users\\PC\\Desktop\\Keyword.xlsx", "Sheet1");
      System.out.println("excel sheet file path");
     //xf.getRow();
      for(int i=1;i<=xf.getLastRowNum();i++)
      {
    	cp.compare(p,xf.getRow(i).getCell(0).toString(),xf.getRow(i).getCell(1).toString(), xf.getRow(i).getCell(2).toString());
      }
     
	  
}
}