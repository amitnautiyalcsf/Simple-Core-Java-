package DateTimeApiInJava8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;

// It is Immutable 
public class DemoDateTime {

	
	public static void main(String[] args) 
	{
		//LocalDate d = LocalDate.now();
	
		//LocalDate d = LocalDate.of(1994, Month.SEPTEMBER, 24);
		
		//LocalTime t = LocalTime.now();
		
		//LocalTime t = LocalTime.of(12,35,10,999);
		
		for(String s: ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
			
			
		}
		
		LocalTime t = LocalTime.now(ZoneId.of("Asia/Kuwait"));
		System.out.println(t);
		
		
		LocalTime t1 = LocalTime.now(ZoneId.of("GMT"));
		System.out.println(t1);
		
		
		Instant i = Instant.now();
		System.out.println(i);
		
	
		LocalDateTime dt= LocalDateTime.now(ZoneId.of("GMT"));
		System.out.println(dt);
		

	
	}

}
