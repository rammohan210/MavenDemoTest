package TestNGPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	private WebDriver driver;
	
	@BeforeMethod
	public void Launchbrowser()
	{
		driver = new FirefoxDriver();	
		driver.get("http://testingmasters.com/hrm/");
	}
	
	@Test
	public void TC1()
	{				
		String title = driver.getTitle();
		// Continue the execution if condition is True, else stop the test case execution and make it fail
		Assert.assertTrue(title.contains("OrangeHRM"));
		System.out.println("HRM Login page opened successfully");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();	
		System.out.println("Successful...");
	}		
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}

}

