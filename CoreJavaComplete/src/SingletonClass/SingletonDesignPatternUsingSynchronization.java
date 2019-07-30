package SingletonClass;

public class SingletonDesignPatternUsingSynchronization {
	public static void main(String[] args) {
		
		
// Here When we use Thread It will create the instance Twice Not a single Instance bcoz we are calling both the thread at the same time, which means both entering this section same time. and hence we failed to follow Singleton Design Pattern.
		
		
		
//		Thread t1 = new Thread(new Runnable()
//				{
//			
//			public void run()
//			{
//				Abcd obj= Abcd.getInstrance();
//				
//			}
//			});
		
		//using Lambda
		
		
		
		Thread t1 = new Thread(()->{Abcde obj= Abcde.getInstance();});
	
		Thread t2 = new Thread(()->{Abcde obj2 = Abcde.getInstance();});
		
		t1.start();
		t2.start();
		
		
		
		
	}

}

class Abcde
{

// This type of object creation in singleton is called as Eagerly instance Creation bcoz even if you are not using it. It will be created and resides in you memory bcoz it acts as a global variable 
  
	//public static Abc obj = new Abc();

  
// how to make it Lazy ?
// We can create this instance at the time of calling the getInstance
	
	
	public static Abcde obj;
	int i;
	private Abcde() {
		System.out.println("Instance Is created");
	}
	
	// solution of above problem are.
	// using synchronized keyword in the method which indicates if one thread is there in the method then the second one have to wait.
	// Bt this approach will reduce the speed of your execution of this method to 100x.
	
	
	
	
	public static synchronized Abcde getInstance()
	{
		if(obj==null) // checking wheather it is the first time we are creating the object. 
		{
		
			obj = new Abcde();
		
		}
		
		return obj;
		
	}
	
	
	
	//Another Approach to solve the above problem is double check Locking
	// which means instead of using Synchronized method use Synchronized blocks.
	
	

}
