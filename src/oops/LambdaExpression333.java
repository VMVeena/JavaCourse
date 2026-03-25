package oops;


//ALambda Expression
interface F333
{
	public int add(int a,int b);
}
public class LambdaExpression333 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
F333 f3=(a,b)->{return a+b;};
System.out.println(f3.add(89, 8));
	}

}
