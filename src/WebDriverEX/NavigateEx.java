package WebDriverEX;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateEx {

	public static void main(String[] args) {
		
		WebDriver d = new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://www.facebook.com/");		
		System.out.println(d.getTitle());
		
		d.navigate().to("https://www.google.co.in");
		System.out.println(d.getTitle());
		System.out.println(d.getCurrentUrl());
		
		d.navigate().back();
		System.out.println(d.getTitle());
		
		d.navigate().forward();
		System.out.println(d.getTitle());
		
		d.navigate().refresh();	

	}

}
