package SingletonClass;

public class SingletonSynchronizedDoubleCheckLocking {

	public static void main(String[] args) {

		Thread t1 = new Thread(()->{Abcdef obj= Abcdef.getInstrance();});
	
		Thread t2 = new Thread(()->{Abcdef obj2 = Abcdef.getInstrance();});
		
		t1.start();
		// Another Approach we can also use is put one thread in sleep . but waiting for 10 milisec is also a waste of time.

		
//		try
//		{
//			Thread.sleep(10);
//		}
//		
//		catch(Exception e)
//		{}
		
		
		
		
		t2.start();
		
		
		
	}
}

class Abcdef
{
   
	public static Abcdef obj;
	int i;
	private Abcdef() {
		System.out.println("Instance Is created");
	}
	
	
	
	
	
	public static  Abcdef getInstrance() // Double check Locking
	{
		if(obj==null) // checking wheather it is the first time we are creating the object. 
		{
			
			synchronized(Abcdef.class)
			{
				if(obj==null)
				obj = new Abcdef();
			}
		
			
		
		}
		
		return obj;
		
	}
}



