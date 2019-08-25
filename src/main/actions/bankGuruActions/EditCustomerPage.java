package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.NewCustomerUI;
import commonPage.CommonFunctions;

public class EditCustomerPage extends CommonFunctions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//public static final String CUSTOMER_NAME_TXT = "//input[@name='name']";
	
	@FindBy(name="name")
	WebElement CUSTOMER_NAME_TXT;	
	
	//public static final String CUSTOMER_NAME_LBL ="//label[@id='message']";
	@FindBy(id = "message")
	WebElement CUSTOMER_NAME_LBL;
	
	//public static final String DATEOFBILRTH="//input[@id='dob']";
	@FindBy(id = "dob")
	WebElement DATEOFBILRTH;
	
	//public static final String DATEOFBIRTH_LBL="//label[@id='message24']";	
	@FindBy(id = "message24")
	WebElement DATEOFBIRTH_LBL;
//	public static final String CITY_TXT="//input[@name='city']";

	@FindBy(name="city")
	WebElement CITY_TXT;	
	//public static final String CITY_LBL="//label[@id='message4']";
	@FindBy(id = "message24")
	WebElement CITY_LBL;
//	public static final String STATE_TXT="//input[@name='state']";
	@FindBy(name="state")
	WebElement STATE_TXT;	
//	public static final String STATE_LBL="//label[@id='message5']";
	
	@FindBy(id = "message5")
	WebElement STATE_LBL;
//	public static final String PIN_TXT="//input[@name='pinno']";
	@FindBy(name="pinno")
	WebElement PIN_TXT;
//	public static final String PIN_LBL="//label[@id='message6']";
	@FindBy(id = "message6")
	WebElement PIN_LBL;
//	public static final String MOBILE_TXT="//input[@name='telephoneno']";
	@FindBy(name="telephoneno")
	WebElement MOBILE_TXT;
//	public static final String MOBILE_LBL="//label[@id='message7']";
	@FindBy(id = "message7")
	WebElement MOBILE_LBL;

	
//	public static final String EMAIL_TXT="//input[@name='emailid']";
	@FindBy(name="emailid")
	WebElement EMAIL_TXT;
//	public static final String EMAIL_LBL="//label[@id='message9']";
	@FindBy(id = "message9")
	WebElement EMAIL_LBL;

	
//	public static final String PASSWORD_TXT="//input[@name='password']";
	@FindBy(name="password")
	WebElement PASSWORD_TXT;
//	public static final String PASSWORD_LBL="//label[@id='message18']";
	@FindBy(id = "message18")
	WebElement PASSWORD_LBL;
//	public static final String SUBMIT_BTN="//input[@name='sub']";
	@FindBy(name="sub")
	WebElement SUBMIT_BTN;
	
	public static final String CUSTOMERID="//td[text()='Customer ID']//following-sibling::td";
  //  public static final String ADDRESS_AREA = "//textarea[@name='addr']";
	@FindBy(name="addr")
	WebElement ADDRESS_AREA;
	public static final String ADDRESS_AREA_MESSAGE= "//textarea[@name='addr']//following-sibling::label";
	public static final String DYNAMIC_MSG = "//*[contains(text(),'%s')]";
	
	
	//public static final String CUSTOMERID_TXT = "//input[@name='cusid']";
	@FindBy(name="cusid")
	WebElement CUSTOMERID_TXT;
//	public static final String CUSTOMERID_LBL ="//label[@id='message14']";
	@FindBy(id = "message14")
	WebElement CUSTOMERID_LBL;
//	public static final String SUBMIT_CUSTOMERID_BTN= "//input[@name='AccSubmit']";
	//@FindBy(name="AccSubmit")
//	WebElement SUBMIT_CUSTOMERID_BTN;
	@FindBy(xpath = "//input[@name='AccSubmit']")
	WebElement SUBMIT_CUSTOMERID_BTN;
	public void inputCustomerID(String CustomerID)
	{
		waitVisible(CUSTOMERID_TXT);
		input(CUSTOMERID_TXT, CustomerID);
	}
	public void clickSubmitCustomerID()
	{
		waitVisible(SUBMIT_CUSTOMERID_BTN);
		click(SUBMIT_CUSTOMERID_BTN);
		//return PageFactory.initElements(driver, EditCustomerPage.class);
			
	}
	public void inputCustomerName(String CustomerName)
	{
		waitVisible(CUSTOMER_NAME_TXT);
		clearText(CUSTOMER_NAME_TXT);
		waitVisible(CUSTOMER_NAME_TXT);
		input(CUSTOMER_NAME_TXT, CustomerName);	
	}
	public HomePage clickSubmitEditCustomer()
	{
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
		return PageFactory.initElements(driver, HomePage.class);
		
	}
	public void EditAddress(String Address)
	{
		waitVisible(ADDRESS_AREA);
		clearText(ADDRESS_AREA);
		waitVisible(ADDRESS_AREA);
		input(ADDRESS_AREA, Address);	
	}
	public void EditCity(String City)
	{
		waitVisible(CITY_TXT);
		clearText(CITY_TXT);
		waitVisible(CITY_TXT);
		input(CITY_TXT, City);	
	}
	public void EditState(String State)
	{
		waitVisible(STATE_TXT);
		clearText(STATE_TXT);
		waitVisible(STATE_TXT);
		input(STATE_TXT, State);	
	}
	public void EditPin(String Pin)
	{
		waitVisible(PIN_TXT);
		clearText(PIN_TXT);
		waitVisible(PIN_TXT);
		input(PIN_TXT, Pin);	
	}
	public void EditPhone(String Phone)
	{
		waitVisible(MOBILE_TXT);
		clearText(MOBILE_TXT);
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, Phone);	
	}
	public void EditEmail(String Email)
	{
		waitVisible(EMAIL_TXT);
		clearText(EMAIL_TXT);
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, Email);	
	}
}
