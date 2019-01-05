package javaadvanced;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) throws FileNotFoundException, IOException{		
					
		    File file = new File("C:\\Users\\Admin\\Desktop\\New Text Document.txt");
		    FileReader fr = new FileReader(file);  
		     char[] a = new char[30];
		    
		     fr.read(a); // reads the content to an array
		     for(char c : a)
		      {
		        System.out.print(c); //prints the characters one by one
		      }  
		
   }
}








