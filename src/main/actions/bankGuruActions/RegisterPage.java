package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bankGuruUI.RegisterPageUI;
import commonPage.CommonFunctions;

public class RegisterPage extends CommonFunctions{
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	@FindBy(name = "emailid")
	WebElement EMAIL_REGISTER_TXT;	
	@FindBy(name = "btnLogin")
	WebElement SUBMIT_BTN;
	
	@FindBy(xpath = "//td[contains(text(),'User ID :')]/following-sibling::td")
	WebElement USERNAME_LBL;

	@FindBy(xpath = "//td[contains(text(),'Password :')]/following-sibling::td")
	WebElement PASSWORD_LBL;

	
	public void inputEmail(String email)
	{
		waitVisible(EMAIL_REGISTER_TXT);
		input(EMAIL_REGISTER_TXT, email);
	}
	public RegisterPage clickSubmit()
	{
		waitVisible(SUBMIT_BTN);
		click(SUBMIT_BTN);
		return PageFactory.initElements(driver, RegisterPage.class);
	}
	public String getUserName()
	{
		waitVisible(USERNAME_LBL);
		return getText(USERNAME_LBL);
		
	}
	public String getPassword()
	{
		waitVisible(PASSWORD_LBL);
		return getText(PASSWORD_LBL);
		
	}
	public void NavigateToPage(String url)
	{
		navigate(url);
	}
	

}
