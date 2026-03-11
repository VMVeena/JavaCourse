package enumAnnotation;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


//LocalDate is a datetime API created by JODA organization
public class LaunchTimeandDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalDate dob=LocalDate.of(1994,12,20);
		System.out.println(dob);
		System.out.println(date.getMonthValue());
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalDateTime datetime=LocalDateTime.now();
		System.out.println(datetime);
		System.out.println(datetime.getDayOfMonth());
	}
	
	
	
	

}
