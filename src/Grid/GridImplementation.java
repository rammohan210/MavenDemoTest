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

public class GridImplementation
{
	public static void main(String[] args) throws MalformedURLException 
	{		
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		capability.setBrowserName("firefox");
		capability.setPlatform(Platform.XP);
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.0.42:8585/wd/hub"),capability);
		
		driver.manage().window().maximize();
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.name("Submit")).click();
	}

}
