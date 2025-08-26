package org.wipro.auto.uo.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.auto.uo.baseClass.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.ReadtDataJSON;
import org.wipro.auto.uo.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.uo.pages.LoginPage;

public class LoginScenario_JSON extends InitiateBrowser
{

	@Test
	public void tc01_validate_valid_login_func() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(ReadtDataJSON.getdata("username"));
		login.enter_password(ReadtDataJSON.getdata("password"));
		login.click_loginbttn();
		
	}
	
	
	
}
