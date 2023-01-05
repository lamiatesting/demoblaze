package com.ActionDB.qa;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.LocatorDB.qa.LoginPageLocatorDB;
import com.UtilityDB.qa.BaseClassDB;
import com.UtilityDB.qa.TestDataClassDB;

public class LoginPageActionDB extends BaseClassDB{
	LoginPageLocatorDB loginPageLocatorDB = new LoginPageLocatorDB();
	
	public void VerifyLoginPageDisplayed() {
		boolean verify = loginPageLocatorDB.loginText.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void VerifyLoginTextDisplayed() {
		boolean verify = loginPageLocatorDB.loginText.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void VerifyUsernameFieldDisplayed() {
		boolean verify = loginPageLocatorDB.usernameField.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void VerifyPasswordFieldDisplayed() {
		boolean verify = loginPageLocatorDB.passwordField.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void VerifyLoginButtonDisplayed() {
		boolean verify = loginPageLocatorDB.loginButton.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void ClickCloseButton() {
		loginPageLocatorDB.closeButton.click();
	}
	
	public void UserInputCredentials(String Username, String Password) {
		loginPageLocatorDB.usernameField.sendKeys(TestDataClassDB.Username);
		loginPageLocatorDB.passwordField.sendKeys(TestDataClassDB.Password);
	}
	
	public void ClickLoginButton() {
		loginPageLocatorDB.loginButton.click();
	}
	
	public void HandlePopUp() {
		driver.switchTo().alert().accept();
	}
	
	public void VerifyUserRedirectedToLoginPage() {
		boolean verify = loginPageLocatorDB.loginText.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void UserInputInvalidCredentialU(String InvalidUsername, String Password) {
		loginPageLocatorDB.usernameField.sendKeys(TestDataClassDB.InvalidUsername);
		loginPageLocatorDB.passwordField.sendKeys(TestDataClassDB.Password);
	}
	
	public void UserInputInvalidCredentialP (String Username, String InvalidPassword) {
		loginPageLocatorDB.usernameField.sendKeys(TestDataClassDB.Username);
		loginPageLocatorDB.passwordField.sendKeys(TestDataClassDB.InvalidPassword);
	}
}
