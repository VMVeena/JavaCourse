package OOPS;
//Boxing Primitive data type to object
// unboxing: ObjectType to primitive data types;
//java will not support this type of boxing now
//converting 10 primitive type to object(Boxing). int -->Integer
//Interger -->int. Premitive to object Unboxing
public class WrapperClass11 {
	public static void main(String[] args) {
		
		//Integer i1=new Integer(10); //java will not support this type of boxing now
		Integer i1=Integer.valueOf(10); //converting 10 primitive type to object(Boxing). int -->Integer
		int i2=20;
		Integer i3=i2; //Autoboxing
		int i6=i1.intValue(); //Interger -->int. Premitive to object Unboxing
		int i7=i1; //Autounboxing
		
		
		System.out.println(i1);
		 
		
	}

}
