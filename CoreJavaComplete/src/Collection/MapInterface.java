package Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapInterface {
	public static void main(String[] args) 
	{
		// for key value pairing
		//sequence is not maintained
		Map<String,String> map = new HashMap<>();
		map.put("MyName", "Ammy");
		map.put("cricketer", "RohitSharma");
		map.put("Captain", "MSD");
		map.put("cricketer", "kholi"); // It will not take this value as we use Set in keys and it doesn't contain duplicates, so it change the value for that particular key.
//		System.out.println(map); 
		
//		System.out.println(map.get("Captain"));
		
		Set<String>keys =map.keySet();
		
		for(String key: keys)
		{
			System.out.println(key + " " + map.get(key));
			
		}	
		
		
		
		// 2nd Way of implementing a map is hashtable // Hashtable is synchronized
		
		Map<String,String> map1 = new Hashtable<>();
		
		
	}

}
