package OOPS;

/*Inheritance is a fundamental concept in Java and a key feature of Object-Oriented Programming (OOP). 
 * It allows one class to inherit the properties and behaviors (fields and methods) of another class
 * Private variable are not able to inherit
 * If we want to call specialized methods from parent refernce we need to do down cast parent to child
 * Whenever any child constructor will call first "super" method will be executed. Use of super method is
   to call constructor of parent class
 * this() mehtod is used to call the constructor of same class
 * We are not able to use super() and this() method at same time  
 * Parents class will always extends Object class by default
 * Both static variables and static method get inherited in child class.
 * Method Hidding: When  we attempt to override static methods in child class then it will become specialized method by hiding inherited static method and we cannot override static method.
*/

class Parent
{
	static void display()
	{
		System.out.println("Static method of Parent class");
	}
	void sleep()
	{
	System.out.println("Sleeps a lot");	
	}
	void looks()
	{
		System.out.println("Looks good based on thier time");	
	}
	
}

class Child extends Parent
{
	void sleep()//Inherited Method
	{
	System.out.println("Sleeps a lot");	
	}
	
	void looks()//overridden Method
	{
		System.out.println("Looks good based on Modern time");	
	}
	
	void ride() //Specialized Method
	{
		System.out.println("Ride 4 wheeler");
	}
	static void display() //Method Hidding: When  we attempt to override static methods in child class then it will become specialized method by hiding inherited static method and we cannot override static method.

	{
		System.out.println("Static method of Child class");
	}
	}

public class Inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child c1=new Child();
		c1.sleep();
		c1.looks();
		c1.ride();
		
		Parent p1=new Child();
		p1.sleep();
		p1.looks();
	   ((Child) p1).ride();
	   ((Child) p1).display();

	}

}
