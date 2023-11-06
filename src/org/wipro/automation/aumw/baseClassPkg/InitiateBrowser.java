package org.wipro.automation.aumw.baseClassPkg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.wipro.automation.aumw.utiltiesClasspkg.PropFileData;

public class InitiateBrowser 
{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser() throws Exception
	{
		
		if(PropFileData.readconfigprop("BrowserName").equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();  //launch a chrome browser
	
		}
	
		else if(PropFileData.readconfigprop("BrowserName").equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();  //launch a chrome browser
	
		}
		
		else
		{
			driver = new ChromeDriver();  //launch a chrome browser
		}
		
		driver.get(PropFileData.readconfigprop("ApplicationUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
		
}
