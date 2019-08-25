package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.HomePageUI;
import commonPage.CommonFunctions;

public class HomePage extends CommonFunctions {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//@FindBy(tagName = "marquee")
	WebElement WELCOME_TXT;	
	@FindBy(linkText = "New Customer")
	WebElement NEWCUSTOMER_MENU;
	@FindBy(linkText = "Edit Customer")
	WebElement EDITCUSTOMER_LINK;
;


	public NewCustomerPage ClickNewCustomer()
	{
		waitVisible(NEWCUSTOMER_MENU);
		click(NEWCUSTOMER_MENU);
		
		return PageFactory.initElements(driver, NewCustomerPage.class);
		
	}
	public EditCustomerPage ClickEditCustomer()
	{
		waitVisible(EDITCUSTOMER_LINK);
		click(EDITCUSTOMER_LINK);
		return PageFactory.initElements(driver, EditCustomerPage.class);
		
	}
	public NewAccountPage ClickNewAccount()
	{
		waitVisible(HomePageUI.NEWACCOUNT_LINK);
		click(HomePageUI.NEWACCOUNT_LINK);
		return PageFactory.initElements(driver, NewAccountPage.class);
		
	}
	

}
