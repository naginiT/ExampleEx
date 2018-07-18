package pomexecution;

import org.testng.annotations.Test;

import pomactions.PomActions;
import pombrowser.BrowserInvoking;

public class PomExecution 
{
	@Test
	public void exe()
	{
		BrowserInvoking.invoke();
		PomActions.actions();
	}

}
