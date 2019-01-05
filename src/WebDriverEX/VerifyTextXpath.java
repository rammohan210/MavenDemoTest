package WebDriverEX;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyTextXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://testingmasters.com/hrm");
		
		//click Login without entering user id, password and verify error message
		driver.findElement(By.id("btnLogin")).click();
		
		Thread.sleep(2000);		
		
		try{
			driver.findElement(By.xpath("//span[contains(text(), 'Username cannot be empty')]"));
			System.out.println("Expected message exist");			
		}
		
		catch(Exception e)
		{
			System.out.println("Expected message not displayed");
		}
		
	

	}

}
