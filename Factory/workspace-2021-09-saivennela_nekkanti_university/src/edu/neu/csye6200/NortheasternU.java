package edu.neu.csye6200;
import java.util.Comparator;

public class NortheasternU extends UniversityBase{
	private static final String name = "Northeastern";

	public static String getName() {
		return name;
	}
	
	public static void demo() {
		
		AbstractPersonAPI s1=new Student(2,"keerti","kkkk",23,3.4);
		AbstractPersonAPI s2=new Student(5,"gtjh","ccc",31,3.1);
		AbstractPersonAPI s3=new Student(6,"tert","uuuu",65,3.2);
		
		AbstractPersonAPI e1=new Employee(9,"ram","qqqq",30,56000);
		AbstractPersonAPI e2=new Employee(8,"shyam","dddd",24,85000);
		AbstractPersonAPI e3=new Employee(7,"dhaam","aaaa",65,100000);
		
		NortheasternU n1= new NortheasternU();
		n1.addEmployee(e1);
		n1.addEmployee(e2);
		n1.addEmployee(e3);
		
		n1.addStudent(s1);
		n1.addStudent(s2);
		n1.addStudent(s3);
		
		n1.show(); 
		n1.sortStudents(AbstractPersonAPI::sortById);
		n1.sortStudents(AbstractPersonAPI::sortByFirstName);
		n1.sortStudents(AbstractPersonAPI::sortByLastName);
		n1.show();

	}
}
