package bankGuruActions;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import bankGuruUI.NewAccountPageUI;
import commonPage.CommonFunctions;

public class NewAccountPage extends CommonFunctions {

	public NewAccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void inputKeyCustomerID( Keys value)
	{
		waitVisible(NewAccountPageUI.CUSTOMERID_TXT);
		inputKeys(NewAccountPageUI.CUSTOMERID_TXT, value);
	}
	public String getTextCustomerIDLBL() {
		waitVisible(NewAccountPageUI.CUSTOMERID_LBL);
		return getText(NewAccountPageUI.CUSTOMERID_LBL);

	}
	public void inputKeyInitialDepositD( Keys value)
	{
		waitVisible(NewAccountPageUI.CUSTOMERID_TXT);
		inputKeys(NewAccountPageUI.CUSTOMERID_TXT, value);
	}
	public String getTextInitialDepositLBL() {
		waitVisible(NewAccountPageUI.INITIALDEPOSIT_LBL);
		return getText(NewAccountPageUI.INITIALDEPOSIT_LBL);

	}
	public void inputCustomerID(String value) {
		waitVisible(NewAccountPageUI.CUSTOMERID_TXT);
		input(NewAccountPageUI.CUSTOMERID_TXT, value);
	}
	public void inputInitialDeposit(String value) {
		waitVisible(NewAccountPageUI.INITIALDEPOSIT_TXT);
		input(NewAccountPageUI.INITIALDEPOSIT_TXT, value);
	}
	public void clickOnSubmit() {
		waitVisible(NewAccountPageUI.SUTMIT_BTN);
		click(NewAccountPageUI.SUTMIT_BTN);
	}
	public String getTextSuccessfullyMSG() {
		waitVisible(NewAccountPageUI.SUCCESSMSG);
		return getText(NewAccountPageUI.SUCCESSMSG);

	}
	
}
