package keywordframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NewExcelData 
{
	public  static String excelcode(String filename,int row,int column, String sheet1) throws IOException 
    {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\PC\\Desktop\\NewKeyword.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet xs=wb.getSheet(sheet1);
		XSSFCell xc=xs.getRow(row).getCell(column);
	    String t=	xc.getStringCellValue();
   	     return t;
		
    

    }
}
	
