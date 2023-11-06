package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime 
{
	
	WebDriver driver;
	
	@Test
	public void initiateBrowser()
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
		//Assert.assertEquals(ActURL, ExpURL,"URL are different"); //hard assertion //failed
		
		SoftAssert sa = new SoftAssert();  //soft assertion
		sa.assertEquals(ActURL, ExpURL,"URL are different");  //soft assertion
		
		System.out.println("this test step1 executed successfully");
		//hard assertion & soft assertion
		
		String ExpTitle = "Facebook – log in or sign up";
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		System.out.println("this test step2 executed successfully");
		
		String ExpUsername = "Email address or phone number";
				
		String ActUsername = driver.findElement(By.id("email")).getAttribute("placeholder");
		
		sa.assertEquals(ActUsername, ExpUsername);
		System.out.println("this test step3 executed successfully");
		
		String ExpLogin = "Log in";
		String ActLogin = driver.findElement(By.name("login")).getText();
		
		sa.assertEquals(ActLogin, ExpLogin);
		
		Point Actloc = driver.findElement(By.name("login")).getLocation();
		System.out.println(Actloc);
		
		//System.out.println(driver.getPageSource());
		
		boolean logen = driver.findElement(By.name("login")).isEnabled();
		System.out.println(logen);
		sa.assertEquals(logen, true);
		
		
		driver.close();
		
		sa.assertAll();
		
	}

}
