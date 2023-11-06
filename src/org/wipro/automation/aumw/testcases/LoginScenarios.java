package org.wipro.automation.aumw.testcases;

import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClassPkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.LoginPage;

public class LoginScenarios extends InitiateBrowser
{

	@Test
	public void tc01_loginFunc() throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
		login.enter_username("user1");
		login.enter_password("pass1");
		login.click_loginbttn();
	}
	
}
