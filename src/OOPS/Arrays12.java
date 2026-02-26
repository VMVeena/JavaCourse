    package OOPS;

import java.util.Arrays;

//Arrays is a utility class which contains static methods.
public class Arrays12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[]{33,40,17,2,3,4,5,6};
		System.out.print(arr.getClass().getName());
		for(int n:arr)
		{
			System.out.print(n );
		}
		System.out.println();
		System.out.println("After Sorting");
		Arrays.sort(arr);
		for(int n:arr)
		{
			System.out.print(n );
		}
		
 int d=Arrays.binarySearch(arr,5);
 System.out.println();
 System.out.println(d);
	}

}
