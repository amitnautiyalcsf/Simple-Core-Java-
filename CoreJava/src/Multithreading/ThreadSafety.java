package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

class Counter1 {
	AtomicInteger count= new AtomicInteger();

//	public  void increment() // issue here is both the methods executing the method at the same time
	public synchronized void increment1() // Now it is Thread Safe.
	{
		count.incrementAndGet();// count =count+1;
	}

}


public class ThreadSafety {
	public static void main(String[] args) throws InterruptedException {

		Counter1 c = new Counter1();
//		c.increment();
//		c.increment();
		
		Thread t1 = new Thread(new Runnable()
				{
	
			public void run()
			{
				
				for(int i=1; i<=10000;i++)
				{
					
					c.increment1();
					
				}
				
			}
			
			
			});
		
		
		Thread t2 = new Thread(new Runnable()
		{

	public void run()
	{
		
		for(int i=1; i<=10000;i++)
		{
			
			c.increment1();
			
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
