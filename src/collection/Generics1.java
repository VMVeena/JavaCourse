package collection;

import java.util.ArrayList;
import java.util.Collections;
class Class1
{
	}

public class Generics1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Class1 c1=new Class1();
		ArrayList<String> ar1=new ArrayList();
		ar1.add("Java");
		ar1.add("ML");
		ar1.add("Maths");
		ar1.addFirst("English");
		ar1.add("Java");
		ar1.add(2,"Kannada");
		//ar1.add(3,6);//when we mention String type only tehn we are not able to add other type if data 
		//ar1.add(c1);
		System.out.println(ar1);
		String course1=(String)ar1.get(0);
				
		String course2=(String)ar1.get(1);
		String course3=(String)ar1.get(2);
		
		int c4=Collections.frequency(ar1,"Java");
		System.out.println(course1);
		System.out.println(course1.toUpperCase());
		
	}

}
