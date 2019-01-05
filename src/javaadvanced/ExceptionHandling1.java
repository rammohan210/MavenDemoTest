package javaadvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling1 {

	public static void main(String[] args) throws IOException  {
		
		FileReader fr = null;	
		
	      try{	    	  
	         File file = new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
	         fr = new FileReader(file);  
	         char [] a = new char[50];
	         fr.read(a); // reads the content to the array
	     
	         for(int i=0; i<a.length; i++)
	         {	        	 
	        	 System.out.print(a[i]); //prints the characters one by one
	         }
	        
	      }
	          
	      catch(FileNotFoundException e){
	    	  System.out.print("File not found in given path");
	       }	      

	      catch(IOException ex){
			 System.out.println("IO exception");			
			}
	      
	      catch(ArrayIndexOutOfBoundsException ex1){  
	    	
	    	 System.out.println("Array out of bound");	    	  
			}
	      
	      catch(Exception e) //generic exception
	      {
	    	  e.printStackTrace();    	  
	      }  
	      
	     finally
	     {
	    	 fr.close();	    	 
	     }
	    
	}

}
