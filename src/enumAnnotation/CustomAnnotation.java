package enumAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Service=component + extra message that its business logic
//Repository=component + extra message that its db logic

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface CricketPalayer
{
	//String country();//country is variable not method.
	String country() default "India";  //if we either give or not it must have default value
	}

@CricketPalayer(country="India")
class RohitSharma
{
	private int innings;
	public int getInnings() {
		return innings;
	}
	@CricketPalayer()//if we either give or not as it is have default value
	public void setInnings(int innings) {
		this.innings = innings;
	}
	public RohitSharma()
	{
		
	}
}

public class CustomAnnotation {

	public static void main(String[] args) {
		RohitSharma rs=new RohitSharma();
		Class<? extends RohitSharma> cls=rs.getClass();
		CricketPalayer ann=cls.getAnnotation(CricketPalayer.class);
		System.out.println(ann.country());
		
	}
}
