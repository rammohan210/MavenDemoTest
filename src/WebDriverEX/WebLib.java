package WebDriverEX;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebLib {
	
	public static Boolean SetText(String ObjectName, String Value, WebDriver driver)
    {
        Boolean stepStatus = true;
        if (ObjectName.contains(":="))
        {
            String[] arrObjectName = ObjectName.split(":=");
            String locatorName = arrObjectName[0];
            String locatorValue = arrObjectName[1];
            String locatorNameLower = locatorName.toLowerCase();
            if (arrObjectName.length == 2)
            {
                switch (locatorNameLower)
                {
                    case "id":
                        try
                        {
                            driver.findElement(By.id(locatorValue)).click();
                            driver.findElement(By.id(locatorValue)).clear();
                            //wait(1);
                            driver.findElement(By.id(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "name":
                        try
                        {
                            driver.findElement(By.name(locatorValue)).click();
                            driver.findElement(By.name(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.name(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "xpath":
                        try
                        {
                            driver.findElement(By.xpath(locatorValue)).click();
                            driver.findElement(By.xpath(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.xpath(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "cssselector":
                        try
                        {
                            driver.findElement(By.cssSelector(locatorValue)).click();
                            driver.findElement(By.cssSelector(locatorValue)).clear();
                            //wait(1);
                            driver.findElement(By.cssSelector(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "partiallinktext":
                        try
                        {
                            driver.findElement(By.partialLinkText(locatorValue)).click();
                            driver.findElement(By.partialLinkText(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.partialLinkText(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "linktext":
                        try
                        {
                            driver.findElement(By.linkText(locatorValue)).click();
                            driver.findElement(By.linkText(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.linkText(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "tagname":
                        try
                        {
                            driver.findElement(By.tagName(locatorValue)).click();
                            driver.findElement(By.tagName(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.tagName(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "classname":
                        try
                        {
                            driver.findElement(By.className(locatorValue)).click();
                            driver.findElement(By.className(locatorValue)).clear();
                           // wait(1);
                            driver.findElement(By.className(locatorValue)).sendKeys(Value);
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    default:
                        stepStatus = false;
                        break;
                } //Switch end
            } //If end
            else 
            {
                stepStatus = false;
            }
        }
        else
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	
	//===================================================
	public static Boolean clickElement(String ObjectName, WebDriver driver)
    {
        Boolean stepStatus = true;
        if (ObjectName.contains(":="))
        {
            String[] arrObjectName = ObjectName.split(":=");
            String locatorName = arrObjectName[0];
            String locatorValue = arrObjectName[1];
            String locatorNameLower = locatorName.toLowerCase();
            if (arrObjectName.length == 2)
            {
                switch (locatorNameLower)
                {
                    case "id":
                        try
                        {
                            driver.findElement(By.id(locatorValue)).click();             
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "name":
                        try
                        {
                            driver.findElement(By.name(locatorValue)).click();
    
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "xpath":
                        try
                        {
                            driver.findElement(By.xpath(locatorValue)).click();
                            
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "cssselector":
                        try
                        {
                            driver.findElement(By.cssSelector(locatorValue)).click();
                            
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "partiallinktext":
                        try
                        {
                            driver.findElement(By.partialLinkText(locatorValue)).click();
                           
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "linktext":
                        try
                        {
                            driver.findElement(By.linkText(locatorValue)).click();
                           
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "tagname":
                        try
                        {
                            driver.findElement(By.tagName(locatorValue)).click();
                           
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    case "classname":
                        try
                        {
                            driver.findElement(By.className(locatorValue)).click();
                            
                        }
                        catch (Exception e)
                        {
                            stepStatus = false;
                        }
                        break;
                    default:
                        stepStatus = false;
                        break;
                } //Switch end
            } //If end
            else 
            {
                stepStatus = false;
            }
        }
        else
        {
            stepStatus = false;
        }
        return stepStatus;
    }
	//==================================================
	
	public static void main(String args[])
	{
		boolean retval;
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.testingmasters.com/hrm");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Enter user name
		retval = WebLib.SetText("id:=txtUsername", "user01", driver);
		if (retval)
		{
			System.out.println("User name entered successfully, passed");
		}
		else
		{
			System.out.println("User name not entered, Failed");
		}
		//Enter password
		retval = WebLib.SetText("id:=txtPassword", "pass1234", driver);
		if (retval)
		{
			System.out.println("Password entered successfully, passed");
		}
		else
		{
			System.out.println("Password not entered, Failed");
		}
		//Click on Login button
		retval = WebLib.clickElement("id:=btnLogin", driver);
		if (retval)
		{
			System.out.println("Login button clicked successfully, passed");
		}
		else
		{
			System.out.println("Login button not clicked , Failed");
		}
		
		//Verify home page is displayed
		
	}

}
