package WebDriverEX;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlePrompt {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("file:///C:/Users/tm/Desktop/confirm.html");
		
		// click the button
		driver.findElement(By.xpath("/html/body/fieldset/button")).click();
		//driver.findElement(By.xpath("//button")).click();		
		
		Alert Alertwindow = driver.switchTo().alert();
		System.out.println(Alertwindow.getText());

		Thread.sleep(3000);		
		//Click OK
		Alertwindow.accept();
		
		//click on cancel button
		//AlertMessage.dismiss();
		
		driver.quit();
	}

}


