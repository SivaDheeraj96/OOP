package edu.neu.csye6200;

public class Person {
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	private String parentFirstName;
	private String parentLastName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getParentFirstName() {
		return parentFirstName;
	}

	public void setParentFirstName(String parentFirstName) {
		this.parentFirstName = parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}

	public void setParentLastName(String parentLastName) {
		this.parentLastName = parentLastName;
	}

	public int sortByID(Person p) 
	{
		return ((Integer)this.getId()).compareTo(p.getId());
	}
	
	public int sortByAge(Person p) 
	{
		return ((Integer)this.getAge()).compareTo(p.getAge());
	}
	
	public int sortByLastName(Person p) 
	{
		return (this.getLastName()).compareTo(p.getLastName());
	}
	
	public int sortByFirstName(Person p) 
	{
		return (this.getFirstName()).compareTo(p.getFirstName());
	}
	@Override
	public String toString() 
	{
		return this.getId()+", "+this.getAge()+", "+this.getFirstName()+", "+this.getLastName()+", "+this.getParentFirstName()+", "+this.getParentLastName();
	}

}
