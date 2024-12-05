package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Check if user able to apply for coupon code while ordering the product.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase13 extends Launch_Quit {

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void CoupenCodeApplying() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.SelectDate();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.click_firstbook();
		
		DetailsPage d = new DetailsPage(driver);
		d.Chiledpagecontrol(driver);
		d.coupencode();
	}
}
