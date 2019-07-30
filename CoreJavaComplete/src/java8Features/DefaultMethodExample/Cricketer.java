package java8Features.DefaultMethodExample;

public interface Cricketer 
{
	
	void bat();
	void field();
	default void bowl()
	{
		
		System.out.println(" I can do Bowling if requirred");
		
	}

}
