package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetEditValue {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		
		//Get Textbox value
		String un = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("Textbox value is : "+ un);
		
		
		//Get page URL
		String URL = driver.getCurrentUrl();
		System.out.println("URL is: " + URL);
		
		//Get page source
		String Pagesrc = driver.getPageSource();
		System.out.println("Page source : "+ Pagesrc);
		
		
	}

}







