package ClearTrip.Project2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;

public class HomePage extends Excell_UserName_Password {
	
	WebDriver driver;
	
	@FindBy(id="mobile")
	WebElement Number;
	
	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement OTPBOX1;
	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement OTPBOX2;
	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement OTPBOX3;
	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement OTPBOX4;
	
	@FindBy(xpath="(//p[@cursor='auto'])[1]") //testcase1
	WebElement MyAccountOption;
	
	@FindBy(xpath="//p[.='Please enter a valid OTP']") //teatcase3
	WebElement Error_message;
	
	@FindBy (xpath="(//div[@class='c-inherit flex flex-1 flex-nowrap fs-16 fw-500 card-price'])[3]")
	WebElement date;
	
	@FindBy(xpath="(//div[@class='p-1 day-gridContent fs-14 fw-500 flex flex-middle flex-column flex-center flex-top monthStart'])[2]")
	WebElement NextMonthfirstDate;
	
	@FindBy(xpath="//input[@placeholder='Where from?']")
	WebElement FromWhere;
	
	@FindBy(xpath="(//ul[@class='airportList'])[2]")
	WebElement DepartureCity;
	
	@FindBy(xpath="//input[@placeholder='Where to?']")
	WebElement WhereTO;
	
	@FindBy(xpath="(//ul[@class='airportList'])[5]")
	WebElement ArrivalCity;
	
	@FindBy(xpath="//h4[.='Search flights']")
	WebElement SearchButton;
	
	@FindBy (xpath="(//div[@class='c-inherit flex flex-1 flex-nowrap fs-16 fw-500 card-price'])[1]")
	WebElement Selecttrip;
	
	@FindBy(xpath="//p[.='Round trip']")
	WebElement RoundTrip;
	
	@FindBy(xpath = "(//div[@class='p-relative']//span)[3]")
	WebElement class_option;
	
	@FindBy(xpath = "//p[.='Economy']")
	WebElement economy_class;
	
	@FindBy(xpath = "//p[.='Business class']")
	WebElement business_class;
	
	@FindBy(xpath = "//p[.='First class']")
	WebElement first_class;
	
	@FindBy(xpath = "//p[.='Premium economy']")
	WebElement premium_class;
	
	@FindBy(xpath = "(//button[@class='bn c-pointer'])[1]")
	WebElement adults_add;
	
	@FindBy(xpath = "(//button[@class='bn c-pointer'])[3]")
	WebElement childrens_add;
	
	@FindBy(xpath = "(//button[@class='bn c-pointer'])[5]")
	WebElement infants_add;
	
	@FindBy(xpath = "//span[.='2 Adults, 1 Child, 1 Infant, Economy']")
	WebElement multiple_passengers_confirm;
	
	
	
	public void login()
	{
		Number.sendKeys(Mob_Number);
		//Number.sendKeys("8793925915");
		Scanner s = new Scanner(System.in);
		System.out.println("PLS Write OTP below here");
		String OTP = s.next();
		
		OTPBOX1.sendKeys(Character.toString(OTP.charAt(0)));
		OTPBOX2.sendKeys(Character.toString(OTP.charAt(1)));
		OTPBOX3.sendKeys(Character.toString(OTP.charAt(2)));
		OTPBOX4.sendKeys(Character.toString(OTP.charAt(3)));
		
		s.close();
		
		Assert.assertTrue(MyAccountOption.isDisplayed(),"My Acccount option is displayed or not");
	}
	
	public void InvalidLogin()
	{
		Number.sendKeys("8793925915");
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Wrong OTP");
		String OTP = s.next();
		
		OTPBOX1.sendKeys(Character.toString(OTP.charAt(0)));
		OTPBOX2.sendKeys(Character.toString(OTP.charAt(1)));
		OTPBOX3.sendKeys(Character.toString(OTP.charAt(2)));
		OTPBOX4.sendKeys(Character.toString(OTP.charAt(3)));
		
		s.close();
		
		Assert.assertTrue(Error_message.isDisplayed(),"Error message not displayed");
		Reporter.log("Test Case is pass Because it is not accepting wrong OTP");
	}
	
	public void TripCities () throws InterruptedException
	{
		Thread.sleep(2000);
		FromWhere.click();
		DepartureCity.click();
		WhereTO.click();
		ArrivalCity.click();
		SearchButton.click();
	}
	
	public void RoundTrip() throws InterruptedException
	{
		Thread.sleep(2000);
		Selecttrip.click();
		RoundTrip.click();
	}
	
	public void select_class() throws InterruptedException 
	{
		Thread.sleep(2000);
		class_option.click();
		business_class.click();
	
		/*economy_class.click();
		first_class.click();
		premium_class.click();*/
	}
	
	public void MultiPassangers() throws InterruptedException
	{
		Thread.sleep(2000);
		class_option.click();
		adults_add.click();
		childrens_add.click();
		infants_add.click();
		Assert.assertTrue(multiple_passengers_confirm.isDisplayed(),"multiple passengers not selected");
	}
	
	public void SelectDate() throws InterruptedException
	{
		Thread.sleep(2000);
		date.click();
		NextMonthfirstDate.click();
	}
	
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
