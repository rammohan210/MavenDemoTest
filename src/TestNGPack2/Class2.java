package TestNGPack2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {	
	
	@BeforeTest
	public void BT()
	{
		System.out .println("BT");
	}
	
	@BeforeSuite
	public void BS()
	{
		System.out .println("BS");
	}
	
	@Test
	public void TC4()
	{
		System.out .println("TC4");
	}
	
	@Test
	public void TC5()
	{
		System.out.println("TC5");
	}

}
