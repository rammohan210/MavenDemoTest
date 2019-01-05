package WebDriverEX;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


	public class CloseAndQuit 
	{
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver = new FirefoxDriver();
			driver.get("http://ljsjobs.com/DiscountedTraining/TrainerRegistration.aspx");			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);			
	
			driver.findElement(By.linkText("FAQ")).click();			 
			
			driver.findElement(By.linkText("FeedBack")).click();
			Thread.sleep(3000);
			
			//Get Home page window handle
			String HomepageHandle = driver.getWindowHandle();
			
			//Get Sub browsers handles
			Set<String> allhandles = driver.getWindowHandles();
			
			for(String wndhandle: allhandles)
			{			
				//Move focus to sub browser
				driver.switchTo().window(wndhandle);
				String pageURL = driver.getCurrentUrl();			
				
				if (pageURL.contains("Feedback"))
				{
					System.out.println("Switched to Feedback page");		
					driver.findElement(By.id("txtfullName")).sendKeys("Testing Masters");
					driver.findElement(By.id("txtemail")).sendKeys("TMtm100@gmail.com");
					driver.findElement(By.id("txtmsg")).sendKeys("Test");
					driver.findElement(By.id("chkrate_0")).click();
					driver.findElement(By.id("btnSubmit")).click();					
					
					Thread.sleep(3000);		
					driver.close();//Close Feedback page
					break; //Exit from for loop
				}					
			}
			//Switch to Home page browser
			driver.switchTo().window(HomepageHandle);
					
		driver.quit();  //Close all browsers opened through webdriver
		}
	}
	
	
	
	
	
	
	
	
	



