package coreJavaConcepts;






public class WrapperClassesAutoBoxing 
{
	public static void main(String[] args) {

		int i =5 ; // primitve datta type
	
		Integer ii= new Integer(5); // refrence variable // Wrapper class
	
		Integer s = new Integer(i); // Boxing - Wrapping -means putting a variable inside an object.
	 int j =ii.intValue(); // intValue is a method which returns the value of ii. // Unboxing - Unwrapping 
		

	 Integer value= i; // Automatically done by java thats y called as a autoboxing.
	 
	 int k= value; //AutoUnboxing;
	 
//Note: In terms of speed primitive works faster than the Wrapper Classes.
// Qus : If Wrapper Classes are so slow then why we need a wrapper Classes?
// Ans: There are some frameWorks which only works with Wrapper Classes they dont support primitive  ex: Hibernate, Collection api.
	 

	String str ="123";
	int n =Integer.parseInt(str);
	
	System.out.println(n);
	 
	 
	 
	 
	}

}
