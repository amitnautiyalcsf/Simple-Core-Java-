package PrivateMethodCallingInJava;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//Reflection API : It is used for testing to get the understanding of a class

public class ReflectionDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException 
	{
		
		Class c = Class.forName("PrivateMethodCallingInJava.Test");
		Test t = (Test) c.newInstance();
		
		Method m = c.getDeclaredMethod("show", null);
		m.setAccessible(true);
		m.invoke(t, null);
		
		// Now we are able to call the private method.
		// But what is the use of private if we are able to call it using Reflection ??
		//We dont use Reflection in the normal scenerio we used reflection for debugging or testing a class.  
		
			
	}

}
