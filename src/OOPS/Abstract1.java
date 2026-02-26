package OOPS;

/*
1. In java we can have methods without body/defination.
and such methods ar called as abstract methods and declared using abstract keyword.
2. If any one method in class is abstract then it class should be declared as abstract class.
3. We cannot create object/instance of abstract class.
4. We can create ref to achive polymorphism.
5. a class and mehtods can be abstract but variables and constructors are not abstract. */

abstract class AeroPlane
{
	//abstract int age; illegal
//	public AeroPlane() //Constructors are not abstract.
//	{
//		super();
//	}
	public abstract void takeOff();
	public abstract void fly();
	
	public void landing()
	{
		System.out.println("Aeroplane is landing");
	}
}

class CargoPlane extends AeroPlane{

	public void takeOff()
	{
		System.out.println("CargoPlane requires longer runway to takeOff");
	}
	public void fly()
	{
		System.out.println("CargoPlane flies at lower height");
	}
	
}
class FighterPlane extends AeroPlane
{
	public void takeOff()
	{
		System.out.println("FighterPlane requires shorter runway to takeOff");
	}
	public void fly()
	{
		System.out.println("FighterPlane flies at higher height");
	}
}

class CommercialPlane extends AeroPlane
{
	
	public void takeOff()
	{
		
		System.out.println("CommercialPlane requires mid size runway to takeOff");
	}
	public void fly()
	{
		
		System.out.println("CommercialPlane flies at medium height");
	}
	
}
class Airport
{
	//AeroPlane aero=p
	public void permit(AeroPlane aero)
	{
		//1:M --> Polymorphsim
		aero.takeOff();
		aero.fly();
	}
}
public class Abstract1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AeroPlane c1 =new CargoPlane();
		AeroPlane f1 =new FighterPlane();
		AeroPlane cm1 =new CommercialPlane();
		Airport a1=new Airport();
		a1.permit(c1);
		a1.permit(f1);
		a1.permit(cm1);

	}

}
