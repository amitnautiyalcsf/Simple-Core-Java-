package StringAndRegex;

import java.util.Scanner;

public class RegexDemo 
{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 to 8 digit no");
		String input= sc.nextLine();
		boolean valid = input.matches("\\d{5,8}"); // You can enter 5 to 8 digit no
		System.out.println(valid);
		
		System.out.println("Enter an ID <aaa-bb-cccc");
		input= sc.nextLine();
	   valid =input.matches("\\d{3}-\\d{2}-\\d{4}");
	//	valid =input.matches("\\d{3}-?\\d{2}-?\\d{4}"); // Here "-" is not compulsory 
		System.out.println(valid);
		
		
		
		
	}

}
