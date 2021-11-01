package edu.neu.csye6200.person;

public class Employee extends Person{
	private int salary;
	public Employee(int id, String firstName, String lastName, int age,int salary) {
		super(id, firstName, lastName, age);
		this.setSalary(salary);
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return super.toString()+" salary:"+this.salary;
	}
	public int sortBySalary(Employee p) {
		return ((Integer)this.salary).compareTo(p.getSalary());
	}
}
