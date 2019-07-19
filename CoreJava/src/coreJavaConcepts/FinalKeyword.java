package coreJavaConcepts;

// we can use it in:
//Variable
//methods 
//classes - u can't extend a final class

class S{

	// final int DAY =0; // Variable become contant.
	
	final int DAY; 
	
	public S() {
 
		DAY=10;
		// DAY=19;// once assigned can't change again 
		
	}

}



final class T
{
	public void show()
	{
		
		System.out.println("In show");
		
	}
}

// class M extends T // gives an error
class M

{
	

}


class K
{
public final void show()
{
	
System.out.println("In k show");
}

}

class L extends K
{
	// we can't override the final method 
	/*
	 * public void show() {
	 * 
	 * System.out.println("In L show"); }
	 */

}





public class FinalKeyword {

	public static void main(String[] args) {
		S obj = new S();
		System.out.println(obj.DAY);
		
		
		L obj2= new L();
		obj2.show();
		
	}
}
