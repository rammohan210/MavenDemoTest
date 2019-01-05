package javaadvanced;

public class MyclassEncap {
	
	public void add()
	{
		System.out.println("Add method");
	}
	
	public void mul()
	{
		System.out.println("mul method");
	}
	
	public void div()
	{
		System.out.println("div method");
	}
	
	public static void main(String args[])
	{
		MyclassEncap obj = new MyclassEncap();
		obj.add();
		obj.mul();
		obj.div();	
	}
	
	

}
