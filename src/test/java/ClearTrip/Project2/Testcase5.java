package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Test the search Functionality for round-trip flights.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase5 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void Round_Trip() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		
		h.RoundTrip();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.verify_roundtrip_searchpage_is_displayed(driver);
	}
}
