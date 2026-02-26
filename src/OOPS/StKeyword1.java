package OOPS;

import java.util.Scanner;


class Former
{

	private String name;
	private float principalAmount;
	private float time;
	private float simpleIntrest;
	static float roi;
	
	static {
		roi=8.5f;
	}
	
	void input()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly enter Amount to be required");
		principalAmount=scan.nextFloat();
		
		System.out.println("Kindly enter time needed");
		time=scan.nextFloat();
	}
	void calculate()
	{
		simpleIntrest=(principalAmount*time*roi)/100;
	}
	
	void display()
	{
		System.out.println("Simple Intrest is: "+simpleIntrest);
	}
	
	static void statickblock()
	{
		System.out.println("Static method will be not be called automaticall, we need to call it");
	}
	
}
public class StKeyword1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Former f1=new Former();
		Former f2=new Former();
		Former f3=new Former();
		System.out.println("First Former");
		f1.input();
		f1.calculate();
		f1.display();
		Former.statickblock();
		System.out.println("Second Former");
		f2.input();
		f2.calculate();
		f2.display();
		
		System.out.println("Third Former");
		f3.input();
		f3.calculate();
		f3.display();
		
	}

}
