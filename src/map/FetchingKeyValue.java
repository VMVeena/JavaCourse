package map;

import java.util.Map.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FetchingKeyValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap map=new HashMap();
		map.put(2,"veena");
		map.put(3,"manasvi");
		map.put(5,"vaval");
		map.put(4,"arradhya");
		map.put(1,"mahendra");
		System.out.println(map);
		
	//Fetching Keys
		Set key1=map.keySet();
		//System.out.println(itr1);
		Iterator itr1=key1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//Fetching Values
		Collection value1=map.values();
		Iterator itr2=value1.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		//Fetching key and Values
		Set kv=map.entrySet();
		Iterator itr3=kv.iterator();
		while(itr3.hasNext())
		{
			//System.out.println(itr3.next());
			Map.Entry pair=(Entry) itr3.next();
			System.out.println("key:"+pair.getKey()+"  "+"Value:"+pair.getValue() );
			
		}

	}

}
