package OOPS;

//An array is a collection of elements of the same data type stored in contiguous memory locations
//studetsId.length  lenght of string is property not method
//Array demands contigous memory allocation.
//Arrays are guarded with boundaries.(buffere overloading or arreay out of index)
//Array stores the address of object
//Arrays size is fixed if we resize instead of old new array with new size will create.

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n;
         System.out.println("Enter the number of students");
         Scanner scan=new Scanner(System.in);
	     n=scan.nextInt();
		int studetsId[]=new int[n];
		
       for(int i=0;i<studetsId.length;i++)
    	   //or for(int i=0;i<n;i++)
		{
			System.out.println("Enter the ID of "+i+"th Student");
			studetsId[i]=scan.nextInt();
		}
		for(int i=0;i<studetsId.length;i++)
			//or for(int i=0;i<n;i++)
		{
			System.out.println(" ID of "+i+"th Student="+studetsId[i]);
		
		}
	}

}
