package keywordframework;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData 
{

	public XSSFSheet dataretrieve(String Filepath,String SheetName) throws Exception
	{
		        FileInputStream fis=new FileInputStream(Filepath);
				XSSFWorkbook wb=new XSSFWorkbook(fis);
				XSSFSheet xs=wb.getSheet(SheetName);
				System.out.println("Excel sheet code");
				return xs;
				
				
	}
}