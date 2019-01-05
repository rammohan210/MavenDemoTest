package WebDriverEX;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class OpenMultipleBrowsers {

	public static void main(String[] args) throws InterruptedException {	
		
		WebDriver driver = null;
		
		System.out.println("Enter browser type: IE or FF or CHROME");
		Scanner sc = new Scanner(System.in);
		String brType = sc.next();
		brType = brType.toUpperCase();
		
			switch(brType)
			{
			case "FF":
				  driver = new FirefoxDriver();				  
				   break;
			
			case "IE":
				//For IE settings
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
				
				System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();				 
				break;
				  
			case "CHROME":
				System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
				 driver = new ChromeDriver();
	              break;
			}		
			
			  driver.get("http://testingmasters.com/hrm/");
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			  System.out.println(driver.getTitle());
			  driver.findElement(By.id("txtUsername")).sendKeys("user02");
			  driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
			  driver.findElement(By.name("Submit")).click();	 
			  
	}
}







