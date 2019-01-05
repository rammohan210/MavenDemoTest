package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetListItems {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
		
		/*
		WebElement mon = driver.findElement(By.id("month"));
		Select mon_sel = new Select(mon);
		
		mon_sel.selectByVisibleText("Jun");
		
		mon_sel.selectByValue("3");
		
		mon_sel.selectByIndex(1);		
		*/
		
		 //OR
	//	new Select(driver.findElement(By.id("month"))).selectByVisibleText("Feb");	
		
		//OR
		//driver.findElement(By.xpath("//select[@id='month']/option[text()='Jun']")).click();		
		
		List<WebElement> items = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		/*
		WebElement mon = driver.findElement(By.id("month"));
		List<WebElement> items = mon.findElements(By.tagName("option"));		
		
		System.out.println(items.size());
		
		for(WebElement itm : items)
		{
			String str = itm.getText();
			System.out.println(str);
		}
		
	*/	
		
		
		
		
		
		
		
		
		/*	
		 int n = items.size();
		System.out.println(n);
		
		for(int i=0;i<n ; i++)
		{
			String str = items.get(i).getText();
			System.out.println(str);
		}	
		*/
	}
}
