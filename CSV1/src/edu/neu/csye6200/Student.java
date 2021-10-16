package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	private int studentId;
	private double gpa;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	public static Object[][] getStudentsData()
	{
		return new Object[][] {
			{1,25,"Dheeraj","Reddy","Ram","Charan",20,3.4},
			{2,24,"Sachin","Surya","Dharam","Tej",21,3.5},
			{3,23,"Manoj","Reddy","Sandeep","Reddy",23,3.6},
			{4,24,"Shashank","Gudla","Nikhil","Gudla",22,3.3}
//			{5,22,"Guna","Shekar","Nikhil","Shekar",28,3.1},
//			{6,21,"Priya","Ganta","Puri","Jaganadh",26,3.2},
//			{7,26,"Wahid","Khan","Krishna","Chaithanya",25,3.0}
		};
	}
	
	
	public static List<Student> createStudentsFromCSV()
	{
		List<Student> students= new ArrayList<>();
		
		List<List<String>> studentData = FileUtil.getParsedFileData("student.txt");
		
		for(int i=0;i<studentData.size();i++) 
		{
			int id = 0;
			int age = 0;
			String firstName = "";
			String lastName = "";
			String parentFirstName = "";
			String parentLastName = "";
			int studentId=0;
			double gpa=0.0;
			try {
				id = Integer.parseInt(studentData.get(i).get(0));
			}catch (Exception e) {
				System.err.println("Error while parsing id"+studentData.get(i).get(0));
				e.printStackTrace();
			}
			try {
				age = Integer.parseInt(studentData.get(i).get(1));
			}catch (Exception e) {
				System.err.println("Error while parsing student age"+studentData.get(i).get(1));
				e.printStackTrace();
			}
			firstName = studentData.get(i).get(2);
			lastName = studentData.get(i).get(3);
			parentFirstName = studentData.get(i).get(4);
			parentLastName = studentData.get(i).get(5);
			try {
				studentId = Integer.parseInt(studentData.get(i).get(6));
			}catch (Exception e) {
				System.err.println("Error while parsing student id"+studentData.get(i).get(6));
				e.printStackTrace();
			}
			try {
				gpa = Double.parseDouble(studentData.get(i).get(7));
			}catch (Exception e) {
				System.err.println("Error while parsing student gpa"+studentData.get(i).get(7)+" i:"+i);
				e.printStackTrace();
			}
			
			Student s = new Student();
			
			s.setId(id);
			s.setAge(age);
			s.setFirstName(firstName);
			s.setLastName(lastName);
			s.setParentFirstName(parentFirstName);
			s.setParentLastName(parentLastName);
			s.setStudentId(studentId);
			s.setGpa(gpa);
			
			students.add(s);
		}
		return students;
	}
	public int sortByStudentID(Student p) 
	{
		return ((Integer)this.getStudentId()).compareTo(p.getStudentId());
	}
	
	public int sortByStudentGpa(Student p) 
	{
		return ((Double)this.getGpa()).compareTo(p.getGpa());
	}
	@Override
	public String toString() 
	{
		return super.toString()+", "+this.getStudentId()+", "+this.getGpa();
	}
}
