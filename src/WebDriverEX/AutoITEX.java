package WebDriverEX;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoITEX {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new FirefoxDriver();		
		driver.get("http://sys1:8080/multi_cloud1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("member1");
		driver.findElement(By.id("password")).sendKeys("pass1234");
		driver.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
		driver.findElement(By.linkText("UPLOAD")).click();
		driver.findElement(By.id("file")).click();
		
		//Runtime.getRuntime().exec("D:\\OpenFile.exe");		
		
		
		
	}

}
