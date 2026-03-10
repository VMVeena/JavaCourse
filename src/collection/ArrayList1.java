package collection;

import java.util.ArrayList;
import java.util.Iterator;

//need to implement arrayList and Linked List, Literable
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList ar1=new ArrayList();
ar1.add("veena");
ar1.add("manasvi");
ar1.add("vaval");
ar1.add("arradhya");
ar1.add("mahendra");

//System.out.println(ar1);
Iterator itr1=ar1.iterator();
while(itr1.hasNext())
{
System.out.println(itr1.next());	
}

		
	}

}
