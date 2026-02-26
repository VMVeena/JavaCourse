package OOPS;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1=new String("Welcome to String");
		String str2=new String("             Welcome to String trim");
		System.out.println(str1.endsWith("ing"));//true
		System.out.println(str1.length());//17
		System.out.println(str1.substring(2,7)); //start substring from index 2 to 7, it will not include index 7
		char ch[]=str1.toCharArray();
		for(char c:ch)
		{
			System.out.print(" "+c+" ");
		}
		System.out.println();
		System.out.println(str2);
		System.out.println(str2.trim());
		

	}

}
