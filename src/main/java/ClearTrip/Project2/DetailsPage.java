package ClearTrip.Project2;

import java.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DetailsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//button[.='Continue']")
	//@FindBy(xpath = "button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")
	//@FindBy(xpath="//div/div/button[.='Continue']")
	WebElement Countinue_button;
	
	@FindBy(xpath="(//div[@class='br-4 w-100p h-100p flex flex-center flex-middle fw-500 c-pointer'])[1]")
	WebElement A1_Seat_Select;
	
	@FindBy(xpath="(//div[@class='br-4 w-100p h-100p flex flex-center flex-middle fw-500 c-pointer'])[2]")
	WebElement C1_Seat_Select;
	
	@FindBy(xpath = "(//div[.='1 of 1 seats selected (1A)'])[2]")
	WebElement seats_selected_text;
	
	@FindBy(xpath="//input[@placeholder='Coupon/Gift card']")
	WebElement WriteCoupencode;
	
	@FindBy(xpath="(//span[.='Apply'])[1]")
	WebElement ApplyCoupencode;
	
	@FindBy(xpath = "//h3[.='OK']")
	WebElement ok_popup_button;
	
	@FindBy(xpath = "//button//h4[.='Continue']")
	WebElement fare_type_continue_button;
	
	@FindBy(xpath = "//h4[.='Skip add-ons']")
	WebElement skip_add_ons_button;

	@FindBy(xpath = "//p[.='Skip add ons']")
	WebElement skip_add_ons_popup_button;

	@FindBy(xpath = "(//div/input)[1]")
	WebElement contact_details_mobile_number_field;

	@FindBy(xpath = "(//div/input)[2]")
	WebElement contact_details_email_field;

	@FindBy(xpath = "//button//p[.='Continue']")
	WebElement contact_details_continue_button;

	@FindBy(xpath = "(//div/input)[3]")
	WebElement first_name_field;

	@FindBy(xpath = "(//div/input)[4]")
	WebElement last_name_field;

	@FindBy(xpath = "//p[.='Continue to payment']")
	WebElement continue_to_payment_button;

	
	public void Chiledpagecontrol(WebDriver driver) throws InterruptedException
	{
		Thread.sleep(2000);
		Set<String> s = driver.getWindowHandles();
		Iterator<String> i1 = s.iterator();
		String parent_id = i1.next();
		String chiled_id = i1.next();
		driver.switchTo().window(chiled_id);
	}
	
	public void CountinueButton() throws InterruptedException
	{
		Thread.sleep(5000);
		//ApplyCoupencode.click();
		Countinue_button.click();
	}
	
	public void SelectSeat()
	{
		if (A1_Seat_Select.isEnabled())
		{
			A1_Seat_Select.click();
		}
		else
		{
			C1_Seat_Select.click();
		}
		Assert.assertTrue(seats_selected_text.isDisplayed(), "seat is not added");
			
	}
	
	public void coupencode()
	{
		WriteCoupencode.sendKeys("SantoshM");
		ApplyCoupencode.click();
	}
	
	/*public void verify_coupon_code_applied(WebDriver driver)
	{
		Assert.assertTrue(ok_popup_button.isDisplayed(), "coupon code not applied");
	}*/
	
	public void enter_travellers_details(WebDriver driver) 
	{
		
		fare_type_continue_button.click();
		skip_add_ons_button.click();
		skip_add_ons_popup_button.click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//p[.='Continue']")));
//		contact_details_mobile_number_field.click();
//		contact_details_mobile_number_field.sendKeys(Keys.CONTROL+"A"+Keys.BACK_SPACE);
//		contact_details_mobile_number_field.sendKeys("8088666694");

		int attempt = 0;
		int maxAttempts = 2;
		while (attempt < maxAttempts) {
			try {
				contact_details_continue_button.click();
				break; 
			} catch (ElementClickInterceptedException e) {
				attempt++;
				if (attempt == maxAttempts) {
					throw e; 
				}
			}
		}
//		first_name_field.clear();
//		last_name_field.clear();
		first_name_field.sendKeys("Ashwathnarayan");
		last_name_field.sendKeys("Joshi");
		continue_to_payment_button.click();
	}
	
	public DetailsPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
