package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HRMLoginEx {

	public static void main(String[] args) throws InterruptedException {
/*
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
		
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user02 ");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
		
		driver.quit(); 
		
	*/	
		
		
		
		
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	
			
			driver.get("http://testingmasters.com/hrm/");
			
			WebElement element = driver.findElement(By.id("txtUsername"));		   
		   JavascriptExecutor js = (JavascriptExecutor)driver;
		   for (int iCnt = 0; iCnt < 5; iCnt++) 
		   {
		         js.executeScript("arguments[0].style.border='solid 4px black'", element);
		         Thread.sleep(200);
		         js.executeScript("arguments[0].style.border=''", element);
		         Thread.sleep(200);
		   }
		
		
		//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();	
		
		//System.setProperty("webdriver.ie.driver","D:\\IEDriverServer.exe");
		//WebDriver driver = new InternetExplorerDriver();
		

	}

}










