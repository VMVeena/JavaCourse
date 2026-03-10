package map;
//sorted in nature
// Duplicates are not allowed
import java.util.LinkedHashMap;
import java.util.TreeMap;

 class HashTree1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> h1=new TreeMap();
		 // h1.put(key,value );
		  h1.put(3, "Rohit");
		  h1.put(4, "Rohit");
		  h1.put(5, "Aaru");
		  h1.put(2, "Manu");
		  h1.put(4, "Rohan"); //Value can be duplicate but key must be uniq
		 // h1.put(null, "Kavya"); //Key should not be null
		  h1.put(9, null); //value and key canbe null
		  System.out.println(h1);
		  h1.forEach((key,value)->System.out.println(key+" "+value));
	}

}
