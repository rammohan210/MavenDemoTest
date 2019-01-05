package WebDriverEX;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JUnitEx {
	
	@Before
	public void m1()
	{
		System.out.println("Before");
	}
	
	@Test
	public void m2()
	{
		System.out.println("Test");
	}
	
	@After
	public void m3()
	{
		System.out.println("After");
	}
	
	
}
