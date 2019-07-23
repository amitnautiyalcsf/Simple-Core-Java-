package ExceptionHandling;

public class UserDefinedException
{
	public static void main(String[] args) {
		
	
	int i =8;
	int j=9;
	
	try 
	{
	int k = i/j;
	
	if(k==0)
	{
		//throw new Exception();
			throw new AmmyException("This is not correct");
	}
	
	System.out.println(k);
	
	}
	
	
	catch(AmmyException e)
	{
		
		System.out.println("error " + e.getMessage());
	}

}
}
