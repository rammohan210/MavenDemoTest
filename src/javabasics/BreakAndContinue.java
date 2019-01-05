package javabasics;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String flag;
		
		while (true)
		{	
			System.out.println("Enter y or n");		
			flag = sc.next();
			
			if(flag.contentEquals("y"))
			{				
				continue;				
			}				
			else				
			{
				break;				
			}
		}
	}

}





