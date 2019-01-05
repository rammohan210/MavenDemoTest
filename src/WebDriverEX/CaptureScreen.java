package WebDriverEX;

import java.io.File;




import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class CaptureScreen {

	public static void main(String[] args) throws Exception {
		
	  
	  WebDriver driver = new FirefoxDriver();
   	  driver.manage().window().maximize(); 
   	  driver.get("http://www.gmail.com");   	  
   	  
   	  TakesScreenshot ts = (TakesScreenshot) driver;
   	  File scrFile = ts.getScreenshotAs(OutputType.FILE);
   	  File trgFile = new File("D:\\screenshot2.png");
      FileUtils.copyFile(scrFile, trgFile);
      
     
      
      
      /*
   	  try{	             
   		  driver.findElement(By.id("lst-ib")).sendKeys("testing Masters");
   	 }
   	  
   	  catch (Exception e){
   		 System.out.println("object not located");
   		//e.printStackTrace();
   		 getscreenshot(driver);
   	  }   	  
   	  
	   	finally
	    {
	  	  driver.quit();
	    }
   	  
     }
     
     public static void getscreenshot(WebDriver d) throws Exception
     {     	  
   	File scrFile = ((TakesScreenshot) d).getScreenshotAs(OutputType.FILE);
    FileUtils.copyFile(scrFile, new File("D:\\screenshot5.png"));
  
    */ 
	   }
}
