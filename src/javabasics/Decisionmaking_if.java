package javabasics;

import java.util.Scanner;

public class Decisionmaking_if {

	public static void main(String[] args) {		
		int a,b;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter values\n");
		a = sc.nextInt();
		b = sc.nextInt();
		if (a==b)
		{
			System.out.println("both are equal");
		}	
		else
		{
			System.out.println("both are not equal");
		}

	}

}
