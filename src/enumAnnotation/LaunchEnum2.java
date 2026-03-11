package enumAnnotation;
//*Wnever we will create enum by default it will create the class with name which enum was created.
//*And also it will create number of object equal to number of constants present in the enum.

enum Result
{
PASS,FAIL,NR;
	
	Result()
	{
		System.out.println("Constructor of Enum");
	}
	int marks;
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
public class LaunchEnum2 {
	public static void main(String[] args) {
		Result res=Result.FAIL;
		System.out.println(res);
		res.setMarks(20);
		System.out.println(res.getMarks());//20
		Result res1=Result.PASS;
		System.out.println(res1.getMarks());//0
	}
	}

