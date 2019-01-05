package WebDriverEX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class UserProfileEx {
			
	public static void main(String[] args) {			
				
		ProfilesIni profile = new ProfilesIni();
				 
		FirefoxProfile myprofile = profile.getProfile("kumar");
				 
		WebDriver driver = new FirefoxDriver(myprofile);
		
		driver.get("http://www.gmail.com/");		
						    
	}
}