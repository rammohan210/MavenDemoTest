package javaadvanced;

public class ExceptionHand3 {

	public static void main(String[] args) {

		try{
			int a = 15;
			int b = 5;
			int c= a/b;
			System.out.println("output is: " + c);
		}
		
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("Can't divide by zero");
		}
		
		
		finally
		{
			System.out.println("Execution completd..");
		}

	}

}
