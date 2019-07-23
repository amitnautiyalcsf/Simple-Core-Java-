package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {
public static void main(String[] args) {
//Set<Integer>values= new HashSet<>();
//	values.add(1);
//	values.add(2);
//	values.add(5);
//	values.add(59);
//	values.add(5); // in set only unique element will be added.
	
	// There is no sequence maintain in hash set.
//	System.out.println(values.add(87));
//	System.out.println(values.add(97));
//	System.out.println(values.add(34));
//	System.out.println(values.add(92));
//	System.out.println(values.add(92));

	
	// provide data in descending order.
	Set<Integer>values= new TreeSet<>();
	values.add(87);
	values.add(97);
	values.add(34);
	values.add(92);
	
	
	
	for(Integer i : values)
	{
		System.out.println(i);
		
	}
	
}

}
