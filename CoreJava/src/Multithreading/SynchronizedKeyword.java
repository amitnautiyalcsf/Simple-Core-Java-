package Multithreading;

class Counter {
	int count;

//	public  void increment() // issue here is both the methods executing the method at the same time
	public synchronized void increment() // Now it is Thread Safe.
	{
		count++;// count =count+1;
	}

}

public class SynchronizedKeyword {

	public static void main(String[] args) throws InterruptedException {

		Counter c = new Counter();
//		c.increment();
//		c.increment();
		
		Thread t1 = new Thread(new Runnable()
				{
	
			public void run()
			{
				
				for(int i=1; i<=10000;i++)
				{
					
					c.increment();
					
				}
				
			}
			
			
			});
		
		
		Thread t2 = new Thread(new Runnable()
		{

	public void run()
	{
		
		for(int i=1; i<=10000;i++)
		{
			
			c.increment();
			
		}
		
	}
	
	
	});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count " + c.count);
	}

}
