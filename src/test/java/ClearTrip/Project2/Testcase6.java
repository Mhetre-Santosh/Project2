package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//validate the search result for different classes (economy, business, first class)
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase6 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void FlightClass() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.select_class();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.verify_business_class_searchpage_is_displayed(driver);
	}
}
