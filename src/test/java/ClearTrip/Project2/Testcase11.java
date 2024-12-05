package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//validate if after clicking on book button in
//the searched page user is able to enter every text fields present 
//like pin code, state, radio button, first name, last name, email id, mobile number, promo code etc
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase11 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class)
	public void Travellers_details() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.click_firstbook();
		
		DetailsPage d = new DetailsPage(driver);
		d.Chiledpagecontrol(driver);
		 
		d.enter_travellers_details(driver);
	}
}
