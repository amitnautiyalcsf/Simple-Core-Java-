package AnonymousClass;

// If the only purpose of your class to override the method then use anonymous class 

//

class A2 {

	public void show() {
		System.out.println("In A Show");

	}

}

/*
 * class B2 extends A2 {
 * 
 * public void show() {
 * 
 * System.out.println("I am the best");
 * 
 * }
 * 
 * }
 */

public class AnonymousClass {
	
	
	public static void main(String[] args) {
		
	
	

	A2 obj = new A2()
			
	{                         // this anonymous class scope only limited to here.
		                      // So if Your intention is to create a class only for one time use we can prefer anonymous class
		                      // Anonymous class is the class which is not having any name.
		
		public void show()
		{
			
			System.out.println("I m the best ");
			
		}
		
		
			
	};

	obj.show();

}
}
