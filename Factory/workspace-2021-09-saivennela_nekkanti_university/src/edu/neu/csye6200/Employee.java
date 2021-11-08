package edu.neu.csye6200;

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
			System.out.println("sorting employee by salary");
			return ((Integer)this.salary).compareTo(p.getSalary());
		}
	}