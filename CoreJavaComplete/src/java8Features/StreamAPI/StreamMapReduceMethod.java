package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamMapReduceMethod {
	public static void main(String[] args) 
	{
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
//		int result=0;
		
//		for(int i: values)
//		{
//			result= result + i*2; // mutated the result value 7 times , we can't achieve concurrency.
//			
//		}
		
		
		
	//	System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)-> c+e));
		
		
		
	// Stream will convert all your values into stream.

		/*Function<Integer, Integer>f = new Function<Integer,Integer>() 
		{
			public Integer apply(Integer i)
			{
				return i*2;
				
			}
			
		};
		BinaryOperator<Integer> b = new BinaryOperator<Integer>() 
		{
			

			
			public Integer apply(Integer i, Integer j) {
				
				return i + j;
				
			}
			
		};
		
		Stream s= values.stream();
		Stream s1= s.map(f);
		                       //2 4 6 8 10 12
		int result=(Integer)s1.reduce(0,b);

		System.out.println(result);*/

		
		
		
		
// making above code more effecient
		
		                      //2 4 6 8 10 12
		 // c is the carry and e is the value.

		System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));
		
		
	}

}
