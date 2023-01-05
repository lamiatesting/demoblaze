package com.ActionDB.qa;



import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import com.LocatorDB.qa.HomePageLocatorDB;
import com.UtilityDB.qa.BaseClassDB;

public class HomePageActionDB extends BaseClassDB{
	HomePageLocatorDB homePageLocatorDB = new HomePageLocatorDB();
	
	public void VerifyLoginLinkDisplayedInHomePage() {
		boolean result = homePageLocatorDB.loginLink.isDisplayed();
		Assert.assertTrue(result);
	}
	
	public void ClickLoginLink() {
		homePageLocatorDB.loginLink.click();
	}
	
	public void VerifyLoginPagecloses() {
		boolean verify = homePageLocatorDB.loginLink.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void VerifyUserCanLogout() {
		boolean verify = homePageLocatorDB.loginLink.isDisplayed();
		Assert.assertTrue(verify);
	}

}
