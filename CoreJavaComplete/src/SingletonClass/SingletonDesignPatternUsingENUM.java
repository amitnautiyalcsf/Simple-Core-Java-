package SingletonClass;

// only work for version 1.5 and above

public class SingletonDesignPatternUsingENUM {

	public static void main(String[] args) {

		Afg obj1 = Afg.INSTANCE; // By this we are creating Singleton design pattern
		obj1.i= 5;
		obj1.show();
		
		
		Afg obj2= Afg.INSTANCE;
		obj2.i=6;
		obj1.show();
		
// Advantage of using Enum in Singleton Design pattern is when we talk about deserialization, we have to use readObject();,even if your class is Singleton read
// readObject will give you new Object, and thats why using enum there is a method called as readResolve();, so if we are using this method it will not create new 
// Object , It will use the current object itself	
	}
}

enum Afg // special type of class, it means it have a private Constructor already.
{

	INSTANCE;
	int i ;
	
	public void show()
	{
		System.out.println(i);
		
	}


}
