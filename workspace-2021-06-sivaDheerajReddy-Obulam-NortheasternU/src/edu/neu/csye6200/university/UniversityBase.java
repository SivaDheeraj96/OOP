package edu.neu.csye6200.university;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.neu.csye6200.person.AbstractPersonAPI;
import edu.neu.csye6200.person.Employee;
import edu.neu.csye6200.person.Student;

public class UniversityBase extends AbstractSchoolAPI{

	private List<AbstractPersonAPI> studentList ;
	private List<AbstractPersonAPI> employeeList ;
	
	UniversityBase(){
		studentList = new ArrayList<AbstractPersonAPI>();
		employeeList = new ArrayList<AbstractPersonAPI>();
	}
	@Override
	public void addEmployee(AbstractPersonAPI employee) {
//		if(!(employee instanceof Employee)) {
//			throw new RuntimeException("Not an employee object");
//		}
		this.employeeList.add(employee);
		
	}

	@Override
	public void addStudent(AbstractPersonAPI student) {
//		if(!(student instanceof Student)) {
//			throw new RuntimeException("Not an employee object");
//		}
		this.studentList.add(student);
		
	}

	@Override
	public String getEmployeesInfo() {
		StringBuilder sb = new StringBuilder();
		this.employeeList.stream().forEach(x -> {sb.append(x);sb.append("\n");});
		return sb.toString();
	}

	@Override
	public void showEmployees() {
		System.out.println(this.getEmployeesInfo());
		
	}

	@Override
	public String getStudentsInfo() {
		StringBuilder sb = new StringBuilder();
		this.studentList.stream().forEach(x -> {sb.append(x);sb.append("\n");});
		return sb.toString();
	}

	@Override
	public void showStudents() {
		System.out.println(this.getStudentsInfo());
		
	}

	@Override
	public void show() {
		System.out.println("Belown is the Employee list");
		this.showEmployees();
		System.out.println("Belown is the Student list");
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
	
	public void sortEmployees() {
		Collections.sort(employeeList);
	}

	public void sortStudents() {
		Collections.sort(studentList);
	}

}
