package map;

import java.util.HashMap;
import java.util.LinkedHashMap;

// same like hashMap, but it will maintain oreder of insertion
public class LinkedHashMap1 {
 public static void main(String[] args) {
			// TODO Auto-generated method stub
	 LinkedHashMap<Integer,String> h1=new LinkedHashMap<>();
	 // h1.put(key,value );
	  h1.put(3, "Rohit");
	  h1.put(4, "Rohit");
	  h1.put(5, "Aaru");
	  h1.put(2, "Manu");
	  h1.put(4, "Rohan"); //Value can be duplicate but key must be uniq
	  h1.put(null, "Kavya");
	  h1.put(9, null); //value and key canbe null
	  System.out.println(h1);

		}

	}
