package javaadvanced;

public class Class10 {
	
	static void m1(int  x, int y)
	{
		if(y==0)
			throw new ArithmeticException("Occured  bacuase y is zero in x/y expression");
		else
			System.out.println(x/y);		
	}	
	
	
	public static void main(String[] args) //throws InterruptedException 
	{		
		m1(10,0);	
		int a;
		a=10;
	}

}
