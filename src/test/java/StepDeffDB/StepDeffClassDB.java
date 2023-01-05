package StepDeffDB;


import com.ActionDB.qa.HomePageActionDB;
import com.ActionDB.qa.LoginPageActionDB;
import com.ActionDB.qa.ProfilePageActionDB;
import com.UtilityDB.qa.BaseClassDB;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDeffClassDB extends BaseClassDB{
	HomePageActionDB homePageActionDB = new HomePageActionDB();
	LoginPageActionDB loginPageActionDB = new LoginPageActionDB();
	ProfilePageActionDB profilePageActionDB = new ProfilePageActionDB();

	
	@Given("^Launch Application <\"([^\"]*)\">$")
	public void launch_Application(String URL) throws Throwable {
	    launchURL(URL);
	}
	
	@Then("^Verify Login Link Displayed In Home Page$")
	public void verify_Login_Link_Displayed_In_Home_Page() throws Throwable {
		homePageActionDB.VerifyLoginLinkDisplayedInHomePage();
	}
	
	@Then("^Click Login Link$")
	public void click_Login_Link() throws Throwable {
		homePageActionDB.ClickLoginLink();
		Thread.sleep(2000);
	}
	
	@Then("^Verify Login Page Displayed$")
	public void verify_Login_Page_Displayed() throws Throwable {
	    loginPageActionDB.VerifyLoginPageDisplayed();
	}
	
	@Then("^Verify Login Text Displayed$")
	public void verify_Login_Text_Displayed() throws Throwable {
	    loginPageActionDB.VerifyLoginTextDisplayed();
	}
	
	@Then("^Verify Username Field Displayed$")
	public void verify_Username_Field_Displayed() throws Throwable {
	    loginPageActionDB.VerifyUsernameFieldDisplayed();
	}
	
	@Then("^Verify Password Field Displayed$")
	public void verify_Password_Field_Displayed() throws Throwable {
	    loginPageActionDB.VerifyPasswordFieldDisplayed();
	}
	
	@Then("^Verify Login Button Displayed$")
	public void verify_Login_Button_Displayed() throws Throwable {
	    loginPageActionDB.VerifyLoginButtonDisplayed();
	}
	
	@Then("^Click Close Button$")
	public void click_Close_Button() throws Throwable {
	    loginPageActionDB.ClickCloseButton();
	}

	@Then("^Verify Login Page closes$")
	public void verify_Login_Page_closes() throws Throwable {
	    homePageActionDB.VerifyLoginPagecloses();
	}
	
	@Then("^User Input Credentials <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_Input_Credentials(String Username, String Password) throws Throwable {
	    loginPageActionDB.UserInputCredentials(Username, Password);
	    Thread.sleep(3000);
	}
	
	@Then("^Click Login Button$")
	public void click_Login_Button() throws Throwable {
	    loginPageActionDB.ClickLoginButton();
	    Thread.sleep(3000);
	}

	@Then("^Handle PopUp$")
	public void handle_PopUp() throws Throwable {
	    loginPageActionDB.HandlePopUp();
	}

	@Then("^Verify User Redirected To Login Page$")
	public void verify_User_Redirected_To_Login_Page() throws Throwable {
	    loginPageActionDB.VerifyUserRedirectedToLoginPage();
	}

	@Then("^Verify User Can Login$")
	public void verify_User_Can_Login() throws Throwable {
		profilePageActionDB.VerifyUserCanLogin();
	}
	
	@Then("^User Input Invalid CredentialU <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_Input_Invalid_CredentialU(String InvalidUsername, String Password) throws Throwable {
	    loginPageActionDB.UserInputInvalidCredentialU(InvalidUsername, Password);
	    Thread.sleep(3000);
	}	
	
	@Then("^User Input Invalid CredentialP <\"([^\"]*)\"> <\"([^\"]*)\">$")
	public void user_Input_Invalid_CredentialP(String Username, String InvalidPassword) throws Throwable {
	    loginPageActionDB.UserInputInvalidCredentialP(Username, InvalidPassword);
	    Thread.sleep(3000);
	}
	
	@Then("^Click Logout Button$")
	public void click_Logout_Button() throws Throwable {
		profilePageActionDB.ClickLogoutButton();
		Thread.sleep(3000); 
	}

	@Then("^Verify User Can Logout$")
	public void verify_User_Can_Logout() throws Throwable {
		homePageActionDB.VerifyUserCanLogout();
	}
}
