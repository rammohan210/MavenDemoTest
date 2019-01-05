package javaadvanced;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet<String> SetA = new HashSet<String>();
		
		SetA.add("Kumar");
		SetA.add("John");
		SetA.add("Sujoy");
		SetA.add("John");
		SetA.add("Sujoy");
		
		//access via Iterator
		Iterator ite = SetA.iterator();
		
		while(ite.hasNext())
		{		  
		  System.out.println(ite.next());
		}

	}

}






