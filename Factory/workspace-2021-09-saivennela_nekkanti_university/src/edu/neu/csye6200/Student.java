package edu.neu.csye6200;

public class Student extends Person {
	private double gpa;
	public Student(int id, String firstName, String lastName, int age, double gpa) {
		super(id, firstName, lastName, age);
		this.setGpa(gpa);
	}
	
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		return super.toString()+" gpa:"+this.gpa;
	}
	
	public int sortById(Student p) {
		return ((Double)this.gpa).compareTo(p.getGpa());
	}
	
}