package CurrentTimeMillisOfSystemClassToCalculateExecutionTime;

import java.util.ArrayList;

//System.currentTimeMillis

public class Timer 
{
	
	public static void main(String[] args) {
		
		
		// to know that how much time is ur method is taking.
		
		//At the start of method we can check the time 
	
		
		long start= System.currentTimeMillis();
		ArrayList s = new ArrayList<>();
		
		for(int i =0; i<900000; i++)
		{
				s.add(i);
		}
		
		//At the end of the method we can check the time.
		long end = System.currentTimeMillis();
		
		System.out.println(end-start);
		
		
		
		long value = System.currentTimeMillis(); // milli second from jan 1st 1970.
		System.out.println(value);
		
		
	}

}
