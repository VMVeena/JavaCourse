package OOPS;

class Animal4
{

}

class Tigers5 extends Animal4
{
	
}

class Jungle
{
public Animal4 info() {
	Animal4 a1=new Animal4();
	return a1;
}	
}

class Zoo extends Jungle
{
public 	Tigers5 info() { // We  can change return type of overriden method in child class if its co-veriated return type.(co-veriated meas if there is a "is-a" relationship between return type of overiiden methods.
	Tigers5 a1=new Tigers5();
	return a1;
}	
}


public class Overriden2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
