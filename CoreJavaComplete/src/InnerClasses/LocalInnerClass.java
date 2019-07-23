package InnerClasses;

//LocalInner Class

class AD
{
	int roll;
	String name;
	
	public void show()
	{
		
		class BD
		{
			String surname;
			public void msg()
			{
				
				System.out.println("Method of local Inner Class BD");
				
			}
			
			
		}
		
		BD obj = new BD();
		System.out.println(obj.surname= "Nautiyal");
		obj.msg();
		
		
	}
	
}


public class LocalInnerClass 
{
	public static void main(String[] args) {
		AD obj1 = new AD();
		System.out.println(obj1.roll=1);
		System.out.println(obj1.name="Ammy");
		
		obj1.show();
				
	}
	

}
