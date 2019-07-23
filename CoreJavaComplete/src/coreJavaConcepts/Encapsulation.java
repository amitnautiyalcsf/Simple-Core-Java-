package coreJavaConcepts;

class Student {

	private int rollno;
	private String name;

	// Getters And Setters
	// Binding data with the methods is called Encapsulation
	
	// Encapsulation is used to make Data Safe. maintaining a log file 

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

public class Encapsulation {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.setRollno(2);
		s1.setName("Ammy");

		System.out.println("rollno is : " + s1.getRollno() + " Name is : " + s1.getName());
	}
}
