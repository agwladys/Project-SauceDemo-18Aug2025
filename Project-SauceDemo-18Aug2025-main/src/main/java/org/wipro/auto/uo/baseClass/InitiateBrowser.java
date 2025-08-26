package org.wipro.auto.uo.baseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.wipro.auto.uo.commonutilities.ExtentReportManager;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;

import com.aventstack.extentreports.ExtentReports;

public class InitiateBrowser
{

	public ExtentReports extent;
	public WebDriver driver;
	
	@BeforeTest
    public void setupReport() {
        extent = ExtentReportManager.getReportInstance();
    }
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		else if(ReadPropFiles.readconfig("BrowserName").equalsIgnoreCase("safari"))
		{
			driver = new SafariDriver();
			
		}
		
		else
		{
			driver = new ChromeDriver();
		}
		
		
		driver.get(ReadPropFiles.readconfig("ApplicationURL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		//driver.quit();
	}
	
	@AfterTest
    public void flushReport() {
        extent.flush();
    }
}
