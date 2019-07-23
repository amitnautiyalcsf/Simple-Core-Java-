package AbstractClasses;

abstract class Human // If u have an abstract method inside the class then class must be abstract.
                     // But it is not compulsory to have an abstract method inside the abstract class
                     // you can't instantiate/ or create an  object of it 
{        
	public abstract void eat();
	public void walk()
	{
		
		
	}
	

}
class Man extends Human // Man class is called as Concrete Class
{

	public void eat()

	{
	

	}
	
}



public class AbstractClasses {

	public static void main(String[] args) 
	{
		Human obj= new Man();
		
		
	}
}


//Note : why do we need abstract class



