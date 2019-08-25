package bankGuruActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bankGuruUI.NewCustomerUI;
import commonPage.CommonFunctions;

public class NewCustomerPage extends CommonFunctions {

	public NewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
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
	
	//public static final String CUSTOMERID="//td[text()='Customer ID']//following-sibling::td";
	 @FindBy(xpath = "//td[text()='Customer ID']//following-sibling::td")
		WebElement CUSTOMERID;
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
	@FindBy(name="AccSubmit")
	WebElement SUBMIT_CUSTOMERID_BTN;
	public void inputKeyCustomerName(Keys value) {
		waitVisible(CUSTOMER_NAME_TXT);
		inputKeys(CUSTOMER_NAME_TXT, value);

	}

	public void inputKeyCity(Keys value) {
		waitVisible(CITY_TXT);
		inputKeys(CITY_TXT, value);

	}

	public void inputKeyDateOfBirth(Keys value) {
		waitVisible(DATEOFBILRTH);
		inputKeys(DATEOFBILRTH, value);

	}

	public String getTextCustomerLBL() {
		waitVisible(CUSTOMER_NAME_LBL);
		return getTextElement(CUSTOMER_NAME_LBL);

	}

	public String getTextDynamicMsg(String value) {
		waitVisibleDynamicElement(DYNAMIC_MSG, value);
		return getTextDynamicElement(DYNAMIC_MSG, value);

	}

	public String getTextCityLBL() {
		waitVisible(CITY_LBL);
		return getTextElement(CITY_LBL);

	}

	public String getTextDateOfBirthLBL() {
		waitVisible(DATEOFBIRTH_LBL);
		return getTextElement(DATEOFBIRTH_LBL);

	}

	public void inputNumbericToCustomer() {
		waitVisible(CUSTOMER_NAME_TXT);
		input(CUSTOMER_NAME_TXT, "123");
	}

	public void inputSpecialToCustomer() {
		waitVisible(CUSTOMER_NAME_TXT);
		input(CUSTOMER_NAME_TXT, "@");
	}

	public void inputFirstSpaceToCustomer() {
		waitVisible(CUSTOMER_NAME_TXT);
		input(CUSTOMER_NAME_TXT, " abc123");
	}

	public void inputNumbericToCity() {
		waitVisible(CITY_TXT);
		input(CITY_TXT, "1234 city123");

	}

	public void inputSpecialToCity() {
		waitVisible(CITY_TXT);
		input(CITY_TXT, "City!@# !@#");
	}

	public void inputFirstSpaceToCity() {
		waitVisible(CITY_TXT);
		input(CITY_TXT, " abc123");
	}

	public void inputKeyToState(Keys key) {
		waitVisible(STATE_TXT);
		inputKeys(STATE_TXT, key);
	}

	public String getTextStateLBL() {
		waitVisible(STATE_LBL);
		return getTextElement(STATE_LBL);
	}

	public void inputNumericToState() {
		waitVisible(STATE_TXT);
		input(STATE_TXT, "1234 State123");
	}

	public void inputFirstSpaceToState() {
		waitVisible(STATE_TXT);
		input(STATE_TXT, " State");
	}

	public void inputSpecialToState() {
		waitVisible(STATE_TXT);
		input(STATE_TXT, "@!#");
	}

	public void inputStringToPin() {
		waitVisible(PIN_TXT);
		input(PIN_TXT, "ABC");
	}

	public String getTextPinLBL() {
		waitVisible(PIN_LBL);
		return getTextElement(PIN_LBL);
	}

	public void inputEmptyToPin(Keys key) {
		waitVisible(PIN_TXT);
		inputKeys(PIN_TXT, key);
	}

	public void inputLessThan6ToPin() {
		waitVisible(PIN_TXT);
		input(PIN_TXT, "12345");
	}

	public void inputSpecialToPin() {
		waitVisible(PIN_TXT);
		input(PIN_TXT, "@!#");
	}

	public void inputFirstSpaceToPin() {
		waitVisible(PIN_TXT);
		input(PIN_TXT, " 12345");
	}

	public void inputEmptyToMobilePhone() {
		waitVisible(MOBILE_TXT);
		inputKeys(MOBILE_TXT, Keys.TAB);
	}

	public String getTextMobileLBL() {
		waitVisible(MOBILE_LBL);
		return getTextElement(MOBILE_LBL);

	}

	public void inputFirstSpaceToMobile() {
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, " 1234512345");
	}

	public void inputSpaceToMobile() {
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, "123451 2345");
	}

	public void inputSpecialToMobile() {
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, "@!#");
	}

	public void inputEmptyToEmail() {
		waitVisible(EMAIL_TXT);
		inputKeys(EMAIL_TXT, Keys.TAB);
	}

	public String getTextEmailLBL() {
		waitVisible(EMAIL_LBL);
		return getTextElement(EMAIL_LBL);
	}

	public void inputIncorrectFormatToEmail() {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, "guru99");
	}

	public void inputSpaceToEmail() {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, "we @gmail");
	}

	public String getTextAfterClickOnSubmit() {
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
		return getTextAlert1();
	}

	public void inputCustomerName(String customer) {
		waitVisible(CUSTOMER_NAME_TXT);
		input(CUSTOMER_NAME_TXT, customer);
	}

	public void inputDateOfBirth(String DOB) {
		waitVisible(DATEOFBILRTH);
		input(DATEOFBILRTH, DOB);
	}

	public void inputAddress(String address) {
		waitVisible(ADDRESS_AREA);
		input(ADDRESS_AREA, address);
	}

	public void inputCity(String city) {
		waitVisible(CITY_TXT);
		input(CITY_TXT, city);
	}

	public void inputState(String state) {
		waitVisible(STATE_TXT);
		input(STATE_TXT, state);
	}

	public void inputPin(String pin) {
		waitVisible(PIN_TXT);
		input(PIN_TXT, pin);
	}

	public void inputPhoneNumber(String phoneNumber) {
		waitVisible(MOBILE_TXT);
		input(MOBILE_TXT, phoneNumber);
	}

	public void inputEmail(String email) {
		waitVisible(EMAIL_TXT);
		input(EMAIL_TXT, email);
	}

	public void inputPassword(String password) {
		waitVisible(PASSWORD_TXT);
		input(PASSWORD_TXT, password);
	}

	public void clickSubmitBTN() {
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
	}

	public String getCustomerID() {
		waitVisible(CUSTOMERID);
		return getText(CUSTOMERID);
	}

	

}
