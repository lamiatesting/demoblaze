package com.TestRunnerDB.qa;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.UtilityDB.qa.BaseClassDB;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = {"src/test/dbRresources/FeaturesDB"},
plugin = {"json:target/cucumber.json"},
glue = "StepDeffDB", 
tags = {"@loginLogout"})

public class TestRunnerClassDB extends AbstractTestNGCucumberTests{
	
	@BeforeTest
	public void startURL() {
		BaseClassDB test = new BaseClassDB();
		test.initBrowser();
	}
	
	@AfterTest
	public void closeURL() {
		BaseClassDB test = new BaseClassDB();
		test.driver.quit();
	}
}
