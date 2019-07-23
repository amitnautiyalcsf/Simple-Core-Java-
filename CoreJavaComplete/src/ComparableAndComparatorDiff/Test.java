package ComparableAndComparatorDiff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Comparator : We use it in two situations 
//           1 When Your class is not Implementing Comparable
//           2 When You want to change the logic instead of using the built in class like integer string you use your own logic.

public class Test {
	public static void main(String[] args) {
		List<Laptop> laps = new ArrayList<>();
		laps.add(new Laptop("Dell",16,800));
		laps.add(new Laptop("Apple",12,1200));
		laps.add(new Laptop("Hp",8,300));
		
//		Collections.sort(laps);
//		for(Laptop l : laps)
//		{
//			System.out.println(l);
//			
//		}

//		Comparator<Laptop> com = new Comparator<Laptop>() {
//			
//			@Override
//			public int compare(Laptop o1, Laptop o2) {
//			
//				if(o1.getPrice()>o2.getPrice())
//				{
//					return 1;
//					
//				}
//				else {
//				return -1;
//				}
//			}
//		};

		Collections.sort(laps,(o1,o2)->{return o1.getPrice()>o2.getPrice()?1:-1;});
		
		for(Laptop l : laps)
		{
			System.out.println(l);
			
		}
		
	}

}
