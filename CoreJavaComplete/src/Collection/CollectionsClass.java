package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class CollectionsClass 
{
	public static void main(String[] args) 
	{
		
		List<Integer> values = new ArrayList<>(); // List is ByDefault Mutable bcoz we can change the values of List
//		values.add(4);
//		values.add(0);
//		values.add(900);
//		values.add(99);
//		
//		
//		Collections.sort(values); // for ascending order
//		Collections.reverse(values); // for descending order
//		Collections.shuffle(values);// for random
//		for(Integer o: values)
//		{
//			System.out.println(o);
//			
//		}
		
		
		values.add(4);
		values.add(0);
		values.add(901);
		values.add(678);
		values.add(395);
		values.add(912);
		
		// sort the element based on last digit
		
		// Comparator Interface
		
//		Comparator<Integer> c = new Comparator<Integer>()
//				{
//			
//			public int compare(Integer i, Integer j)
//			{
//				/*
//				 * if(i%10>j%10) return 1; else return -1;
//				 */
//				return i%10>j%10?1:-1;
//			}
//			};
		
//		Collections.sort(values,c);
		
		
		// Use of lambda Expression.
		

		// Comparator Interface
		
		Collections.sort(values,(i,j)->i%10>j%10?1:-1);
		
		for(Integer o:values)
		{
			System.out.println(o);
			
		}
		
		
	}

}
