package com.qa.cleartrip.screenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cm.qa.cleartrip.utils.ClearTripBase;



public class ScreensShots extends ClearTripBase{
	
	public static void screenShot1() throws IOException  {
	File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\project-workspace\\ClearTrip\\ClearTripScreenShots\\screenshot1.png"));
	}
	

}
