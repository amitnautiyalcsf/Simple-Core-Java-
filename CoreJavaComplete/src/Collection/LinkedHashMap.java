package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class LinkedHashMap 
{
	
	public static void main(String[] args) {
		
//		Map<Integer,String> m = new java.util.LinkedHashMap<>(); // Maintain an order of insertion

		Map<Integer,String> m = new TreeMap<>(); // gives an output based on key sorting.
		
		
		m.put(2, "Ammy");
		m.put(3, "Manu");
		m.put(1, "Rohit");
		
		
		Set<Map.Entry<Integer, String>> values= m.entrySet(); // entry is a concatinated interface i.e interface inside an interface Entry interface is in Map interface.
		
		 for(Map.Entry<Integer, String> e : values )
		 {
			 
			 
			 System.out.println(e.getKey() + " " + e.getValue());
			 
		 }
		
		
	}

}
