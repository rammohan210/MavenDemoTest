package WebDriverEX;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CookiesEx {

	public static void main(String[] args) {		
	
		WebDriver driver = new FirefoxDriver();
		 
		String URL="http://google.com/";
		driver.navigate().to(URL);		
       		
		//Display all cookies
		Set<Cookie> cookiesList =  driver.manage().getCookies();
				
		for(Cookie c : cookiesList) {
			System.out.println(c);	
		}
		
		//delete all cookies
		driver.manage().deleteAllCookies();
								
	}
}




