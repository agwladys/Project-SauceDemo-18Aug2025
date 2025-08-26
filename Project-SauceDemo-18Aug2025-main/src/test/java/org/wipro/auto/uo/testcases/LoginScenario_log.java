package org.wipro.auto.uo.testcases;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.wipro.auto.uo.baseClass.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.CaptureScreenshot;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;
import org.wipro.auto.uo.pages.LoginPage;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class LoginScenario_log extends InitiateBrowser
{
	
	
	ExtentReports Reports;
	ExtentTest test;
	

	
	static Logger log = Logger.getLogger(LoginScenario_log.class);

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("standard_user");
		
		log.info("enter username...");
	    Reporter.log("Step 1: Enter username", true);
		
		login.enter_password("secret_sauce");
		login.click_loginbttn();
		
		test = extent.createTest("Verify the product page");
		
		String ProductPage = driver.findElement(By.xpath("//span[text()='Products']")).getText();
		
		if (ProductPage.equals("Product")) {
            test.log(Status.PASS, "Product Page matched: " + ProductPage);
        } 
		else {
            test.log(Status.FAIL, "Product Page not matched: " + ProductPage);
            CaptureScreenshot.results(driver, "tc01_validate_valid_login_func");
        }
        
        Assert.assertEquals(ProductPage, "Product", "Product Page not matched");
        
		
	}
	
	//this test case read data from properties file
	@Test(enabled=false)
	public void tc01_validate_invalid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(ReadPropFiles.readconfig("username"));
		login.enter_password(ReadPropFiles.readconfig("password"));
		login.click_loginbttn();
		
		//because "this.driver" is null
		
	}
}
