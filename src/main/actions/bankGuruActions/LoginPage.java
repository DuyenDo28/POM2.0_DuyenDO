package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BankGuruTestcases.RegisterScript;
import bankGuruUI.LoginPageUI;

import commonPage.CommonFunctions;

public class LoginPage extends CommonFunctions  {
	RegisterPage registerPage;
	RegisterScript registerScript;
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText = "here")
	WebElement HERE_LINK;	
	@FindBy(name = "uid")
	WebElement USERNAME_LOGIN_TXT;
	@FindBy(name= "password")
	WebElement PASSWORD_LOGIN_TXT;
	@FindBy(name= "btnLogin")
	WebElement LOGIN_BTN;


	public RegisterPage ClickHereLink() {
		waitVisible(HERE_LINK);
		click(HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);

	}
	public void inputUserName(String username)
	{
		waitVisible(USERNAME_LOGIN_TXT);
		input(USERNAME_LOGIN_TXT, username);
		
		
	}
	public HomePage ClickLogin()
	{
		click(LOGIN_BTN);
		return PageFactory.initElements(driver, HomePage.class);
	
	}
	public void inputPassword(String password)
	{
		waitVisible(PASSWORD_LOGIN_TXT);
		input(PASSWORD_LOGIN_TXT, password);
		
		
	}
	public HomePage Login(String username,String password)
	{
		waitVisible(USERNAME_LOGIN_TXT);
		input(USERNAME_LOGIN_TXT, username);
		waitVisible(PASSWORD_LOGIN_TXT);
		input(PASSWORD_LOGIN_TXT, password);
		click(LOGIN_BTN);
		return PageFactory.initElements(driver,HomePage.class);
		
	}

}
