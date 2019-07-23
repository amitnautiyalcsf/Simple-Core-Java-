package Collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesInArrayList {
	public static void main(String[] args) {
		ArrayList<String> arl= new ArrayList<>();
		arl.add("Ammy");
		arl.add("Sonu");
		arl.add("Konu");
		arl.add("Sonu");
		arl.add("Ammy");
		
		Set<String>s = new HashSet<>();
		
		
		for(String name : arl)
		{
			if(s.add(name)==false)
			System.out.println(name);
			
		}
	}

}
