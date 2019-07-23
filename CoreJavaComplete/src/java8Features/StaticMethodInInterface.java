package java8Features;

interface Demo2 {
	
	int num =8; // By default if u create a variable inside a interface it becomes constant(Final)
	
	void abc();
    static void show() {

		System.out.println("hi");
	}

}


class DemoImpl3 implements Demo2
{
	

	public void abc()
	{
		
		// num=9; it will throw an error bcoz the variable is final by default.		
	}
}


public class StaticMethodInInterface {

	public static void main(String[] args) {
		Demo2.show(); // we can directly call the static method of interface. 
	}
}
