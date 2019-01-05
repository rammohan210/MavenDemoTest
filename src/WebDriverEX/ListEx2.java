package WebDriverEX;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListEx2 {

	public static void main(String[] args) {
		WebDriver d = new FirefoxDriver();
		d.get("http://sys1:8080/multi_cloud1/");
		
		d.findElement(By.id("username")).sendKeys("admin");		
		
		d.findElement(By.id("password")).sendKeys("admin");
		
		d.findElement(By.xpath(".//*[@id='users']/table/tbody/tr[5]/td[2]/input[1]")).click();
		
		
		d.findElement(By.linkText("CREATE MEMBER")).click();
		
		WebElement oList = d.findElement(By.id("cloudname"));
		
		List<WebElement> oItems = oList.findElements(By.tagName("option"));
		
		int iCount = oItems.size();
		System.out.println("Items count is :" + iCount);
				
		/*for(int i=0; i < iCount; i++)
		{
			String itm = oItems.get(i).getText();
			System.out.println(itm);
		}
		*/
		
		for(WebElement item : oItems)
		{
			String itm = item.getText();
			System.out.println(itm);
		}
		


	}

}
