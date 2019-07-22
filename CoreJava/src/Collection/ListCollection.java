package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection 
{
	public static void main(String[] args) {
		List values = new ArrayList<>(); // List is an interface
	
		values.add(1);
		values.add(2);
		values.add(3);
		values.add(2,0);
		values.add("2");
//		Iterator itr = values.iterator();
//		
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//			
//			
//		}
		
		
//		for(int i =0; i<values.size();i++)
//		{
//			
//			System.out.println(values.get(i));
//		}
		
		for(Object o : values)
		{
			
			System.out.println(o);
			
		}
		
		
		
		
		
	}

}
