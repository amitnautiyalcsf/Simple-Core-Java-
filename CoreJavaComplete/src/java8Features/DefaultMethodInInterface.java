package java8Features;

//Abstract class--> define and declare method.
//Interface --> only declare method but upto version --> 1.7.
//in java 1.8 we can define methods in Interface.

@FunctionalInterface  // it doesn't give us any error the reason is functional interface can have only one abstract method , so we can have any no of default methods 
interface Demo
{

	void abc();
	default void show()
	{
		
		System.out.println("in show");
		
	}

}


class DemoImpl implements Demo
{

	public void abc()
	{
		
		System.out.println("in abc");
		
	}
	
	/*
	 * public void show()// that means the default method can also be overrided in
	 * the class itself {
	 * 
	 * System.out.println("in a new Show");
	 * 
	 * }
	 */

}



public class DefaultMethodInInterface 
{
	public static void main(String[] args) {
		Demo obj = new DemoImpl();
		obj.abc();
		obj.show();
	}

}
