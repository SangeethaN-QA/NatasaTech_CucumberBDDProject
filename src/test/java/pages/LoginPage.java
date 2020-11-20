package pages;

import org.openqa.selenium.WebDriver;

import helpers.ApplicationKeywords;
import helpers.CommonUtilites;

public class LoginPage extends CommonUtilites {

	
	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	public static final String title_LoginForm  = "//div[@id='login-form-container']//p[contains(text(),'Welcome to Yatra!')]";	
	public static final String txt_EmailId = "//input[@id='login-input']";	
	public static final String txt_Passwd = "//input[@placeholder='Enter your password']";	
	public static final String btn_Continue = "//li//button[@id='login-continue-btn']";	
	public static final String title_UserName = "//a[contains(text(),'Hi Sangeetha')]";	
	public static final String txt_Offers = "//h2[contains(text(),'Great Offers & Amazing Deals')]";
	public static final String btn_Login = "//button[@id='login-submit-btn']";
	public static final String errMsg_InvalidLogin = "//p[@id='login-error']";
	
	
	
	
	public static void click_LoginBtn()
	{
		Click_HeaderMenus("My Account");
		Click_UserBlock("Login");
	}
	
	public static void login_toApplication(String username,String pwd) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_EmailId, username);
		ApplicationKeywords.click_Button(btn_Continue);
		ApplicationKeywords.enterValue(txt_Passwd, pwd);
		ApplicationKeywords.click_Button(btn_Login);
	}
	
	public static void enter_InvalidUserName_LoginPage(String username) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_EmailId, username);
		ApplicationKeywords.click_Button(btn_Continue);
		
	}
	
	public static void enter_InvalidPwd_LoginPage(String pwd) throws InterruptedException
	{
		ApplicationKeywords.enterValue(txt_Passwd, pwd);
		ApplicationKeywords.click_Button(btn_Continue);
		
	}
	
	public static void getErrorMsg(String expectErrorMsg)
	{
		ApplicationKeywords.verify_getTextValue(errMsg_InvalidLogin,expectErrorMsg);
		
	}
}
