package javaadvanced;

public class Class1 extends Class2 { 
	
	protected int add(int a, int b)
	{
		int z;
		System.out.println("Class1");
		z = a + b;
		return z;
		
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class1 obj1 = new Class1();
		int a = obj1.add(10, 20);
		System.out.println(a);
		
		
		
		
		
		
		

	}

}
