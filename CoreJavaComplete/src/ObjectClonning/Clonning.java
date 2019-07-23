package ObjectClonning;

/*Types of copying 
1. Shallow copy
2. Deep copy
3. objectClonning*/

public class Clonning {

	public static void main(String[] args) throws CloneNotSupportedException {

		Abc obj = new Abc();
		obj.i = 5;
		obj.j = 6;

		System.out.println(obj);

		// 1.Shallow Copy = here we are not creating a diff object we just creating one
		// more refrence that is assigned to the same object.
		Abc obj1 = obj;
		System.out.println(obj1);

		
//		2. Deep Copy = In it we are creating a new object(Obj2) and we are taking all the values from obj and putting the values to obj2.
		               // Problem with it is time consuming and increase a no of lines 
		
		Abc obj2 = new Abc();
		obj2.i=obj.i;
		obj2.j=obj.j;
		
		obj2.j=10;
		
		System.out.println(obj2); //expected output now is 5,10
		System.out.println(obj); //expected output now is 5,6
		
		
		
//      3.Clone = Combination of both Deep and Shallow Copying. 
		
		
		Abc obj3=(Abc) obj.clone();
		System.out.println("Object 3" + obj3);
		
		
}

}
// Marker Interface is for permission.
class Abc implements Cloneable
{

	int i, j;

	@Override
	public String toString() {
		return "Abc [i=" + i + ", j=" + j + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	

}
