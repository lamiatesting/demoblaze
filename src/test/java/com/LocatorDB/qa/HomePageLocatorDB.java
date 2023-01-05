package com.LocatorDB.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityDB.qa.BaseClassDB;

public class HomePageLocatorDB extends BaseClassDB{
	public HomePageLocatorDB() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Log in")
	public WebElement loginLink;

}
