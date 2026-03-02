package OOPS;

import java.util.Scanner;

class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg)
	{
	super(msg);
}	

	}
 
 class ATM
 {
	 private int  account_no=1234;
	 private int password=9999;
	 private int acn;
	 private int pw;
	 Scanner sc=new Scanner(System.in);
	 
	 public void input()
	 {
		 System.out.println("Enter Account Number");	
		 acn=sc.nextInt();
		 System.out.println("Enter password");	
		 pw=sc.nextInt();
		 
	 }
	 
	 public void verify() throws InvalidCustomerException
	 {
		 if(acn==account_no && pw==password)
		 {
			 System.out.println("Collect your Cash");
		 }
		 
		 else
		 {
			// System.out.println("Invalid Credentials");
			 //InvalidCustomerException ie=new InvalidCustomerException();
			 //throw ie;
			 throw new InvalidCustomerException("Ivalid input.. Try Again !!");
			 
		 }
		
	 }	 
 }
 
 
class Bank
{
	public void initiate()
	{
		ATM a=new ATM();
	      try {
	      a.input();
	      a.verify();
	      }
	      catch (InvalidCustomerException e1)
	      {
	    	  //System.out.println("Invalid Credentials, Enter valid Credential");
	    	  System.out.println(e1.getMessage());
	    	  System.out.println("You have 2 attempts");
	    	  try
	    	  {
	    		  a.input();
	    	      a.verify();  
	    	  }
		      catch (InvalidCustomerException e2)
		      {
		    	  System.out.println(e2.getMessage());
		    	 // System.out.println("Invalid Credentials, Enter valid Credential");
		    	  System.out.println("You have 1 attempts");
		    	
	    	  try
	    	  {
	    		  a.input();
	    	      a.verify();  
	    	  }
		      catch (InvalidCustomerException e3)
		      {
		    	  //System.out.println("Invalid Credentials");
		    	  System.out.println("Your Account got locked");
		    	  
		      }
		    	  	   
		      }
		   finally
		   {
			   System.out.println("Thanks for visiting our Bank");
		   }
	   
	      }}
	
}

public class CustomisedException {

	public static void main(String[] args) throws InvalidCustomerException {
		// TODO Auto-generated method stub
      Bank b1=new Bank();
      b1.initiate();
      System.out.println("Main application terminated");
	}
	

}
