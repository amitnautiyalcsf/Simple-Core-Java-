package ExceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource {
	public static void main(String[] args) throws IOException{
		
		int n=0;
		
		System.out.println("Enter a number");
	
		 
	try(BufferedReader br =new BufferedReader(new InputStreamReader(System.in))) //as soon as your object goes out of scope it will close the resource automatically
	{	
		n= Integer.parseInt(br.readLine());
		System.out.println(n);
	}
		
		
		
}

}
