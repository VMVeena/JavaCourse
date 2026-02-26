package OOPS;


//if Functional interface's methods have parameter and return type then how to write lambda expression
//that time we may or may not write parameter and return type in lambda exression as method was refferring to interface method
interface FI2
{
	int add(int a,int b);
}


public class LambdaExpression2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*FI2 f1=(int a,int b)->{
				int c=a+b;
				return c;};
				*/
		FI2 f2=(a,b)->a+b;
		System.out.println("Addition of 2 number="+f2.add(20,50));
		
		
	FI2 f3=(a,b)->{return a+b;};
				System.out.println("Addition o f 2 number="+f3.add(40,50));
				}

}
