package OOPS;

/*If both interfaces have default methods with the same name,
 *  you must explicitly override the method in the implementing class to resolve ambiguity*/
public class Interface1Imple1 implements Interface1, Interface2 {

	@Override
	public int add(int a, int b) {
		 
		return a+b;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public float div(float a, float b) {
		// TODO Auto-generated method stub
		return a/b;
	}

	@Override
	public void show() {
	// Explicitly specify which interface's method to call
	Interface1.super.show();
	Interface2.super.show();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interface1 i1=new Interface1Imple1();
		int x=i1.add(10,50);
		int y=i1.sub(50,30);
		i1.show();
		System.out.println("addition="+x+"\n"+"Substraction="+y);
		Interface2 i2=new Interface1Imple1();
		int p=i2.mul(10,50);
		float q=i2.div(60.5f,30.2f);
		System.out.println("Multipliaction="+p+"\n"+"Division="+q);
		i2.show();
		

	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          


