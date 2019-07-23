package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{

	int rollNo , marks;
	String name;
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		
//		return marks>s.marks?1:-1; 
		return name.length()>s.name.length()?1:-1;
	}

}


public class ComparableInterface {
	public static void main(String[] args) {
	
		List<Student>stud = new ArrayList<>(); 

		stud.add(new Student(23,"Sonu",78));
		stud.add(new Student(01,"Ammy",99));
		stud.add(new Student(02,"Manu",98));
		stud.add(new Student(24,"Peeyush",95));
		stud.add(new Student(26,"Rohit",91));
		
		Collections.sort(stud,(i,j)->i.marks>j.marks?1:-1); // Now it will sort based on marks doesn't matter that above it is mention sorted as a name length // we override the logic with the help of comparator object.
		
		for(Student s: stud)
		{
			
			System.out.println(s);
			
		}
	}

}
