package enumAnnotation;

enum Week
{
	SUN,MON,TUE,WED,THU,FRI,SAT;
	
}

public class EnumLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Week w1=Week.MON;
		System.out.println(w1);
		
		int index=Week.FRI.ordinal();
		System.out.println(index);
		Week[] weeks=Week.values();
		for(Week data:weeks)
		{
			System.out.println(data);
		}
		
	}

}
