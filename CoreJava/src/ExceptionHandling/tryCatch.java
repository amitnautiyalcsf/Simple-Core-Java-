package ExceptionHandling;

public class tryCatch 
{
	public static void main(String[] args) {
		try {
			
			int i =7;
			int j=0;
			int k =i/j;
			}
		
		catch(ArithmeticException e)
		{
			
			System.err.println("Error");
			
		}
		finally // must be executed even if u r not getting an exception.
		{
			System.out.println("Bye");
			
		}
		
		
	}

}
