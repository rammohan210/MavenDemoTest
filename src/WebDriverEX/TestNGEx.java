package WebDriverEX;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx {	
	private WebDriver driver;	
	
	@BeforeTest
	public void CMSLogin()
	{
		driver = new FirefoxDriver();	
		driver.get("http://sys1:8080/multi_cloud1/");		
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
		
		System.out.println("Before");
	}
	
	@Test
	public void LinksCount()
	{		
		System.out.println("Test1");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int n = links.size();
		System.out.println("Links count is: " + n);
	
		for(WebElement link : links)
		{
			System.out.println(link.getText());
		}
			
	}
		
	@AfterTest
	public void CMSLogout()
	{
		driver.quit();
		System.out.println("After");
	}

}
