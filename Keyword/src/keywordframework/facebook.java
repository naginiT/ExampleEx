package keywordframework;

import java.io.FileInputStream;
import java.util.Properties;

public class facebook
{

	public Properties getvaluepro() throws Exception
	{
		Properties prop=new Properties();
		FileInputStream fs=new FileInputStream("./Property/obj.properties");
		System.out.println("It opens properties file");
		prop.load(fs);
		return prop;
		
		
	}
	
}