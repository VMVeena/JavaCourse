package OOPS;


class Demo1{
	int age=50;
	int a;
	int b;
	Demo1(){
		
		System.out.println("Zero Constructor of demo1 parent class");
	}
	Demo1(int x,int y)
	{
		this.a=x;
		this.b=y;
		System.out.println("Parametrized constructor of parent class");
		System.out.println("a= "+a+"b="+b);
	}
	void display()
	 {
		 System.out.println("Display method of Demo1 parent class");
	 }
	void dislpayAge()
	{
		System.out.println("Age from parent class="+age);
	}
	
}

class Demo2 extends Demo1
{
	
	void dislpayAge()
	{
		age=20;
		System.out.println("Age from child class="+super.age); //if we need to use parent class value then we need to use "super.variable name"
	}
	
 Demo2()
 {

	 System.out.println("Zero Constructor of Demo2 Child class ");
 }
 void display()
 {
	 System.out.println("Display method of Demo2 child class");
 }
 
 Demo2(int x, int y)
 { 
	 //super(5,5);
	 this();
	 this.a=x;
	 this.b=y;
	 System.out.println("Parametrized constructor of child class");
	 System.out.println("a= "+a+"b="+b);
 }
}
 
 public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo1 d1=new Demo2(4, 6);
		d1.display();
		d1.dislpayAge();

	}

}
