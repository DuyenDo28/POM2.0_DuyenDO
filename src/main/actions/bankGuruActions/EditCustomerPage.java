package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.NewCustomerUI;
import commonPage.CommonFunctions;

public class EditCustomerPage extends CommonFunctions {

	public EditCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void inputCustomerID(String CustomerID)
	{
		waitVisible(NewCustomerUI.CUSTOMERID_TXT);
		input(NewCustomerUI.CUSTOMERID_TXT, CustomerID);
	}
	public void clickSubmitCustomerID()
	{
		waitVisible(NewCustomerUI.SUBMIT_CUSTOMERID_BTN);
		click(NewCustomerUI.SUBMIT_CUSTOMERID_BTN);
		//return PageFactory.initElements(driver, EditCustomerPage.class);
			
	}
	public void inputCustomerName(String CustomerName)
	{
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		clearText(NewCustomerUI.CUSTOMER_NAME_TXT);
		waitVisible(NewCustomerUI.CUSTOMER_NAME_TXT);
		input(NewCustomerUI.CUSTOMER_NAME_TXT, CustomerName);	
	}
	public HomePage clickSubmitEditCustomer()
	{
		waitVisible(NewCustomerUI.SUBMIT_BTN);
		click(NewCustomerUI.SUBMIT_BTN);
		return PageFactory.initElements(driver, HomePage.class);
		
	}
	public void EditAddress(String Address)
	{
		waitVisible(NewCustomerUI.ADDRESS_AREA);
		clearText(NewCustomerUI.ADDRESS_AREA);
		waitVisible(NewCustomerUI.ADDRESS_AREA);
		input(NewCustomerUI.ADDRESS_AREA, Address);	
	}
	public void EditCity(String City)
	{
		waitVisible(NewCustomerUI.CITY_TXT);
		clearText(NewCustomerUI.CITY_TXT);
		waitVisible(NewCustomerUI.CITY_TXT);
		input(NewCustomerUI.CITY_TXT, City);	
	}
	public void EditState(String State)
	{
		waitVisible(NewCustomerUI.STATE_TXT);
		clearText(NewCustomerUI.STATE_TXT);
		waitVisible(NewCustomerUI.STATE_TXT);
		input(NewCustomerUI.STATE_TXT, State);	
	}
	public void EditPin(String Pin)
	{
		waitVisible(NewCustomerUI.PIN_TXT);
		clearText(NewCustomerUI.PIN_TXT);
		waitVisible(NewCustomerUI.PIN_TXT);
		input(NewCustomerUI.PIN_TXT, Pin);	
	}
	public void EditPhone(String Phone)
	{
		waitVisible(NewCustomerUI.MOBILE_TXT);
		clearText(NewCustomerUI.MOBILE_TXT);
		waitVisible(NewCustomerUI.MOBILE_TXT);
		input(NewCustomerUI.MOBILE_TXT, Phone);	
	}
	public void EditEmail(String Email)
	{
		waitVisible(NewCustomerUI.EMAIL_TXT);
		clearText(NewCustomerUI.EMAIL_TXT);
		waitVisible(NewCustomerUI.EMAIL_TXT);
		input(NewCustomerUI.EMAIL_TXT, Email);	
	}
}
