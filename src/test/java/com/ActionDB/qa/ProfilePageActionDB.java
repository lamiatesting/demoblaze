package com.ActionDB.qa;

import org.testng.Assert;

import com.LocatorDB.qa.ProfilePageLocatorDB;
import com.UtilityDB.qa.BaseClassDB;

public class ProfilePageActionDB extends BaseClassDB{
	ProfilePageLocatorDB profilePageLocatorDB = new ProfilePageLocatorDB();
	
	public void VerifyUserCanLogin() {
		boolean verify = profilePageLocatorDB.nameOfUser.isDisplayed();
		Assert.assertTrue(verify);
	}
	
	public void ClickLogoutButton() {
		profilePageLocatorDB.logoutButton.click();
	}

}
