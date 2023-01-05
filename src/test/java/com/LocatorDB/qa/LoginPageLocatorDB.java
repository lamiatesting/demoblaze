package com.LocatorDB.qa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.UtilityDB.qa.BaseClassDB;

public class LoginPageLocatorDB extends BaseClassDB{
	public LoginPageLocatorDB() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "logInModalLabel")
	public WebElement loginText;
	
	@FindBy(id = "loginusername")
	public WebElement usernameField;
	
	@FindBy(id = "loginpassword")
	public WebElement passwordField;
	
	@FindBy(xpath = "//button[@onclick='logIn()']")
	public WebElement loginButton;
	
	@FindBy(xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
	public WebElement closeButton;
	

}
