package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Test the search functionality for one way trip flights.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase4 extends Launch_Quit {

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void OneWay_Trip() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.Verify_OneWay_searche_resultpage(driver);
	}
}
