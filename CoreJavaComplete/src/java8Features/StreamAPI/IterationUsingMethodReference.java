package java8Features.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class IterationUsingMethodReference {

	public static void main(String[] args) {

		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		// values.forEach(System.out::println); //System.out.println(i); call by value, call by refrence, call by method.
		                                     // :: for method reference 
		// using lambda
 
		//values.forEach(i->doubleit(i));
		
		
		// using method refrence
		
		values.forEach(IterationUsingMethodReference::doubleit); // bcoz doubleit method belongs to IterationUsingMethodReference class
		
	}


// Instead of using println we will use this method to print.

public static void doubleit(int i)
{

	System.out.println(i*2);
	

}


}