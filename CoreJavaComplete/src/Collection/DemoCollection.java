package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoCollection 
{
	public static void main(String[] args) 
	{
		
		Collection values= new ArrayList<>(); // Collection is an interface and ArrayList is a class
		values.add(1);
		values.add(2);
		values.add("Ammy");
		values.add(9);
//		System.out.println(values);
		
	Iterator itr= values.iterator();
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.next());
//	System.out.println(itr.next());
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
		
	}

		
	}

}
