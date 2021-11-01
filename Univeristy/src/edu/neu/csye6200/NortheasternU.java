package edu.neu.csye6200;

import java.util.Comparator;

import edu.neu.csye6200.person.AbstractPersonAPI;
import edu.neu.csye6200.person.Employee;
import edu.neu.csye6200.person.Person;
import edu.neu.csye6200.person.Student;

public class NortheasternU extends UniversityBase{
	private static final String name = "Northeastern";

	public static String getName() {
		return name;
	}
	
	public static void demo() {
		UniversityBase neu = new NortheasternU();
		neu.addEmployee(new Employee(2,"Sdf","fsdf",34,3545));
		neu.addEmployee(new Employee(4,"dsdff","fsdfsdff",44,3535));
		neu.addEmployee(new Employee(6,"tertt","hfghrt",44,3235));
		
		
		neu.addStudent(new Student(1,"fsdf","gfgd",11,3.4));
		neu.addStudent(new Student(5,"gtjh","yruj",10,3.3));
		neu.addStudent(new Student(3,"tert","jghj",12,3.2));
		neu.addStudent(new Student(1,"jtguy","utyu",13,3.1));
		neu.show(); 
		neu.sortStudents(AbstractPersonAPI::sortById);
		neu.sortEmployees(AbstractPersonAPI::sortById);
		neu.show();
	}
}
