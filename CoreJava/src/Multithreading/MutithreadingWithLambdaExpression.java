package Multithreading;

public class MutithreadingWithLambdaExpression {
	public static void main(String[] args) {

		// Use of Anonymous Class

		/*
		 * Runnable obj1= new Runnable() {
		 * 
		 * @Override public void run() { for(int i=0;i<=5; i++) {
		 * System.out.println("Hi"); try { Thread.sleep(1000);
		 * 
		 * 
		 * } catch(Exception e){}
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * };
		 * 
		 * Runnable obj2 = new Runnable() {
		 * 
		 * @Override public void run() { for(int i=0;i<=5; i++) {
		 * System.out.println("Hello"); try { Thread.sleep(1000);
		 * 
		 * 
		 * } catch(Exception e){}
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * };
		 */

		// Use of Lambda Expression
		
		Thread t1 = new Thread(()->{
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);

				} catch (Exception e) {
				}

			}
			});
		
		Thread t2 = new Thread(()-> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);

				} catch (Exception e) {
				}

			}
			});
		
		
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}
		t2.start();

	}

}
