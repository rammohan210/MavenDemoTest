package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingTableHRM {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver  driver;
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.testingmasters.com/hrm/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement Leave_menu = driver.findElement(By.id("menu_leave_viewLeaveModule"));
		
		Actions act_obj = new Actions(driver);
		act_obj.moveToElement(Leave_menu).build().perform();
		
		driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
		//Thread.sleep(5000);
	
		//Get row count
		List<WebElement> tableRows = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr"));
		int iRows = tableRows.size();
		System.out.println("Row count: " + iRows);
		
		//Get col count
		List<WebElement> tableCols1 = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td"));
		int iCols = tableCols1.size();
		System.out.println("Col count: " + iCols);
		
		//get required cell data
		WebElement cell1 = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr[1]/td[1]"));
		String txt = cell1.getText();
		System.out.println(txt);
		
		
	
		for(int i=1; i<=iRows;i++)
		{
			List<WebElement> tableCols = driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td"));
			int iColumns = tableCols.size();
			
			for(int j=1; j<=iColumns;j++)
			{
				WebElement cell = driver.findElement(By.xpath("//*[@id='resultTable']/tbody/tr["+i+"]/td["+j+"]"));
				String text = cell.getText();
				System.out.println(text);
			}
			
			System.out.println("\n");
					
		}
	

	}
	
}


