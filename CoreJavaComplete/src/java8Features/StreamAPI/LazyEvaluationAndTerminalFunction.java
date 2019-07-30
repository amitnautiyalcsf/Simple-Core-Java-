package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluationAndTerminalFunction {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		/*System.out.println(values.stream()
                                 .filter(i->i%5==0)
                                 .map(i->i*2)
                                 .findFirst()
                                 .orElse(0)); */
		
		// Filter and Map is a lazy method
		// findFirst is a terminal Method(Eager)
		
		// findFirst will ask a map method that i just need a 1st value, then map will only mapped the first element, and ask the filter, dont filter all the elements find the first element which is divisble by 5.   
		
		
		
		
		// Same above code using simple for loop 
		
		int result=0;
		for(int i: values)
		{
			
			if(i%5==0)
			{
				result=i*2;
				break;
				
			}
			
		}
		System.out.println(result);

	}
}
