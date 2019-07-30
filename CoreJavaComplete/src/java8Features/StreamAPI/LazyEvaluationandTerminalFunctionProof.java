package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class LazyEvaluationandTerminalFunctionProof {

	public static void main(String[] args) {
	
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		

	
		
		/*int result=0;
		for(int i: values)
		{
			
			if(i%5==0)
			{
				result=i*2;
				break;
				
			}
			
		}
		System.out.println(result);*/

		
		
		
		/*System.out.println(values.stream()
                                 .filter(i->i%5==0)
                                 .map(i->i*2)
                                 .findFirst()
                                 .orElse(0));*/
		
		
		
		System.out.println(values.stream()
				                 .filter(LazyEvaluationandTerminalFunctionProof::isDivisible)
				                 .map(LazyEvaluationandTerminalFunctionProof::mapdouble)
				                 .findFirst()
				                 .orElse(0));
		
		

	}
	
	public static boolean isDivisible(int i)
	{
		
		System.out.println("In isDivisble" +i);
		
		return i%5==0;
		
	}
	
	public static int mapdouble(int i)
	{
		System.out.println("In Mapdouble " +i);
		return i*2;
		
	}

}
