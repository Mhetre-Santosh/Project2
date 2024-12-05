package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Test login with invalid credentials and ensure proper error message are displayed.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase3 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void login_with_Incorrectdata()
	{
		HomePage h = new HomePage(driver);
		h.InvalidLogin();
	}
}
