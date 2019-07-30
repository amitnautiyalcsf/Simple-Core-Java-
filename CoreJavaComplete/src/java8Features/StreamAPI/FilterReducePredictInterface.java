package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FilterReducePredictInterface {

	public static void main(String[] args) 
	{

		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		
	// add all those number who is divisble by 5
		// this approach is external iteration , it is called as imperative coding like what to do and how to do 
		
		
/*		int result =0;
		for(int i: values)
		{
			if(i%5==0)
			{
				
				result += i;
			}
			
			
		}
		System.out.println(result);*/
		
		
		
	// Using stream api Internal Iteration.
		
		/*System.out.println(values.stream()
				                 .filter(i->i%5==0)
				                 .reduce(0,Integer::sum));*/
		
		
		
// How Filter Works
		Predicate<Integer>p = new Predicate<Integer>() {
			
			@Override
			public boolean test(Integer i) {
				
				return i%5==0;
			}
		};
		
		
		System.out.println(values.stream()
				                 .filter(p)
				                 .reduce(0,(c,e)->c+e));
		
		
		
	}
}
