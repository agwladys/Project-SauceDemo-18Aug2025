package org.wipro.auto.uo.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.wipro.auto.uo.commonutilities.CaptureScreenshot;
import org.wipro.auto.uo.commonutilities.ExtentReportManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class SampleTest_Extent 
{

	WebDriver driver;
    ExtentReports extent;
    ExtentTest test;

    @BeforeTest
    public void setupReport() {
        extent = ExtentReportManager.getReportInstance();
    }

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver(); // use WebDriverManager if needed
        driver.manage().window().maximize();
    }

    @Test
    public void verifyTitleTest() {
        test = extent.createTest("Verify Google Title Test");
        driver.get("https://www.google.com");
        String title = driver.getTitle();
        if (title.equals("Google")) {
            test.log(Status.PASS, "Title matched: " + title);
        } else {
            test.log(Status.FAIL, "Title mismatch. Found: " + title);
        }
        
        Assert.assertEquals(title, "Google");
        
      // test.addScreenCaptureFromPath(CaptureScreenshot.captureScreenshot(driver,"Testcase1"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @AfterTest
    public void flushReport() {
        extent.flush();
    }
	
}
