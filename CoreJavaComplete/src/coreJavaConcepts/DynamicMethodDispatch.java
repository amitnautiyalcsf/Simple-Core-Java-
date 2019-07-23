package coreJavaConcepts;

class A1
{

	public void show()
	{
		
		System.out.println("A method");
		
	}

}


class B1 extends A1
{

	public void show()
	{
		System.out.println("B method");
		
	}
	
	public void config()
	{
		
		System.out.println("config method");
		
	}

}

class C extends A1
{
	public void show()
	{
		
		System.out.println("C method");
		
	}

}


public class DynamicMethodDispatch {

	public static void main(String[] args) {
		A1 obj1 = new B1(); // run time polymorphism
		obj1.show(); // It will print B method as we create the obj of B 
		// obj1.config(); // it will not call the method config becoz we have a refrence of A and in A class we dont have any method named config
		// only overridden method will be called

		A1 obj2= new C();
		obj2.show(); // Dynamic Method dispatch
		
		
		
		
		
	}
}
