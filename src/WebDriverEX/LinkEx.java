package WebDriverEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkEx {	

		public static void main(String[] args) {

			WebDriver driver = new FirefoxDriver();
			
			driver.get("http://sys1:8080/multi_cloud1/");		
			driver.findElement(By.id("username")).sendKeys("admin");		
			driver.findElement(By.id("password")).sendKeys("admin");
			driver.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
			
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int n = links.size();
			System.out.println("Links count is: " + n);
		
			for(WebElement link : links)
			{
				System.out.println(link.getText());
			}
			
			//driver.findElement(By.linkText("CREATE ADMIN")).click();
			//driver.findElement(By.partialLinkText("CREATE AD")).click();

		}

	}



