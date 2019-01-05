package javabasics;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int n;
		int fact = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n\n");
		n = sc.nextInt();
		for(int i = 1; i<=n; i++)
		{
			fact = fact * i;
		}
		
		System.out.println("factorial of "+ n + " is : " + fact);
	}

}
