package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SleepEx {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Leave_menu = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		
		Actions act_obj = new Actions(driver);
		act_obj.moveToElement(Leave_menu).build().perform();
		
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
				
		Thread.sleep(4000);
		String cell_val = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[4]")).getText();
		System.out.println("Cell val is: "+ cell_val);
		

	}

}








