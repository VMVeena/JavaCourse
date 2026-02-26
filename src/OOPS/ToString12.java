package OOPS;

class Test45
{
private int id;
private String name;
 void course()
 {
	 id=54;
	 name="veena";
	 System.out.println("ID :"+id+"Name:"+name);
	 System.out.println("Welocame to course method");
	 
 }
 @Override
 public String toString()//toString overrides the equal adress
 {
	 //return "ID :"+id+"Name:"+name;
	 return "its toString method";
				 
 }
 

}

public class ToString12 {

	public static void main(String[] args) {
		
		Test45 t1=new Test45();
		t1.course();
		System.out.println(t1); //Instead of giving reference it gives toString method call. 
		
	}
}
