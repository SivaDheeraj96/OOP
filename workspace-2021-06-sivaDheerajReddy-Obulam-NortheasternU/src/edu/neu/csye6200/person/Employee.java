package edu.neu.csye6200.person;

public class Employee extends Person {
	private int wage;
	public Employee(int id, String firstName, String lastName, int age, int wage) {
		super(id, firstName, lastName, age);
		this.wage = wage;
	}



	public int getWage() {
		return wage;
	}

	public void setWage(int wage) {
		this.wage = wage;
	}
//	public int compareTo(Employee o) {
//		return ((Integer)this.wage).compareTo(o.getWage());
//	}
	
	@Override
	public String toString() {
		return super.toString()+" wage: "+this.wage;
	}
	
	@Override
	public int compareTo(AbstractPersonAPI o) {
		return ((Integer)this.wage).compareTo(((Employee)o).getWage());
	}

}
