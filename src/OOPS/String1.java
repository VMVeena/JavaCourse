package OOPS;

/* 
>3 types of string: 1: String(Immutable,nonchangable)
  2.String Buffer and 3.String Builder these are Mutable(Changable).
->String is mutable because whenever we change string value its will create new variable but it will not alter existing value.
-> Whenever we will create string using direct litral that time in heap its created in SCP(String Constant Pool) where duplicates will not allowed.
 for ex: str1="veena"; str2="veena". in this both str1 and str2 are refering to same .thir address is same.
-> String is case sensitive.
-> Whenever we will create string using new keyord it will create different object for both.
for ex: str1=new String("veena"); str2=new String("veena");
int this example both str1 and str2 are pointing to different address and have different reference.

Imp Methods:
  * == (check references)
  * equals (string data)
  * equalIgnoreCase() (string data by ignoring case sensitivity .
  * compareTo (string data char by char).

 
 */

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="veena";
		String s2="veena";
		String s22="Bakare";
		String s3="Veena";
		String s4=new String("veena");
		String s5=new String("veena");
		String s6=new String("veera");

System.out.println(s1==s2);//true
System.out.println(s1==s3);//false because its case sensitive
System.out.println(s1==s4);//false because they jave different object reference
System.out.println(s4==s5);//false because they jave different object reference
System.out.println(s1.equals(s2));//true
System.out.println(s1.equals(s22));//false
System.out.println(s1.equals(s3));//false because its case sensitive
System.out.println(s4.equals(s5));//true
System.out.println(s1.equalsIgnoreCase(s3));//true
System.out.println(s4.compareTo(s5)); //0 because both strings are same
System.out.println(s4.compareTo(s6)); //its substract the ASCCI value of n-r and return it

		
		

	}

}
