package ClearTrip.Project2;
//Validate the system ability to handle multiple passengers in a single booking.

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase9 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void MultilplePassanger() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.MultiPassangers();
		h.TripCities();
	}
	
}
