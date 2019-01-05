package javaadvanced;

public class classA {
	
	public static void m1(int x, int y) {
		int z;
		z=x+y;
		System.out.println("addition in ClassA is: " + z);		
	}

	public void m2(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Sub in ClassA is: " + z);		
	}
	
	public static void main(String args[])
	{		
		classA.m1(10,20);
		//classA.m2(10,20);	//not accepted
	}

}
