package javaadvanced;

public class Myclass01 implements Myinterface{

	public void m1(int x, int y) {
		int z;
		z=x+y;
		System.out.println("addition is: " + z);		
	}

	public void m2(int x, int y) {
		int z;
		z=x-y;
		System.out.println("Sub is: " + z);		
	}

	public void m3(int x, int y) {
		int z;
		z=x*y;
		System.out.println("Mul is: " + z);		
	}
	
	
	public static void main(String args[])
	{
		Myclass01 obj = new Myclass01();
		
		obj.m1(10,30);
		obj.m2(10,30);
		obj.m3(10,30);
	}
	

}
