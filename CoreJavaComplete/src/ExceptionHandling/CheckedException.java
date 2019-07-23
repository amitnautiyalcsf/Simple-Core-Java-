package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// Checked Exception : when your compiler knows about the exception.

//Unchecked Exception: when your compiler dont prompt about the exception that is unchecked exception ex divided by zero. Only runtime exception subclasses are unchecked reamining all are checked 

public class CheckedException {
	public static void main(String[] args) throws IOException{
		
		int n=0;
		
		System.out.println("Enter a number");
	
		BufferedReader br = null;
	try {	
		br =new BufferedReader(new InputStreamReader(System.in));
		n= Integer.parseInt(br.readLine());
		System.out.println(n);
	}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
		finally
		{
			br.close(); // use of finally block is to close your resources.
			
		}
		
		
}

}
