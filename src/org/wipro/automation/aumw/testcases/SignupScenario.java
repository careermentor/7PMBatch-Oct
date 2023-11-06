package org.wipro.automation.aumw.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.wipro.automation.aumw.baseClassPkg.InitiateBrowser;
import org.wipro.automation.aumw.pages.SignupPage;

public class SignupScenario extends InitiateBrowser
{

	@Test
	public void tc02_signupFunc() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		sign.click_createnewaccountbttn();
		sign.enter_firstname("Java");
		sign.enter_lastname("Selenium");
		
		Select bday = new Select(driver.findElement(By.name("birthday_day")));
		bday.selectByVisibleText("31");
		
		sign.click_signupbttn();
	}
	
}
