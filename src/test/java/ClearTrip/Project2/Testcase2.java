package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Validate the login functionality with valid credentials.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase2  extends Launch_Quit {

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void login_validation()
	{
		HomePage h = new HomePage(driver);
		h.login();
	}
}
