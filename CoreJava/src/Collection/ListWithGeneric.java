package Collection;

import java.util.ArrayList;
import java.util.List;

public class ListWithGeneric 
{
	
public static void main(String[] args) 
{
	List<Integer> values = new ArrayList<>();
	values.add(1);
	values.add(10);
	values.add(100);
	values.add(99);
	for(Integer o: values)
	{
		System.out.println(o);
		
	}
}

}
