package OOPS;

import java.util.Scanner;

class Calc11
{int d;
int devide(int a, int b)
{ 
	try  {
	 d=a/b;
	 System.out.println("Inside devide method");
	}
	catch(NullPointerException ae) {
		System.out.println("Enter valid denominator");
	}
	
	return d;
	}

}

public class ExceptionHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc11 c1=new Calc11();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numarator");
		int n=sc.nextInt();
		System.out.println("Enter Denominator");
		int d=sc.nextInt();
		try {
		c1.devide(n, d);
		System.out.println("Inside main method try area");
		}
		catch(ArithmeticException ae) {
			System.out.println("Enter valid denominator  ArithmeticException exption in main method");
		}
		catch(Exception e) {
			System.out.println("Enter valid denominator common exption in main method");
		}
	
		    System.out.println("Application Terminated");
	}

}
