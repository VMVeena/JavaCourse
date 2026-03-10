package collection;
import java.util.ArrayDeque;
class Veena1 
{
	}
public class LaunchArrayDeque 
{
	public static void main(String[] args)
	{ Veena1 v1=new Veena1();
		ArrayDeque ad=new ArrayDeque();
		ad.add(100);
		ad.add(200);
		System.out.println(ad);
		ad.add(300);
		System.out.println(ad);
		ad.addFirst(400);
		System.out.println(ad);
		ad.add("Veena1");
		ad.add(45.5);
		ad.add(4);
		ad.add(4);
		//ad.add(null);//exception
		System.out.println(ad);
		
		
		
	}

}
