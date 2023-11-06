package org.wipro.automation.aumw.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.wipro.automation.aumw.utiltiesClasspkg.PropFileData;

public class SignupPage 
{

	WebDriver driver;
	
	
	public SignupPage(WebDriver driver) 
	{
	
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(PropFileData.readelementprop("FB_Signup_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(PropFileData.readelementprop("FB_Signup_FirstName_name"))).sendKeys(fname);
	}
	
	public void enter_lastname(String lname) throws Exception
	{
		driver.findElement(By.name(PropFileData.readelementprop("FB_Signup_LastName_name"))).sendKeys(lname);
	}
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(PropFileData.readelementprop("FB_Signup_Submit_name"))).click();
	}
}
