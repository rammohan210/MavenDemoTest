package WebDriverEX;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarEx {

	public static void main(String[] args) {
		
		FirefoxDriver d=new FirefoxDriver();
		
		d.get("http://www.jqueryui.com");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		d.findElement(By.partialLinkText("Datepicker")).click();		

		d.switchTo().frame(d.findElement(By.className("demo-frame")));

		d.findElement(By.id("datepicker")).click();			
		
		/*
		//To get Cell value
		WebElement cell = d.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[3]"));
		System.out.println(cell.getText());
				
	*/
		
		//Click on Month
		//d.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span")).click();
		
		
		WebElement tble = d.findElement(By.xpath(".//*[@id='ui-datepicker-div']/table/tbody"));
		
		List<WebElement> rows = tble.findElements(By.tagName("tr"));
		System.out.println("the no of rows in table is" + rows.size());				
						
		List<WebElement> cols = tble.findElements(By.tagName("td"));
		System.out.println("the no of cols in table is" +cols.size());		
		String day = "16";
		for(int i=0;i<cols.size();i++)
		{			
			//System.out.println(cols.get(i).getText());
			if(cols.get(i).getText().equals(day))
			{
				d.findElement(By.partialLinkText(day)).click();
				break;
			}
		}
		
		
		
		
		

	}

}
