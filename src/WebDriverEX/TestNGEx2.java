package WebDriverEX;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx2 {
	
	@BeforeMethod
	public void befmethod()
	{
		System.out.println("Before method");
	}
	
	@BeforeClass
	public void befclass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void Afterclas()
	{
		System.out.println("After class");
	}
	
	@AfterMethod
	public void aftmethod()
	{
		System.out.println("After method");
	}
	@BeforeTest
	public void bef()
	{
		System.out.println("Before Test");
	}
	
	@Test()
	public void Test1()
	{
		System.out.println("Test1");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test2");
	}
	
	@AfterTest
	public void aft()
	{
		System.out.println("After Test");
	}

}
