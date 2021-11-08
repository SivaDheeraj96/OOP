package edu.neu.csye6200.university;

import edu.neu.csye6200.person.AbstractPersonAPI;
import edu.neu.csye6200.person.Employee;
import edu.neu.csye6200.person.Student;

public class NortheasternU extends UniversityBase{

	public static void Demo() {
		
		AbstractPersonAPI  e1 = new Employee(1,"Dan","Peters",55,100000);
		AbstractPersonAPI  e2 = new Employee(2,"Nick","Brown",50,90000);
		AbstractPersonAPI  e3 = new Employee(3,"Mofei","Xu",38,80000);
		
		
		AbstractPersonAPI s1 = new Student(1,"Dheeraj","Siva",25,3.6); 
		AbstractPersonAPI s2 = new Student(4,"Manoj","Reddy",26,3.4); 
		AbstractPersonAPI s3 = new Student(6,"Shashank","Pragada",24,3.9);
		
		UniversityBase neu = new UniversityBase();
		
		neu.addEmployee(e1);
		neu.addEmployee(e2);
		neu.addEmployee(e3);
		
		neu.addStudent(s1);
		neu.addStudent(s2);
		neu.addStudent(s3);
		
		System.out.println("After adding the Employees and Students");
		neu.show();
		
		
		neu.sortEmployees(AbstractPersonAPI::sortById);
		neu.sortStudents(AbstractPersonAPI::sortById);
		System.out.println("After sorting based on ID the Employees and Students");
		neu.show();
		
		
		neu.sortEmployees(AbstractPersonAPI::sortByAge);
		neu.sortStudents(AbstractPersonAPI::sortByAge);
		System.out.println("After sorting based on AGE the Employees and Students");
		neu.show();
		
		neu.sortEmployees(AbstractPersonAPI::sortByFirstName);
		neu.sortStudents(AbstractPersonAPI::sortByFirstName);
		System.out.println("After sorting based on FirstName the Employees and Students");
		neu.show();
		
		neu.sortEmployees(AbstractPersonAPI::sortByLastName);
		neu.sortStudents(AbstractPersonAPI::sortByLastName);
		System.out.println("After sorting based on LastName the Employees and Students");
		neu.show();
		
		neu.sortEmployees();
		neu.sortStudents();
		System.out.println("After sorting based on Natural Order the Employees and Students");
		neu.show();
		
		
		
	}
}
