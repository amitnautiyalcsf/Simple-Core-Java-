package InnerClasses;

//Inner Member Class


class A
{
	int rollNo;
	String name;
	
	class B
	{
		
		public void show()
		{
			System.out.println("Show method of inner class");
			
		}
		
	}

}


public class TestInner 
{

	public static void main(String[] args) {
	
		A obj1= new A();
		System.out.println(obj1.rollNo=101);
		System.out.println(obj1.name="Ammy");
		
		A.B obj2= obj1.new B();
		obj2.show();
		
		
		
}
	
}
