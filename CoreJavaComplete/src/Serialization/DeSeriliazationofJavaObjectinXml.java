package Serialization;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class DeSeriliazationofJavaObjectinXml {
	

	public static void main(String[] args) {
	
	try {
		XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream("mycollege3.xml")));
	
		College c = (College)x.readObject();
		
		List<Student>s = c.getStudents();
		for(Student st: s)
		{
			System.out.println(st);
			
		}
		
	
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
