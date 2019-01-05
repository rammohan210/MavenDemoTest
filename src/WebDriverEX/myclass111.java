package WebDriverEX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myclass111 {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		driver=new ChromeDriver();
          driver.get("http://www.google.com");
          System.out.println(driver.getTitle());
          driver.quit();

	}

}
