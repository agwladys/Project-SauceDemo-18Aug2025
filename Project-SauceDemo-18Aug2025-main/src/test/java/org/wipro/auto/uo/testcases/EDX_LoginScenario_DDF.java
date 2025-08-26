package org.wipro.auto.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.uo.baseClass.InitiateBrowser;
import org.wipro.auto.uo.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.uo.pages.LoginPage;

public class EDX_LoginScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void tc01_validate_valid_login_func(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
		
	}
	
	
	
}
