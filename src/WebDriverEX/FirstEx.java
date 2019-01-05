package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstEx {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");	
		String ExpTitle = "Google";
		
		String ActTitle = driver.getTitle();
		if (ActTitle.contentEquals(ExpTitle))
		{
			System.out.println("google page is opened, Pass");
		}
		else
		{
			System.out.println("google page is not opened, Fail");
		}	
		
		driver.findElement(By.id("lst-ib")).sendKeys("Testing Masters Technologies");
		
		driver.findElement(By.name("btnG")).click();
				
		//driver.quit();
	}

}
