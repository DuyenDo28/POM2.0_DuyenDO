package BankGuruTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;

import bankGuruActions.EditCustomerPage;
import bankGuruActions.HomePage;
import bankGuruActions.LoginPage;
import commonPage.CommonTestcases;

public class EditCustomerScript extends CommonTestcases {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	RegisterScript registerScript;
	NewCustomerScript newCustomerScript;
	EditCustomerPage editCustomerPage;
	String CustomerID, userNameLogin,passWordLogin;
	@Parameters({"browser","version","url"})
	@BeforeClass
    public void BeforeClass(String browser, String version, String url)
    {
		inititalReport("DuyenDoReport.html");
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
		editCustomerPage=homePage.ClickEditCustomer();
		editCustomerPage.inputCustomerID(CustomerID);
		editCustomerPage.clickSubmitCustomerID();
		
	}
	@Test
	public void TC_01_EditAddress()
	{
		logTestCase("Log Test Case TC_01_EditAddress");
		editCustomerPage.EditAddress("HaNoi");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@Test
	public void TC_02_EditCity()
	{
		logTestCase("Log Test Case TC_02_EditCity");
		editCustomerPage.EditCity("Ha Long");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@Test
	public void TC_03_EditState()
	{
		
		logTestCase("Log Test Case TC_03_EditState");
		editCustomerPage.EditState("VietNam");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@Test
	public void TC_04_EditPin()
	{
		logTestCase("Log Test Case TC_04_EditPin");
		editCustomerPage.EditPin("123321");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@Test
	public void TC_05_EditPhone()
	{
		logTestCase("Log Test Case TC_05_EditPhone");
		editCustomerPage.EditPhone("0948878539");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@Test
	public void TC_06_EditEmail()
	{
		logTestCase("Log Test Case TC_06_EditEmail");
		editCustomerPage.EditEmail("DuyenDo28@gmail.com");
		editCustomerPage.clickSubmitEditCustomer();
		
	}
	@AfterMethod
	public void AfterMethod(ITestResult result)
	{
		getResult(result);
	}
	@AfterClass
	public void AfterClass()
	{
		exportReport();
		closeBrowser();
	}
	

}
