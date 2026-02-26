package OOPS;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][];
		 arr[0]=new int[3];
		 arr[1]=new int[1];
		 arr[2]=new int[6];
		 Scanner scan=new Scanner(System.in);
       for(int i=0;i<arr.length;i++)
       	//or  for(int i=0;i<3;i++)
       {
       	for(int j=0;j<arr[i].length;j++)
       		// or for(int j=0;j<4;j++)
       	{
       		System.out.println("Enter the marks for "+i+"th class "+j+"th student:");
       	    arr[i][j]=scan.nextInt();
       }
	}
       
       System.out.println("Students details are");
       for(int i=0;i<arr.length;i++)
          	//or  for(int i=0;i<3;i++)
          {
          	for(int j=0;j<arr[i].length;j++)
          		// or for(int j=0;j<4;j++)
          	{
          		System.out.println("Marks for "+i+"th class "+j+"th student:"+arr[i][j]);
          	   
          }
   	}
          
	}
	

}
