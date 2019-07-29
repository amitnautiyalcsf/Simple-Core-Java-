package SingletonClass;

// you can only create a single instance of this class.
public class Singleton 
{
	public static void main(String[] args) {
		
		Abc obj1 = Abc.getInstance();
		// Abc obj2 = new Abc(); // It will throw an error bcoz  my constructor is private.
		Abc obj2= Abc.getInstance();// every time You will get the same Instance 
		
	}
	

}

// Steps to create a class Singleton 
// 1. create a static instance of same class
// 2. Don't allow user to create a instance with default Constructor
// 3. You have to create a method which should be static and returns the instance of ur class.
class Abc
{
	
//Step 1:
	
	static Abc obj = new Abc(); 
	
// Step2:
	
	private Abc()
	{
		
		
	}
	
// step3:
	
	public static Abc getInstance()
	{
		
		return obj;
	}
	
	

	
	
}