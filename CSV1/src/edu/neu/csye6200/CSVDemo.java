package edu.neu.csye6200;

import java.util.List;

public class CSVDemo {
	
	public static void demo() 
	{
		FileUtil.createCSV(Student.getStudentsData(),"student.txt");
		FileUtil.createCSV(Teacher.getTeacherData(),"teacher.txt");
		
		List<Student> students = Student.createStudentsFromCSV();
		
		students.sort(Person::sortByID);
		System.out.println("\nSort based on ID");
		printList(students);
		students.sort(Student::sortByStudentID);
		System.out.println("\nSort based on Student Id");
		printList(students);
		students.sort(Person::sortByLastName);
		System.out.println("\nSort based on LAST NAME");
		printList(students);
		students.sort(Person::sortByFirstName);
		System.out.println("\nSort based on FIRST NAME");
		printList(students);
		students.sort(Student::sortByStudentGpa);
		System.out.println("\nSort based on GPA");
		printList(students);
		
		List<Teacher> teachers = Teacher.getTeacherFromCSV();
		System.out.println("\nTeachers available ");
		printList(teachers);
		
	}
	
	
	private static void printList(List<? extends Person> list) 
	{
		for(int i=0;i<list.size();i++) 
		{
			System.out.println(list.get(i));
		}
	}
}
