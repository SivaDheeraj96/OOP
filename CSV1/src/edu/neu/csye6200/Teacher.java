package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
	private double hourlyWage;
	public double getHourlyWage() {
		return hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	@Override
	public String toString() 
	{
		return super.toString()+", "+this.getHourlyWage();
	}
	
	public static Object[][] getTeacherData()
	{
		return new Object[][] 
		{
			{1,32,"don","bosco","james","baskardas",25.5}
		};
	}
	
	public static List<Teacher> getTeacherFromCSV()
	{
		List<Teacher> teachers= new ArrayList<>();
		
		List<List<String>> teacherData = FileUtil.getParsedFileData("teacher.txt");
		
		for(int i=0;i<teacherData.size();i++) 
		{
			int id = 0;
			int age = 0;
			String firstName = "";
			String lastName = "";
			String parentFirstName = "";
			String parentLastName = "";
			double hourWage=0;
			try {
				id = Integer.parseInt(teacherData.get(i).get(0));
			}catch (Exception e) {
				System.err.println("Error while parsing id"+teacherData.get(i).get(0));
				e.printStackTrace();
			}
			try {
				age = Integer.parseInt(teacherData.get(i).get(1));
			}catch (Exception e) {
				System.err.println("Error while parsing student age"+teacherData.get(i).get(1));
				e.printStackTrace();
			}
			firstName = teacherData.get(i).get(2);
			lastName = teacherData.get(i).get(3);
			parentFirstName = teacherData.get(i).get(4);
			parentLastName = teacherData.get(i).get(5);
			try {
				hourWage = Double.parseDouble(teacherData.get(i).get(6));
			}catch (Exception e) {
				System.err.println("Error while parsing student id"+teacherData.get(i).get(6));
				e.printStackTrace();
			}
			
			Teacher t = new Teacher();
			
			t.setId(id);
			t.setAge(age);
			t.setFirstName(firstName);
			t.setLastName(lastName);
			t.setParentFirstName(parentFirstName);
			t.setParentLastName(parentLastName);
			t.setHourlyWage(hourWage);
			
			teachers.add(t);
		}
		return teachers;
	}
}
