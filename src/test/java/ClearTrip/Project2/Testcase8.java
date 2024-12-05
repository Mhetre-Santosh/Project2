package ClearTrip.Project2;
//Check for seat selection during the booking.

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ClearTrip.Project2.Listener_Class.class)
public class Testcase8 extends Launch_Quit {
	
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
		d.SelectSeat();
		
	}
}
