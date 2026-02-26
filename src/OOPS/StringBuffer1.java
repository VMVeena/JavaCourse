package OOPS;
 //StringBuffer,StringBuilder are immutable string means we can change the value of string without changing object. 
//String buffer will not support multiThreading but StringBuilder will support.
// StartingCapacity  of string builder and buffer is 16
//new size=older size*2+2
// .equals will not compare here.. its compare referenses.
// var aregs will allow giing dynamic arguments during method call.

class Test5
{
int add(int ...a)	//var aregs consider it as a array.
{
	int sum=0;
	for(int m:a)
	{
	sum = sum+m;
	}
	return sum;
	}

}


public class StringBuffer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test5 t1=new Test5();
		StringBuffer b1 = new StringBuffer();
		StringBuffer b2 = new StringBuffer();
		StringBuilder b3 = new StringBuilder();
		b1.append("Veena");
		b2.append("Veena");
		System.out.println(b1==b2); //flase
		System.out.println(b1.equals(b2));//false because equals will not compare here.. its compare referenses.
		
		System.out.println(t1.add(4,6));
		System.out.println(t1.add(12,4,12,6,23));

	}

}
