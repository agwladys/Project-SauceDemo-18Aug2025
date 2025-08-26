package org.wipro.auto.uo.testcases;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.wipro.auto.uo.baseClass.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;
import org.wipro.auto.uo.pages.LoginPage;

public class DemoRelativeLocator extends InitiateBrowser
{
	
	
	
	//this test case read data from properties file
	@Test(enabled=true)
	public void tc01_validate_invalid_login_func() throws Exception
	{
	
		
		WebElement searchid = driver.findElement(By.id("twotabsearchtextbox"));  //landmark
		
		WebElement username1 = driver.findElement(with(By.name("field-keywords")).above(searchid));
		
		WebElement username2 = driver.findElement(with(By.name("field-keywords")).below(searchid));
		
		WebElement username3 = driver.findElement(with(By.name("field-keywords")).near(searchid));
		
		WebElement username4 = driver.findElement(with(By.name("field-keywords")).toLeftOf(searchid));
		
		WebElement username5 = driver.findElement(with(By.name("field-keywords")).toRightOf(searchid));
		
		// /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
		
		
	}
}
