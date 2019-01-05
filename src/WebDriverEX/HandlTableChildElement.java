package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlTableChildElement {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Leave_menu = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		Actions act_obj = new Actions(driver);
		act_obj.moveToElement(Leave_menu).click().build().perform();
		
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		Thread.sleep(5000);
		
		//To click link in Leaves table
		List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int iRows = tableRows.size();
		String expDate  = "2016-05-31";
		for(int i=1; i<=iRows;i++)
		{
			WebElement link = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td[1]/a"));
			String text = link.getText();
			if(text.contains(expDate))
			{		
				link.click();
				break;
			}			
		}
	}

}
