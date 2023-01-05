package com.LocatorDB.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityDB.qa.BaseClassDB;

public class ProfilePageLocatorDB extends BaseClassDB{
	public ProfilePageLocatorDB() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "nameofuser")
	public WebElement nameOfUser;
	
	@FindBy(id = "logout2")
	public WebElement logoutButton;
}
