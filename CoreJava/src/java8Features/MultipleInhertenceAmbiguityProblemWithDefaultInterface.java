package java8Features;

@FunctionalInterface
interface Demo1 {

	void abc();

	default void show() {

		System.out.println("In demo show");

	}

}

interface MyDemo1 {

	default void show() {
		System.out.println("In mydemo Show");

	}

}


class DemoImpl1 implements Demo1,MyDemo1
{

	public void abc()
{
	System.out.println("In abc");

}

	@Override
	public void show() {
		// TODO Auto-generated method stub
//		Demo1.super.show();
		MyDemo1.super.show();
	}
	
	


}

public class MultipleInhertenceAmbiguityProblemWithDefaultInterface {

	public static void main(String[] args) {
		Demo1 obj = new DemoImpl1();
		obj.abc();
		obj.show();
		

		
		
		
	}
	
	
}
