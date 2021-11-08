package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public  class UniversityBase extends AbstractSchoolAPI{

	private List<AbstractPersonAPI> el= new ArrayList<AbstractPersonAPI>();
	private List<AbstractPersonAPI> sl= new ArrayList<AbstractPersonAPI>();

	public void addEmployee(AbstractPersonAPI employee) {
		this.el.add(employee);		
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		this.sl.add(student);
		
	}

	@Override
	public String getEmployeesInfo() {
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI student : sl) {
			sb.append(student).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void showEmployees() {
		System.out.println(this.getEmployeesInfo());
		
	}

	@Override
	public String getStudentsInfo() {
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI student : el) {
			sb.append(student).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void showStudents() {
		System.out.println(this.getStudentsInfo());
		
	}

	@Override
	public void show() {
		this.showEmployees();
		this.showStudents();
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		this.el.sort(c);
		
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		this.sl.sort(c);
	}
}
