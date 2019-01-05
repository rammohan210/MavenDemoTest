package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListEx {

		public static void main(String[] args) {

			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://sys1:8080/multi_cloud1/");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.id("username")).sendKeys("admin");		
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
			
			driver.findElement(By.linkText("CREATE MEMBER")).click();
			
			WebElement cname = driver.findElement(By.id("cloudname"));			
			Select itms = new Select (cname);			
			itms.selectByVisibleText("TestingM");				
		}
}
