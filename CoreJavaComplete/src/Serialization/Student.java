package Serialization;

import java.io.Serializable;

class Student implements Serializable
{

	private int rollNo;
	private String name;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public  int getRollNo() {
		return rollNo;
	}
	public  void setRollNo( int rollNo) {
		this.rollNo = rollNo;
	}
	public  String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
	
	
	
}