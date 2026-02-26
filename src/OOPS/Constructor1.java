package OOPS;

class Student
{

	private String name;
	private int cost;
	static int count=0;
	
	{
		
		System.out.println("Java block");
		count++;
		System.out.println(count);
		
	}
   Student(){
	   
	   System.out.println("Default Constructor");	
	}
	Student(String name){
		
		this.name = name;
	}
    Student(String name,int cost){
		
		this.name = name;
		this.cost=cost;
	}
	String getName()
	{
		return name;
		
	}
	int getCost()
	{
		return cost;
		
	}
}


public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student st1=new Student();
		System.out.println("***********");
		Student st2=new Student("Aaru");
		System.out.println("NM : "+st2.getName());
		System.out.println("***********");
		Student st3=new Student("Manu",400);
		System.out.println("NM : "+st3.getName());
		System.out.println("NM : "+st3.getCost());
	}

}
