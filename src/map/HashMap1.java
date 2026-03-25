package map;

import java.util.HashMap;

// * HashMap: Null is allowed ,Null is allowed.
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  HashMap<Integer,String> h1=new HashMap<>();
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
