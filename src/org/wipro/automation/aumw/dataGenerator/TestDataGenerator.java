package org.wipro.automation.aumw.dataGenerator;

import org.testng.annotations.DataProvider;

public class TestDataGenerator 
{

	@DataProvider(name="ddf_data")
	public Object[][] datagenerator()
	{
		//String data = "user1";
		//Object[] data1 = {"user1", "user2"};   //1-D array
		
		Object[][] testdata = {{"user1", "pass1"},{"user2", "pass2"},{"user3", "pass3"}};
		
		return testdata;
	}
	
}
