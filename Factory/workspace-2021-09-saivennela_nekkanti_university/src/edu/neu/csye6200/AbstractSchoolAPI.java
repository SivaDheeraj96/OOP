package edu.neu.csye6200;

import java.util.Comparator;

public abstract class AbstractSchoolAPI {
	public abstract void addEmployee(AbstractPersonAPI employee);				
	public abstract void addStudent(AbstractPersonAPI student);
				
				public abstract String getEmployeesInfo();	
				public abstract void showEmployees();	
				
				public abstract String getStudentsInfo();	
				public abstract void showStudents();
				
				public abstract void show();
				
				public abstract void sortEmployees(Comparator<AbstractPersonAPI> c);
				public abstract void sortStudents(Comparator<AbstractPersonAPI> c);

}
