package property;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyclass
{
 public static Properties file() throws Exception
 {
	FileInputStream fs=new FileInputStream("E:\\AK\\AK\\src\\property\\file.properties");
     Properties p = new Properties();
	 p.load(fs);
	return p;
	
 }
}