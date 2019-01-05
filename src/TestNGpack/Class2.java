package TestNGpack;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Class2 {
	
	@BeforeSuite
	public void BS2()
	{
		System.out .println("BS2");
	}
	
	@Test
	public void tc3()
	{
		System.out.println("Test case3");
	}

}
