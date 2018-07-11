package keywordframework;

import java.io.IOException;

import org.testng.annotations.Test;

public class NewExecution 
{
	@Test
	public  void m1() throws IOException 
		{


               for(int i =1;i<=4;i++)
		{
	        String st=	NewExcelData.excelcode("C:\\Users\\PC\\Desktop\\NewKeyword.xlsx", 0, 0, null);
			if (st.equalsIgnoreCase("brosercode"))
			{
				NewInvoke.invokecode();
			}
			else	if (st.equalsIgnoreCase("appInvoke"))
			{
				NewInvoke.invokeapp();
			}
			else if (st.equalsIgnoreCase("email"))
			{
				NewInvoke.email();
			}
			else if(st.equalsIgnoreCase("pass"))
			{
				NewInvoke.pass();
			}
		 }
	 }
}
