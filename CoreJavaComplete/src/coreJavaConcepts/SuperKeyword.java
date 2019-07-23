package coreJavaConcepts;

public class SuperKeyword {

	public static void main(String[] args) {
		// A obj1 = new A();

		B obj1 = new B(5);
	}

}

class A {

	public A() {

		System.out.println("A constructor");
	}
   public A(int i)
   {
	   
	   System.out.println("In a int A");
	   
	   
   }
}

class B extends A {

	public B() {
		
		//super(5);

		System.out.println("B Construtor");
	}
	
	 public B(int i)
	   {
	
		 super(i);
		   
		   System.out.println("In a int B");
		   
		   
	   }
	

}
