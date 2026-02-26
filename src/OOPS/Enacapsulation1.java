package OOPS;

class Student1{
	
	
	//int id;
	//String name;
	
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}

public class Enacapsulation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 st1=new Student1();
		/* st1.id=8;
		System.out.println("Id="+st1.id);
		*/
		
		st1.setId(8);
		st1.setName("Manu");
		System.out.println("Student1 Details");
		System.out.println("Id="+st1.getId());
		System.out.println("Name="+st1.getName());
		

	}

}
