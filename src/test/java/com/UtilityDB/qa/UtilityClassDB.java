package com.UtilityDB.qa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityClassDB extends BaseClassDB{
	
	public static void takeScreenshot(WebDriver driver, String screenshot) {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		
		try {
			FileUtils.copyFile(srcfile, new File(currentDir+"/ScreenshotDB/"+screenshot+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
