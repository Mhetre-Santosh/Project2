package ClearTrip.Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Searchresult {

	WebDriver driver;
	
	@FindBy(css = "[value='One way']")
	WebElement one_way_trip_option;
	
	@FindBy(css = "[value='Round trip']")
	WebElement round_trip_option;
	
	@FindBy(xpath="(//button[.='Book'])[1]")
	WebElement Book_Button;
	
	@FindBy(xpath = "(//p[.='Flight Details'])[1]")
	WebElement flight_details_link;
	
	@FindBy(xpath = "//div[@class='sc-aXZVg iNidEX flex flex-middle'][2]")
	WebElement flight_information_box;
	
	@FindBy(xpath = "//div[@class='sc-aXZVg hKtzvB flex flex-baseline']/h1")
	WebElement flight_fare_box;
	
	@FindBy(xpath = "//div[@class='sc-aXZVg bIVvcp mt-4 pb-10']/div/div")
	WebElement baggage_box;
	
	@FindBy(xpath = "//h3[.='Book']")
	WebElement mini_book_button;
	
	@FindBy(xpath = "(//p[contains(text(), 'Cancellation fee')])[2]")
	WebElement cancellation_details_box;
	
	@FindBy(xpath = "//p[.='My account']")
	WebElement my_account_option;
	
	@FindBy(xpath = "//span[.='Sign out']")
	WebElement sign_out_button;
	
	//Assertion Methods 
	public void Verify_OneWay_searche_resultpage(WebDriver driver) //testcase4
	{
		Assert.assertTrue(one_way_trip_option.isDisplayed(), "sorry, one way search page not displayed");;
	}
	
	public void verify_roundtrip_searchpage_is_displayed(WebDriver driver) //testcase5
	{
		Assert.assertTrue(round_trip_option.isDisplayed(), "sorry, round trip search page not displayed");
	}
	
	/*public void verify_economy_class_searchpage_is_displayed(WebDriver driver) {
		Assert.assertTrue(driver.getCurrentUrl().contains("Economy"), "URL does not contain 'Economy'");
	}*/
	
	public void verify_business_class_searchpage_is_displayed(WebDriver driver) {
		Assert.assertTrue(driver.getCurrentUrl().contains("Business"), "URL does not contain 'Economy'");
	}
	
	/*public void verify_first_class_searchpage_is_displayed(WebDriver driver) {
		Assert.assertTrue(driver.getCurrentUrl().contains("First"), "URL does not contain 'Economy'");
	}
	
	public void verify_premium_class_searchpage_is_displayed(WebDriver driver) {
		Assert.assertTrue(driver.getCurrentUrl().contains("Premium"), "URL does not contain 'Economy'");
	}*/
	
	//perform methods 
	public void click_firstbook() throws InterruptedException
	{
		Thread.sleep(2000);
		Book_Button.click();
	}
	
	public void validate_Flight_details() 
	{
		flight_details_link.click();
		Assert.assertTrue(flight_information_box.isDisplayed(),"flight information box not displayed");
		Assert.assertTrue(flight_fare_box.isDisplayed(),"flight fare box not displayed");
		Assert.assertTrue(baggage_box.isDisplayed(),"baggage box not displayed");
		mini_book_button.click();
		Assert.assertTrue(cancellation_details_box.isDisplayed(),"cancellation details box not displayed");
		
	}
	
	public void click_signout_button() throws InterruptedException 
	{
		Thread.sleep(2000);
		my_account_option.click();
		Thread.sleep(2000);
		sign_out_button.click();
	}
	
	public Searchresult (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
