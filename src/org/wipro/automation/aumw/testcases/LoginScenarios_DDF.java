package org.wipro.automation.aumw.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClassPkg.InitiateBrowser;
import org.wipro.automation.aumw.dataGenerator.TestDataGenerator;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenarios_DDF extends InitiateBrowser
{

	@Test(dataProvider="ddf_data",dataProviderClass=TestDataGenerator.class)
	public void tc01_loginFunc(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username(username);
		login.enter_password(password);
		login.click_loginbttn();
	}
	
	
	
	
}
