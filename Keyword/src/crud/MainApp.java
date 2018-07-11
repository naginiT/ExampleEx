package crud;

import java.sql.Connection;
import java.sql.DriverManager;

public class MainApp
{
   public static Connection db() throws Exception
   {
	   Class.forName("oracle.jdbc.driver.OracleDriver");
	   Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Nandan","Nandan");
	   return conn;
   }

	public static void main(String[] args)
	{

		          crudoperations.insert();
				  crudoperations.fetch();
				  crudoperations.update();
				  crudoperations.delete();

	}

}
