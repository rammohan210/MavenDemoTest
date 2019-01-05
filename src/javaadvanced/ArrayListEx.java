package javaadvanced;
import java.util.*; 
public class ArrayListEx { 
	 
	 public static void main(String args[]){  
		 
		  ArrayList<String> list = new ArrayList<String>();//Creating arraylist  
		  
		  list.add("Kumar");
		  list.add("John"); 
		  list.add("Sujay");  
		  list.add("John");  
		  list.add("Sujay");  
		  
		  //Traversing list through Iterator  
		  Iterator itr = list.iterator();
		  
		  while(itr.hasNext()){ 		  
			  System.out.println(itr.next()); 	   
		  }
	  
	   } 
	 
	}  


