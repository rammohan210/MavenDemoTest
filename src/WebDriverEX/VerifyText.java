package WebDriverEX;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerifyText {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://testingmasters.com/hrm");
		
		String expText = "LOGIN Panel";
		String PageText = driver.getPageSource();	

			boolean b = PageText.contains(expText);
			if(b)
				System.out.println("Text exist");
			else	
				System.out.println("Text not exist");	
			
	}
}






