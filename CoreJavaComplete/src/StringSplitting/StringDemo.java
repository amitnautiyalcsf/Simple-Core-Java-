package StringSplitting;

public class StringDemo 
{
	
	public static void main(String[] args) {
		String str = "Navin, Mahesh, Rahul, Vijay";
		
		String name[]=str.split(",");
		
		for(String s: name)
		{
			
			System.out.println(s);
			
		}
		
		
	}

}
