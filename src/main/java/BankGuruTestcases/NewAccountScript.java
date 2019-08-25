package BankGuruTestcases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import bankGuruActions.EditCustomerPage;
import bankGuruActions.HomePage;
import bankGuruActions.LoginPage;
import bankGuruActions.NewAccountPage;
import bankGuruActions.NewCustomerPage;
import commonPage.CommonTestcases;

public class NewAccountScript extends CommonTestcases{
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	RegisterScript registerScript;
	NewCustomerScript newCustomerScript;
	EditCustomerPage editCustomerPage;
	NewAccountPage newAccountPage;
	String CustomerID, userNameLogin,passWordLogin;
	@Parameters({"browser","version","url"})
	@BeforeClass
    public void BeforeClass(String browser, String version, String url)
    {
		//inititalReport("DuyenDoReport.html");
		driver=openMultiBrowser(browser, version, url);
		CustomerID= NewCustomerScript.customerID;
		userNameLogin=RegisterScript.userName;
		passWordLogin=RegisterScript.passWord;
		loginPage= PageFactory.initElements(driver, LoginPage.class);
		homePage=loginPage.Login(userNameLogin, passWordLogin);
		
		
							
    }
	@BeforeMethod
	public void BeforeMethod()
	{
		newAccountPage=homePage.ClickNewAccount();
		
		
	}
	@Test
	public void TC_01_CustomerIDCannotBlank() {
		newAccountPage.inputKeyCustomerID(Keys.TAB);
		verifyEqual(newAccountPage.getTextCustomerIDLBL(), 
				"Customer ID is required");
		
	}
	@Test
	public void TC_02_InitialDepositCannotBlank() {
		newAccountPage.inputKeyInitialDepositD(Keys.TAB);
		verifyEqual(newAccountPage.getTextInitialDepositLBL(), 
				"Initial Deposit must not be blank");
		
	}
	@Test
	public void TC_03_CanCreateNewAccount() {
		newAccountPage.inputCustomerID(CustomerID);
		newAccountPage.inputInitialDeposit(CustomerID);;
		newAccountPage.clickOnSubmit();
		verifyEqual(newAccountPage.getTextSuccessfullyMSG(), "Account Generated Successfully!!!");
		
	}
//	@AfterMethod
//	public void AfterMethod(ITestResult result)
//	{
//		getResult(result);
//	}
	@AfterClass
	public void AfterClass()
	{
		//exportReport();
		//closeBrowser();
	}
	

}

