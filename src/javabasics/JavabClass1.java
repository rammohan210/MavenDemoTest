package javabasics;

public class JavabClass1 {
	
	public JavabClass1(int num)
	{
		System.out.println("Constructor input is: " + num);
	}
	
	
	public void mul(int x, int y)
	 {
		 int z;
		 z = x * y;
		 System.out.println("Mul of 2 val is: "+z);
	 }
	
	
	public static void main(String[] args) {		
		
		JavabClass1 obj2 = new JavabClass1(50);	
	
	}
}
