package WebDriverEX1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AjaxAutosuggest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//launch flipkart Application
		driver.get("https://www.flipkart.com");
		
		//Close the windowover popup
		driver.findElement(By.xpath("//html/body/div[2]/div/div/button")).click();
		
		//Send the values from the search box
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Apple");
		Thread.sleep(2000);
		
		//Store the all AjaxAutosuggest webelements into list
		List<WebElement> lst_names=driver.findElements(By.xpath("//div[@class='AsXM8z']/div/div[1]/form/ul/li/a"));

		//Find the list Size
		int size=lst_names.size()-1;
		for(int i=0;i<=size;i++)
		{
			String names=lst_names.get(i).getText();
						
			//Print the Each  AjaxAutosuggest  Name
			System.out.println(names);
		}
	}

}
