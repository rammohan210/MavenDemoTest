package WebDriverEX;

public class ErrorHandling {

	public static void main(String[] args) {
		int a,b,c;	
		
		try{
			a = 10;
			b = 0;
			c = a/b;
			System.out.println("output is : " + c);
		}
		
		catch(Exception e)
		{
			System.out.println("Cannot divide by zero, try again..");
			//e.printStackTrace();
		}
		
		finally
		{
			//System.out.println("Finally executed");
		}

	}

}
