package org.wipro.auto.uo.datageneratorpkg;

import org.testng.annotations.DataProvider;

public class TestDataGenerator
{


	@DataProvider(name="ddf")
	public Object[][] dataset()
	{
		//String data1 = "user1";
		//Object[] data2 = {"standard_user","secret_sauce"};    //1-D Array
		Object[][] data3 = {{"standard_user","secret_sauce"},{"locked_out_user","secret_sauce"},{"problem_user","secret_sauce"}};  //2-D Array
		return data3;
	}
	
	
	
	@DataProvider(name="sign")
	public Object[][] signupdata()
	{
		//String data1 = "user1";
		//Object[] data2 = {"standard_user","secret_sauce"};    //1-D Array
		Object[][] data3 = {{"David","John"},{"Alex","Neena"},{"Reena","Rowa"}};  //2-D Array
		return data3;
	}
	
}
