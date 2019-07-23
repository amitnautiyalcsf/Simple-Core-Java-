package Serialization;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Save implements Serializable 
{
	int i;

	@Override
	public String toString() {
		return "Save [i=" + i + "]";
	}
	
	
	
}


// Object Serialization in java
public class ObjectSerial {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Save obj = new Save();
		obj.i = 4;

		File f = new File("obj.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj); // state of this object is store in this file 
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois= new ObjectInputStream(fis);
		
		Save obj1 = (Save)ois.readObject();
		
		System.out.println("Value of Obj1 " +obj1);
		
		
		
	}

}
