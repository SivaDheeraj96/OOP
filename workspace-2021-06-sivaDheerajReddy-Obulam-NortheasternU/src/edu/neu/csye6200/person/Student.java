package edu.neu.csye6200.person;


public class Student extends Person{
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
	@Override
	public String toString() {
		return super.toString()+" gpa: "+this.gpa;
	}
//	@Override
//	public int compareTo(AbstractSchoolAPI o) {
//		return ((Double)this.gpa).compareTo(o.getGpa());
//	}
	
	@Override
	public int compareTo(AbstractPersonAPI o) {
		return ((Double)this.gpa).compareTo(((Student)o).getGpa());
	}

}
