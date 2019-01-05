package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	
public class OpenNewWindow {

   public static void main(String[] args) {
	
	WebDriver driver = new FirefoxDriver(); 
	driver.manage().window().maximize();
	driver.get("http://www.google.co.in");
			
	WebElement link_Gmail = driver.findElement(By.linkText("Gmail")); 

	Actions Act = new Actions(driver);
			
	//Open gmail page in new tab
	Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
			
	//Open gmail page in new window
	//Act.contextClick(link_Gmail).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();	
   }
}
	
	
	
