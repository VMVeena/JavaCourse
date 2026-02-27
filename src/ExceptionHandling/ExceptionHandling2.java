package ExceptionHandling;

import java.util.Scanner;

class Calc22
{
	int d;
int devide(int a, int b) throws ArithmeticException ////it will not handle the exption. it will just dump the exception
{ 
	try  {
	 d=a/b;
	 System.out.println("Inside devide method");
	}
	catch(ArithmeticException ae) {
		
		System.out.println("Handled in devide method");
		throw ae;
	}
	
	finally {
		System.out.println("Calc11 Application Terminated");
	}
	return d;
	
	}


}

public class ExceptionHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc22 c1=new Calc22();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numarator");
		int n=sc.nextInt();
		System.out.println("Enter Denominator");
		int d=sc.nextInt();
		int r=0;
		try {
		r=c1.devide(n, d);
		System.out.println("Inside try block of Main method");
		}
	 catch(ArithmeticException ae) {
			
			System.out.println("handled in Main method");
			
		}
		finally {
			System.out.println("Main Application Terminated");
		}
	}

}
