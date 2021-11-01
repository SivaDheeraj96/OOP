package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import edu.neu.csye6200.person.AbstractPersonAPI;

public class UniversityBase extends AbstractSchoolAPI{

	private List<AbstractPersonAPI> employeeList ;
	private List<AbstractPersonAPI> studentList ;
	public UniversityBase() {
		employeeList = new ArrayList<AbstractPersonAPI>();
		studentList = new ArrayList<AbstractPersonAPI>();
	}
	@Override
	public void addEmployee(AbstractPersonAPI employee) {
		this.employeeList.add(employee);		
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
		this.studentList.add(student);
		
	}

	@Override
	public String getEmployeesInfo() {
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI student : studentList) {
			sb.append(student).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void showEmployees() {
		System.out.print(this.getEmployeesInfo());
		
	}

	@Override
	public String getStudentsInfo() {
		StringBuilder sb = new StringBuilder();
		for(AbstractPersonAPI student : employeeList) {
			sb.append(student).append("\n");
		}
		return sb.toString();
	}

	@Override
	public void showStudents() {
		System.out.print(this.getStudentsInfo());
		
	}

	@Override
	public void show() {
		this.showEmployees();
		this.showStudents();
		
	}

	@Override
	public void sortEmployees(Comparator<AbstractPersonAPI> c) {
		this.employeeList.sort(c);
		
	}

	@Override
	public void sortStudents(Comparator<AbstractPersonAPI> c) {
		this.studentList.sort(c);
	}

}
