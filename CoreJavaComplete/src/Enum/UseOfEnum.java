package Enum;


//This is what happen inside in compiler
/*
class Mobile
{
	static final Mobile APPLE= new Mobile(100);
	static final Mobile SAMSUNG= new Mobile();
	static final Mobile HTC= new Mobile(90);

}
*/
interface demo1{}


// It is possible to create variable and methods also inside the enum
// also an enum can implements an interface but doesnt extends the class coz ur enum already extends an enum class
enum Mobile implements demo1 
{

	APPLE(100),SAMSUNG,HTC(90);
	int price;
	
	
	Mobile() 
	{
	
		price =80;
	
		System.out.println("Constructor");
	}
	
	
	Mobile(int p)
	{
		price=p;
		
	}
	
	
	public int getPrice()
	{
		
		return price;
		
	}
	
	
	
	
}


public class UseOfEnum 
{
	
	
	public static void main(String[] args) {

	Mobile m = Mobile.SAMSUNG;
	
	switch(m)
	{
		case APPLE:
			System.out.println("Apple is best");
			break;
			
		case SAMSUNG:
			System.out.println("First Copy of apple");
			break;
			
		
	}
	
	System.out.println(Mobile.APPLE.getPrice());
	System.out.println(Mobile.SAMSUNG.ordinal()); // means every constant is having a number , a sequence
	
	Mobile m2[] = Mobile.values(); // stores all the constant in an array 
	
	for(Mobile ss: m2)
	{
		
		System.out.println(ss);
		
	}
	
	
	
	}

}
