package WebDriverEX;

import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

public class SwitchTabs {	
	
	public static void main(String args[]) throws Exception {	 
			
	FirefoxDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.get("http://google.com");
	  
	//Open new tab using CTRL + t keys.
	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	  
	//Open URL In 2nd tab.	
	driver.navigate().to("http://yahoo.com");
	  
	//Switching between tabs using CTRL + tab keys.
	 driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	 
	 //Switch to current selected tab's content.
	 driver.switchTo().defaultContent();  //Google page is focused
	  
	 }
	
	
	
	
	
	
	
	
	 
	 /*
	 public void openTab() {
	  //Open tab 2 using CTRL + t keys.
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
	  //Open URL In 2nd tab.	
	  driver.get("http://yahoo.com");
	  
	  //Call switchToTab() function to switch to 1st tab
	  switchToTab();  
	 } 
	 
	 public void switchToTab() {
	  //Switching between tabs using CTRL + tab keys.
	  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
	  //Switch to current selected tab's content.
	  driver.switchTo().defaultContent();  
	 }
*/
}
