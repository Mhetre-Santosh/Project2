package ClearTrip.Project2;
import org.testng.annotations.Listeners;
//Reach till payments page and select credit card option -> enter card option -> make the payment.
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase15 extends Launch_Quit{

	@Test(retryAnalyzer=ClearTrip.Project2.Retry_logic.class) 
	public void SEAT_Selection() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.login();
		h.TripCities();
		
		Searchresult s = new Searchresult(driver);
		s.click_firstbook();
		
		DetailsPage d = new DetailsPage(driver);
		d.Chiledpagecontrol(driver);
		d.CountinueButton();
		
		Paymentpage payment=new Paymentpage(driver);
		payment.verify_payment_page_navigated(driver);
		
		payment.enter_card_details(driver);
	}
}
