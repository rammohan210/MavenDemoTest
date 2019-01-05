package javaadvanced;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String> listA = new ArrayList<String>();

		listA.add("element 0");
		listA.add("element 1");
		listA.add("element 0");


		//access via Iterator
		Iterator ite = listA.iterator();
		while(ite.hasNext())
		{
		  String element = (String) ite.next();
		  System.out.println(element);
		}
	}

}
