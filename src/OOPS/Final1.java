package OOPS;
/*  final class cannot be inherited (we cannot inherited from final class)
2. final methods can be inherited however we cannot override them 
3. final variable cannot be re iniatialized (behave as constant) */
//final class Maths
class Maths
{
	 final float pi=3.14f;
	
	public final void courses()
	{
		//pi=45.5f; //The final field Maths.pi cannot be assigned
		System.out.println("Welcome to mathd class");
	}
}
//class Giometric extends Maths
class Giometric extends Maths
{
	//Cannot override the final method from Maths
//	public void courses()
//	{
//		System.out.println("Welcome to geometric class");
//	}
}
public class Final1
{
	public static void main(String[] args)
	{
		Maths t=new Maths();
		t.courses();
		Maths m=new Giometric();
		m.courses();
		System.out.println(t.pi);
		System.out.println(m.pi);
		
	
	}
}
