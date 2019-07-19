package AnonymousClass;

interface Abc {

	void show();

}

/*
 * class Implementor implements Abc {
 * 
 * public void show() { System.out.println("I am an implementor");
 * 
 * }
 * 
 * }
 */

public class AnonymousClassWithTheInterface {
public static void main(String[] args) {
//	Abc obj = new Implementor();
//	obj.show();
	
	Abc obj = new Abc() // advantage is memory usage
			{
		
		public void show() 
		{
			System.out.println("I am an implementor");

		}
	};
	
	obj.show();
	
	
}
}
