package OOPS;


/* ***********>Rules for overriding Methods<************
1. We cannot decrease the visibility of overriden methods in child class however we can increase 
2. We cannot change return type of overriden method in child class.
3. We  can change return type of overriden method in child class if its co-veriated return type.
(co-veriated meas if there is a "is-a" relationship between return type of overiiden methods.
4. We cannot change parameter list of overidden method in child class if we change it will be trated as specialized method.*/
class Animal{
	
	int age;
	public void eat() {
		System.out.println("Animals will eat");
		}
	public int info(int age) {
		this.age=age;
		
		System.out.println("Animal age="+age);
		return age;
		}
}

class Tiger extends Animal{
	int month;
	public void eat() {
		System.out.println("Tigers will hunt and  eat");
		}
	// public float info(int age) We cannot change return type of overriden method in child class.
	public int info(int age) 
	{
		this.age=age;
		System.out.println("Tiger age="+age);
		return age;
		}
	public int info(int age,int month) //. We cannot change parameter list of overidden method in child class if we change it will be trated as specialized method.
	{  
		this.month=month;
		this.age=age;
		System.out.println("Tiger age="+age);
		return age;
		}
}

public class Overridden1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Animal a1=new Tiger();
a1.eat();
System.out.println("Age="+((Tiger)a1).info(40,2));

	}

}
