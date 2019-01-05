package javabasics;

public class StringMethods2 {

	public static void main(String[] args) {
		
	/*	
		String str = "Testing Masters";	
		int n = str.length();	
		System.out.println(n);			
		*/			
		
		/*		
		String str = "Testing Masters Technologies";	
		str = str.replace("Testing", "QA");		
		System.out.println(str);		
		*/		
			
		/*
		String str1 = "Testing Masters Technologies";
		String[] arr = str1.split(" ");
		System.out.println(arr.length);
		
		for(String s : arr)
		{
			System.out.println(s);
		}		
		*/
		
		//System.out.println("Word count is : " + arr.length);
			
		/*
		String str1 = "Testing Masters Technologies";
		String str2 = "Testing";
		
		if (str1.contains(str2))		
			System.out.println(" exist");		
		else		
			System.out.println(" not exist");				
		*/			
		
		/*
		String str = "Testing Masters Technologies";
		String s = str.substring(8, 15);
		System.out.println(s);		
		*/
		
		
		String str1 = "Sunny";
		String str2 = "Sunny";
		 if(str1.contentEquals(str2))  // if(str1.equalsIgnoreCase(str2)) or if(str1.equals(str2))				
			System.out.println("both are Equal");	
		else		
			System.out.println("both are not Equal");			
			
			/*
		String brw = "IE";
		brw = brw.toLowerCase();
		System.out.println(brw);
		
		brw = brw.toUpperCase();
		System.out.println(brw);
				
		*/
		
		/*
		String str1 = " Testing Masters ";
		System.out.println(str1.length());
		
		str1 = str1.trim();
		System.out.println(str1.length());	
		*/
	
	}

}







