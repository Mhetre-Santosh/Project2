package ClearTrip.Project2;
//check is user is able to search the domestic round trip flight

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase14 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void domestic_flights() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		
		h.RoundTrip();
		h.TripCities();
	
	}
}
