package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserControl 
{
	
	WebDriver driver;
	
	@Test
	public void facebooklogin() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://thetestingworld.com/testings/");  //by default upto 60 secs
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(500));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.name("email")).sendKeys("user1");
		//driver.findElement(By.name("email")).clear();
		//driver.findElement(By.name("email")).sendKeys("user2");
		
		driver.findElement(By.name("fld_username")).sendKeys("Selenium");
		driver.findElement(By.cssSelector("[value='home']")).click();
		driver.findElement(By.name("terms")).click();
	//	driver.findElement(By.className("displayPopup")).click();
		
		WebElement mf = driver.findElement(By.name("sex"));
		Select gen = new Select(mf);
		
		//gen.selectByIndex(1); //male
		//gen.selectByValue("2"); //female
		gen.selectByVisibleText("Male");
	
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		st.selectByVisibleText("Hawaii");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		
		//wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("cityId")), "Hilo"));
		
		ct.selectByVisibleText("Kula");
		
	
	}
	@Test(enabled=false)
	public void initiateBrowser() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		driver.navigate().refresh();
		
		
		driver.close(); //close one window only
		driver.quit();  //will close multiple window
	}
	
		
}
