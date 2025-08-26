package org.wipro.auto.uo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;

public class LoginPage_PF 
{
	WebDriver driver;

	public LoginPage_PF(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbttn;
	
	
	public void enter_username(String uname)
	{
		username.sendKeys(uname);
	}
	
	public void enter_password(String pass) 
	{
		password.sendKeys(pass);
	}
		
	public void click_loginbttn()
	{
		loginbttn.click();
	}
	
}
