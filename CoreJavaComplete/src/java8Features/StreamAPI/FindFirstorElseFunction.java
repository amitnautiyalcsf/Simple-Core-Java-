package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class FindFirstorElseFunction 
{
	
	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		//List<Integer> values = Arrays.asList(6,99,13); // for this list findFirst() will give the output Optional.empty bcoz no value is there which is divisble by 5
		                                                 // orElse(0); this will not give Optional.empty , it will give 0 as a answer.
//		System.out.println(values.stream()
//				                 .filter(i->i%5==0)
//				                 .map(i->i*2)
//				                 .reduce(0,(c,e)->c+e));
		
		
		
		System.out.println(values.stream()
                                 .filter(i->i%5==0)
                                 .map(i->i*2)
                                 .findFirst()
                                 .orElse(0));
		
		
	}

}
