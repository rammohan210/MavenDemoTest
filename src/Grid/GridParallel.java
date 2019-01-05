package Grid;	

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridParallel 
{
  @Test
  public void TC1() throws MalformedURLException 
  {
	  	DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		WebDriver driver = new  RemoteWebDriver(new URL("http://192.168.0.42:8585/wd/hub"),capability);
		
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
  }
  @Test
  public void TC2() throws MalformedURLException 
  {
		
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName(BrowserType.CHROME);
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.42:6565/wd/hub"),capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
  }
  @Test
  public void TC3() throws MalformedURLException 
  {
		
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		capability.setBrowserName(BrowserType.IE);
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.42:4545/wd/hub"),capability);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
  }
}


