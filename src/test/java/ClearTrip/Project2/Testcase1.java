package ClearTrip.Project2;
//Verify that user can successfully register for a new account. 
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase1 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void Registration()
	{
		HomePage h = new HomePage(driver);
		h.login();
	}
}
