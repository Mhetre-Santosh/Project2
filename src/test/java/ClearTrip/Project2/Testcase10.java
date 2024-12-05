package ClearTrip.Project2;
//Validate the Flight information, Fare details, baggage Rules & Cancellation Rules link has the details in the search result page

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase10 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void Flight_details() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.Verify_OneWay_searche_resultpage(driver);
		
		s.validate_Flight_details();
	}
}
