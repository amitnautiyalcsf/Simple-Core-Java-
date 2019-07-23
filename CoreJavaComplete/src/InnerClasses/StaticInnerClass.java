package InnerClasses;

class St
{
	
	static int marks;
	
	static class Sm
	{
		
		public void msg()
		{
			
			System.out.println("Static inner class Method");
			
		}
		
		
		
	}

}



public class StaticInnerClass {

public static void main(String[] args) {

	System.out.println(St.marks=100);
	St.Sm obj1 = new St.Sm();
	obj1.msg();
	
}
}
