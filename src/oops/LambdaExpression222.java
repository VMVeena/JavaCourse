package oops;

//Anonymous class
interface F222
{
	public int add(int a,int b);
}

public class LambdaExpression222 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		F222 f2=new F222() {

			@Override
			public int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}

	};
	
	System.out.println(f2.add(5, 99));

}
}
