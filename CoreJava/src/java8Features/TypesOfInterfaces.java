package java8Features;
// Types of Interface 

/*
1. Normal Interface :If a interface is having more than one methods 
2. Single abstract method Interface(SAM inteface): It will have only one method
3. Marker Interface: It doesn't have any method. ex.serializable
*/

/*In Java 1.8 we have 

1. Normal Interface :If a interface is having more than one methods 
2. Single abstract method Interface(SAM inteface):--> Functional Interface:--> Lambda Expression:  It will have only one method
3. Marker Interface: It doesn't have any method. ex.serializable
*/

@FunctionalInterface
interface Abcd
{

	void show();
//	void a(); it will give u an error bcoz functional interface can have only one method 

}


public class TypesOfInterfaces 
{
	public static void main(String[] args) {
		Abcd obj =()->System.out.println("I am the best"); // this works only with functional interface
        obj.show();	
	}
	

}
