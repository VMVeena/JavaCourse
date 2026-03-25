package oops;

interface F111
{
	public int add(int a,int b);
}

class Launch implements F111
{
	public int add(int x,int y)
	{
		return x+y;
	}
	}
public class LambdaExpression111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Launch l1=new Launch();
		System.out.println(l1.add(5, 8));
		

	}

}
