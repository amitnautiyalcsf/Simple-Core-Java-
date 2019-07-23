package OthermethodsOfClassReflectionApi;

//class Class

class Abc
{
	

}


class A extends Abc
{
	

}


public class DemoReflection {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		
		Class c = Class.forName("OthermethodsOfClassReflectionApi.A");
		System.out.println(c.isInterface()); // to check weather A is a interface or not
		System.out.println(c.getSuperclass()); // to check weather it extends any class
		
	
	}
}
