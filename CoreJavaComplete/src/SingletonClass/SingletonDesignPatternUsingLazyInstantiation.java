package SingletonClass;



class Abcd
{

// This type of object creation in singleton is called as Eagerly instance Creation bcoz even if you are not using it. It will be created and resides in you memory bcoz it acts as a global variable 
  
	//public static Abc obj = new Abc();

  
// how to make it Lazy ?
// We can create this instance at the time of calling the getInstance
	
	
	public static Abcd obj;
	int i;
	private Abcd() {
		System.out.println("Instance Is created");
	}
	
	public static Abcd getInstrance()
	{
		if(obj==null) // checking wheather it is the first time we are creating the object. 
		{
		
			obj = new Abcd();
		
		}
		
		return obj;
		
	}

}

public class SingletonDesignPatternUsingLazyInstantiation {
	
	public static void main(String[] args) {
	
		Abcd obj= Abcd.getInstrance();
		Abcd obj2 = Abcd.getInstrance();
		
	}

}

