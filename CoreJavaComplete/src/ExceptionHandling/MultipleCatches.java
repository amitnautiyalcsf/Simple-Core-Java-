package ExceptionHandling;

public class MultipleCatches {

	public static void main(String[] args) {
		
		try {
		int arr[] = null;
		
		arr[4]=8;
		int i =7;
		int j = 0;
		int k = i/j;
		System.out.println("Output is " + k);
	}
		catch(ArithmeticException e)
	    {
			
			System.err.println("Error");
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Stay in ur limit");
			
			
		}
		catch(Exception e)
		{
			
			System.err.println("Something went wrong");
		}
		
		finally
		{
			System.out.println("Bye ");
		}
		
		
    }
	
}
