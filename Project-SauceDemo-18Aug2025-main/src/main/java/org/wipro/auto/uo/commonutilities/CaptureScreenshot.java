package org.wipro.auto.uo.commonutilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot 
{
	
	/*
	public static String captureScreenshot(WebDriver driver, String testName) {
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    File src = ts.getScreenshotAs(OutputType.FILE);
	    String path = "screenshots/" + testName + ".png";
	    File destination = new File(path);
	    try {
	        FileUtils.copyFile(src, destination);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	    return path;
	}
*/
	

	public static void results(WebDriver driver, String name) throws Exception
	{
		TakesScreenshot ts = (TakesScreenshot) driver;  //take screenshot
		
		File f = ts.getScreenshotAs(OutputType.FILE);
		
		File fd = new File("./Screenshot/" + name + ".png");
		
		FileUtils.copyFile(f, fd);
		
	}
	
	
}
