package Serialization;

import java.io.Serializable;
import java.util.List;

class College implements Serializable
{
	private List<Student>students;
	

	public College() {
		// TODO Auto-generated constructor stub
	}


	public List<Student> getStudents() {
		return students;
	}


	public  void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
	
	
	
}

