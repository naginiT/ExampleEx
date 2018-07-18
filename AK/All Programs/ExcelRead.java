package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.stream.FileImageOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelRead {
@Test
public void read() throws IOException, InterruptedException {
System.setProperty("webdriver.chrome.driver","E:\\AK\\Selenium files\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://mail.india.com/account/login");
File fs= new File("E:\\AK\\akexcel.xlsx");
FileInputStream fis=new FileInputStream(fs);
XSSFWorkbook wb=new XSSFWorkbook(fis);
XSSFSheet xs=wb.getSheet("Sheet1");
for(int i=1;i<=xs.getLastRowNum();i++)
{
XSSFCell xc=xs.getRow(i).getCell(0);
if(xc.getCellType()==XSSFCell.CELL_TYPE_STRING)
{
System.out.println(xc);
driver.findElement(By.name("user[email]")).sendKeys(xc.getStringCellValue());
}
else
{
    double d=	xc.getNumericCellValue();
    String s=String.valueOf((int)d);
    
    System.out.println(s);
    
    driver.findElement(By.name("user[email]")).sendKeys(s);
}
Thread.sleep(2000);
driver.findElement(By.name("user[email]")).clear();
xs.getRow(1).createCell(2).setCellValue("pass");
FileOutputStream fos=new FileOutputStream("E:\\AK\\akexcel.xlsx");
wb.write(fos);
fos.close();
}

}
}
