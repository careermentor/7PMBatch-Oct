package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation 
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void initiateBrowser()
	{
		
		ChromeDriver driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
	//	driver.close();
	}
	
	@Test
	public void signupfunc() throws Exception
	{
		
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		
	
	}
	
	@Test
	public void loginfunc()
	{
		
		
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass12345");
		
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
		
	}
	
}
