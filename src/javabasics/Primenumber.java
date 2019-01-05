package javabasics;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		for(int k = 2; k<=50; k++)
		{
			int n;
			n = k;
			int count = 0;		
			for(int i = 1; i<=n/2; i++)
			{
				if (n % i == 0)
					count = count + 1;
				}
			if (count==1)
			{
				System.out.println(n);
			}			
		}	
	}

}
