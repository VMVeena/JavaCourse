package OOPS;
//Functional interface: A interface have only one abstract method
interface FI1
{
	 void disp();
	
	}
//TYPE1 //Treditional way by implementing interface
class FI1implementation implements FI1
{
	public void disp()
	{
		
		System.out.println("Display method from FI1implementation class");	
	}
	
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FI1 f1=new FI1implementation();
		f1.disp();
		
		//TYPE2 //inner annonymous class
	//we can directly implement abstract method in main closs without in implementation class. we can use interface as blow
		FI1 f2=new FI1() {
			public void disp()
			{
				
				System.out.println("Display method from  inner annonymous class");	
			}
		};
		f2.disp();
		
		//TYPE3 
		//LAMBDA EXRESSION (its possible only if interface is functional interface.
		//(Paramter) ->(body);
		 FI1 f4=()->{
			System.out.println("Display method from  Lambda expression1");	
			};
			f4.disp();
		//or we can write it in single line also
		FI1 f3=()-> System.out.println("Display method from  Lambda expression2");
			f3.disp();
		
		
		
		
	}

}
