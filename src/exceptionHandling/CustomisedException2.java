package exceptionHandling;

import java.util.Scanner;

class UnderAgeException extends Exception
{
	UnderAgeException(String str)
	{
		super(str);
	}
	
	}
class OverAgeException extends Exception
{
	OverAgeException(String str)
	{
		super(str);
	}
	}
class Applicant
{
	int age;
	void input()
	{
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter Age ");	
		 age=sc.nextInt();
		
	}
	void verify() throws UnderAgeException, OverAgeException
	{
		if(18<=age && age<=60 )
		{
			System.out.println("Please proceed with your application further...");	
		}
		else if(age<18)
		{
			throw new UnderAgeException("Kiddo.. Your too young to apply for this driving license.");
		}
		else
		{
			throw new OverAgeException("Sir.. Your too old to apply for this driving license.");
		}
		
		
	}
	
	}

class RTO
{
	Applicant a1=new Applicant();
	public void initiate() throws OverAgeException
	{
		try {
	a1.input();
	a1.verify();
		}
		 catch(UnderAgeException  | OverAgeException oe1)
		{
			 System.out.println(oe1.getMessage());
		} 
		/*catch(UnderAgeException ue1)
		{
			 System.out.println(ue1.getMessage());
		} 
		catch(OverAgeException oe1)
		{
			 System.out.println(oe1.getMessage());
		} */
		
	}
	
}

public class CustomisedException2 {

	public static void main(String[] args) throws OverAgeException {
		// TODO Auto-generated method stub
		RTO r=new RTO();
		r.initiate();
	   System.out.println("Main application got terminated");	
	

	}

}
