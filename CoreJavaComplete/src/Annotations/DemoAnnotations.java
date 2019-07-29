package Annotations;

import java.util.ArrayList;

@FunctionalInterface // you can only declare one method inside this interface.
interface Asd
{
	void akl();
}


class A
{

	public void showMyDataFromLastYearDatabase()
	{
		
		System.out.println("In A");
		
	}
	
}

class B extends A
{
	@Deprecated // Its better to not to use this method
	public void show()
	{
		
		
		
	}
	
	
	// check the compile time stuff.
	@Override
	@SuppressWarnings("unchecked")
	public void showMyDataFromLastYearDatabase()
	{
		
		ArrayList obj = new ArrayList<>();
		System.out.println("In B");
		
		
	}

	
}




public class DemoAnnotations {
	public static void main(String[] args) {
	
		B obj = new B();
		obj.showMyDataFromLastYearDatabase();
		obj.show();
		
	}

}
