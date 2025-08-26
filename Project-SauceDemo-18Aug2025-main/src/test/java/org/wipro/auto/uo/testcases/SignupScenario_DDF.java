package org.wipro.auto.uo.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.uo.baseClass.InitiateBrowser;
import org.wipro.auto.uo.commonutilities.ReadPropFiles;
import org.wipro.auto.uo.datageneratorpkg.TestDataGenerator;
import org.wipro.auto.uo.pages.LoginPage;
import org.wipro.auto.uo.pages.SignupPage;

public class SignupScenario_DDF extends InitiateBrowser
{

	@Test(dataProvider="sign",dataProviderClass=TestDataGenerator.class)
	public void tc02_validate_valid_signup_func(String firstname, String lastname) throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccount();
		sign.enter_firstname(firstname);
		sign.enter_lastname(lastname);
		sign.select_dob_day("12");
		sign.click_male();
		sign.click_signupbttn();
		
	}
	
}
