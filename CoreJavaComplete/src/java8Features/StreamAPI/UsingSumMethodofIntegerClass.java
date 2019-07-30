package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class UsingSumMethodofIntegerClass {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		// System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->Integer.sum(c,e)));
		
		// same code using method refrence
		System.out.println(values.stream().map(i->i*2).reduce(0,Integer::sum));
		
	}
}
