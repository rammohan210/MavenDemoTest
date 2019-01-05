package javaadvanced;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverException {
	public void setval(WebDriver driver1)  throws NoSuchElementException{
	    try{	 
	    	driver1.findElement(By.id("search")).sendKeys("naveen");   
		}
	    catch (NoSuchElementException e){
	    	System.out.println("before throw");	
	       throw(e); //comment this line if you don't want to stop execution 
	    }	 
	}		
		
		public static void main(String[] args)  {
			
			WebDriverException obj = new WebDriverException();
			WebDriver driver = new FirefoxDriver();			
			driver.get("http://google.co.in");
			obj.setval(driver);
			System.out.println("After throw");
	}

}
