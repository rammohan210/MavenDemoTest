package javaadvanced;

import java.util.HashMap;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		HashMap<String, String> City = new HashMap<String,String>();		
		
		City.put("TS", "HYD");
		City.put("AP", "AMR");
		City.put("TN", "CHE");
		City.put("KA", "BLR");
		City.put("KT", "BLR");
		
		//display one value
		System.out.println(City.get("KT"));

		//display all values
		Set<String> allkeys = City.keySet();
		for(String keyname : allkeys)
		{
			System.out.println("the value of key '" + keyname + "' is : " + City.get(keyname));
		}
		
	}
}





