package org.xyz.automation.fb;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KeyMouse 
{
	
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://demoqa.com/frames");
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		CaptureScreenshot.results(driver,"handleFrames1");
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenshot.results(driver,"handleFrames2");
		
	}
	@Test
	public void handleAlerts() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.className("signinbtn")).click();
		driver.switchTo().alert().accept();
		
		CaptureScreenshot.results(driver,"handleAlerts");
		
	}
	@Test(enabled=false)
	public void handlemouse() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://www.mphasis.com/home.html");
		
		//driver.findElement(By.xpath("//*[contains(text(),'Our Approach')]")).click();
		
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//*[contains(text(),'Our Approach')]"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//*[contains(text(),'Our Approach')]"))).perform();
		//act.contextClick(driver.findElement(By.xpath("//*[contains(text(),'Our Approach')]"))).perform();
		act.moveToElement(driver.findElement(By.xpath("//*[contains(text(),'Industries')]"))).perform();
		
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		//Cntrl+Click
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> winsid = driver.getWindowHandles();
		System.out.println(winsid);
		
		Iterator<String> itr = winsid.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		//driver.switchTo().window(win1);
		
		
	}
	
	@Test(enabled=false)
	public void handleKeyboard() throws Exception
	{
		
		driver = new ChromeDriver();  //launch a chrome browser
		driver.get("https://www.facebook.com/");
		
		Actions act = new Actions(driver);
		
		//act.sendKeys(Keys.PAGE_DOWN).perform();
		
		act.sendKeys("user1").perform();
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("Pass123").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
		
	}	
		
		
}
