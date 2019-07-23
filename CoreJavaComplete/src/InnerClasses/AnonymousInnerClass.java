package InnerClasses;

/*
class Tata
{
	
	public void show()
	{
		System.out.println("Bye");
		
	}
	
}
*/

@FunctionalInterface
interface Tata{
	
	public void show();
	
}

public class AnonymousInnerClass 
{
	public static void main(String[] args) {
		
//		Tata t = new Tata()
//				{
//			
//			public void show()
//			{
//				
//				System.out.println("Syonara and Bye");
//			}
//			
//	    };
		
	//Using lambda	
		
		Tata t =()->System.out.println("Syonara and Bye");
	                t.show();
		
     }

}
