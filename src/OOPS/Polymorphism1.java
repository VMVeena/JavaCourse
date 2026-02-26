package OOPS;
/* Polymorphism in Java is one of the core concepts in object-oriented programming (OOP) 
that allows objects to behave differently based on their specific class type
* We can achive it by method overridden and creating a parent class refernce for child class. */

class Animals4
{
	void makeSound()
	{
		System.out.println("Animal will make sound");
	}
}
class Dog extends Animals4
{
	void makeSound()
	{
		System.out.println("The dog says: bow bow");
	}
}
class Cat extends Animals4
{
	void makeSound()
	{
		System.out.println("The Cat says: Meow Meow");
	}
}

class Anmls{
	
	public void checkSound(Animals4 anml)
	{
		anml.makeSound();
	}
}


public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Animals4 d1=new Dog();
		d1.makeSound();
		Animals4 c1=new Cat();
		c1.makeSound(); */
		
		Animals4 d1=new Dog();
		Anmls anm1=new Anmls();
	    anm1.checkSound(d1);
		Animals4 c1=new Cat();
		anm1.checkSound(c1);
	}

}
