package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class InternalIteration {

	public static void main(String[] args) {
	
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		//Internal Iteration...

		//Consumer is a functional Interface
		
//		Consumer<Integer> c = new Consumer<Integer>()
//				{
//			
//			
//			public void accept(Integer i)
//			{
//				
//				System.out.println(i);
//			}
//			
//			
//			
//			};
		

		// Using Functional Interface
	
//		values.forEach(new Consumer<Integer>()
//				
//		{
//			
//                   			
//			public void accept(Integer i)
//			{
//				System.out.println(i);
//				
//			}
//			
//			
//		
//			});
		
		
		
		
		// using lambda Expression(Lambda Expression is only used in Functional Interface).
		
		
//		Consumer<Integer> c =i->System.out.println(i);
//		values.forEach(c);
	  
		
		values.forEach(i-> System.out.println(i));
		
	

	}

}

